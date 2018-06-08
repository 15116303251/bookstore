<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加订单</title>
    <link rel="stylesheet" href="../assets/css/base.css">
    <link rel="stylesheet" href="../assets/layui/css/layui.css" media="all">
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/layui/layui.js"></script>
    <script src="../assets/js/jfTable.js"></script>
    <script src="../assets/js/order/order_add.js"></script>
</head>
<body>
<div class="body_top_marger10">
    <div class="layui-main layui-form-pane" style="width: 550px">
        <form class="layui-form" action="">
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>订单号</label>
                <div class="layui-input-inline">
                    <input type="text" id="orderNumber"
                           name="orderNumber" required
                           lay-verify="orderNumber" placeholder="请输入订单号" autocomplete="off"
                           class="layui-input">
                </div>
                <div class="mds-form-input-aux">PS：订单号只能是数字</div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>用户id</label>
                <div class="layui-input-inline">
                    <input type="text" id="uid" name="uid"
                           required lay-verify="required"
                           placeholder="请输入用户id" autocomplete="off" class="layui-input">
                </div>
                <div class="mds-form-input-aux">PS：用户id只能是数字</div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>支付金额</label>
                <div class="layui-input-block">
                    <input type="text" id="payPrice" name="payPrice"
                           required lay-verify="required"
                           placeholder="随便写点什么吧" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>是否支付</label>
                <div class="layui-input-inline">
                    <input type="text" id="isPay" name="isPay"
                           required lay-verify="required"
                           placeholder="请输入是否支付" autocomplete="off" class="layui-input">
                </div>
                <div class="mds-form-input-aux">PS：已支付1，未支付0</div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">支付时间</label>
                <div class="layui-input-block">
                    <input class="layui-input" id="payTime" name="payTime" placeholder="请选择支付时间" required lay-verify="required">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">是否发货</label>
                <div class="layui-input-block">
                    <input class="layui-input" id="isShip" name="isShip" placeholder="是否发货" required lay-verify="required" >
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>发货时间</label>
                <div class="layui-input-block">
                    <input type="text" id="shipTime" name="shipTime"
                           required lay-verify="required"
                           placeholder="发货时间" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">是否收货</label>
                <div class="layui-input-block">
                    <input class="layui-input" id="isReceipt" name="isReceipt" placeholder="是否收货" required lay-verify="required" >
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>收货时间</label>
                <div class="layui-input-block">
                    <input type="text" id="receiptTime" name="receiptTime"
                           required lay-verify="required"
                           placeholder="请输入收货时间" autocomplete="off" class="layui-input">
                </div>
            </div>


            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>订单编号</label>
                <div class="layui-input-block">
                    <input type="text" id="shipNumber" name="shipNumber"
                           required lay-verify="required"
                           placeholder="请输入订单编号" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>订单状态</label>
                <div class="layui-input-block">
                    <input type="text" id="status" name="status"
                           required lay-verify="required"
                           placeholder="请输入订单状态10" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>更新时间</label>
                <div class="layui-input-block">
                    <input type="text" id="updateTime" name="updateTime"
                           required lay-verify="required"
                           placeholder="请输入更新" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"><font color="red">*</font>创建时间</label>
                <div class="layui-input-block">
                    <input type="text" id="createTime" name="createTime"
                           required lay-verify="required"
                           placeholder="请输入创建时间" autocomplete="off" class="layui-input">
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