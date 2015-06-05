package zhiyou.Action;

/**
 * Created by zhiyou on 15-5-30.
 */
public class MyServiceImpl implements Myservice {
   private String success = "seccess";
    private String error = "error";
    public int validLogin(String login){
        if(login.equals("1")){
            System.out.println("111111");
            return 1;
        }
        System.out.println("222222");
        return -1;
    }
}
