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
    .d-all{width:100%;height:100%;
      background: url("img/down.jpg") }
    .d-all .d-table{width: 750px;height:500px; background: #f7ffc2;
      margin-left: 80px;padding-top: 30px;padding-left:100px;}
    .d-all .d-table .d-showtable{width: 600px;height:300px;
      margin-left: 40px;margin-top: 1px;}
    .d-submit{width: 250px;height: 100px;margin: 0 auto}
    .d-all .d-table .d-butten{width: 100px;height:30px;
      border-radius: 3px;font-size: 20px;float: left}
    .d-all .d-table .d-href{width: 100px;height:30px;
        border-radius: 3px;font-size: 20px;float: right}
  </style>
</head>
<body>
<form action="download" method="post">
  <div class="d-all">
      <div class="d-table">
                <div class="d-showtable">
                    <% ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
                        Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
                    %>
                    <%=dfilelistDao.showtable()%>
                </div>
                      <div class="d-submit">
                          <p>
                            <input type="submit" value="下载" class="d-butten">
                          </p>
                          <p>
                              <a href="Lvloginout.jsp" class="d-href">返回</a>
                          </p>
                      </div>
      </div>
  </div>
</form>
</body>
</html>
