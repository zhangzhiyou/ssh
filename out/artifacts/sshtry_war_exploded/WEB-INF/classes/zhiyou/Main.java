package zhiyou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhiyou.Dao.AdministratorDao;
import zhiyou.model.Administrator;

/**
 * Created by zhiyou on 15-5-31.
 */
public class Main {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        AdministratorDao administratorDao = ctx.getBean("administratorDao",AdministratorDao.class);
        Administrator adt = new Administrator();
      //  administratorDao.logincheck("123","456");
        adt.setUsername("遮天");
        adt.setPassword("遮天");
        administratorDao.save(adt);

    }
}
