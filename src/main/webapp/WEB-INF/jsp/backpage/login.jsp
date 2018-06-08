<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/layui/css/layui.css" media="all">
<link rel="stylesheet" href="assets/layui/css/modules/code.css" media="all">
<link rel="stylesheet" href="assets/layui/css/modules/layer/default/layer.css" media="all">
<link rel="stylesheet" href="assets/css/login.css" media="all">
</head>
<body>
	<div class="login">
	    <h1>BK-MANAGER管理平台</h1>
	    <form class="layui-form" method="post" action="backlogin">
	    	<div class="layui-form-item">
				<input class="layui-input" name="username" placeholder="用户名" lay-verify="required" type="text" autocomplete="off">
		    </div>
		    <div class="layui-form-item">
				<input class="layui-input" name="password" placeholder="密码" lay-verify="required" type="password" autocomplete="off">
		    </div>
			<button class="layui-btn login_btn" lay-submit="" lay-filter="login">登录</button>
			<%--<button class="layui-btn login_btn" lay-submit="" lay-filter="login" ><a href="toErpUserResiger">注册</a></button>--%>
		</form>
	</div>
</body>
</html>
