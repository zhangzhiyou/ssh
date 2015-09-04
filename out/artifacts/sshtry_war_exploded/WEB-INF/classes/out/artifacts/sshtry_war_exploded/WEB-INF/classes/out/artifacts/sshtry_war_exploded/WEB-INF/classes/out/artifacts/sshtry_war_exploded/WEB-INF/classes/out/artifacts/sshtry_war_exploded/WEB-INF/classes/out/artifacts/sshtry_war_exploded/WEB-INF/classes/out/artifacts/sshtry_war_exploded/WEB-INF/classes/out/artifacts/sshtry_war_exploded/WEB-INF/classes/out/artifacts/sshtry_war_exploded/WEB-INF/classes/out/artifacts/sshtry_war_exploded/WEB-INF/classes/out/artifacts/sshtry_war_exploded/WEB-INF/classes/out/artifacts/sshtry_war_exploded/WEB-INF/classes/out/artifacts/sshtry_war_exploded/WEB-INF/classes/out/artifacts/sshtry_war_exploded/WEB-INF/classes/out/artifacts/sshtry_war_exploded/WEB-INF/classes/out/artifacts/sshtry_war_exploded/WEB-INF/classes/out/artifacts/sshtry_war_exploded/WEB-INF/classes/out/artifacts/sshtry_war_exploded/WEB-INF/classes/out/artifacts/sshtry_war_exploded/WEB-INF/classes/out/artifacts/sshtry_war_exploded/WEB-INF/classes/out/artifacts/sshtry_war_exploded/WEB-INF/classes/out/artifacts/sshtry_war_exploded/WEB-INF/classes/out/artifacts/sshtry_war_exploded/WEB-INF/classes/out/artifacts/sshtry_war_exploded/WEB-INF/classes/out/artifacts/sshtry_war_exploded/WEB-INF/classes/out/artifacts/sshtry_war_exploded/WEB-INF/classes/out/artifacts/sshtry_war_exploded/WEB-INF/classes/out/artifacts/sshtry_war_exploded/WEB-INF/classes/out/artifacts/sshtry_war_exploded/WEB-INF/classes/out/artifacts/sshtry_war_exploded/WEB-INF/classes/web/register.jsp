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

  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.6/themes/icon.css">
  <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.js"></script>
  <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.min.js"></script>
  <script type="text/javascript" src="jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="vakata-jstree-2f630b4%20(2)/dist/jstree.js"></script>
  <script type="application/javascript">
    $(document).ready(function(){
      $("#img").onmouseover=function(){
        this.width = this.width*1.2;
        this.height = this.height*1.2;
      }
    });

    $(function(){
      $('.b_info').each(function(){
        $(this)
                .css('position','relative')
                .animate({
                  left:"+=300",
                  top:"+=150"
                },
                'slow'
        )
      })
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
    .body{background-image: url("img/beijing7.jpg");height: 100%;width:100%;
      position: relative;}
     .b_box{width:1000px;height:550px;
      margin: 0 auto;position:relative}

    .b_box .b_info{width: 300px;height: 310px;
      position:absolute;top:0px;left: 0px}

    .b_box .b_info p {width: 300px;height: 40px;
      background: #575157;border-radius: 4px ;float: left;
      margin:10px;
    }

     .b_box .b_info p span{width:80px ;
      height:40px;line-height:40px;font-size:16px;
      background: #8c828c;float: left;
      border-radius: 3px }

     .b_box .b_info p input{width: 200px;
      height: 40px;background: #545353;
      font-size: 16px;border:0px;
      padding:5px;outline:none;
    }
    .b_butten .b_submit{margin-left: 40px;}

  </style>
</head>
<body>
  <form method="post" action="register">
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
    <div class="b_box">
      <div class="b_info">
        <p>
          <span>用户名：</span>
          <input  type="text" class="b_text" name="username" onkeyup="this.value=this.value.replace(/[^\w]/g,'')" onpaste="this.value=this.value.replace(/[^\w]/g,'')" />
        </p>
        <p>
          <span>密码：</span>
          <input type="password" class="b_text" name="password"/>
        </p>
        <p>
          <span>邮箱：</span>
          <input type="text" class="easyui-validatebox" required="true" validType="email" name="username" />
        </p>
        <p class="b_butten">
          <input type="submit" value="提交" class="b_submit"/>
        </p>
      </div>
    </div>
  </div>
    </form>
</body>
</html>
