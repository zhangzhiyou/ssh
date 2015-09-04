package zhiyou.Dao;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.model.Userlogin;

import java.util.List;

/**
 * Created by zhiyou on 15-9-3.
 */
public class UserloginDao extends HibernateDaoSupport implements Userlogins {
    public void save(Userlogin userlogin){
        getHibernateTemplate().save(userlogin);
    }
    public Integer userlogincheck(String userName,String password) {//查找信息
        String hql = "select userName,password from Userlogin u " +
                "where u.userName=? and u.password=?";
        //也可以用sql语句
        //  String sql = "select username,password from Administrator a where a.username =? and a.password=?";
        // SQLQuery query = currentSession().createSQLQuery(sql);
        Query query = currentSession().createQuery(hql);
        query.setString(0,userName);
        query.setString(1,password);
        List<String> list = query.list();
        if(list !=null)
        {
            if(!list.isEmpty()){
                return 1;
            }

            return -1;

        }
        return -2;

    }
    //验证该用户名是否已被注册
    public Integer checkregister(String userName,String password){
        String hql="select userName , password from Userlogin u where u.userName=? and u.password=?";
        Query query = currentSession().createQuery(hql);
        query.setString(0,userName);
        query.setString(1,password);
        List<String> list = query.list();

        if(list!=null&& !list.isEmpty()){//todo 如果list集合为空即没有查到元素
            return 1;//说明查到元素了
        }
        else {
            return -1;//说明没查到元素注册成功
        }
    }

}
