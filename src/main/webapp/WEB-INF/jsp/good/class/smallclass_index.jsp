<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="../assets/js/good/class/smallclass_index.js"></script>

<div class="body_center" style="overflow: auto">
	<div class="colla-panel">
		<div class="colla-content" style="align-content: center">
			<label ><h1>类别管理</h1></label>>
		</div>
	</div>
	<div class="empty-line"></div>
	<div class="div_centent_right">
		<div class="layui-btn-group">
			<button class="layui-btn layui-btn-primary" id="smallClassAdd">
				<i class="iconfont">&#xe6e2;</i> 添加
			</button>
			<button class="layui-btn layui-btn-primary" id="smallClassDel">
				<i class="iconfont">&#xe6f7;</i> 删除
			</button>
			<button class="layui-btn layui-btn-primary" id="smallClassRefresh">
				<i class="iconfont">&#xe71e;</i> 刷新
			</button>
		</div>
	</div>

	<div id="table" style="overflow: auto"></div>
</div>
