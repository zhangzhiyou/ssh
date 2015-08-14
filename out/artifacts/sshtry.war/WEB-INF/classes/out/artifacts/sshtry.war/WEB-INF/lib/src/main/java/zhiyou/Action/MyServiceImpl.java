package zhiyou.Action;

/**
 * Created by zhiyou on 15-5-30.
 */
public class MyServiceImpl implements Myservice {
   private String success = "seccess";
    private String error = "error";
    public int validLogin(String login){
        if(login.equals("1")){

            return 1;//return1之后程序就结束了，一个方法中不可能return2次
        }
        return -1;
    }
}
