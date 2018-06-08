<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
<link rel="stylesheet" href="../assets/css/base.css">
<link rel="stylesheet" href="../assets/layui/css/layui.css" media="all">
</head>
<body>
<div class="body_top_marger10">
	<div class="layui-main layui-form-pane" style="width: 550px">
		<form class="layui-form" action="">
			<div class="hidder_body">
				<input type="hidden" id="id" name="bDBid" value="${bigDetail.bDBid}">
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><font color="red">*</font>二级大分类</label>
				<div class="layui-input-inline">
					<input type="text" id="bDBigDetail"
						   name="bDBigDetail" required
						   lay-verify="userName" placeholder="请输入用户名" autocomplete="off"
						   class="layui-input" value="${bigDetail.bDBigDetail}">
				</div>
				<div class="mds-form-input-aux">PS：用户名只能是字母和数字</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><font color="red">*</font>bSid</label>
				<div class="layui-input-inline">
					<input type="text" id="bSid" name="bSid"
						   required lay-verify="required"
						   placeholder="请输入邮箱" autocomplete="off" class="layui-input" value="${bigDetail.bSid}">
				</div>
				<div class="mds-form-input-aux">PS：</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"><font color="red">*</font>推荐标志</label>
				<div class="layui-input-block">
					<input type="password" id="recommendFlag" name="recommendFlag"
						   required lay-verify="required"
						   placeholder="随便写点什么吧" autocomplete="off" class="layui-input" value="${bigDetail.recommendFlag}">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label"><font color="red">*</font>链接</label>
				<div class="layui-input-inline">
					<input type="text" id="link" name="link"
						   required lay-verify="required"
						   placeholder="请输入性别" autocomplete="off" class="layui-input" value="${bigDetail.link}">
				</div>
				<div class="mds-form-input-aux">PS：链接</div>
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
	<script src="../assets/js/jquery.min.js"></script>
	<script src="../assets/layui/layui.js"></script>
	<script src="../assets/js/jfTable.js"></script>
	<script src="../assets/js/good/class/bigdetailclass_update.js"></script>
</body>
</html>