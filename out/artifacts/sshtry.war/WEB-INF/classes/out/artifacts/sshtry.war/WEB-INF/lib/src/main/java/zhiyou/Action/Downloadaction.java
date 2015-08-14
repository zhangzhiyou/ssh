package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.request.ServletRequestAttributes;
import zhiyou.Dao.Dfilelist;
import zhiyou.Dao.DfilelistDao;
import zhiyou.dispose_download.Downfile;
import zhiyou.dispose_download.DownloadDao;
import zhiyou.model.Filelist;
import zhiyou.requestpaging.*;

import javax.persistence.Entity;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.util.EmptyStackException;

/**
 * Created by zhiyou on 15-7-27.
 */
@Controller
public class Downloadaction extends ActionSupport {
    DownDao downDao = new DownDao();
    Dbutil dbutil = new Dbutil();
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


        //todo 开始添加代码
       // ApplicationContext axt = new ClassPathXmlApplicationContext("spring-config.xml");
      //  Dfilelist dfilelistDao = axt.getBean("dfilelistDao", DfilelistDao.class);
        HttpServletResponse response=ServletActionContext.getResponse();//todo 获得一个请求的 responce对象
        HttpServletRequest request = ServletActionContext.getRequest();//todo
        //todo 添加代码结束

        request.setAttribute("filename",filename);
        Downfile downfile = new Downfile();
        downfile.down(response,getFilename(),getFiletype());

        return SUCCESS;
    }

}
