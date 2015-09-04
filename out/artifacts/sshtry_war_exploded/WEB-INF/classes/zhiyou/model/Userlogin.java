package zhiyou.model;

/**
 * Created by zhiyou on 15-9-3.
 */
public class Userlogin {
    private int id;
    private String userName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Userlogin() {
        super();
    }

    public Userlogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
