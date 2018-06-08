<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加公告</title>
    <link rel="stylesheet" href="../assets/css/base.css">
    <link rel="stylesheet" href="../assets/layui/css/layui.css" media="all">
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/layui/layui.js"></script>
    <script src="../assets/js/jfTable.js"></script>
    <script src="../assets/js/content/content_add.js"></script>
</head>
<body>
<div class="body_top_marger10">
    <div class="layui-main layui-form-pane" style="width: 550px">
        <form class="layui-form" action="">
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>标题</label>
                <div class="layui-input-inline">
                    <input type="text" id="content"
                           name="content" required
                           lay-verify="userName" placeholder="请输入标题" autocomplete="off"
                           class="layui-input">
                </div>
                <div class="mds-form-input-aux"></div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>flag</label>
                <div class="layui-input-inline">
                    <input type="text" id="flag" name="flag"
                           required lay-verify="required"
                           placeholder="请输入状态" autocomplete="off" class="layui-input">
                </div>
                <div class="mds-form-input-aux">PS：</div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>链接</label>
                <div class="layui-input-block">
                    <input type="password" id="href" name="href"
                           required lay-verify="required"
                           placeholder="随便写点什么吧" autocomplete="off" class="layui-input">
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