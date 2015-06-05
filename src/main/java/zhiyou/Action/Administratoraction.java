package zhiyou.Action;

import com.opensymphony.xwork2.ActionSupport;
import zhiyou.Dao.AdministratorDao;
import zhiyou.model.Administrator;
import zhiyou.model.Adminstratorlogins;

import java.util.List;

/**
 * Created by zhiyou on 15-6-1.
 */
public class Administratoraction extends ActionSupport {

 //   private AdministratorDao administratorDao;

  //  private Adminstratorlogins adminstratorlogins;
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

//    public void setAdministratorDao(AdministratorDao administratorDao) {
//        this.administratorDao = administratorDao;
//    }
//
//    public AdministratorDao getAdministratorDao() {
//        return administratorDao;
//    }


    public String execute() throws Exception{
    AdministratorDao administratorDao = new AdministratorDao();

        System.out.println("usernaem+password"+getUsername()+"1111"+getPassword());

        List list= administratorDao.logincheck(getUsername(), getPassword());

        if(!list.equals("")){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
