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

        response.setContentType(getServletContext().getMimeType(filename ));
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);
        String fullFileName = getServletContext().getRealPath("/home/zhiyou/upload" + filename);
        InputStream in = new FileInputStream(fullFileName);
        OutputStream out = response.getOutputStream();
        //写文件
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }

        in.close();
        out.close();
        response.sendRedirect("download.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}