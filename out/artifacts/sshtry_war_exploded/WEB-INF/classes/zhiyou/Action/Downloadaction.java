package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;
import zhiyou.dispose_download.Downfile;
import zhiyou.dispose_download.DownloadDao;
import zhiyou.model.Filelist;

import javax.persistence.Entity;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.EmptyStackException;

/**
 * Created by zhiyou on 15-7-27.
 */
@Controller
public class Downloadaction extends ActionSupport {
    private String filename;
    private String filetype;
    private InputStream inputStream;
    private ServletContext servletContext;
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public String down()throws Exception{
        HttpServletResponse response=ServletActionContext.getResponse();//todo 获得一个请求的 responce对象
        HttpServletRequest request = ServletActionContext.getRequest();//todo
        request.setAttribute("filename",filename);
        Downfile downfile = new Downfile();
        downfile.down(response,getFilename(),getFiletype());
        filename = downfile.getdownfilename(filename);
        System.out.println("filename===="+filename);
        return SUCCESS;
    }

}
