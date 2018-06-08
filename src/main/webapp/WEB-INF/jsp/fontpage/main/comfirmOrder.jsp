<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style type="text/css">
        body,
        ul,
        li,
        ol,
        p,
        dl,
        dd,
        h1,
        h2,
        h3,
        h4,
        h5,
        h6,
        img,
        iframe,
        form,
        div {
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

        #hd .tools a,
        #hd .tools a:hover {
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

        #hd .tel_pop a.title,
        #hd .tel_pop a.title:hover {
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
            background: url(assets/dangdang_image/procedure_bg2.png) 0 0 no-repeat;
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

        .checkout_tip {
            background-color: #fff5f5;
            border: 1px solid #ffecec;
            color: #323232;
            line-height: 34px;
            padding: 0 10px;
            margin: 10px auto 0;
            font-size: 12px;
        }

        .icon_tip {
            width: 18px;
            height: 18px;
            display: inline-block;
            background: url(assets/dangdang_image/icon_bg.png) 0 -140px no-repeat;
            margin: 0 10px 0 0;
            vertical-align: middle;
        }

        .checkout_tip b {
            display: inline-block;
        }

        .checkout_tip .con {
            display: inline-block;
            vertical-align: top;
            line-height: 24px;
            padding: 6px 0;
        }

        .address {
            padding: 0 0 20px;
        }

        h1.title {
            font-size: 16px;
            color: #000;
            line-height: 22px;
            padding: 10px 0;
            font-weight: bold;
        }

        .address .addr_list {
            height: 140px;
            overflow: hidden;
            position: relative;
        }

        .addr_list ul {
            width: 955px;
            overflow: hidden;
            font-size: 12px;
        }

        .addr_list .addr.active {
            border-color: #ff2832;
        }

        .addr_list .addr {
            width: 192px;
            padding: 8px 12px 0 12px;
            height: 114px;
            float: left;
            line-height: 22px;
            background: #fbfbfb;
            margin: 0 18px 20px 0;
            position: relative;
            color: #000;
            border: 2px solid #e6e4e2;
            cursor: pointer;
        }

        .addr_list .addr h1 {
            font-weight: bold;
            line-height: 30px;
            border-bottom: 1px solid #e6e6e6;
            padding: 0 8px;
            margin-bottom: 4px;
            font-size: 12px;
        }

        .addr_list .addr h1 span {
            float: right;
            font-size: 12px;
        }

        .addr_list .addr p {
            height: 22px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            padding: 0 0 0 8px;
        }

        .addr_list .addr .addr_mo {
            display: block;
            position: absolute;
            bottom: 14px;
            right: 14px;
            color: #956767;
            line-height: 14px;
        }

        .addr_list .addr .addr_mo em {
            background: url(assets/dangdang_image/icon_bg.png) 0 0 no-repeat;
            display: inline-block;
            width: 10px;
            height: 14px;
            margin-right: 5px;
            vertical-align: bottom;
        }

        a:link,
        a:visited {
            text-decoration: none;
            color: #323232;
        }

        .btn {
            border: 1px solid rgb( 220, 220, 220);
            border-radius: 2px;
            color: #000;
            display: inline-block;
            line-height: 22px;
            padding: 0 10px;
            height: 22px;
            margin-right: 10px;
            vertical-align: baseline;
            background: -moz-linear-gradient( 90deg, rgb(244, 243, 246) 0%, rgb(254, 254, 254) 100%);
            background: -webkit-linear-gradient( 90deg, rgb(244, 243, 246) 0%, rgb(254, 254, 254) 100%);
            background: -ms-linear-gradient( 90deg, rgb(244, 243, 246) 0%, rgb(254, 254, 254) 100%);
            background: #f5f5f5\9;
            font-size: 12px;
        }

        .w960 {
            width: 960px;
            margin: 0 auto;
        }

        h1.title {
            font-size: 16px;
            color: #000;
            line-height: 22px;
            padding: 10px 0;
            font-weight: bold;
        }

        a.modify {
            color: #1a66b3;
            padding-left: 10px;
            font-size: 12px;
            font-weight: normal;
        }

        .fr {
            float: right;
        }

        .shipping {
            padding: 0 0 10px;
        }

        .shipping .title,
        .payment .title {
            font-size: 14px;
            color: #505050;
            line-height: 18px;
            padding: 5px 0 10px;
        }

        .shipping .title .icon {
            width: 18px;
            height: 18px;
            display: inline-block;
            background: url(assets/dangdang_image/icon.png) 0 0 no-repeat;
            vertical-align: text-bottom;
            margin-right: 10px;
        }

        .ship_box {
            border: 1px solid #dcdcdc;
            line-height: 20px;
            margin-bottom: 20px;
            background: url(assets/dangdang_image/line.png) 316px 0 repeat-y;
        }

        .ship_box .left {
            padding: 18px 16px;
            width: 289px;
            float: left;
        }

        .ship_box p.method_tip {
            margin-top: -15px;
            padding: 6px 0 10px;
        }

        .ship_box .method li {
            display: inline-block;
            padding: 0 10px 10px 0;
        }

        .ship_box .method a.current {
            background: #ff2832;
            border-color: #ff2832;
            color: #fff;
            font-size: 14px;
        }

        .ship_box .method a {
            height: 28px;
            line-height: 28px;
            text-align: center;
            width: 94px;
            border: 1px solid #dcdcdc;
            border-radius: 2px;
            background-color: #f0f0f0;
            display: block;
        }

        .ship_box .left p,
        .ship_box .left .time {
            padding: 6px 0;
            position: relative;
        }

        .ship_box .left .time {
            z-index: 9;
            font-size: 12px;
        }

        .ship_box .left .time select {
            border: 1px solid #dcdcdc;
            border-radius: 2px;
            height: 20px;
            padding-left: 5px;
            font-family: microsoft yahei;
            font-size: 12px;
            color: #323232;
        }

        .ship_box .left {
            padding: 18px 16px;
            width: 289px;
            float: left;
        }

        .red {
            color: #ff2832;
        }

        .ship_box .right {
            float: left;
            width: 637px;
            font-size: 12px;
        }

        .ship_box p.method_tip {
            margin-top: -15px;
            padding: 6px 0 10px;
            font-size: 12px;
        }

        .icon_tip_s {
            width: 14px;
            height: 14px;
            display: inline-block;
            background: url(assets/dangdang_image/icon_bg.png) 0 -160px no-repeat;
            vertical-align: text-bottom;
            margin: 0 6px 0 0;
        }

        .clearfix {
            zoom: 1;
        }

        .ship_box .right .subpackage_title {
            padding: 0 20px;
            height: 40px;
            line-height: 40px;
            border-bottom: 1px solid #e0e0e0;
            background-color: #f5f5f5;
        }

        .ship_box .right .subpackage_title .charge {
            padding-left: 15px;
        }

        .ship_box .right .list {
            text-align: center;
        }

        .ship_box .right .list th.th_img {
            width: 96px;
        }

        .ship_box .right .list th {
            line-height: 36px;
            font-weight: normal;
        }

        .ship_box .right .list th.th_name {
            width: 265px;
        }

        .ship_box .right .list td {
            width: 90px;
            text-align: center;
            vertical-align: top;
            padding-bottom: 10px;
        }

        .ship_box .right .list .img {
            width: 80px;
            height: 70px;
            padding-left: 15px;
            position: relative;
        }

        .ship_box .right .list .name {
            width: 255px;
            text-align: left;
            padding-left: 5px;
            position: relative;
        }

        .ship_box .sub {
            clear: both;
            background-color: #f1f5f8;
            border-top: 1px solid #dcdcdc;
            padding: 5px 10px 5px 18px;
            line-height: 24px;
        }

        .ship_box .sub .sub_left {
            display: inline-block;
            width: 410px;
            vertical-align: top;
            font-size: 12px;
        }

        .ship_box .sub .sub_right {
            display: inline-block;
            width: 515px;
            text-align: right;
            font-size: 12px;
        }

        .ship_box .sub .sub_right span.tab {
            padding-left: 25px;
        }
        /*总额小计*/

        .total {
            border-top: 1px solid #e6e6e6;
            padding: 5px 0 10px;
            text-align: right;
            line-height: 26px;
            font-size: 12px;
        }

        .total .border {
            border-bottom: 1px solid #e6e6e6;
            padding: 5px 0;
            width: 228px;
            display: inline-block;
        }

        .total p {
            position: relative;
        }

        .total .name {
            width: 125px;
            display: inline-block;
        }

        .total_price {
            padding: 8px 0 3px;
        }

        .total p {
            position: relative;
        }

        .total_price .name {
            font-size: 14px;
        }

        .total .price {
            width: 100px;
            text-align: left;
            display: inline-block;
        }

        .total_price .price {
            font-size: 18px;
        }

        .total .confirm {
            border-top: 1px solid #e6e6e6;
            background-color: #f1f5f8;
            padding: 15px 20px 20px 0;
        }

        .total .confirm .big {
            font-size: 14px;
        }

        .submit .alart_con {
            width: 940px;
            padding: 10px;
            margin: 0 auto;
            text-align: right;
            color: #646464;
            line-height: 22px;
            border-bottom: 1px solid #ffe3e3;
        }

        .icon_tip {
            width: 18px;
            height: 18px;
            display: inline-block;
            background: url(assets/dangdang_image/icon_bg.png) 0 -140px no-repeat;
            margin: 0 10px 0 0;
            vertical-align: middle;
        }
        /*支付*/

        .submit {
            width: 960px;
            margin: 0 auto;
            background: #f1f5f8;
        }

        .submit .alart_con {
            width: 940px;
            padding: 10px;
            margin: 0 auto;
            text-align: right;
            color: #646464;
            line-height: 22px;
            border-bottom: 1px solid #ffe3e3;
        }

        .submit .box {
            width: 920px;
            padding: 20px;
            margin: 0 auto;
            text-align: right;
            color: #646464;
            line-height: 36px;
            height: 36px;
            font-size: 12px;
        }

        .submit .box .price {
            color: #323232;
            font-size: 14px;
            padding: 0 4px 0 20px;
        }

        .submit .box .price .red {
            font-size: 18px;
        }

        a.btn_red {
            background-color: #ff2832;
            height: 30px;
            line-height: 30px;
            text-align: center;
            display: inline-block;
            color: #fff;
            font-size: 14px;
            padding: 0 14px;
            border-radius: 3px;
            vertical-align: baseline;
            vertical-align: bottom\9;
        }

        .submit .box .btn_red {
            height: 36px;
            line-height: 36px;
            font-size: 16px;
            padding: 0 26px;
            margin-left: 20px;
        }
        /*新增地址弹出框*/
        #divDialog {
            position: absolute;
            border: 1px solid #b6aca2;
            background-color: white;
            position: absolute;
            z-index: 9999;
            margin-left:400px ;
        }
        .pop {
            border: 1px solid #cdcdcd;
            position: relative;
            display: inline-block;
            background-color: #fff;
        }
        .pop .close {
            position: absolute;
            top: 10px;
            right: 10px;
            width: 13px;
            height: 13px;
            display: block;
            background: url(../dangdang_image/icon_close.png) 0 0 no-repeat;
        }
        a:link, a:visited {
            text-decoration: none;
            color: #323232;
        }
        .pop .pop_title {
            height: 36px;
            line-height: 36px;
            padding: 0 10px;
            border-bottom: 1px solid #cdcdcd;
            font-size: 14px;
        }
        .pop .pop_con {
            padding: 15px;
        }
        .info_list ul {
            padding: 15px;
            font-size: 14px;
            line-height: 32px;
        }
        .info_list li {
            padding: 12px 0;
            position: relative;
        }
        .pop .btn_bar {
            text-align: center;
            padding: 0 0 5px;
        }
        a.btn_red {
            background-color: #ff2832;
            height: 30px;
            line-height: 30px;
            text-align: center;
            display: inline-block;
            color: #fff;
            font-size: 14px;
            padding: 0 14px;
            border-radius: 3px;
            vertical-align: baseline;
            vertical-align: bottom\9;
        }
        .pop .btn_bar .btn {
            height: 28px;
            line-height: 28px;
            padding: 0 20px;
            margin: 0 0 0 20px;
            font-size: 14px;
        }
        .info_list li .name {
            width: 76px;
            text-align: right;
            padding-right: 10px;
            display: inline-block;
            vertical-align: top;
        }
        .info_list li .select_add {
            position: relative;
            display: inline-block;
            font-size: 12px;
        }
        .info_list li .text {
            display: inline-block;
            height: 30px;
            padding: 0 12px 0 8px;
            color: #505050;
            margin-right: 8px;
            border: 1px solid #d2d2d2;
            border-radius: 3px;
            line-height: 30px;
            background: url(assets/dangdang_image/area_drop.png) right bottom no-repeat #fff;
            z-index: 8;
            position: relative;
        }
        .info_list li .area_pop {
            position: absolute;
            width: 369px;
            border: 1px solid #ccc;
            background-color: #fff;
            z-index: 7;
            padding: 0 2px;
            top: 30px;
            left: 0;
            min-height: 88px;
            _height: expression(this.scrollHeight < 88 ? "88px" : "auto");
        }
        input {
            padding: 0;
            margin: 0;
        }
        .info_list li .area_pop .tab {
            height: 27px;
            border-bottom: 1px solid #d2d2d2;
            padding: 0;
        }
        .info_list li .area_pop .tab li {
            height: 20px;
            float: left;
            margin: 7px 0 -1px 7px;
            padding: 0 6px;
            _display: inline;
            background: #f1f1f1 url(assets/dangdang_image/icon_drop.png) no-repeat right 5px;
            padding-right: 12px;
        }
    </style>
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/comfirmOrder.js"></script>
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
        <div class="shopping_procedure"><span>我的购物车</span><span class="current">填写订单</span><span>完成订单</span></div>
        <div class="logo">
            <a href="http://www.dangdang.com"><img src="assets/dangdang_image/dd_logo.png" alt="" ></a>
        </div>
    </div>
