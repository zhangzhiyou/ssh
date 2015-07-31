package zhiyou.dispose_download;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by zhiyou on 15-7-30.
 */
public class Downfile {
    private ServletContext servletContext;
    private String name;
    public void down(HttpServletResponse response,String filename,String filetype) throws Exception {
      //  String path = "http://localhost:8080/home/zhiyou/upload/";//获取网站部署的位置
        String path="/home/zhiyou/upload/";

        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        File file = new File(path);
        try {
            FileInputStream inputStream = new FileInputStream(file+"/"+filename);//new 一个下载的路径
            byte[] buffer = new byte[1024];
            int len=0;
            //获得一个 ServletOutputStream(向客户端发送二进制数据的输出流)对象
            OutputStream servletOutPutStream=response.getOutputStream();
            while ((len=inputStream.read(buffer))!=-1) {
                servletOutPutStream.write(buffer,0,len);
            }
            servletOutPutStream.flush();//将写到客户端内存的数据写到磁盘
            servletOutPutStream.close();
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
                downfilename = new String(downfilename.getBytes(), "ISO8859-1");
            }catch (Exception e){
                e.printStackTrace();
            }
            return downfilename;
        }
}
