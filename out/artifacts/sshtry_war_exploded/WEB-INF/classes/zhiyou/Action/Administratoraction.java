package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.Adminis;
import zhiyou.Dao.AdministratorDao;

/**
 * Created by zhiyou on 15-6-1.
 */
public class Administratoraction extends ActionSupport {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String execute() throws Exception{//spring链接hibernater，处理数据库信息
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");//加载xml文件
        Adminis administratorDao = ctx.getBean("administratorDao",AdministratorDao.class);//返回值是administratordao类型的 实列化一个工厂
        Integer result= administratorDao.logincheck(getUsername(), getPassword());
        if(result<0){
            return ERROR;
        }
         else {
            return SUCCESS;
        }
    }
}
