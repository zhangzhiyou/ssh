package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Lvloginshenhe;
import zhiyou.Dao.LvoginshenheDao;

/**
 * Created by zhiyou on 15-6-17.
 */
public class Lvloginshenhedao extends ActionSupport{
    private String name1;
    private String agree;
    private String classrooml;
    private String applytimel;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public String getClassrooml() {
        return classrooml;
    }

    public void setClassrooml(String classrooml) {
        this.classrooml = classrooml;
    }

    public String getApplytimel() {
        return applytimel;
    }

    public void setApplytimel(String applytimel) {
        this.applytimel = applytimel;
    }
    public String execute() throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
         Lvloginshenhe  lvoginshenheDao = ctx.getBean("lvoginshenheDao", LvoginshenheDao.class);
        return SUCCESS;
    }
}
