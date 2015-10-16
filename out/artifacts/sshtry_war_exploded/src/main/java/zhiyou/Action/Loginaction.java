package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhiyou on 15-5-30.
 */
public class Loginaction extends ActionSupport{
     private char login;//定义页面中输入框中的name变量，就可以通过get和set方法直接获取值
     String st;

    public char getLogin() {
        return login;
    }

    public void setLogin(char login) {
        this.login = login;
    }
    private Myservice ms;

    public void setMs(Myservice ms) {
        this.ms = ms;
    }
    public String execute() throws Exception {
        if (ms.validLogin(getLogin())>0) {
           return SUCCESS;
        }
       return ERROR;
    }
}
