package zhiyou.Dao;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.model.Lvlogin;

/**
 * Created by zhiyou on 15-6-17.
 */
public class LvoginshenheDao extends HibernateDaoSupport implements Lvloginshenhe{
    public void save(Lvlogin lvlogin){
        getHibernateTemplate().save(lvlogin);
    }
    public void update(Lvlogin lvlogin){
        getHibernateTemplate().update(lvlogin);
    }
    public void insert1(String name1,String agree,String classrooml,String applytimel){
       // String sql = "insert into lvtable(username, agree,classroom,applytime) values(?, ?, ?,?);";
    //   String hql = "update Lvlogin l set l.name1"
      //  SQLQuery query = currentSession().createSQLQuery(hql);
//        query.addScalar("username", Hibernate.)

    }

}