</div>

<div class="w960" style="min-height:650px;">
    <div id="div_checkout_tips" class="checkout_tip" style=""><span class="icon_tip"></span>
        <b>温馨提示：</b>
        <div class="con">
            <p>当当平台及销售商不会以任何理由，要求您点击任何网址链接进行退款或支付操作。</p>
        </div>
    </div>
    <!--收货人信息-->
    <div id="address_div" class="address" style="display: block;">
        <h1 class="title">收货人信息</h1>
        <div class="addr_list" id="address_content">
            <ul>
                <li class="addr active" id="address_block">
                    <h1>申旺<span>151****3251</span></h1>
                    <p>中国 湖南 长沙市 岳麓区 </p>
                    <p>****569号湖南商学院</p>
                    <div id="defalut" style="display: none;">
                        <span class="addr_mo">默认地址</span>
                    </div>
                    <div id="oper_111466186" style="display: block;">
                        <a href="#" id="edit_addr" style="display: block;float: left;padding-left: 10px">编辑</a>
                        <a href="#" id="del_addr" style="display: block;float: left;padding-left: 10px">删除 </a>
                        <a href="#" id="set_default" class="us" style="display: block; float: left;padding-left: 10px">设为默认地址</a>
                    </div>
                </li>
            </ul>
        </div>
        <p>
            <a href="javascript:void(0)" class="btn" id="btn_show_more_address" style="display: none;">展开地址<em class="bicon a_d"></em></a>
            <a href="javascript:void(0)" class="btn" id="btn_add_address">新增收货地址<em class="bicon"></em></a>
        </p>
    </div>


    <div id="divDialog" style="left: 7.5px; top: 174.5px; display: none">
        <div class="pop">
            <a href="javascript:void(0)" class="close" id="closeEdit"></a>
            <div class="pop_title">
                收货地址
            </div>
            <div class="pop_con">
                <form action="" method="" class="info_list">
                    <ul>
                        <li><input name="customerId" type="hidden" id="customerId" value="" /></li>
                        <li><span class="name">收货人</span>
                            <input name="customerName" type="text" id="txt_ship_name_edit" value="" maxlength="25">
                            <div class="alart_tip" style="display:none;" id="span_ship_name_valid_msg_edit"><span class="hide"></span>请填写收货人姓名 </div>
                            <div class="alart_tip" style="display:none;" id="span_ship_name_valid_msg_edit_eng"><span class="hide"></span>请用英文填写收货人姓名 </div>
                            <div class="alart_tip" style="display:none;" id="span_ship_name_valid_msg_charac_frobid"><span class="hide"></span>收货人姓名不能使用非法字符 </div>
                        </li>
                        <li><span class="name">手机号码</span>
                            <input name="customerPhone" type="text" id="phone" value=""  maxlength="20">
                            <div class="alart_tip" style="display:none;" id="span_ship_mb_valid_msg_edit"><span class="hide"></span>请正确填写手机号码或固定电话</div>
                            <div class="alart_tip" style="display:none;" id="MSG_PDDMONEY_SHIP_TEL_EMPTY"><span class="hide"></span>请填写移动电话，礼品卡激活信息将会在订单交易成功后发送到此号码上</div>
                        </li>
                        <li style="z-index:3;"><span class="name">所在地区</span>
                            <input name="bigAddress" type="text" id="txt_ship_mb_edit" value="" placeholder="湖南省 长沙市 岳麓区">
                        </li>
                        <li><span class="name">详细地址</span>
                            <input name="address" type="text" style="width:413px;" id="txt_ship_address_edit" value="" maxlength="150">
                            <div class="alart_tip" style="display:none;" id="span_ship_address_valid_msg_edit"><span class="hide"></span>请填写详细的街道地址，要求3个汉字或以上</div>
                            <div class="alart_tip" style="display:none;" id="span_ship_address_valid_msg_edit_eng"><span class="hide"></span>请用英文填写详细地址信息，至少五个字母</div>
                            <div class="alart_tip" style="display:none;" id="span_ship_address_valid_msg_charac_frobid"><span class="hide"></span>收货人详细地址不能使用非法字符 </div>
                            <div class="alart_tip" style="display:none;" id="span_ship_address_valid_msg_length_forbid"><span class="hide"></span>详细地址不可超过50个汉字或字符</div>
                            <ul id="ul_ship_address_prompt_edit" class="drop_tip" style="width:423px;display:none;"></ul>
                        </li>
                    </ul>
                </form>
                <div class="btn_bar">
                    <a href="javascript:void(0)" id="submitAdd" class="btn_red">新增地址</a>
                    <a href="javascript:void(0)" id="updateAdd" class="btn_red">更新</a>
                    <a href="javascript:void(0)" id="cancelAdd" class="btn">取消</a>
                </div>

            </div>
        </div>
    </div>

    <!--配送方式-->
    <div id="shipments_div" class="w960">
        <h1 class="title"><a href="detailToCart" class="fr modify">返回购物车</a>送货清单</h1>
        <div class="shipping">
            <div id="shipment_0_0_div">
                <div class="title"><span class="icon"></span>当当网</div>
                <div class="ship_box">
                    <div class="main">
                        <!-- 送货模块 -->
                        <div class="left" id="delivery_0_0">
                            <a href="#shipmentAnchor_0_0" name="shipmentAnchor" id="shipmentAnchor"></a>
                            <p class="method_tip red" style="color:black;"><span class="icon_tip_s" style="display:none;"></span>请选择配送方式</p>
                            <div id="divDeliveryMethod">
                                <ul class="method">
                                    <li>
                                        <a id="methed_id_1" class="current" href="javascript:void(0);">当当快递</a>
                                    </li>

                                </ul>
                            </div>
                            <div id="divDeliveryTime_0_0" class="time" style="position: static;">配送时间&nbsp;&nbsp;
                                <select id="sltDeliveryTime_0_0">
                                    <option selected="selected" value="1">只工作日送货</option>
                                    <option value="2">只双休日、假日送货</option>
                                    <option value="3">时间不限</option>
                                </select>
                            </div>
                            <div id="divPromise_0_0" class="time" style="position: static;">
                                <span class="red">今日</span><span class="red">20:25</span>前付款，预计<span class="red">明日</span> 送达
                                <a id="btnModify_0_0" href="javascript:void(0);" class="modify">修改</a>
                            </div>
                        </div>
                        <!-- 订单商品列表 -->
                        <div id="order_0_0_div" class="right clearfix">
                            <!-- 定金预售订单 -->
                            <!-- 普通订单 -->
                            <div class="subpackage_title">
                                以下商品 预计
                                <span class="red">明</span>日送达
                            </div>

                            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="list">
                                <tbody id="goodsList">
                                <tr>
                                    <th scope="col" class="th_img">&nbsp;</th>
                                    <th scope="col" class="th_name">商品名称</th>
                                    <th scope="col">单价</th>
                                    <th scope="col">数量</th>
                                    <th scope="col">总价</th>
                                </tr>
                                <!-- 普通商品 -->

                                <tr id="25245058_NOTGIFT" ddt-data-key="productid" ddt-data="25245058">
                                    <td class="img">
                                        <img src="http://img3m8.ddimg.cn/58/32/25245058-1_t_4.jpg" width="70" height="70">
                                    </td>
                                    <td class="name">
                                        <a href="http://product.dangdang.com/25245058.html" title="高兴死了!!!（我正在人生低谷，我现在高兴死了！）" target="_blank" dd_name="查看详情" style="word-break:break-all;  word-wrap:break-word;">高兴死了!!!（我正在人生低谷，我现在高兴死了！）</a>
                                        <p class="seven">
                                            <span class="icon_7"></span>支持7天无理由退换货
                                        </p>
                                    </td>
                                    <td>44.90</td>
                                    <td>2</td>
                                    <td>89.80</td>
                                </tr>
                                </tbody>
                            </table>
                            <!-- 集合促销商品 -->
                        </div>
                    </div>
                    <div id="shipment_sub_0_0_div" class="sub">
                        <div class="sub_left">
                            <div id="giftPacking" style="">
                                <p id="greenPackage" style="display:none">
                                    <a href="javascript:void(0)" class="check" id="greenPackage_check"></a>加<span id="green_package_price" class="price red"></span>元选择环保包装，为地球减负
                                    <a class="modify" id="greenPackage_edit" href="http://help.dangdang.com/page250" target="_blank">了解当当环保包装?</a>
                                </p>
                                <p id="giftPackage" style="">
                                    <a href="javascript:void(0)" class="check" id="giftPacking_check"></a>此订单作为礼品赠送他人
                                    <a class="modify" id="giftPacking_edit" href="javascript:void(0)" style="display:none">修改</a>
                                </p>
                            </div>
                        </div>
                        <div class="sub_right">
                            <p>
                                <span class="red">1</span>个包裹
                                <span class="tab">商品金额：89.80</span>
                                <span class="tab">运费：0.00</span>
                                <span class="tab"></span>
                            </p>
                            <p><span class="tab">店铺合计：</span><span class="price red">89.80</span></p>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <!--小计-->
    <div id="summary_div">
        <div class="total">
            <div class="confirm"></div>
        </div>
    </div>
</div>

<div id="submit_div">
    <div id="submit_div_inner" class="submit">

        <!-- 受限-->
        <div id="max_vddmoney" class="alart_con" style="display:none">
            <span class="icon_tip"></span>根据国家法律规定，购买电子礼品卡不可超过10000元。
        </div>

        <div class="box">



        </div>
    </div>
    <div id="limit_products_div" style="display:none">
        <div class="pop">
            <a href="javascript:void(0);" onclick="javascript:limitProductsDivClose($(this).parent());" class="close"></a>
            <div class="pop_title">商品限购</div>
            <div class="popup_limit">

            </div>
            <div class="btn_bar limit_bar">

                <a href="javascript:void(0);" id="btn_go_cart" onclick="javascript:backCart();" class="btn_red">返回购物车修改数量</a>
                <a href="javascript:void(0);" onclick="javascript:limitProductsDivClose($(this).parent().parent());" class="btn">取消</a>

            </div>
        </div>
    </div>
</div>
</body>

</html>
