<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-9-2
  Time: 上午9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script type="application/javascript">
    $(document).ready(function(){
      $("#img").onmouseover=function(){
        this.width = this.width*1.2;
        this.height = this.height*1.2;
      }
    })
  </script>
  <style type="text/css">
    *{margin: 0;padding: 0}
    body{font-size: 12px;font-family: "微软雅黑" ; color: #666}
    .head{width: 100%;height:100px;background-color: antiquewhite}
    .head .logo{width: 150px;height: 100px;float: left;display: inline}
    .head .logo .img{width: 150px;height: 100px;}

    .head .desc{width: 150px;height: 100px;float: left;display: inline;
    font-size: 18px;margin-top: 10px;margin-left: 25px;
    }
    .head .school .sdut{width: 250px;height: 100px;}
    .head .school{width:150px;height: 100px;float: left;display: inline;}
    .head .advertisment{width: 425px;height: 100px;display: inline;float: right}
    .body{background-image: url("img/beijing7.jpg")}
  </style>
</head>
<body>
  <div class="head">
    <div class="logo"><a href="https://www.tmall.com/?&spm=a1z15.419.3219.9079&ad_id=1001315559c2c043608f&jlogid=a0210320330e98"><img class="img" src="img/tianmao.png"></a>
    </div>
    <div class="desc">
      <p>点击左图可以！</p>
      <p>天猫在等大家！</p>
      <p>大家刷起来！</p>
    </div>
    <div class="school"><a href="http://www.sdut.edu.cn/"><img class="sdut" src="img/sdut.jpg"></a></div>
    <div class="advertisment"></div>
  </div>
  <div class="body">
    <div class="r_table">
      <p>
        <span>用户名：</span>
        <input type="text" name="userName" align="center">
      </p>
    </div>
  </div>
</body>
</html>
