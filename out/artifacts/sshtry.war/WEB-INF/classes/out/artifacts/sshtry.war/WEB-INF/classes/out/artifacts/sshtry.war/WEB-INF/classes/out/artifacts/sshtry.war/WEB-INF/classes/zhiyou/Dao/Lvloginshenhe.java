package zhiyou.Dao;

import zhiyou.model.Administrator;
import zhiyou.model.Lvlogin;

/**
 * Created by zhiyou on 15-6-17.
 */
public interface Lvloginshenhe {
    public void save(Lvlogin lvlogin);
    public void update(Lvlogin lvlogin);
    public void insert1(String name1,String agree,String classrooml,String applytimel);
}
