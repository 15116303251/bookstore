<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assets/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="assets/layui/css/modules/code.css"
          media="all">
    <link rel="stylesheet"
          href="assets/layui/css/modules/laydate/laydate.css" media="all">
    <link rel="stylesheet"
          href="assets/layui/css/modules/layer/default/layer.css" media="all">
    <link rel="stylesheet" href="assets/css/base.css">
    <link rel="stylesheet" href="assets/css/main.css">

</head>
<body>
    <div class="body_center" style="overflow: auto">
        <div class="colla-panel">
            <div class="colla-content">
                <form class="layui-form">
                    <div class="layui-form-item">
                        <label class="layui-form-label">书名：</label>
                        <div class="layui-input-inline">
                            <input type="text" id="query_bookName" name="bookName" placeholder="请输入需要查询书名"
                                   autocomplete="off" class="layui-input">
                        </div>


                        <label class="layui-form-label">作者：</label>
                        <div class="layui-input-inline">
                            <input type="text" id="query_author" name="author" placeholder="请输入需要查询书名"
                                   autocomplete="off" class="layui-input">
                        </div>

                        <label class="layui-form-label">出版社：</label>
                        <div class="layui-input-inline">
                            <input type="text" id="query_publish" name="publish" placeholder="请输入需要查询出版社"
                                   autocomplete="off" class="layui-input">
                        </div>


                        <label class="layui-form-label">类别：</label>
                        <div class="layui-input-inline">
                            <input type="text" id="query_class" name="bookClass" placeholder="请输入需要查询书籍类别"
                                   autocomplete="off" class="layui-input" >
                        </div>

                        <button class="layui-btn layui-btn-primary" lay-submit lay-filter="formQuery">
                            <i class="iconfont">&#xe741;</i>查询
                        </button>
                        <button type="reset" class="layui-btn layui-btn-primary">
                            <i class="iconfont">&#xe6f8;</i>重置
                        </button>
                    </div>
                </form>
            </div>
        </div>
        <div class="empty-line"></div>
        <div class="div_centent_right">
            <div class="layui-btn-group">
                <button class="layui-btn layui-btn-primary" id="bookAdd">
                    <i class="iconfont">&#xe6e2;</i> 添加
                </button>
                <button class="layui-btn layui-btn-primary" id="bookDel">
                    <i class="iconfont">&#xe6f7;</i> 删除
                </button>
                <button class="layui-btn layui-btn-primary" id="bookUpdate">
                    <i class="iconfont">&#xe6eb;</i> 修改
                </button>
                <button class="layui-btn layui-btn-primary" id="bookRefresh">
                    <i class="iconfont">&#xe71e;</i> 刷新
                </button>
            </div>
        </div>

        <div id="table" style="overflow: auto"></div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/layui/layui.js"></script>
    <script src="assets/js/jfTable.js"></script>
    <script src="assets/js/good/book/book_index.js"></script>
</body>
</html>
