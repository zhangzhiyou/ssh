<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-5-30
  Time: 上午10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <style type="text/css">
    body{background: url("img/am.jpg")}
  </style>
</head>
   <body>
   <form action="userlogin" method="post">
     <h1 align="center">欢迎用户来到登录页面</h1>
     <img border="0" src="img/am.jpg" width="100%" height="100%"
          style='position: absolute;left:0px;top:0px;z-index: -1'/><br/>
     <div id="admini" align="center" style="height: 100%">
       <table style="margin-top: 150px">
         <tr height="10">
           <td width="40%"></td>
           <td width="10%">用户名：</td>
           <td><input type="text" value="${userName}" id="userName" name="userName"></td>
           <td width="30%"></td>
         </tr>
         <tr>
           <td width="40%"></td>
           <td width="10%">密    码：</td>
           <td><input type="password" value="${password}" id="password" name="password"></td>
           <td width="30%"></td>
         </tr>
         <tr>
           <td width="20%"></td>
           <td width="10%"><input type="submit" value="登入"></td>
           <td width="10%"><a href="register.jsp">注册</a></td>
           <td width="10%"><a href="Userlogin.jsp">重置</a></td>
           <td width="10%"></td>
         </tr>
       </table>
     </div>
   </form>
   </body>
</html>
