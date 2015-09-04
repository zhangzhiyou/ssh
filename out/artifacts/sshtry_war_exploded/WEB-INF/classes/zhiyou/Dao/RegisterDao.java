package zhiyou.Dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.model.Register;

/**
 * Created by zhiyou on 15-9-3.
 */
public class RegisterDao extends HibernateDaoSupport implements Registers{
   public void save(Register register){
       getHibernateTemplate().save(register);
   }
}
