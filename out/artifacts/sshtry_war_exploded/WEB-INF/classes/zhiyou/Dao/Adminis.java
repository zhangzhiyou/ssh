package zhiyou.Dao;

import zhiyou.model.Administrator;

import java.util.List;

/**
 * Created by zhiyou on 15-6-1.
 */
public interface Adminis {
    public void save(Administrator administrator);
    public void update(Administrator administrator);
    public Integer logincheck(String username,String password);
}
