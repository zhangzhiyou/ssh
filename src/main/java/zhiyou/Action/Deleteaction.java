package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Dfilelist;
import zhiyou.Dao.DfilelistDao;
import zhiyou.dispose_download.DeletDao;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by zhiyou on 15-8-14.
 */
public class Deleteaction extends ActionSupport{
    private String filename;
    private String filetype;
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
    public String delete() throws Exception{
        String path="/home/zhiyou/download/"+filename+filetype;
        File file = new File(path);
        HttpServletRequest request = ServletActionContext.getRequest();
        ApplicationContext axt = new ClassPathXmlApplicationContext("spring-config.xml");
        Dfilelist dfilelistDao = axt.getBean("dfilelistDao", DfilelistDao.class);
        dfilelistDao.delect(filename,filetype);
        DeletDao deletDao = new DeletDao();

       if( deletDao.delete(file)>0) {
            request.setAttribute("error","恭喜你成功删除");
       }
        if(deletDao.delete(file)<0){
            request.setAttribute("error","你删除的文件不存在");
        }
        return SUCCESS;
    }
}
