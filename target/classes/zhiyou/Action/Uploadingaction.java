package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Dfilelist;
import zhiyou.Dao.DfilelistDao;
import zhiyou.model.Filelist;

import java.io.*;

/**
 * Created by zhiyou on 15-6-11.
 * file:/home/zhiyou/.IntelliJIdea14/system/tomcat/Unnamed_sshtry/work/Catalina/localhost/_/upload_4d3c3bd8_74ba_4352_b8da_47154b6396ec_00000000.tmp
 * imageFileName:文件夹的名字，
 * imageContentType：文件夹的类型，
 * 成功上传文件，文件大小接近1G，修改了strust.xml文件,来修改文件的大小
 */


public  class Uploadingaction extends ActionSupport {
     private File file;
     private String filename;
    private String filetype;
    private String error;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
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
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String execute() throws Exception{

        //获取上传文件存放的路径
     //   String root = ServletActionContext.getServletContext().getRealPath("/upload");//这句话说明要上传到tomcat下的应用下面的upload目录。
       // String root ="//home"+"//zhiyou"+"//upload";
        Filelist filelist = new Filelist(getFilename(),getFiletype());
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");//加载xml文件
        Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
        //todo 把新添加的文件名和文件类型保存到数据库
        dfilelistDao.save(filelist);


        String root ="/home/zhiyou/upload";//上传后你把上传的文件所存放的文件目录
        if(file!=null){
            File savefile = new File(new File(root),filename);//todo File引用的是java.io.*包下面的
            if(!savefile.getParentFile().exists()){//判断存放文件的文件夹是否存在，
                savefile.getParentFile().mkdirs();//若不存在就新建一个
            }
            FileUtils.copyFile(file,savefile);
            return SUCCESS;
        }
            error="选的文件不能为空";
            setError(error);
            return ERROR;
    }
}

