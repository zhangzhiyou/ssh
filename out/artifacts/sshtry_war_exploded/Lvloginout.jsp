<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-6-17
  Time: 下午7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%--<% if(session.getAttribute("currentUser")==null) {--%>
    <%--response.sendRedirect("Administrator.jsp");--%>
    <%--return;--%>
  <%--}--%>
  <%--%>--%>
  <style>
    *{margin:0;padding:0}
    body{font-size:12px;font-family:"微软雅黑";color: #666}
    .head{width:100%;height:100%;background: url("img/am.jpg") ;position:relative}
    .head .h-uplode{width:400px;height:224px;
      border: 1px solid red; position:absolute;
      top:150px;left:360px;background: #fffdc7;
      /*padding-top:14px;*/
      /*padding-left: 72px;*/
    }

    .head .h-uplode p {width:300px;height:20px;margin: 20px;float :left; }
    .head .h-uplode p span{width: 50px;height: 20px;font-size:12px;color: black}
    .head .h-uplode .h-file{
      width: 200px;height: 20px;font-size: 12px;color: black;border-radius:3px;}
    .head .h-uplode .h-jump{width:400px; height:40px;
        font-size: 10px;float: right;margin-right: 1px;
    }
    .head .h-uplode  .h-prompt{width:200px;height: 20px;float:right;margin-top: -28px;
        font-size:10px;}
    .head .h-uplode .h-jump .h-login{width: 100px;height: 20px;margin-left: 100px;font-size: 15px;}

    .head .h-uplode .h-jump .h-down{width: 100px;height: 20px;float: left;}
    .head .h-uplode .h-jump .h-delect{width: 100px;height: 20px;margin-right: 99px;padding-top: 1px;padding-right: 1px;float: right;}

  </style>
</head>
<body>
  <form action="login4" method="post" enctype="multipart/form-data">
    <div class="head">
    <div class="h-uplode">
                      <p>
                          <span>选择上传文件：</span>
                         <input type="file" name="file" class="h-file"/>
                        </p>

          <div class="h-jump">
                <div class="h-login">
                  <p>
                      <input type="submit" value="上传" name="login"/>
                  </p>
                </div>
                <div class="h-down">
                                  <p>
                                      <a href="download.jsp" >去下载</a>
                                  </p>
                </div>
                <div class="h-delect">
                          <p>
                              <a href="delectfile.jsp" >删除文件上传文件</a>
                          </p>
                <div>
          </div>
          </div>
                  <p class="h-prompt">
                      <font color="aqua">${success}</font>
                  </p>
          </div>
    </div>
    </div>
  </form>
</body>
</html>