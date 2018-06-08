<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
<link rel="stylesheet" href="../assets/css/base.css">
<link rel="stylesheet" href="../assets/layui/css/layui.css" media="all">
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/layui/layui.js"></script>
<script src="../assets/js/jfTable.js"></script>
<script src="../assets/js/system/user/user_add.js"></script>
</head>
<body>
	<div class="body_top_marger10">
		<div class="layui-main layui-form-pane" style="width: 550px">
			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>用户名</label>
					<div class="layui-input-inline">
						<input type="text" id="userName"
							name="userName" required
							lay-verify="userName" placeholder="请输入用户名" autocomplete="off"
							class="layui-input">
					</div>
					<div class="mds-form-input-aux">PS：用户名只能是字母和数字</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>邮箱</label>
					<div class="layui-input-inline">
						<input type="text" id="userEmail" name="userEmail"
							required lay-verify="required"
							placeholder="请输入邮箱" autocomplete="off" class="layui-input">
					</div>
					<div class="mds-form-input-aux">PS：邮箱可以不限</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>密码</label>
					<div class="layui-input-block">
						<input type="password" id="userPassword" name="userPassword"
							required lay-verify="required"
							placeholder="随便写点什么吧" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>性别</label>
					<div class="layui-input-inline">
						<input type="text" id="userSex" name="userSex"
							   required lay-verify="required"
							   placeholder="请输入性别" autocomplete="off" class="layui-input">
					</div>
					<div class="mds-form-input-aux">PS：男/女</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">注册日期</label>
					<div class="layui-input-block">
						<input class="layui-input" id="userRegisterDate" name="userRegisterDate" placeholder="请选择注册日期" required lay-verify="required">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">出生日期</label>
					<div class="layui-input-block">
						<input class="layui-input" id="userBirthday1" name="userBirthday" placeholder="请选择出生日期" required lay-verify="required" >
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>手机号</label>
					<div class="layui-input-block">
						<input type="text" id="userTel" name="userTel"
							required lay-verify="required"
							placeholder="请输入手机号码" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>住址</label>
					<div class="layui-input-block">
						<input type="text" id="userProvince" name="userProvince"
							required lay-verify="required"
							placeholder="请输入省份" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>住址</label>
					<div class="layui-input-block">
						<input type="text" id="userCity" name="userCity"
							   required lay-verify="required"
							   placeholder="请输入城市" autocomplete="off" class="layui-input">
					</div>
				</div>

				<div class="layui-form-item" pane>
					<label class="layui-form-label">是否启用</label>
					<div class="layui-input-block">
						<input type="checkbox" id="userState" checked="checked"
							name="userState" lay-skin="switch" lay-text="启用|禁用">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="formSubmit">保存</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>