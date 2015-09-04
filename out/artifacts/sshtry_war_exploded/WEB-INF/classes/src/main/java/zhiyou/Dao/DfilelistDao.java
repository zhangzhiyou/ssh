package zhiyou.Dao;

import com.mysql.jdbc.*;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import zhiyou.dispose_download.Downfile;
import zhiyou.model.Filelist;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public  String showtable() throws Exception {
//    HttpServletRequest request = ServletActionContext.getRequest();
//    HttpServletResponse response = ServletActionContext.getResponse();
        //todo 原来的开始
        String str="<table  "+ "border=\"1\" cellpadding=\"10\" " + "cellspacing=\"0\" width=\"600\">" +
                "<tr><th>文件列表</th></tr>";
        String hql="select filename from Filelist";
        Query query = currentSession().createQuery(hql);
        List<Object> list = query.list();
      //  List<String> list = query.list();



        //todo 取出query.list中的元素.遍历把list集合转化为obj数组，
        // todo 每一个数组相当于数据库中所有属性中的一组值，
        // todo 然后取数组的长度，再对数组obj数组进行遍历，数组中的每一个元素
        // todo 相当与数据库中的一个元组值。

        //todo 如果遍历的list只有一个属性，就只用一层for循环就行，
        //todo 如果遍历的list有两个以上的属性就要用两层循环，
        for(int i=0;i<list.size();i++){
//          Object[] obj = (Object[])list.get(i);
//            for(int j=0;j<obj.length;j++){
//                st = st+obj[j];
//            }

               str=str+"<tr><td>"+list.get(i)+"<input type='radio' name='selectfile' value="+list.get(i)+"></td></tr>";
           }
           str = str + "</table>";
           return str;

    }
    public void delect(String filename ){
        String hql = "delete from Filelist f where f.filename=?";
        Query query =currentSession().createQuery(hql);
        query.setString(0,filename);

        query.executeUpdate();
    }
}
