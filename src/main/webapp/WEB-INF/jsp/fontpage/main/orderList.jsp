<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>当当图书 – 全球最大的中文网上书店</title>
    <%--<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />--%>
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/bookList.js"></script>
    <link rel="stylesheet" type="text/css" href="assets/css/user/account/base.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/user/account/common.css" />
    <link rel="stylesheet" type="text/css" href="assets/css/user/account/orderlist.css" />
    <style type="text/css">
        body, ul, li, ol, p, dl, dd, h1, h2, h3, h4, h5, h6, img, iframe, form, div {
            margin: 0;
            padding: 0;
            list-style-type: none;
            border: 0;
        }

        /*顶部*/
        #hd {
            font: 12px 'Hiragino Sans GB', "simsun", "Arial";
            color: #646464;
            min-width: 1200px;
            background-color: #fff;
        }

        #hd .tools {
            width: 100%;
            background-color: #f9f9f9;
            border-bottom: 1px solid #f2f2f2;
            height: 34px;
            line-height: 34px;
            position: relative;
            z-index: 10010;
        }

        .tools .ddnewhead_operate {
            width: 1200px;
            margin: 0 auto;
            background-color: #f9f9f9;
            height: 34px;
        }

        .tools .ddnewhead_operate_nav {
            float: right;
            padding-top: 2px;
        }

        .ddnewhead_operate_nav li {
            float: left;
            height: 22px;
            padding-top: 4px;
            line-height: 21px;
            background: url(http://img63.ddimg.cn/upload_img/00459/home/head_sprite.png) no-repeat left -285px;
            position: relative;
            z-index: 100;
        }

        #hd .tools a, #hd .tools a:hover {
            text-decoration: none;
        }

        #hd a {
            color: #646464;
            text-decoration: none;
        }

        .ddnewhead_operate_nav li a {
            display: block;
            position: relative;
            line-height: 21px;
            padding: 0 7px 0 8px;
        }

        #hd .new_head_znx {
            float: right;
            position: relative;
            padding-top: 2px;
            margin-right: -1px;
            z-index: 100;
            font-family: arial, simsun;
        }

        .tools .ddnewhead_welcome {
            padding: 5px 0 0 10px;
            height: 24px;
            line-height: 24px;
            position: relative;
            float: right;
            z-index: 50;
        }

        .tools .ddnewhead_welcome a.login_link {
            color: #ff2832 !important;
        }

        .tools .ddnewhead_welcome a {
            display: inline-block;
            margin-right: 4px;
        }



        .ddnewhead_welcome .tel_pop_box li {
            height: 158px;
            margin-top: 3px;
            width: 104px;
            text-align: center;
            line-height: 18px;
            overflow: hidden;
        }

        #hd .logo_line_out {
            position: relative;
            z-index: 10002;
        }

        #hd .logo_line {
            height: 100px;
            width: 1200px;
            margin: 0 auto;
            position: relative;
        }

        #hd .logo_line .logo {
            overflow: hidden;
            width: 362px;
            vertical-align: middle;
            position: absolute;
            left: 0;
            top: 0;
        }

        map {
            display: inline;
        }

        #hd .logo_line .search {
            position: absolute;
            margin-top: 20px;
            height: 48px;
            z-index: 9999;
            left: 362px;
            top: 0;
        }

        #hd .logo_line .search form {
            display: block;
            height: 50px;
        }


        label {
            cursor: default;
        }

        #hd .logo_line .search .text {
            width: 398px;
            height: 18px;
            border: 2px solid #ff2832;
            border-right: none;
            padding: 9px 0 9px 10px;
            position: absolute;
            left: 0;
            top: 0;
            z-index: 2;
            color: #323232;
            font: 12px/18px 'Hiragino Sans GB', "simsun", Arial;
            outline: 0;
            background: none;
        }

        #hd a {
            color: #646464;
            text-decoration: none;
        }

        #hd .logo_line .search .select {
            position: absolute;
            top: 0px;
            left: 410px;
            border: 2px solid #ff2832;
            border-left: 0px solid #dedede;
            width: 92px;
            height: 36px;
            font: 16px/36px "Microsoft Yahei";
            color: #969696;
            padding: 0 0 0 14px;
            cursor: pointer;
            background-color: #f6f6f6;
        }

        #hd .logo_line .search .button {
            width: 48px;
            height: 40px;
            border: none;
            background: url(http://img63.ddimg.cn/upload_img/00459/home/head_sprite.png) no-repeat 0 -346px;
            cursor: pointer;
            position: absolute;
            left: 517px;
            top: 0;
        }

        #hd .logo_line .search_bottom {
            position: absolute;
            top: 65px;
            left: 362px;
            color: #969696;
            width: 585px;
            line-height: 20px;
            z-index: 6666;
        }

        #hd .logo_line .search_bottom a, #hd .logo_line .search_bottom a:hover {
            color: #969696;
            margin-right: 15px;
            _display: inline;
            height: 20px;
            overflow: hidden;
        }





        #hd .logo_line .ddnew_cart a, .logo_line .ddnew_cart a b {
            color: #fff;
        }

        #hd a {
            color: #646464;
            text-decoration: none;
        }

        .logo_line .ddnew_cart a {
            padding-left: 35px;
            width: 72px;
            display: inline-block;
        }

        #hd .logo_line .ddnew_cart a, .logo_line .ddnew_cart a b {
            color: #fff;
        }

        .logo_line .ddnew_cart a b, .logo_line .ddnew_order a b, .logo_line .ddnew_cart a:hover b {
            color: #ff2832;
            padding-left: 3px;
            font-family: Arial;
            font-weight: bold;
        }



        .logo_line .ddnew_order a {
            display: inline-block;
            width: 86px;
        }

        #hd .sub {
            background: #f5f5f5;
            float: none;
            width: auto;
        }

        #hd .sub ul {
            height: 31px;
            margin: 0 auto;
            overflow: hidden;
            line-height: 30px;
            width: 1200px;
        }

        #hd .sub ul li {
            float: left;
            padding: 0 15px;
            margin-left: -1px;
            white-space: nowrap;
            background: url(http://img4.ddimg.cn/header/header2014/sub_line_bg.png) right center no-repeat;
            _line-height: 12px;
            _padding: 9px 15px 8px;
        }




        .shoplist .bigimg li {
            height: 242px;
            width: 960px;
            position: relative;
            background: #fff;
            -webkit-transition: all .2s ease-in-out;
            -moz-transition: all .2s ease-in-out;
            -o-transition: all .2s ease-in-out;
            -ms-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
            padding-left: 20px;
        }



        .shoplist .bigimg li .name a {
            font-size: 14px;
            color: #1a66b3;
            font-family: simsun;
        }

        a {
            text-decoration: none;
            outline: none;
        }


        .search_star_black span {
            background: url(../assets/images//icon_star3.png) repeat-x;
            height: 16px;
            line-height: 16px;
            display: inline-block;
            font-size: 12px;
        }


        .price .search_e_price span {
            font-size: 12px;
            font-family: 微软雅黑;
            display: inline-block;
            background-color: #739cde;
            color: white;
            padding: 2px 3px;
            line-height: 12px;
            border-radius: 2px;
            margin: 0 4px 0 5px;
        }

        .search_e_price i {
            color: #214c90;
            font-family: arial;
            font-size: 18px;
        }

        .search_e_price i {
            color: #fa5000;
            font-style: normal;
        }

    </style>

</head>

<body style="background-color: white">

<div id="hd">
    <div id="tools">
        <div class="tools">
            <div class="ddnewhead_operate">
                <ul class="ddnewhead_operate_nav">
                    <li><a target="_blank" href="selectOrderByUserId" name="mydd_7" dd_name="新_我的订单">我的订单<b id="orderAmount" style="color: red"></b></a></li>
                    <li><a target="_blank" href="detailToCart" name="mydd_8" dd_name="新_购物车" rel="nofollow">购物车<b id="cartAmount" style="color: red"></b></a></li>
                    <li><a target="_blank" href="toMyCollection" name="mydd_1" dd_name="我的收藏" rel="nofollow">我的收藏</a></li>
                </ul>
                <div class="new_head_znx" id="znx_content" style="display:none;"></div>
                <div class="ddnewhead_welcome" display="block;">
                    <span id="nickname"><span class="hi">Hi，<a href="http://myhome.dangdang.com/" class="login_link" target="_blank"><b>${fontUserName}</b></a><a href="UserExit" target="_self">[退出]</a></span></span
                </div>
            </div>
        </div>
    </div>

    <div style=" position:relative;" class="logo_line_out">
        <div class="logo_line" dd_name="搜索框">
            <div class="logo"><img src="../assets/dangdang_image/360-100LOGOewm-1516155836.png" usemap="#logo_link">
                <map name="logo_link" id="logo_link" dd_name="logo区"><area shape="rect" coords="0,18,200,93" href="http://www.dangdang.com" title="当当" onfocus="this.blur();">
                    <area shape="rect" coords="200,18,320,93" href="http://t.dangdang.com/20170929_4xss" title="" target="_blank" onfocus="this.blur();"></map>
            </div>
            <div class="search">
                <form action="toBookList" name="searchform" id="form_search_new"  method="POST">
                    <input type="text" class="text gray" name="key" id="key_S">
                    <span class="select">
							<span id="Show_Category_Name">全部分类</span>
							<span class="icon"></span>
						</span>
                    <input type="button" class="button"  id="clickButton">
                </form>
            </div>
            <div class="search_bottom">
                <a href="http://search.dangdang.com/advsearch" class="search_advs" target="_blank" name="ddnav_adv_s" dd_name="高级搜索">高级搜索</a>
            </div>
        </div>
    </div>
</div>

<div class="mu_content_wrap">
    <div class="order-title">
        <ul class="order-title-column clearfix">
            <li class="goods">商品</li>
            <li class="price">单价(元)</li>
            <li class="quantity">数量</li>
            <li class="total">实付款(元)</li>
            <%--<li class="status">交易状态</li>--%>
            <%--<li class="other">操作</li>--%>
        </ul>
        <div class="clear_f"></div>
        <div id="orderWrap">
            <div class="order-list">
                <div class="order-section unpaid" data-payid="62431339929553">
                    <table class="order-table">
                        <tbody>
                        <c:forEach var="order" items="${orders}">
                            <tr class="order-table-header">
                                <td colspan="7" style="overflow: hidden">
                                    <div class="order-info fl">
                                        <span class="no">
                                            订单编号：
                                            <span class="order_num"> ${order.order.orderNumber} </span>
                                        </span>
                                        <span class="deal-time">
                                            成交时间：${order.order.createTime}
                                        </span>
                                        <%--<span class="deal-time">--%>
                                            <%--收货人: ${order.deliveryAddress.receiverName}--%>
                                        <%--</span>--%>
                                        <%--<span class="deal-time">--%>
                                            <%--电话: ${order.deliveryAddress.cellphone}--%>
                                        <%--</span>--%>
                                            <%--<span class="deal-time">--%>
                                            <%--地址: ${order.deliveryAddress.area.areaName}--%>
                                            <%--</span>--%>
                                    </div>
                                </td>
                            </tr>
                            <c:forEach items="${order.orderItemList}" var="item" varStatus="status">
                                <tr class="order-table-item">
                                    <td >
                                        <a class="pic" href="/goodToDetail?bDBid=${item.bDBid}&bookId=${item.goodsId}" title="查看宝贝详情" hidefocus="true" target="_blank">
                                                <img src="assets/images/${item.image}" alt="查看宝贝详情" width="70">
                                        </a>
                                        <div>
                                            <p>
                                                    <a href="http://www.mogujie.com/detail/1kadmj2" target="_blank">${item.goodsName}</a>
                                            </p>
                                        </div>
                                    </td>
                                    <td>
                                            <p class="price-old">${item.goodsPrice}</p>
                                    </td>

                                    <td>${item.goodsNum}</td>
                                        <%--<td class="aftersale"></td>--%>

                                    <td>${order.order.payPrice}</td>
                                    <%--<td  rowspan="1">--%>
                                        <%--<p class="wait_pay">--%>
                                            <%--<c:if test="${order.status == 0}">待付款</c:if>--%>
                                            <%--<c:if test="${order.status == 1}">已付款</c:if>--%>
                                            <%--<c:if test="${order.status == 4 || order.status == 5}">已删除</c:if>--%>
                                        <%--</p>--%>
                                            <%--&lt;%&ndash;<a href="/order/detail4buyer?orderId=62431339939553" class="order-link go-detail-link" target="_blank">订单详情</a>&ndash;%&gt;--%>
                                    <%--</td>--%>
                                    <%--<td class="other" colspan="2" rowspan="1">--%>
                                        <%--<c:if test="${status.first && (order.status == 0)}">--%>
                                            <%--<a class="order-link order-cancel" href="javascript:;" data-id="${order.orderID}">取消订单</a>--%>
                                        <%--</c:if>--%>
                                        <%--<c:if test="${status.first && (order.status == 1)}">--%>
                                            <%--<a class="order-link order-remove" href="javascript:;" data-id="${order.orderID}">删除订单</a>--%>
                                        <%--</c:if>--%>
                                    <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                                </tr>
                            </c:forEach>
                            <%--<tr class="order-table-footer">--%>
                                <%--<td colspan="4">--%>
                                        <%--&lt;%&ndash;<ul>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<li>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<a class="order-link order-cancel" href="javascript:;" data-payid="62431549059553">取消订单</a>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
                                <%--</td>--%>
                                <%--<td class="status">--%>
                                        <%--&lt;%&ndash;<p class="wait_pay">等待付款</p>&ndash;%&gt;--%>
                                <%--</td>--%>
                                <%--<c:choose>--%>
                                    <%--&lt;%&ndash;<c:when test="${order.status == 0}">&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<td class="total">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<span class="sub">总计：</span>￥ <fmt:formatNumber value="${total}" pattern="0.00"/>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<td class="other">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<a class="order-btn primary order-pay" data-id="${order.orderID}" target="_blank" href="javascript:void(0);">付款</a>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;</c:when>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;<c:otherwise>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;<td class="total other" colspan="2">&ndash;%&gt;--%>
                                            <%--&lt;%&ndash;<span class="sub">总计：</span>￥ <fmt:formatNumber value="${total}" pattern="0.00"/>&ndash;%&gt;--%>
                                        <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;</c:otherwise>&ndash;%&gt;--%>
                                <%--</c:choose>--%>
                                    <%--<td class="other">--%>
                                    <%--<a class="order-btn primary order-pay" target="_blank" href="/order/cashier?orderId=62431339929553">付款</a>--%>
                                    <%--</td>--%>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <%--<div id="paginator-list"></div>--%>
            <%--<c:if test="${!empty orders && pageInfo.totalPage > 1}">--%>
                <%--<div style="height: 40px;margin-left: 30%;" class="M-box"></div>--%>
            <%--</c:if>--%>
            <form id="pay-form" action="http://www.itppay.com/newsdk/api/v1.0/cli/order_pc/0" method="post">
                <input type="hidden" id="orderInfo" name="orderInfo" value="">
            </form>
        </div>
    </div>
</div>
</body>
</html>




