<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-9-3
  Time: 下午8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <style>
    *{margin:0;padding:0}
    body{font-size:12px;font-family:"微软雅黑";color: #666}
    .head{width:100%;height:700px;background: url("img/am.jpg") ;position:relative}
    .head .h-uplode{width:400px;height:250px;
      border: 1px solid red; position:absolute;
      top:250px;left:360px;background: #fffdc7;
    }
    .head .h-uplode p {width:300px;height:20px;margin: 20px;float :left; }
    .head .h-uplode p span{width: 50px;height: 20px;font-size:12px;color: black}
    .head .h-uplode .h-file{
      width: 200px;height: 20px;font-size: 12px;color: black;border-radius:3px;}
    .head .h-uplode .h-jump{width:400px; height:40px;
      font-size: 10px;float: right;margin-right: 1px;
    }
    .head .h-uplode .h-jump .h-login{margin-left: 94px;}
    .head .h-uplode .h-jump .h-login .login{font-size: 18px;}
    .head .h-uplode .h-jump .h-down {margin-left: 91px;font-size: 18px;}
  </style>
</head>
<body>
<form action="login5" method="post" enctype="multipart/form-data">
  <div class="head">
      <div class="h-uplode">
            <p>
              <span>选择上传文件：</span>
              <input type="file" name="file" class="h-file"/>
            </p>
            <div class="h-jump">
                    <div class="h-login">
                      <p>
                        <input type="submit" class="login" value="上传" name="login"/>
                      </p>
                    </div>
                    <div class="h-down">
                      <p>
                        <a href="download.jsp">去下载</a>
                      </p>
                    </div>
            </div>
            <div>
              <p class="h-prompt">
                <font color="aqua">${success}</font>
              </p>
            </div>
      </div>
  </div>
</form>
</body>
</html>
