package zhiyou.dispose_download;

import org.apache.struts2.ServletActionContext;
import zhiyou.dispose_download.DownThread;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by zhiyou on 15-7-27.
 * 处理下载。
 */

public class DownloadDao extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        String filetype = request.getParameter("filetype");
        response.setContentType(getServletContext().getMimeType(filename+filetype));
        response.setHeader("Content-Disposition", "attachment;filename="+filename+filetype);
        String fullFileName = getServletContext().getRealPath("/home/zhiyou/upload" + filename+filetype);
        InputStream in = new FileInputStream(fullFileName);
        OutputStream out = response.getOutputStream();
        //写文件
        int b;
        while((b=in.read())!= -1)
        {
            out.write(b);
        }

        in.close();
        out.close();
        response.sendRedirect("download.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
//        public void downfile(String filename,String filetype) throws MalformedURLException {
//            //定义下载线程的个数
//            final int DOWN_THREAD_NUM = 4;
//            //获取要下载文件的名字
//            String out_file_name=filename+filetype;
//            //建立4个输入流对象数组
//            InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
//            //RandomAccessFile是用来访问那些保存数据记录的文件的，是一个继承了objeck的一个独立类，是一个数据流类
//            RandomAccessFile[] outArr = new RandomAccessFile[DOWN_THREAD_NUM];
//            try {
//                //new一个url
//                URL url = new URL("http://localhost:8080/home/zhiyou/upload/"+filename);
//             //   HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//                // 以此URL对象打开第一个输入流
//             //   URLConnection con = url.openConnection();
//                isArr[0] = url.openStream();
//                long fileLen = getFileLength(url);
//                // 以输出文件名创建第一个RandomAccessFile输出流
//                //创建从中读取和向其中写入（可选）的随机存取文件流，第一个参数：文件名，第二个参数是：参数指定用以打开文件的访问模式
//                //"rw"可能是可读可写，
//                outArr[0] = new RandomAccessFile(out_file_name, "rw");
//                // 创建一个与下载资源相同大小的空文件
//                for (int i = 0; i < fileLen; i++) {
//                    outArr[0].write(0);
//                }
//                // 每线程应该下载的字节数
//                long numPerThred = fileLen / DOWN_THREAD_NUM;
//                // 整个下载资源整除后剩下的余数取模
//                long left = fileLen % DOWN_THREAD_NUM;
//                for (int i = 0; i < DOWN_THREAD_NUM; i++) {
//                    // 为每个线程打开一个输入流、一个RandomAccessFile对象，
//                    // 让每个线程分别负责下载资源的不同部分。
//                    //isArr[0]和outArr[0]已经使用，从不为0开始
//                    if (i != 0) {
//                        // 以URL打开多个输入流
//                        isArr[i] = url.openStream();
//                        // 以指定输出文件创建多个RandomAccessFile对象
//                        outArr[i] = new RandomAccessFile(out_file_name, "rw");
//                    }
//                    // 分别启动多个线程来下载网络资源
//                    if (i == DOWN_THREAD_NUM - 1) {
//                        // 最后一个线程下载指定numPerThred+left个字节
//                        new DownThread(i * numPerThred, (i + 1) * numPerThred
//                                + left, isArr[i], outArr[i]).start();
//                    } else {
//                        // 每个线程负责下载一定的numPerThred个字节
//                        new DownThread(i * numPerThred, (i + 1) * numPerThred,
//                                isArr[i], outArr[i]).start();
//                    }
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }
//       //定义获取指定网络资源的长度的方法
//    public static long getFileLength(URL url) throws Exception {
//        long length = 0;
//        // 打开该URL对应的URLConnection
//        URLConnection con = url.openConnection();
//        // 获取连接URL资源的长度
//        long size = con.getContentLength();
//        length = size;
//        return length;
//    }
//        public DownloadDao(){
//        super();
//    }

}
