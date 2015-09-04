package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Dfilelist;
import zhiyou.Dao.DfilelistDao;
import zhiyou.model.Filelist;

import java.io.File;

/**
 * Created by zhiyou on 15-9-4.
 */
public class Userupdownaction extends ActionSupport {
    private File file;
    private String fileFileName;//获取上传文件的名字如 123.text
    private String fileContentType;//获取上传文件的类型 imgen/img

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
    private String error;
    private String success;

    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String execute() throws Exception{
        //获取上传文件存放的路径
        String name = getFileFileName();
        Filelist filelist = new Filelist(name);//创建一个（带参数）持久化类对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");//加载xml文件实列化一个工厂
        Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
        String root = "/home/zhiyou/upload"+"/"+name;
        if(file!=null){
            //todo 把新添加的文件名和文件类型保存到数据库
            dfilelistDao.save(filelist);
            File savefile = new File(root);//todo File引用的是java.io.*包下面的
            if(!savefile.getParentFile().exists()){//判断存放文件的文件夹是否存在，
                savefile.getParentFile().mkdirs();//若不存在就新建一个
            }
            FileUtils.copyFile(file, savefile);
            success="恭喜你上传成功";
            setSuccess(success);
            return SUCCESS;
        }
        else {
            success = "选的文件不能为空";
            setError(success);
            return ERROR;
        }
    }
}
