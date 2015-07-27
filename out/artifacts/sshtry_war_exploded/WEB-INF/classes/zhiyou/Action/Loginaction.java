package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhiyou on 15-5-30.
 */
public class Loginaction extends ActionSupport{
     private String login;//定义页面中输入框中的name变量，就可以通过get和set方法直接获取值
     String st;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    private Myservice ms;

    public void setMs(Myservice ms) {
        this.ms = ms;
    }
    public String execute() throws Exception {
        System.out.println(getLogin());//此时login的值等于你从页面上输入的值
        if (ms.validLogin(getLogin())>0) {
           return SUCCESS;
        }
       return ERROR;
    }
}
