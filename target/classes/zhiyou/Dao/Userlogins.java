package zhiyou.Dao;

import zhiyou.model.Userlogin;

/**
 * Created by zhiyou on 15-9-3.
 */
public interface Userlogins {
    public void save(Userlogin userlogin);
    public Integer userlogincheck(String username,String password);
    public Integer checkregister(String userName ,String password);
}
