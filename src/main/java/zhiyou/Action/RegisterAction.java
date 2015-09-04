package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.RegisterDao;
import zhiyou.Dao.Registers;
import zhiyou.Dao.UserloginDao;
import zhiyou.Dao.Userlogins;
import zhiyou.model.Register;
import zhiyou.model.Userlogin;

/**
 * Created by zhiyou on 15-9-3.
 */
public class RegisterAction extends ActionSupport {
    private String userName;
    private String password;
    private String email;
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String execute() throws Exception{
        Register register = new Register(userName,password,email);
        Userlogin userlogin = new Userlogin(userName,password);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Registers registerDao = ctx.getBean("registerDao", RegisterDao.class);
        Userlogins userloginDao = ctx.getBean("userloginDao", UserloginDao.class);
        Integer result=userloginDao.checkregister(userName,password);
        if(result>0){
            success="该用户名已经被注册";
            setSuccess(success);
            return ERROR;
        }
        else {
            registerDao.save(register);
            userloginDao.save(userlogin);
            success="恭喜您已经注册成功";
            setSuccess(success);
            return SUCCESS;
        }

    }
}
