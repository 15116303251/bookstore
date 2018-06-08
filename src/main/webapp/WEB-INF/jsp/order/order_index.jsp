<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="assets/js/order/order_index.js"></script>s

<div class="body_center" style="overflow: auto">
	<div class="colla-panel">
		<div class="colla-content">
			<form class="layui-form">
				<div class="layui-form-item">
					<label class="layui-form-label">订单编号：</label>
					<div class="layui-input-inline">
						<input type="text" id="query_order_id" name="order_id" placeholder=""
							autocomplete="off" class="layui-input">
					</div>
					<label class="layui-form-label">是否支付：</label>
					<div class="layui-input-inline">
						<input type="text" id="query_pay" name="isPay" placeholder=""
							   autocomplete="off" class="layui-input">
					</div>

					<label class="layui-form-label">是否发货：</label>
					<div class="layui-input-inline">
						<input type="text" id="query_ship" name="isShip" placeholder=""
							   autocomplete="off" class="layui-input">
					</div>

					<label class="layui-form-label">是否收货：</label>
					<div class="layui-input-inline">
						<input type="text" id="query_receipt" name="isReceipt" placeholder=""
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
			<button class="layui-btn layui-btn-primary" id="orderAdd">
				<i class="iconfont">&#xe6e2;</i> 添加
			</button>
			<button class="layui-btn layui-btn-primary" id="orderkDel">
				<i class="iconfont">&#xe6f7;</i> 删除
			</button>
 --%>
			<button class="layui-btn layui-btn-primary" id="bookRefresh">
				<i class="iconfont">&#xe71e;</i> 刷新
			</button>
		</div>
	</div>

	<div id="table"></div>
</div>
