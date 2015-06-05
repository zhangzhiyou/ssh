package zhiyou.Dao;

import org.hibernate.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.model.Administrator;

import java.util.List;

/**
 * Created by zhiyou on 15-5-31.
 */
public class AdministratorDao extends HibernateDaoSupport implements Adminis{//调用时这要用hibernate4
    public void save(Administrator administrator){

        getHibernateTemplate().save(administrator);
    }
   public void update(Administrator administrator){
        getHibernateTemplate().update(administrator);
    }
   public List logincheck(String username,String password) {

       String hql = "select username,password from Administrator a " +
               "where a.username =? and a.password=?";
     //  String sql = "select username,password from Administrator a where a.username =? and a.password=?";
      // SQLQuery query = currentSession().createSQLQuery(sql);

       Query query = currentSession().createQuery(hql);
       query.setString(0,username);
       query.setString(1,password);
       List list = query.list();

      return list;
   }
    public Administrator get(Integer id){
        return getHibernateTemplate().get(Administrator.class,id);
    }
}
