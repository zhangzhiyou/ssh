package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhiyou on 15-5-30.
 */
public class Loginaction extends ActionSupport{
     private String login;
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
        if (ms.validLogin(getLogin())>0) {
           return SUCCESS;
        }
       return ERROR;
    }
}
