package zhiyou;

import zhiyou.Action.Downloadaction;

/**
 * Created by zhiyou on 15-5-31.
 */
public class Main {
    public static void main(String args[]) throws Exception {
        Downloadaction down = new Downloadaction();
        down.execute();
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        DfilelistDao dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
//        dfilelistDao.showtable();
//        AdministratorDao administratorDao = ctx.getBean("dfilelistDao",);
//        Administrator adt = new Administrator();
//      //  administratorDao.logincheck("123","456");
//        adt.setUsername("遮天");
//        adt.setPassword("遮天");
//        administratorDao.save(adt);

    }
}
