package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.UserloginDao;
import zhiyou.Dao.Userlogins;
import zhiyou.model.Userlogin;

/**
 * Created by zhiyou on 15-9-3.
 */
public class Userloginaction extends ActionSupport {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String execute() throws Exception{
        Userlogin userlogin = new Userlogin(getUserName(),getPassword());
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Userlogins userloginDao = ctx.getBean("userloginDao", UserloginDao.class);
       // userloginDao.save(userlogin);
         Integer result= userloginDao.userlogincheck(getUserName(), getPassword());
        if(result<0){
            return ERROR;
        }else {
            return SUCCESS;
        }

    }

}
