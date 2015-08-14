<%@ page import="zhiyou.Dao.DfilelistDao" %>
<%@ page import="zhiyou.Dao.Dfilelist" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-8-11
  Time: 下午7:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择性删除</title>
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/icon.css">
    <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function(){
           $('.d-filewriter')
                   .animate({
                       left:"+=400",
                       top:"+=200"
                   },
           'slow'
           )
        })
    </script>
    <style>
        *{margin :0 ;padding:0}
        body{font-size:12px;font-family:"微软雅黑";background: url("img/down.jpg");color:#666}
        .delete{ width: 100%;height: 700px;}
        .delete .d-showtable{background: #fff2ce;
            width: 400px;height: 200px;margin-left: 300px;margin-top: 80px;
        }
      .delete .d-filewriter{position:relative;height: 200px;width: 300px;}
    </style>
</head>
    <body>
        <div class="delete">
          <form>
            <div class="d-showtable">
                <% ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
                    Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
                %>
                <%=dfilelistDao.showtable()%>

            </div>
            <div class="d-filewriter" >
                <p>
                    <span>文件名</span>
                    <input type="text" name="filename" value=""/>
                </p>
                <p>
                    <span>文件类型</span>
                    <input type="text" name="filetype" value=""/>
                </p>

            </div>
          </form>
        </div>
    </body>
</html>
