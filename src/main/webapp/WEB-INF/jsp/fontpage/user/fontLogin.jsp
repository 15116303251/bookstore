<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>

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

            var userName=$("#Email1").val();
            var password=$("#Password1").val();
            var rePassWord=$("#Password2").val();

            if(userName==""){
                $("#error").html("用户名不能为空！");
                return false;
            }
            if(password==""){
                $("#error").html("密码不能为空！");
                return false;
            }
            if(rePassWord==""){
                $("#error").html("确认密码不能为空！");
                return false;
            }
            if(password!=rePassWord){
                $("#error").html("确认密码和密码不一致，请重新输入！");
                return false;
            }
            return true;
        }
    </script>
</head>

<body style="background:url(assets/LayuiImages/bg.jpg) no-repeat;">

<div class="container wrap1" style="height:450px;margin-top: 200px">
    <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content">
        <p class="text-center font16">用户登录</p>
        <p class="text-center font16" id="error"></p>
        <form action="fontlogin" method="POST" onsubmit="return checkForm()">
            <div class="form-group mg-t20">
                <i class="icon-user icon_font"></i>
                <input type="text" class="login_input" id="Email1" name="username" placeholder="请输入用户名" />
            </div>
            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>
                <input type="password" class="login_input" id="Password1" name="password" placeholder="请输入密码" />
            </div>
            <div class="form-group mg-t20">
                <i class="icon-lock icon_font"></i>
                <input type="password" class="login_input" id="Password2" name="password" placeholder="请输入密码" />
            </div>
            <div class="checkbox mg-b25">
                <label>
                    <input type="checkbox" name="checkbox" value="0"/>记住我的登录信息
                </label>
                <label style="margin-left: 20px"><a href="toUserResiger">注册</a></label>
            </div>
            <button type="submit" class="login_btn">登 录</button>

        </form>
    </div><!--row end-->
</div><!--container end-->

</body>
</html>






