<%@ page contentType="text/html;charset=UTF-8" language="java" deferredSyntaxAllowedAsLiteral="true" %>
<html>
<head>
    <%--<title>Title</title>--%>
    <%--<%--%>
        <%--String path=request.getContextPath();--%>
        <%--String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
    <%--%>--%>
    <%--<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />--%>
    <%--<script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js" ></script>--%>
    <%--<script type="text/javascript" src="assets/bootstrap/js/bootstrap.js" ></script>--%>
    <%--<script type="text/javascript" src="assets/bootstrap/js/jquery-form.js"></script>--%>
    <%--<script>--%>
        <%--$(function(){--%>

        <%--});--%>
    <%--</script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
    <%--<div class="row clearfix">--%>
        <%--<div class="col-md-12 column">--%>
            <%--<form class="form-horizontal" role="form"  method="post" action="/register">--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">名字</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userName" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">密码</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userPassword" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label" >邮箱</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userEmail" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">性别</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userSex" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">生日</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userBirthday" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">电话</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userTel" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">省份</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userProvince" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <%--<div class="form-group">--%>
                    <%--<label class="col-sm-4 control-label">城市</label>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<input type="text" class="form-control" name="userCity" value=""/>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <%--<div class="form-group">--%>
                    <%--<div class="col-sm-4 control-label"></div>--%>
                    <%--<div class="col-sm-4">--%>
                        <%--<button type="submit" class="btn btn-default">注册</button>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</form>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>



<%--<!DOCTYPE html>--%>
<%--<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>--%>
<%--<html>--%>
<%--<head>--%>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录界面</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css">
    <link href="iconfont/style.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js" ></script>
    <style>
        body{color:#fff; font-family:"微软雅黑"; font-size:14px;}

        .main_content{background:url(assets/LayuiImages/main_bg.png) repeat; margin-left:auto; margin-right:auto; text-align:left; float:none; border-radius:8px;}
        .form-group{position:relative;}
        .login_btn{display:block; background:#3872f6; color:#fff; font-size:15px; width:100%; line-height:50px; border-radius:3px; border:none; }
        .login_input{width:100%; border:1px solid #3872f6; border-radius:3px; line-height:40px; padding:2px 5px 2px 30px; background:none;}
        .icon_font{position:absolute; bottom:15px; left:10px; font-size:18px; color:#3872f6;}
        .font16{font-size:16px;}
        .mg-t20{margin-top:20px;}
    </style>

    <script>
        function checkForm(){

            var userName=$("#userName").val();
            var password=$("#userPassword").val();
            var userEmail=$("#userEmail").val();
            var userSex=$("#userSex").val();
            var userBirthday=$("#userBirthday").val();
            var userProvince=$("#userProvince").val();
            var userCity=$("#userCity").val();

            if(userName==""){
                $("#error").html("用户名不能为空！");
                return false;
            }
            if(password==""){
                $("#error").html("密码不能为空！");
                return false;
            }
            if(userEmail==""){
                $("#error").html("确认密码不能为空！");
                return false;
            }

            if(userSex==""){
                $("#error").html("用户名不能为空！");
                return false;
            }
            if(userBirthday==""){
                $("#error").html("密码不能为空！");
                return false;
            }
            if(userProvince==""){
                $("#error").html("确认密码不能为空！");
                return false;
            }
            if(userCity==""){
                $("#error").html("确认密码不能为空！");
                return false;
            }

            return true;
        }
    </script>
</head>

<body style="background:url(assets/LayuiImages/bg.jpg) no-repeat;">

<div class="container wrap1" style="height:450px;">
    <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content">
        <p class="text-center font16">用户注册</p>
        <p class="text-center font16" id="error"></p>
        <form action="/register" method="POST" onsubmit="return checkForm()">
            <div class="form-group mg-t20">
                <i class="icon-user icon_font" style="margin-right: 20px">用户名</i>
                <input type="text" class="login_input" id="userName" name="userName" placeholder="" />
            </div>

            <div class="form-group mg-t20">
                <i class="icon-user icon_font">密码</i>
                <input type="password" class="login_input" id="userPassword" name="userPassword" placeholder="" />
            </div>

            <div class="form-group mg-t20">
                <i class="icon-user icon_font">邮箱</i>
                <input type="text" class="login_input" id="userEmail" name="userEmail" placeholder="" />
            </div>

            <div class="form-group mg-t20">
                <i class="icon-user icon_font">性别</i>
            <input type="text" class="login_input" id="userSex" name="userSex" placeholder="" />
    </div>

    <div class="form-group mg-t20">
        <i class="icon-user icon_font">生日</i>
        <input type="text" class="login_input" id="userBirthday" name="userBirthday" placeholder="" />
    </div>

    <div class="form-group mg-t20">
        <i class="icon-user icon_font">省份</i>
        <input type="text" class="login_input" id="userProvince" name="userProvince" placeholder="" />
    </div>

    <div class="form-group mg-t20">
        <i class="icon-user icon_font">电话</i>
        <input type="text" class="login_input" id="userTel" name="userTel" placeholder="" />
    </div>

    <div class="form-group mg-t20">
        <i class="icon-user icon_font">城市</i>
        <input type="text" class="login_input" id="userCity" name="userCity" placeholder="" />
    </div>
    <button type="submit" class="login_btn">注册</button>

        </form>
    </div><!--row end-->
</div><!--container end-->

</body>
</html>






