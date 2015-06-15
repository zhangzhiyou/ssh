package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Disposeupload;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiyou on 15-6-11.
 */


public class Uploadingaction extends ActionSupport {

    private String feil;

    public String getFeil() {
        return feil;
    }

    public void setFeil(String feil) {
        this.feil = feil;
    }

    public String download() throws Exception{//todo 换个函数名。

        ApplicationContext etx = new ClassPathXmlApplicationContext("spring-config.xml");
        Disposeupload disposeupload = etx.getBean("disposeupload", Disposeupload.class);
        List<String> list = new ArrayList<String>();
        list.add(".jpg");
        list.add(".jar");
        list.add(".zip");
        list.add(".pdf");
    String result=disposeupload.uploadFeil("/home/zhiyou/下载/pack.zip", "/home/zhiyou/pack", list);
        if(!result.isEmpty()){
            return SUCCESS;
        }
       return ERROR;
    }
}
