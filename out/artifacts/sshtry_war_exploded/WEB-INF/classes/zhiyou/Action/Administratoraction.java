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
    public String execute() throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Adminis administratorDao = ctx.getBean("administratorDao",AdministratorDao.class);
        System.out.println("usernaem+password"+getUsername()+"1111"+getPassword());

        Integer result= administratorDao.logincheck(getUsername(), getPassword());
            System.out.println(result+"22222");
        if(result<0){
            return ERROR;
        }
         else {
            return SUCCESS;
        }
    }
}
