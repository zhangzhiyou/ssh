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
  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/icon.css">
  <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.min.js"></script>
  <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="vakata-jstree-2f630b4%20(2)/dist/jstree.js"></script>
  <style>
    *{margin:0;padding:0;}
    body{font-size: 12px;}
    .d-all{width:100%;height:100%;
      background: url("img/down.jpg") }
    .d-all .d-table{width: 750px; background: #f7ffc2;
      margin-top:1px;
      margin-left: 150px;}
    .d-all .d-table .d-showtable{width: 400px;height:200px;
      margin-left: 70px;margin-top: 1px;}
    .d-all .d-table .d-writwer{width:400px;height: 200px;margin:0 auto;  }
    .d-all .d-table .d-writwer p{width: 400px;height:40px;border-radius: 3px;}
    .d-all .d-table .d-writwer p span{width: 150px;height: 30px;font-size: 20px;}
    .d-all .d-table .d-writwer .d-filename{width: 250px;
      height: 30px;font-size: 20px;line-height: 100%;
    float: right}
    .d-all .d-table .d-submit{width: 100px;height:40px;
    margin:1px auto;}
    .d-all .d-table .d-butten{width: 100px;height:40px;
      border-radius: 3px;font-size: 20px;}
  </style>
</head>
<body>
<form action="download" method="get">
  <div class="d-all">
    <div class="d-table">
      <div class="d-showtable">
     <% ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
             Dfilelist dfilelistDao = ctx.getBean("dfilelistDao",DfilelistDao.class);
     %>
      <%=dfilelistDao.showtable()%>

        </div>

      <div class="d-writwer">
        <p>
          <span>文件名：</span>
          <input type="text" name="filename" class="d-filename">
        </p>
        <p>
          <span>文件类型：</span>
          <input type="text" name="filetype" class="d-filename">
        </p>
      </div>
      <div class="d-submit">
        <p>
          <input type="submit" value="下载" class="d-butten">
        </p>
      </div>
    </div>
  </div>
  </form>
</body>
</html>
