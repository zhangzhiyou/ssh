<%@ page import="zhiyou.Dao.DfilelistDao" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="zhiyou.Dao.Dfilelist" %>
<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-7-25
  Time: 下午2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载页面</title>
  <style>
    *{margin:0;padding:0;}
    body{font-size: 12px;}
    .d-all{width:100%;height:750px;background: url("img/down.jpg") }
    .d-all .d-table{width: 1000px;height: 500px; background: #f7ffc2;margin-top:1px;margin-left: 115px;border:1px solid #ff0000}
    .d-all .d-table .d-showtable{width: 250px;margin: 55px auto;}
  </style>
</head>
<body>
  <div class="d-all">
    <div class="d-table">
      <div class="d-showtable">
     <% ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
             Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);

     %>
      <%=dfilelistDao.showtable()%>
        </div>
    </div>
  </div>
</body>
</html>
