<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>购物车</title>
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/shopCart.js"></script>
    <style type="text/css">
        body, ul, li, ol, p, dl, dd, h1, h2, h3, h4, h5, h6, img, iframe, form, div {
            margin: 0;
            padding: 0;
            list-style-type: none;
            border: 0;
        }
        /*顶部*/
        #hd {
            font: 12px 'Hiragino Sans GB',"simsun","Arial";
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
            background: url(assets/dangdang_image/head_sprite.png) no-repeat left -285px;
            position: relative;
            z-index: 100;
        }
        .ddnewhead_operate_nav li .icon_card {
            float: left;
            width: 15px;
            height: 14px;
            background: url(assets/dangdang_image/home_sprite.png) no-repeat -40px -86px;
            overflow: hidden;
            margin: 3px 9px 0 0;
        }
        .ddnewhead_operate_nav li.ddnewhead_cart b {
            color: #ff2832;
            font: bold 12px "Arial";
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
            font-family: arial,simsun;
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
            color: #ff2832!important;
        }
        .tools .ddnewhead_welcome a {
            display: inline-block;
            margin-right: 4px;
        }
        .tools .ddnewhead_welcome .tel_pop {
            position: absolute;
            height: 201px;
            left: 0;
            top: 2px;
        }
        #hd .tel_pop a.title, #hd .tel_pop a.title:hover {
            color: #ff2832;
        }
        .ddnewhead_welcome .tel_pop .icon_tel {
            float: left;
            width: 11px;
            height: 16px;
            margin: 6px 5px 0 0;
            _display: inline;
            background: url(assets/dangdang_image/head_sprite.png) no-repeat -51px -70px;
        }
        .ddnewhead_welcome .tel_pop .title_shadow {
            display: block;
            position: absolute;
            top: 36px;
            left: 1px;
            height: 5px;
            width: 79px;
            background-color: #fff;
            font-size: 0;
            line-height: 0;
        }
        .ddnewhead_welcome .tel_pop .tel_pop_box {
            border: 1px solid #e6e6e6;
            background-color: #fff;
            box-shadow: 1px 1px 2px #dfdfdf;
            width: 104px;
        }
        .ddnewhead_welcome .tel_pop_box li {
            height: 158px;
            margin-top: 3px;
            width: 104px;
            text-align: center;
            line-height: 18px;
            overflow: hidden;
        }

        /*购物车商品流程*/
        .logo_line {
            width: 100%;
            border-bottom: 4px solid #ff2832;
            height: 100px;
        }
        .w960 {
            width: 960px;
            margin: 0 auto;
        }
        .shopping_procedure {
            float: right;
            width: 634px;
            height: 36px;
            background: url(assets/dangdang_image/procedure_bg.png) 0 0 no-repeat;
            font: bold 14px/36px "Microsoft Yahei";
            color: #646464;
            margin: 30px 0 0;
        }

        .shopping_procedure span {
            width: 211px;
            display: inline-block;
            text-align: center;
        }
        .shopping_procedure span.current {
            color: #fff;
            width: 206px;
        }
        .logo_line .logo {
            padding: 20px 0 0 15px;
        }
        /*购物车商品信息*/
        .w960 {
            width: 960px;
            margin: 0 auto;
        }
        .shopping_title {
            line-height: 36px;
            height: 36px;
            margin-top: 10px;
        }
        .shopping_title .f1 {
            text-align: left;
            width: 202px;
        }
        a:link, a:visited {
            text-decoration: none;
            color: #323232;
        }
        a.checknow {
            display: inline-block;
            width: 12px;
            height: 12px;
            border: 1px solid #bcbcbc;
            background-color: #fff;
            text-decoration: none;
            border-radius: 3px;
            font-size: 0;
            font-size: 0;
            line-height: 0;
            overflow: hidden;
            margin: 0 10px 0 0;
            vertical-align: text-bottom;
        }
        .shopping_title li {
            float: left;
            text-align: center;
            font-size: 12px;
        }
        .shopping_title .f2 {
            text-align: left;
            width: 280px;
        }
        .shopping_title .f3, .shopping_list .row3 {
            width: 130px;
        }
        .shopping_title .f4, .shopping_list .row4 {
            width: 200px;
        }
        shopping_title .f5, .shopping_list .row5 {
            width: 70px;
        }
        .shop_title {
            color: #323232;
            font-weight: bold;
            line-height: 24px;
            height: 24px;
            margin: 10px 0;
            padding-left: 15px;
        }
        .shop_title a {
            color: #323232;
        }
        .shop_icon {
            width: 18px;
            height: 18px;
            display: inline-block;
            background: url(assets/dangdang_image/icon_sprite.png) 0 -30px no-repeat;
            margin: 10px 6px 0 0;
            padding-top: 3px;
        }
        .shoppingcart_loading {
            height: 130px;
            padding-top: 80px;
            text-align: center;
            border-top: 1px solid #efeae5;
            border-bottom: 5px solid #efeae5;
        }

        .hide {
            display: none;
        }
        .dangdang_icon{font-size: 12px;}
        .shopping_list .bb_none td {
            border-bottom: none 0;
        }
        .shopping_list td {
            vertical-align: top;
            padding-top: 15px;
            position: relative;
            line-height: 22px;
            text-align: center;
            border-bottom: 1px solid #e4e4e4;
        }
        .shopping_list .row1 {
            padding: 0 0 0 10px;
            width: 42px;
            vertical-align: middle;
            border-bottom: 0;
        }
        .shopping_list .row_img {
            padding: 20px 20px 20px 0;
            width: 80px;
            border-bottom: 0;
            position: relative;
            z-index: 9;
            font-size: 0;
            line-height: 0;
        }
        .tree_first .row_img {
            background: url(assets/dangdang_image/tree.png) 40px 60px no-repeat;
        }
        .shopping_list .row_name {
            width: 300px;
            line-height: 18px;
            text-align: left;
            position: relative;
            padding-top: 17px;
            font-size: 12px;
        }
        .shopping_list .row_name .name {
            display: block;
            width: 100%;
            height: 36px;
            overflow: hidden;
            margin-bottom: 27px;
        }
        .shopping_list .row_name .name a {
            color: #323232;
        }
        .shopping_title .f3, .shopping_list .row3 {
            width: 200px;
        }
        .shopping_list td span {
            display: block;
            font-size: 12px;
        }
        .shopping_list .amount.red {
            border-color: #ff2832;
        }
        .shopping_list td .red {
            color: #ff2832;
        }
        .shopping_list .amount {
            border: 1px solid #dcdcdc;
            height: 28px;
            width: 94px;
            line-height: 28px;
            font-size: 14px;
            margin: 5px auto;
            overflow: hidden;

        }
        .shopping_list .amount a {
            display: block;
            float: left;
            height: 28px;
            width: 28px;
            background-color: #f4f4f4;
        }
        .shopping_list .amount input {
            width: 36px;
            height: 28px;
            line-height: 28px\9;
            float: left;
            padding: 0;
            text-align: center;
            border: 1px solid #dcdcdc;
            border-width: 0 1px;
            background-color: #fff;
            font-weight: bold;
        }
        .shopping_list {
            width: 958px;
            border: 1px solid #ebebeb;
            background-color: #fafafa;
            margin-bottom: 40px;
        }
        .shopping_list .amount a {
            display: block;
            float: left;
            height: 28px;
            width: 28px;
            background-color: #f4f4f4;
        }
        .shopping_list td .red {
            color: #ff2832;
        }
        .shopping_list td span {
            display: block;
        }
        .shopping_list .row4 {
            color: #323232;
        }
        .shopping_title .f5, .shopping_list .row5 {
            width: 70px;
        }
        .shopping_list .total td.row_img {
            text-align: center;
            color: #323232;
            font-weight: bold;
            line-height: 22px;
            font-size: 12px;
            padding: 15px 20px 15px 0;
        }
        .shopping_list .total td {
            border-bottom: none 0;
            border-top: 1px solid #dcdcdc;
        }
        .shopping_list .total td {
            border-bottom: none 0;
            border-top: 1px solid #dcdcdc;
        }
        .shopping_list .total td.row4 {
            text-align: right;
            line-height: 18px;
            position: relative;
            padding-top: 10px;
        }
        .shopping_list .total td.row4 .big.ooline {
            padding-top: 8px;
        }
        .shopping_list .total td.row4 .big {
            font-size: 16px;
        }
        .shopping_list .total td.row4 .alignright {
            padding-right: 144px;
        }
        .shopping_list td .red {
            color: #ff2832;
        }
        .shopping_list td span {
            display: block;
        }
        .shopping_list .total td.row4 .shipping_tip {
            position: absolute;
            left: -66px;
            top: 18px;
        }

        /*结算*/
        .shopping_total {
            width: 960px;
            height: 72px;
            z-index: 10;
            margin: 20px auto;
            padding: 0 62px;
            background: url(assets/images/shopping_total.png) 0 center no-repeat;
            position: relative;
        }
        .shopping_total .shopping_total_right {
            float: right;
            margin: 18px 0 0;
            width: 530px;
            position: relative;
        }
        .shopping_total .unable, .shopping_total .unable:hover {
            cursor: default;
            background-color: #e1e1e1;
        }
        .shopping_total .total_btn {
            float: right;
            display: block;
            width: 116px;
            height: 38px;
            font: bold 18px/38px "Microsoft Yahei";
            color: #fff;
            background-color: #ff2832;
            border-radius: 2px;
            text-align: center;
            margin-top: 4px;
        }
        .shopping_total .subtotal {
            padding-right: 30px;
            line-height: 24px;
            float: right;
        }
        .shopping_total .subtotal .cartsum {
            width: 114px;
            text-align: right;
            padding: 0 8px 0 0;
            font-size: 12px;
        }
        .shopping_total .subtotal .price {
            font-size: 18px;
            color: #ff2832;
        }
        .shopping_total .subtotal .cartsum {
            width: 114px;
            text-align: right;
            padding: 0 8px 0 0;
        }
        .shopping_total .shopping_total_left {
            float: left;
            line-height: 58px;
            width: 430px;
            position: relative;
        }
        .shopping_total .shopping_total_left a.checknow {
            margin: 0 6px 0 0;
        }
        .shopping_total .shopping_total_left a {
            margin-left: 28px;
            font-size: 12px;
        }
        .pop_del p {
            font-size: 14px;
            color: #323232;
            line-height: 18px;
            padding: 25px 0;
        }
        .pop_del.col {
            background-image: none;
        }
        .shopping_total .shopping_total_left span {
            margin-left: 80px;
            font-size: 12px;
        }
        .selectAll{font-size: 12px;}
        #bookimg{
            width: 80px;
            height: 80px;
        }
        .shopping_list .row_img {
            padding: 20px 20px 20px 0;
            width: 80px;
            border-bottom: 0;
            position: relative;
            z-index: 9;
            font-size: 0;
            line-height: 0;
        }
        #hd .logo_line .logo {
            overflow: hidden;
            width: 362px;
            vertical-align: middle;
            position: absolute;
            left: 0;
            top: 0;
        }
        a.check_on, a.check_on:hover {
            border-color: #ff2832;
            background: #ff2832 url(assets/dangdang_image/icon_sprite.png) no-repeat -65px -1px;
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
</div>

<!--头部结束-->

<div class="logo_line">
    <div class="w960">
        <div class="shopping_procedure"><span class="current">我的购物车</span><span>填写订单</span><span>完成订单</span></div>
        <div class="logo"><a href="#"><img src="assets/dangdang_image/dd_logo.jpg?v=20171226"  style="margin-top: 30px;"></a></div>
    </div>
</div>

<!--购物车商品-->
<div class="w960" id="cart">
    <ul class="shopping_title" id="j_carttitle">
        <li class="f1">
            <a id="j_selectall" href="updateAllCarGoodStatus" class="checknow fn-checkall check_on" dd_name="全选">选中</a>全选</li>
        <li class="f2">商品信息</li>
        <li class="f3">单价（元）</li>
        <li class="f4">数量</li>
        <li class="f5">操作</li>
    </ul>
    <div class="fn-shops" id="J_cartContent">
        <div class="fn-shop">
            <div class="shopping_list">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tbody class="goodCart"></tbody>
                    <tfoot></tfoot>
                </table>
            </div>
        </div>
    </div>
</div>

<!--结算-->
<div class="shopping_total" id="J_totalMoneyBlock">
    <div class="shopping_total_right">
        <a class="total_btn fn-checkout unable" href="cartToOrder" id="checkout_btn" dd_name="结算">结&nbsp;&nbsp;算</a>
        <div class="subtotal">
            <p><span class="cartsum">总计(不含运费)：</span><span id="payAmount" class="price">¥0.00</span></p>
            <p><span class="cartsum">已节省：</span><span id="totalFavor">¥0.00</span></p>
        </div>
    </div>
    <div class="shopping_total_left" id="J_leftBar">
        <div id="J_batchRemoveProductBox" style="display: none;z-index:-1;left:0px;" class="pop_del"><p>您确定要批量删除商品吗？</p><a href="javascript:;" class="pop_btn fn-confirm-batchremovebox">确定</a><a href="javascript:;" class="pop_btn fn-close-batchremovebox">取消</a></div>
        <div id="J_batchAddWishBox" style="display: none;z-index:-1;left:85px;" class="pop_del col "><p>您确定要批量移入收藏吗？</p><a href="javascript:;" class="pop_btn fn-confirm-batchaddwish">确定</a><a href="javascript:;" class="pop_btn fn-close-batchwishbox">取消</a></div>
    </div>
</div>

</body>
</html>
