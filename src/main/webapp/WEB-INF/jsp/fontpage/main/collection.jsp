<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>收藏管理</title>
    <%--<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />--%>
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/collectionList.js"></script>

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
            background: url(http://img63.ddimg.cn/upload_img/00459/home/head_sprite.png) no-repeat -51px -70px;
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

        #hd .logo_line .search .label_search {
            position: absolute;
            top: 2px;
            left: 10px;
            width: 398px;
            height: 36px;
            line-height: 36px;
            z-index: 1;
            overflow: hidden;
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
            font: 12px/18px 'Hiragino Sans GB',"simsun",Arial;
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
        .logo_line .suggest_key {
            width: 408px;
            border: 1px solid #c8c8c8;
            border-top: none;
            z-index: 7777;
            position: absolute;
            left: 362px;
            top: 60px;
            background-color: #fff;
            color: #323232;
        }
        .logo_line .ddnew_cart {
            right: 88px;
            width: 107px;
            border-color: #ff2832;
            background: url(http://img62.ddimg.cn/upload_img/00459/home/icon_cart.png) 5px 0 no-repeat #ff2832;
        }
        .logo_line .ddnew_cart, .logo_line .ddnew_order {
            height: 36px;
            position: absolute;
            top: 20px;
            border: 2px solid #dcdcdc;
            font: 14px/36px "Microsoft Yahei";
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
        .logo_line .ddnew_order {
            width: 86px;
            padding: 0;
            text-align: center;
            right: 0;
            border-left: 0;
            background-color: #f6f6f6;
        }
        .logo_line .ddnew_cart, .logo_line .ddnew_order {
            height: 36px;
            position: absolute;
            top: 20px;
            border: 2px solid #dcdcdc;
            font: 14px/36px "Microsoft Yahei";
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

        /**
        商品列表
         */
        #bd {
            width: 1200px;
        }
        .search_wrap {
            width: 1200px;
            margin: 0 auto;
        }
        .con .col {
            float: left;
        }
        .search_left {
            float: left;
            width: 960px;
            overflow: hidden;
            position: relative;
        }
        .search_wrap .good_right {
            width: 222px;
            float: right;
            overflow: hidden;
        }
        .shoplist {
            padding-top: 20px;
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
        .shoplist .bigimg li .pic {
            position: absolute;
            left: 20px;
            top: 21px;
        }
        .shoplist .bigimg li .pic, .shoplist .bigimg li .pic img {
            display: block;
            width: 200px;
            height: 200px;
        }
        .shoplist .bigimg li .name {
            position: absolute;
            left: 240px;
            top: 21px;
            line-height: 20px;
            height: 20px;
            width: 720px;
            overflow: hidden;
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
        .shoplist .bigimg li .detail {
            position: absolute;
            left: 240px;
            top: 145px;
            line-height: 20px;
            height: 40px;
            overflow: hidden;
            color: #333;
            width: 720px;
            font-size: 14px;
        }
        .shoplist .bigimg li .price {
            position: absolute;
            left: 240px;
            top: 48px;
            font-family: "arial";
            line-height: 30px;
            width: 720px;
        }
        .shoplist .bigimg li .price .search_now_price {
            color: #ff2832;
        }
        .shoplist .bigimg li .price .search_now_price {
            font-size: 18px;
        }
        .search_now_price {
            font-family: arial,'Hiragino Sans GB',"Simsun";
            color: #fa5000;
            font-size: 14px;
            overflow: hidden;
            font-weight: bold;
            margin-right: 10px;
        }
        .search_discount {
            color: #969696;
            font-size: 12px;
            font-weight: normal;
            font-family: arial,'Hiragino Sans GB',"Simsun";
        }
        .search_pre_price {
            color: #969696;
            text-decoration: line-through;
            font-size: 12px;
            font-weight: normal;
            font-family: arial,'Hiragino Sans GB',"Simsun";
        }
        .search_discount {
            color: #969696;
            font-size: 12px;
            font-weight: normal;
            font-family: arial,'Hiragino Sans GB',"Simsun";
        }
        .search_e_price {
            font-family: arial, 'Microsoft Yahei';
            font-size: 14px;
            color: #646464;
            margin-left: 10px;
        }
        .shoplist .bigimg li .lable_label {
            position: absolute;
            top: 123px;
            left: 231px;
        }
        .shoplist .bigimg li .new_lable {
            float: right;
            margin-left: 10px;
        }
        .shoplist .bigimg li .new_lable .new_lable1 {
            background-color: white;
            border: 1px solid #ff2832;
            color: #ff2832;
            border-radius: 2px;
            padding: 0 2px;
            font-size: 12px;
            font-family: "Microsoft YaHei";
            margin-right: 5px;
            display: inline-block;
            white-space: nowrap;
            margin-bottom: 4px;
            line-height: 14px;
        }
        .shoplist .bigimg li .search_star_line {
            position: absolute;
            left: 240px;
            top: 92px;
        }
        .search_star_line {
            color: #787878;
            padding-top: 8px;
        }
        .search_star_black {
            width: 76px;
            height: 16px;
            background: url(assets/images/icon_star3.png) 0 -16px repeat-x;
            display: inline-block;
            zoom: 1;
            vertical-align: middle;
            font-size: 0;
            vertical-align: middle;
        }
        .search_star_black span {
            background: url(assets/images//icon_star3.png) repeat-x;
            height: 16px;
            line-height: 16px;
            display: inline-block;
            font-size: 12px;
        }
        .search_comment_num {
            height: 16px;
            line-height: 16px;
            font-style: normal;
            display: inline-block;
            vertical-align: middle;
            margin-left: 10px;
            color: rgb(26, 102, 179);
            font-family: 微软雅黑;
            cursor: pointer;
            font-size: 12px;
        }
        .shoplist .bigimg li .tag_box {
            left: 179px;
            top: 6px;
        }
        .tag_box {
            position: absolute;
            top: 0px;
            right: -4px;
            width: 56px;
            height: 56px;
            z-index: 100;
        }
        .shoplist .bigimg li .search_book_author {
            position: absolute;
            left: 240px;
            top: 70px;
            color: #787878;
            line-height: 30px;
            height: 30px;
            overflow: hidden;
            overflow: hidden;
            word-break: break-all;
            word-wrap: break-word;
            font-size: 12px;
        }
        .search_book_author {
            color: #646464;
            font-family: arial,'Hiragino Sans GB',"Simsun";
            height: 14px;
            line-height: 14px;
            font-size: 12px;
        }
        .search_book_author a {
            color: rgb(26, 102, 179);
            font-family: 微软雅黑;
        }
        .shop_button {
            height: 0px;
        }
        .shoplist .bigimg li .bottom_p {
            position: absolute;
            left: 222px;
            top: 193px;
        }
        .search_btn_collect {
            width: 80px;
            height: 28px;
            line-height: 28px;
            background: #ffedee;
            color: #ff2832;
            border: 1px solid #ff2832;
            display: inline-block;
            zoom: 1;
            border-radius: 3px;
            text-align: center;
            font-family: 'Microsoft Yahei';
            font-size: 14px;
            margin-right: 10px;
        }
        .search_btn_cart {
            width: 100px;
            height: 28px;
            line-height: 28px;
            background: #ff2832;
            border-radius: 3px;
            display: inline-block;
            zoom: 1;
            color: #fff;
            text-align: center;
            font-family: 'Microsoft Yahei';
            font-size: 14px;
            margin-right: 10px;
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
            <div class="logo"><img src="assets/dangdang_image/360-100LOGOewm-1516155836.png" usemap="#logo_link">
                <map name="logo_link" id="logo_link" dd_name="logo区"><area shape="rect" coords="0,18,200,93" href="http://www.dangdang.com" title="当当" onfocus="this.blur();">
                    <area shape="rect" coords="200,18,320,93" href="http://t.dangdang.com/20170929_4xss" title="" target="_blank" onfocus="this.blur();"></map>
            </div>
            <div class="search">
                <form action="toBookList" name="searchform" id="form_search_new"  method="POST">
                    <input type="text" class="text gray" name="key" id="key_S">
                    <%--<a href="javascript:void(0); class="del-keywords"></a>--%>
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

<div id="bd">
    <div class="con">
        <div class="con search_wrap clearfix">
            <div class="col search_left">
                <div>
                    <div class="con shoplist">
                        <div id="search_nature_rg">
                            <ul class="bigimg">
                                <%--<li ddt-pit="1" class="line1" id="p23274638" sku="23274638">--%>
                                    <%--<a title=" 追风筝的人（1-9年级必读书单）此版本已售罄，请购买新版"--%>
                                       <%--ddclick="act=normalResult_picture&amp;pos=23274638_0_2_q" class="pic"--%>
                                       <%--name="itemlist-picture" dd_name="单品图片"--%>
                                       <%--href="http://product.dangdang.com/23274638.html" target="_blank"><img--%>
                                            <%--src="http://img3m8.ddimg.cn/35/10/23274638-1_b_19.jpg"--%>
                                            <%--alt=" 追风筝的人（1-9年级必读书单）此版本已售罄，请购买新版"></a>--%>
                                    <%--<p class="name" name="title"><a--%>
                                            <%--title=" 追风筝的人（1-9年级必读书单）此版本已售罄，请购买新版快乐大本营高圆圆感动推荐。为你，千千万万遍！"--%>
                                            <%--href="http://product.dangdang.com/23274638.html"--%>
                                            <%--ddclick="act=normalResult_title&amp;pos=23274638_0_2_q"--%>
                                            <%--name="itemlist-title" dd_name="单品标题" target="_blank"> <font--%>
                                            <%--class="skcolor_ljg">追风筝的人</font>（1-9年级必读书单）此版本已售罄，请购买新版快乐大本营高圆圆感动推荐。为你，千千万万遍！</a>--%>
                                    <%--</p>--%>
                                    <%--<p class="detail">这本小说太令人震撼，很长一段时日，让我所读的一切都相形失色。文学与生活中的所有重要主题，都交织在这部惊世之作里：爱、恐惧、愧疚、赎罪--%>
                                        <%--伊莎贝尔 阿连德 ★ 快乐大本营高圆圆感动推荐，窦靖童创作灵感的来源。 ★ 全球现象级畅销书，感动3200万读者的经典之作。</p>--%>
                                    <%--<p class="price"><span class="search_now_price">¥16.00</span><a--%>
                                            <%--class="search_discount" style="text-decoration:none;">定价：</a><span--%>
                                            <%--class="search_pre_price">¥29.00</span><span class="search_discount">&nbsp;(5.52折) </span><a--%>
                                            <%--href="http://product.dangdang.com/1900471452.html"--%>
                                            <%--ddclick="act=normalResult_EBookPrice&amp;pos=1900471452_0_1act=ddclicktemplate&amp;pos=23274638_0_2_q"--%>
                                            <%--class="search_e_price" dd_name="单品电子书" target="_blank"><span>电子书：</span><i>¥8.99</i></a>--%>
                                    <%--</p>--%>
                                    <%--<div class="lable_label"><span class="new_lable" y=""><span--%>
                                            <%--class="new_lable1">当当自营</span></span></div>--%>
                                    <%--<p class="search_star_line"><span class="search_star_black"><span--%>
                                            <%--style="width: 100%;"></span></span><a--%>
                                            <%--href="http://product.dangdang.com/23274638.html?point=comment_point"--%>
                                            <%--target="_blank" name="itemlist-review" dd_name="单品评论"--%>
                                            <%--class="search_comment_num"--%>
                                            <%--ddclick="act=click_review_count&amp;pos=23274638_0_2_q">1632546条评论</a></p>--%>
                                    <%--<span class="tag_box"></span>--%>
                                    <%--<p class="search_book_author"><span>[美]<a--%>
                                            <%--href="http://search.dangdang.com/?key2=卡勒德·胡赛尼&amp;medium=01&amp;category_path=01.00.00.00.00.00"--%>
                                            <%--name="itemlist-author" dd_name="单品作者"--%>
                                            <%--title="[美]卡勒德·胡赛尼（Khaled Hosseini） 著，李继宏 译">卡勒德·胡赛尼</a>（<a--%>
                                            <%--href="http://search.dangdang.com/?key2=Khaled&amp;medium=01&amp;category_path=01.00.00.00.00.00"--%>
                                            <%--name="itemlist-author" dd_name="单品作者"--%>
                                            <%--title="[美]卡勒德·胡赛尼（Khaled Hosseini） 著，李继宏 译">Khaled</a> <a--%>
                                            <%--href="http://search.dangdang.com/?key2=Hosseini&amp;medium=01&amp;category_path=01.00.00.00.00.00"--%>
                                            <%--name="itemlist-author" dd_name="单品作者"--%>
                                            <%--title="[美]卡勒德·胡赛尼（Khaled Hosseini） 著，李继宏 译">Hosseini</a>） 著，<a--%>
                                            <%--href="http://search.dangdang.com/?key2=李继宏&amp;medium=01&amp;category_path=01.00.00.00.00.00"--%>
                                            <%--name="itemlist-author" dd_name="单品作者"--%>
                                            <%--title="[美]卡勒德·胡赛尼（Khaled Hosseini） 著，李继宏 译">李继宏</a> 译</span><span> /2006-05-01</span><span>  /<a--%>
                                            <%--href="http://search.dangdang.com/?key=&amp;key3=%C9%CF%BA%A3%C8%CB%C3%F1%B3%F6%B0%E6%C9%E7&amp;medium=01&amp;category_path=01.00.00.00.00.00"--%>
                                            <%--name="P_cbs" dd_name="单品出版社" title="上海人民出版社">上海人民出版社</a></span></p>--%>
                                    <%--<div class="shop_button"><p class="bottom_p"><a class="search_btn_cart"--%>
                                                                                    <%--name="area_buy" dd_name="查询详情"--%>
                                                                                    <%--href="javascript:goto_product(23274638)"--%>
                                                                                    <%--ddclick="act=normalResult_detail&amp;pos=23274638_0_2_q">详细信息</a><a--%>
                                            <%--class="search_btn_cart" target="_blank" name="ebook_buy_button"--%>
                                            <%--dd_name="购买电子书" href="http://product.dangdang.com/1900471452.html"--%>
                                            <%--ddclick="act=normalResult_buyEBook&amp;pos=23274638_0_2_q'">购买电子书</a><a--%>
                                            <%--class="search_btn_collect" name="collect" dd_name="加入收藏" id="lcase23274638"--%>
                                            <%--href="javascript:void(0);"--%>
                                            <%--ddclick="act=normalResult_favor&amp;pos=23274638_0_2_q">收藏</a></p></div>--%>
                                <%--</li>--%>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="vspacer"></div>
            <div class="col good_right"></div>
        </div>
    </div>
</div>
</body>
</html>




