<%--
  Created by IntelliJ IDEA.
  User: zhiyou
  Date: 15-6-1
  Time: 下午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
    <%--<title></title>--%>
  <%--<script type="text/javascript">--%>
    <%--$(document).ready(function(){--%>
      <%--$('.u-file-c').addClass('u-file-btn');--%>
      <%--$('.u-file-c').each(function(i, el){--%>
        <%--$(this).html($(this).html());--%>
      <%--})--%>
    <%--});--%>
  <%--</script>--%>
<%--</head>--%>
<%--<body>--%>
  <%--<form action="" method="post">--%>
       <%--<div class="u-file-c" align="center">--%>
          <%--<input type="file"name="attach"/>--%>
       <%--</div>--%>
   <%--</form>--%>
 <%--</body>--%>
<%--</html>--%>


<!--第二种上传方式 只是获取文件的名，没有上传路径-->
<%--<html>--%>
<%--<head>--%>
  <%--<title>添加附件</title>--%>
<%--</head>--%>
<%--<body class="body">--%>
<%--<script type="text/javascript">--%>
  <%--function fclick(obj){--%>
    <%--obj.style.posTop=event.srcElement.offsetTop--%>
    <%--var x=event.x-obj.offsetWidth/2--%>
    <%--if(x<event.srcElement.offsetLeft)x=event.srcElement.offsetLeft--%>
    <%--if(x>event.srcElement.offsetLeft+event.srcElement.offsetWidth-obj.offsetWidth)x=event.srcElement.offsetLeft+event.srcElement.offsetWidth-obj.offsetWidth--%>
    <%--obj.style.posLeft=x--%>
  <%--}--%>
<%--</script>--%>
<%--<style>--%>
  <%--input{border:1px solid #333333;color:#666666;background:#eeeeee;font:normal 12px Tahoma;height:18px}--%>
<%--</style>--%>
<%--<form method="post" action="" enctype="multipart/form-data">--%>
  <%--<input id="f_file" type='text' name="way">--%>
  <%--&lt;%&ndash;<input  onmouseover="fclick(t_file)">&ndash;%&gt;--%>
  <%--<input name="upload" type="file" style="position:absolute;filter:alpha(opacity=20);width:30px;" id="t_file" onchange="f_file.value=this.value" hidefocus>--%>
  <%--<!-- opacity是透明度  这里写20是为了方便浏览，使用时应设置为0 -->--%>
  <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<html>
<head>
  <meta  http-equiv="content-type" content="text/html; charset=utf-8" >
  <title>upload...</title>
  <style>
    #ui-upload-holder{ position:relative;width:60px;height:35px;border:1px solid silver; overflow:hidden;}
    #ui-upload-input{ position:absolute;top:0px;right:0px;height:100%;cursor:pointer; opacity:0;filter:alpha(opacity:0);z-index:999;}
    #ui-upload-txt{ position:absolute;top:0px;left:0px;width:100%;height:100%;line-height:35px;text-align:center;}

    #ui-upload-filepath{ position:relative; border:1px solid silver; width:150px; height:35px; overflow:hidden;  float:left;}
    #ui-upload-filepathtxt{ position:absolute; top:0px;left:0px; width:100%;height:35px; border:0px; line-height:35px;  }

    .uploadlay{margin:200px; border:1px green solid; width:300px; height:200px; padding:10px;  }
  </style>
</head>

<body>
 <form action="uploading" method="post" enctype="multipart/form-data">
  <div class="uploadlay" align="center">
     <div id="ui-upload-filepath">
        <input type="text" id="ui-upload-filepathtxt" class="filepathtxt" name="feil" />
     </div>
    <div id="ui-upload-holder">
      <div id="ui-upload-txt">浏览</div>
        <input type="file" id="ui-upload-input"/>
      </div><br>
    <div>
        <input type="submit" value="上传">
        <a href="download.jsp">下载</a>
    </div><!--todo-->
  </div>
   <script>
      document.getElementById("ui-upload-input").onchange=function(){
        document.getElementById("ui-upload-filepathtxt").value = this.value;
      }
    </script>
 </form>
</body>
</html>

<%--<html>--%>
<%--<head>--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />--%>
    <%--<title>无标题文档</title>--%>

    <%--<script type="text/javascript" src="软件工程概论/软件工程实验原型/js/jquery-1.8.3.min.js"></script>--%>
    <%--<script type="text/javascript">--%>

        <%--var imgurl = "";--%>

        <%--function getImgURL(node) {--%>
            <%--var imgURL = "";--%>
            <%--try{--%>
                <%--var file = null;--%>
                <%--if(node.files && node.files[0] ){--%>
                    <%--file = node.files[0];--%>
                <%--}else if(node.files && node.files.item(0)) {--%>
                    <%--file = node.files.item(0);--%>
                <%--}--%>
                <%--//Firefox 因安全性问题已无法直接通过input[file].value 获取完整的文件路径--%>
                <%--try{--%>
                    <%--//Firefox7.0--%>
                    <%--imgURL =  file.getAsDataURL();--%>
                    <%--//alert("//Firefox7.0"+imgRUL);--%>
                <%--}catch(e){--%>
                    <%--//Firefox8.0以上--%>
                    <%--imgRUL = window.URL.createObjectURL(file);--%>
                    <%--//alert("//Firefox8.0以上"+imgRUL);--%>
                <%--}--%>
            <%--}catch(e){      //这里不知道怎么处理了，如果是遨游的话会报这个异常--%>
                <%--//支持html5的浏览器,比如高版本的firefox、chrome、ie10--%>
                <%--if (node.files && node.files[0]) {--%>
                    <%--var reader = new FileReader();--%>
                    <%--reader.onload = function (e) {--%>
                        <%--imgURL = e.target.result;--%>
                    <%--};--%>
                    <%--reader.readAsDataURL(node.files[0]);--%>
                <%--}--%>
            <%--}--%>
            <%--//imgurl = imgURL;--%>
            <%--creatImg(imgRUL);--%>
            <%--return imgURL;--%>
        <%--}--%>

        <%--function creatImg(imgRUL){   //根据指定URL创建一个Img对象--%>
            <%--var textHtml = "<img src='"+imgRUL+"'/>";--%>
            <%--$(".mark").after(textHtml);--%>
        <%--}--%>

    <%--</script>--%>

<%--</head>--%>

<%--<body>--%>
<%--<div style="width:90px; height:110px; overflow:hidden; border:1px solid red;" id="show">--%>
    <%--<div class="mark"></div>--%>
<%--</div>--%>
<%--<br>--%>
<%--<input type="file" value="上传文件" onchange="getImgURL(this)">--%>
<%--</body>--%>
<%--</html>--%>


<%--<html>--%>
   <%--<head>--%>
       <%--<meta charset="utf-8">--%>
       <%--<title></title>--%>
       <%--<style>--%>
           <%--h1{--%>
               <%--color:#ff0000;--%>
           <%--}--%>
       <%--</style>--%>
   <%--</head>--%>
  <%--<body>--%>
    <%--<form action="uploading" method="post" id="f" enctype="multipart/form-data">--%>
        <%--<div align="center">--%>
            <%--<input type="file" id="text" value="上传的文件"><br/>--%>
            <%--<input type="submit" value="确认">--%>
        <%--</div>--%>
    <%--</form>--%>
  <%--</body>--%>
<%--</html>--%>