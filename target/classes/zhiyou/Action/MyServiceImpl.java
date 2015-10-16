package zhiyou.Action;

/**
 * Created by zhiyou on 15-5-30.
 */
public class MyServiceImpl implements Myservice {
   private String success = "seccess";
    private String error = "error";
    @SuppressWarnings("fallthrough")// todo 添加该注解就不会对该方法产生警告
    public int validLogin(char login){// todo 把if判断换成switch判断,可以让逻辑思路清晰
        int result = 0;
        switch (login){
            case '1':
                result=1;
            break;
            case '2':
                result=-1;
            break;
        }
        return result;
//        if(login.equals('1')){
//
//            return 1;//return1之后程序就结束了，一个方法中不可能return2次
//        }
//        return -1;

    }
}
