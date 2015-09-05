package zhiyou.dispose_download;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by zhiyou on 15-7-30.
 * 首先指定文件中读取内容，
 * 把读取的内容写入到response中，再写到磁盘中。
 * 完成文件的下载
 */
public  class Downfile {

    private ServletContext servletContext;

    public void sdown(HttpServletResponse response,String filename) throws Exception {
        String path="/home/zhiyou/upload/";
        String paths="/home/zhiyou/download/"+filename;

        //添加response.addHeader可以防止文件名中有中问乱码问题
        response.addHeader("Content-Disposition", "attachment; name=\"" + filename + "\"");

        File file = new File(path);
        File file1 = new File(paths);
        try {
            //new一个FileInputStream对象，为了获取要下载文件夹的路径
            FileInputStream inputStream = new FileInputStream(file+"/"+filename);

            //new一个FileOutputSteam对象，获取下载后文件放在哪，
            FileOutputStream fos = new FileOutputStream(file1);
            byte[] buffer = new byte[1024];
            int len=0;
            int i=0;
            //获得一个 ServletOutputStream(向客户端发送二进制数据的输出流)对象
            OutputStream servletOutPutStream=response.getOutputStream();
            while ((len=inputStream.read(buffer))!=-1) {

                //每次取出response.getOutputStream中的1024个字节写入servletOutPutStream中，
                //而且下次循环开始是从上次读完后开始的，直到读完文件中的所有字节
                servletOutPutStream.write(buffer,0,len);
                //把那次读得字节全部都写到指定的文件中。
                fos.write(buffer,0,len);
            }
            servletOutPutStream.flush();//将写到客户端内存的数据写到磁盘
            fos.flush();//清空缓冲区中的数据。
            fos.close();
            inputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
        public String getdownfilename(String filename){
            String downfilename=filename;
            try {
                downfilename = new String(downfilename.getBytes("UTF-8"), "ISO8859-1");
            }catch (Exception e){
                e.printStackTrace();
            }
            return downfilename;
        }
}
