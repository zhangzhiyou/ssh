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
                       left:"+=250",
                       top:"+=30"
                   },
           'slow'
           )
        })
    </script>
    <style>
        *{margin :0 ;padding:0}
        body{font-size:12px;font-family:"微软雅黑";background: url("img/down.jpg");color:#666}
        .delete{ width: 100%;height: 600px;}
        .delete .deleteDesc{width:1000px;height:50px;color: #807f74;background-color: #f8f1be;
            text-align: center;font-size: 20px;padding-top: 18px;
        }
        .delete .d-showtable{background: #fff2ce;
            width: 680px;height: 300px;margin-left: 60px;margin-top: 30px;padding-top: 30px;padding-left: 150px;
        }
      .delete .d-filewriter{position:relative;height: 60px;width: 300px;margin-top: 1px;margin-left: 1px;}

        .d-button{width: 300px;background: #575157;margin-top: 14px;margin-left: 50px;height: 50px;
        }
        .d-submit{width: 300px;background: #8c828c;margin: 0 auto;height: 50px;}
        .warn{margin:0 auto}
        tr:nth-of-type(even){
            background-color: #f3f3f3;
        }
        tr:nth-of-type(odd){background-color: #ddd}
    </style>
</head>
    <body>
        <div class="delete">
          <form action="delete" method="post">
              <div class="deleteDesc" >欢迎来到删除页面</div>
            <div class="d-showtable">
                <% ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
                    Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
                %>
                <%=dfilelistDao.showtable()%>
            </div>
            <div class="d-filewriter" >
                <div class="d-button">
                    <button class="d-submit" type="submit">提交</button>
                </div>
                <div class="warn">
                    <tr>
                        <td width="40%"></td>
                        <font color="red">${error}</font>
                    </tr>
                </div>
            </div>
          </form>
        </div>
    </body>
</html>
