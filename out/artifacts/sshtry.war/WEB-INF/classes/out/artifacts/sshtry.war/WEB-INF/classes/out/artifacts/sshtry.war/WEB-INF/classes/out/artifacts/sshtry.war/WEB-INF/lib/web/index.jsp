<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-5-30
  Time: 上午9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎来到分享界面</title>

    <style type="text/css">
      *{margin: 0;padding :0}
      body{font-size:12px;font-family: "微软雅黑" ;color:#666}
      .head{width:100%;height:50px;}
      .head .h-letf{width:200px;height:50px;background-color: red;margin-left:20px;float:left}
      .head .h-mid{height: 50px;background-color: aqua}
      .head .h-rigth{width: 20px;height:50px;background-color: blue;float:right}
      /*body{background: url("img/am.jpg")}*/
      /*div{*/
        /*border-top: 1px dashed blue;*/
        /*border-right:1px dotted #2b42ff;*/
        /*border-left:1px solid #ff0000;*/
        /*border-bottom: 1px solid chartreuse;*/

      /*}*/
    </style>
  </head>
  <body>
  <form id="form" method="post" action="login">
    <div  class="head">
      <div class="h-letf"></div>
      <div class="h-rigth"></div>
      <div class="h-mid"></div>
    </div>
    <%--<img border="0" src="img/am.jpg" width="100%" height="100%"--%>
         <%--style='position: absolute;left:0px;top:0px;z-index: -1'/><br/>--%>
    <%--<div align="center" style="height: 100%">--%>
      <%--<tr>--%>
        <%--<td>--%>
          <%--<table width=300 height=400 border="1" bordercolor="#ff00ff" cellspacing="0" cellpadding="0">--%>
            <%--<tr>--%>
              <%--<td align="center" valign="middle">--%>
                <%--<font color="#7fff00">请选择登录方式:</font>--%>
              <%--</td>--%>
            <%--<tr>--%>
              <%--<td>--%>
                <%--<font color="#FF0000">管理员登录</font>--%>
                <%--<label>--%>
                  <%--<input type="radio" name="login" value="1">--%>
                <%--</label>--%>
              <%--</td>--%>
            <%--</tr>--%>
            <%--<td>--%>
              <%--<font color="#FF0000">用户登录</font>--%>
              <%--<label>--%>
                <%--<input type="radio" name="login" value="2">--%>
              <%--</label><br/>--%>
            <%--</td>--%>
            <%--<tr>--%>
              <%--<td align="center" valign="middle">--%>
                <%--<input type="submit" value="登录">--%>
              <%--</td>--%>
            <%--</tr>--%>
          <%--</table>--%>
        <%--</td>--%>
      <%--</tr>--%>
    <%--</div>--%>
  </form>
  </body>
</html>
