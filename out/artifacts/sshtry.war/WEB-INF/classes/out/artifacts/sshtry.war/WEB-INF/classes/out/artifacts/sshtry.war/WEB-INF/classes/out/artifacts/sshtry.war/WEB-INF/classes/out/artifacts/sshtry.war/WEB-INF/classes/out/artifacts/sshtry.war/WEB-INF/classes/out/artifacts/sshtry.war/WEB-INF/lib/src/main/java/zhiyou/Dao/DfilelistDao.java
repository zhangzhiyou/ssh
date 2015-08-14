package zhiyou.Dao;

import com.mysql.jdbc.*;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.model.Filelist;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.sql.rowset.Predicate;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

/**
 * Created by zhiyou on 15-7-25.
 */
public class DfilelistDao extends HibernateDaoSupport implements Dfilelist{
    public void save(Filelist filelist){
        getHibernateTemplate().save(filelist);
    }
    public void updata(Filelist filelist){
        getHibernateTemplate().update(filelist);
    }
    public  String showtable() {

        Statement stmt = null;
        ResultSet rs = null;
        String str="<table  fitColumns=\"true\" class=\"easyui-datagrid\" pagination=\"true\" border=\"1\" bordercolor=\"black\" cellpadding=\"10\" cellspacing=\"0\" width=\"200\">" +
                "<tr><th>提供下载的文件名</th></tr>";
        String hql="select filename,filetype from Filelist";
        Query query = currentSession().createQuery(hql);
        List<Object> list = query.list();
//            for(int i=0;i<list.size();i++){
//                System.out.println(list.get(1));
//            }
        //todo 取出query.list中的元素.遍历把list集合转化为obj数组，
        // todo 每一个数组相当于数据库中所有属性中的一组值，
        // todo 然后取数组的长度，再对数组obj数组进行遍历，数组中的每一个元素
        // todo 相当与数据库中的一个元组值。
        for(int i=0;i<list.size();i++){
            String st="";
            Object[] obj = (Object[])list.get(i);

            for(int j=0;j<obj.length;j++) {
             //   System.out.println(obj[j]);
              //  st+=obj[j];
//                if(j==0) {
//                    str += "<td>"+obj[j] + "<input type='radio'" + "value='obj[j]'" + "name='filename'" + "/></td>";
//                }else {
//                    str += "<td>"+obj[j] + "<input type='radio'" + "value='obj[j]'" + "name='filetype'" + "/></td>";
//                }
                st = st+obj[j];
            }
            str=str+"<tr><td><a href='http://localhost:8080s/home/zhiyou/upload/'"+">"+st+"</a></td></tr>";
        }
        str=str+"</table>";
        //控制器完成业务处理后会返回一些值，而返会的这些值就可以子页面中显示。我们称这些业务逻辑组件（类）为Model
        return str;
    }

}
