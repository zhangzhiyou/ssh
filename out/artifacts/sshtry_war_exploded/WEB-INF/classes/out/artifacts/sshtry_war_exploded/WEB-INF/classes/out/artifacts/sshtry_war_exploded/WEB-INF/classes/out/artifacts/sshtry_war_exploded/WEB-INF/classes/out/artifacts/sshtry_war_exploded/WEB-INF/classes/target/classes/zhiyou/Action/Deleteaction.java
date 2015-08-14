package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Dfilelist;
import zhiyou.Dao.DfilelistDao;
import zhiyou.dispose_download.DeletDao;

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
        ApplicationContext axt = new ClassPathXmlApplicationContext("spring-config.xml");
        Dfilelist dfilelistDao = axt.getBean("DfilelistDao", DfilelistDao.class);
        dfilelistDao.delect(filename,filetype);
        String path="/home/zhiyou/download/"+filename+filetype;
        File file = new File(path);
        DeletDao deletDao = new DeletDao();
        deletDao.delete(file);
        return SUCCESS;
    }
}
