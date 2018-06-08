<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<%--<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />--%>
		<script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
		<script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript" src="assets/js/productDetail.js"></script>
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
				background: url(assets/dangdang_image/head_sprite.png) no-repeat 0 -346px;
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
				background: url(assets/dangdang_image/sub_line_bg.png) right center no-repeat;
				_line-height: 12px;
				_padding: 9px 15px 8px;
			}
            /*商品详情*/
			.product_wrapper {
				width: 1200px;
				margin: 0 auto;
				font: 12px "Hiragino Sans GB","Verdana","Simsun";
				background-color: #fff;
			}
			.topbanner_all div {
				height: 63px;
			}
			.topbanner_all div, .product_btmad div {
				width: 1198px;
				margin: 10px auto 0;
				border: 1px solid #dcdddd;
				overflow: hidden;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.breadcrumb {
				color: #646464;
				font: 12px/40px "simsun";
				height: 40px;
				padding-bottom: 8px;
				position: relative;
				z-index: 10000;
			}
			.breadcrumb a.domain {
				font: 14px/40px "Microsoft Yahei";
			}
			.breadcrumb a, .breadcrumb a:hover {
				color: #646464;
				float: left;
				_display: inline;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.breadcrumb span.gt {
				color: #646464;
				margin: 1px 6px 0;
			}
			.breadcrumb span {
				color: #323232;
				float: left;
				_display: inline;
			}
			.clearfix {
				zoom: 1;
			}
			.product_main {
				width: 1200px;
				margin: 0 auto;
			}
			.product_main .pic_info {
				float: left;
				width: 320px;
				padding: 0 20px 30px 0;
			}
			.product_main .pic_info .pic {
				width: 320px;
				height: 320px;
				margin: 0 auto;
				position: relative;
				z-index: 7777;
			}
			.product_main .pic_info .pic .img, .product_main .pic_info .pic .img img {
				display: block;
				width: 320px;
				height: 320px;
				overflow: hidden;
			}
			.product_main .pic_info .dp_slide {
				width: 320px;
				margin: 8px auto 0;
				position: relative;
			}
			.product_main .pic_info .dp_slide .prev_none, .product_main .pic_info .dp_slide .next_none, .product_main .pic_info .dp_slide .prev_none:hover, .product_main .pic_info .dp_slide .next_none:hover {
				background-color: #ddd;
				cursor: default;
			}
			.product_main .pic_info .dp_slide .prev, .product_main .pic_info .dp_slide .prev:hover {
				left: 0;
			}
			.product_main .pic_info .dp_slide .next, .product_main .pic_info .dp_slide .next:hover {
				right: 0;
				background-position: -15px 0;
			}
			.product_main .pic_info .dp_slide .mainimg_fy, .product_main .pic_info .dp_slide .mainimg_fy:hover {
				position: absolute;
				height: 56px;
				width: 14px;
				top: 0;
				background: #969696 url(../images/product_sprites.png) no-repeat 0 0;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.product_main .pic_info .dp_slide_box {
				width: 295px;
				height: 56px;
				margin-left: 14px;
				overflow: hidden;
			}
			.product_main .pic_info .dp_slide ul {
				width: 100000px;
			}
			.product_main .pic_info .dp_slide ul li {
				float: left;
				margin-right: 3px;
				width: 56px;
				height: 56px;
			}
			.product_main .pic_info .dp_slide ul a, .product_main .pic_info .dp_slide ul a:hover {
				display: block;
				border: 1px solid #fff;
				width: 54px;
				height: 54px;
				overflow: hidden;
				overflow: hidden;
				text-decoration: none;
			}
			.product_main .show_info {
				float: left;
				width: 860px;
				font: 12px "Verdana","Simsun";
				color: #646464;
			}
			.product_main .sale_box {
				line-height: 24px;
				padding: 0 0 0 10px;
				background: url(../images/sale_box_bg.png) repeat-y 670px 0;
				margin-top: 5px;
			}
			.product_main .sale_box .sale_box_left {
				width: 630px;
				float: left;
			}
			.product_main .name_info {
				font-family: "Verdana","Microsoft Yahei";
				font-weight: normal;
				border-bottom: 1px solid #f5f5f5;
				padding: 0 6px 12px 0;
			}
			.product_main .name_info h1 {
				line-height: 24px;
				max-height: 48px;
				overflow: hidden;
				color: #323232;
				font-size: 18px;
				margin: 0 auto;
			}
			.product_main .name_info h1 .icon_name {
				position: relative;
				top: 2px;
			}
			.product_main .name_info h2 {
				padding-top: 6px;
				max-height: 96px;
				overflow: hidden;
				font-size: 16px;
				line-height: 24px;
				font-family: "宋体", Arial, Helvetica, sans-serif;
			}
			.product_main .name_info .head_title_name {
				color: #323232;
			}
			.product_main .sale_box .messbox_info .t1 {
				display: inline-block;
				padding-right: 25px;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.product_main .sale_box .messbox_info .pinglun {
				clear: both;
			}
			.product_main .sale_box .messbox_info .star_box {
				float: left;
				width: 70px;
				height: 12px;
				background: url(../images/icon_star.png) repeat-x 0 -12px;
				margin: 6px 6px 0 0;
				_display: inline;
				overflow: hidden;
			}
			.product_main .sale_box .messbox_info .star_box .star {
				background: url(../images/icon_star.png) repeat-x 0 0;
				display: block;
				height: 12px;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_main .sale_box .messbox_info .score.write_comment {
				background: #ff6d6b;
				border-color: #ff6d6b;
				color: white;
			}
			.product_main .sale_box .messbox_info .score, .product_main .sale_box .messbox_info .score:hover {
				color: #ff9c43;
				height: 16px;
				line-height: 16px;
				border: 1px solid #ffaf66;
				padding: 0 8px 0 9px;
				overflow: hidden;
				background: #fffaf5;
				border-radius: 2px;
				text-decoration: none;
			}
			.product_main .sale_box .price_info {
				background-color: #ebebeb;
				padding: 0 0 0 10px;
				margin: 6px 0 0 -10px;
				line-height: 28px;
				position: relative;
				width: 630px;
				z-index: 6666;
				height:66px;
			}
			.price_info .price_pc {
				float: left;
				padding-bottom: 7px;
			}
			.price_info .price_pc .price_d {
				font-size: 26px;
				color: #e52222;
			}
			.price_info .price_pc .price_d, .price_info .price_pc .price_zhe, .price_info .price_pc .price_m, .price_info .price_pc .price_vip, .price_info .price_pc .price_hdj {
				float: left;
				height: 56px;
				overflow: hidden;
				padding: 3px 5px 0 0;
			}
			.price_info .t {ht: normal!important;
				font-size: 12px!important;
			}
			.price_info .price_pc .price_d .yen {
				font-size: 14px;
			}
			.price_info .yen {
				font: 12px verdana;
			}
			.price_info .price_pc .price_zhe {
				line-height: 93px;
				color: #e52222;
			}
			.price_info .price_pc .price_m {
				line-height: 93px;
				text-decoration: line-through;
				color: #969696;
			}
			.product_main .sale_box .area_info {
				padding-top: 8px;
			}
			.product_main .sale_box .price_info .left, .product_main .sale_box .cuxiao_info .left, .product_main .sale_box .area_info .left {
				float: left;
				width: 68px;
				color: #969696;
				white-space: nowrap;
				overflow: hidden;
			}
			.letter03 {
				letter-spacing: 6px;
			}
			.product_main .sale_box .cuxiao_info .right, .product_main .sale_box .area_info .right {
				float: left;
				width: 562px;
				_width: 550px;
				color: #646464;
			}
			.product_main .sale_box .area_info .select_add {
				position: relative;
				clear: both;
				z-index: 1000;
			}
			.product_main .sale_box .area_info .text {
				float: left;
				border: 1px solid #ccc;
				height: 18px;
				line-height: 16px;
				line-height: 18px\9;
				padding: 0 14px 0 5px;
				background: #fff url(../images/product_sprites.png) no-repeat right -313px;
				cursor: pointer;
				margin: 3px 8px 0 0;
				position: relative;
				z-index: 88;
			}
			.area_pop {
				position: absolute;
				width: 369px;
				border: 1px solid #ccc;
				background-color: #fff;
				z-index: 77;
				padding: 0 2px;
				font-size: 12px;
				top: 21px;
				left: 0;
			}
			.product_main .sale_box .area_info .select_add b {
				float: left;
			}
			.product_main .sale_box .area_info b {
				display: inline-block;
				padding: 0 6px 0 0;
			}
			.product_main .sale_box .area_info .select_add a, .product_main .sale_box .area_info .select_add a:hover {
				color: #646464;
			}
			.product_main .sale_box .area_info .yunfei {
				float: left;
				background: url(../images/product_sprites.png) no-repeat right -203px;
				position: relative;
				padding-right: 13px;
				white-space: nowrap;
			}

			.product_main .sale_box .buy_box {
				padding: 30px 0 35px;
			}





			.product_main .sale_box .buy_box .num {
				float: left;
				height: 34px;
				border: 1px solid #e9e9e9;
				width: 38px;
				padding-right: 23px;
				overflow: hidden;
				text-align: center;
				position: relative;
			}
			.product_main .sale_box .buy_box .num input {
				width: 38px!important;
				height: 32px;
				line-height: 32px;
				border: 0;
				background: #fff;
				text-align: center;
			}
			.product_main .sale_box .buy_box .text {
				color: #969696;
				clear: both;
				line-height: 20px;
				width: 630px;
				overflow: hidden;
			}
			input.text {
				outline: none;
			}
			input {
				padding: 0;
				margin: 0;
			}
			.product_main .sale_box .buy_box .num .num_add {
				background-position: -37px 0;
				top: 0;
			}
			.product_main .sale_box .buy_box .num a, .product_main .sale_box .buy_box .num a:hover {
				position: absolute;
				right: 0;
				display: block;
				width: 23px;
				height: 17px;
				background-image: url(../images/product_sprites.png);
				background-repeat: no-repeat;
				background-color: #646464;
				margin-left: 6px;
				_display: inline;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.product_main .sale_box .buy_box .num .num_disabled, .product_main .sale_box .buy_box .num .num_disabled:hover {
				background-color: #ccc;
				cursor: default;
			}
			.product_main .sale_box .buy_box .num .num_del {
				background-position: -37px -17px;
				top: 17px;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_wrapper a {
				text-decoration: none;
			}
			.product_main .sale_box .buy_box .buy_box_btn {
				float: left;
				width: 567px;
			}
			.product_main .buy_box_btn a.btn, .product_main .buy_box_btn a.btn:hover, .product_content .group_buy .group_info a.btn, .product_content .group_buy .group_info a.btn:hover, .tab_panel_btn .btn, .tab_panel_btn .btn:hover {
				height: 36px;
				font: 16px/36px "Microsoft Yahei";
				overflow: hidden;
				margin: 0 0 3px 10px;
				float: left;
				padding: 0 15px;
				border-radius: 3px;
				text-decoration: none;
				color: #fff;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			a.btn_red {
				background-color: #ff2832;
			}
			.product_main .buy_box_btn a.btn_b, .product_main .buy_box_btn a.btn_b:hover {
				height: 34px;
				line-height: 34px;
			}
			a.btn_b_red, a.btn_b_red:hover {
				border: 1px solid #ff2832;
				color: #ff2832!important;
				background-color: #ffedee;
			}
			/*右边*/
			.product_main .service_more {
				float: left;
				_display: inline;
				width: 180px;
				padding-left: 10px;
				margin-top: 0;
				margin-left: 29px;
				font-family: "Simsun","Verdana";
			}
			.narrow_dang {
				display: none;
				width: 34px;
				height: 34px;
				overflow: hidden;
				left: -34px;
				top: -1px;
				position: absolute;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_main .service_more .service_more_info {
				border-top: 1px solid #f5f5f5;
			}
			.product_main .show_info a, .product_main .show_info a:hover {
				color: #1a66b3;
			}
			.product_main .service_more .title {
				line-height: 18px;
				padding: 10px 0 8px;
				border-bottom: 1px dotted #ccc;
			}
			.product_main .service_more .title .nei_shang, .product_main .service_more .title .nei_shang:hover {
				float: left;
				margin: 1px 10px 0 0;
				font: 12px "Arial","simsun";
				color: #646464;
				width: 170px;
				height: 18px;
				line-height: 18px;
				overflow: hidden;
			}
			.shop_score_box {
				color: #969696;
				background: #fff;
				margin-top: -1px;
				border-bottom: 1px dotted #ccc;
				position: relative;
				z-index: 888;
			}
			.product_main .service_more .fuwu {
				padding: 3px 0 6px;
			}
		</style>

	</head>

	<body style="background-color: white">

	<div id="hd">
		<div id="tools">
			<div class="tools">
				<div class="ddnewhead_operate" dd_name="顶链接">
					<ul class="ddnewhead_operate_nav">
						<%--<li><a target="_blank" href="http://e.dangdang.com/ebook/listUserEbooks.do" name="我的云书房" dd_name="我的云书房">我的云书房</a></li>--%>
						<%--<li class="my_dd"><a class="menu_btn" target="_blank" href="http://myhome.dangdang.com/" name="我的当当" dd_name="我的当当" id="a_myddchannel" onmouseover="showgaoji('a_myddchannel','__ddnav_mydd')" onmouseout="hideotherchannel('a_myddchannel','__ddnav_mydd');">我的当当</a>--%>
							<%--<ul class="ddnewhead_gcard_list" id="__ddnav_mydd"  style="display: block; width: 83px;">--%>
								<li><a target="_blank" href="selectOrderByUserId" name="mydd_7" dd_name="新_我的订单">我的订单<b id="unpaid_num" style="color: red"></b></a></li>
								<li><a target="_blank" href="detailToCart" name="mydd_8" dd_name="新_购物车" rel="nofollow">购物车<b id="cart_items_count" style="color: red"></b></a></li>
								<%--<li><a target="_blank" href="http://myhome.dangdang.com/mypoint?ref=my-0-L" name="mydd_4" dd_name="积分抵现" rel="nofollow">积分抵现</a></li>--%>
								<li><a target="_blank" href="toMyCollection" name="mydd_1" dd_name="我的收藏" rel="nofollow">我的收藏<b id="collection_items_count" style="color: red"></b></a></li>
								<%--<li><a target="_blank" href="http://noncash.dangdang.com/balance/" name="mydd_5" dd_name="我的余额" rel="nofollow">我的余额</a></li>--%>
								<%--<li><a target="_blank" href="http://comment.dangdang.com/comment" name="mydd_4" dd_name="我的评论" rel="nofollow">我的评论</a></li>--%>
								<%--<li><a target="_blank" href="http://newaccount.dangdang.com/payhistory/mycoupon.aspx" name="mydd_2" dd_name="礼券/礼品卡" rel="nofollow">礼券/礼品卡</a></li>--%>
							<%--</ul>--%>
						<%--</li>--%>
						<%--<li><a target="_blank" href="http://e.dangdang.com/media/h5/pc/zhuangti/zhengwen2017/essay.html" name="mydd_7" dd_name="小说投稿">小说投稿</a></li>--%>
						<%--<li><a target="_blank" href="http://pbook-shequ.dangdang.com/welcome/" dd_name="我要出书">我要出书</a></li>--%>
						<%--<li><a class="menu_btn" href="javascript:void(0);" style="cursor:default;" name="qycg" dd_name="企业采购" id="a_qycgchannel" onmouseover="showgaoji('a_qycgchannel','__ddnav_qycg');" onmouseout="hideotherchannel('a_qycgchannel','__ddnav_qycg');">企业采购</a>--%>
							<%--<ul class="ddnewhead_gcard_list" id="__ddnav_qycg" onmouseover="showgaoji('a_qycgchannel','__ddnav_qycg');" onmouseout="hideotherchannel('a_qycgchannel','__ddnav_qycg');" style="display: none; width: 79px;">--%>
								<%--<li><a target="_blank" href="http://giftcard.dangdang.com/giftcardCompany" name="qycg_1" dd_name="大宗采购">大宗采购</a></li>--%>
								<%--<li><a target="_blank" href="http://giftcard.dangdang.com/" name="qycg_2" dd_name="礼品卡采购">礼品卡采购</a></li>--%>
								<%--<li><a target="_blank" href="http://newaccount.dangdang.com/payhistory/mymoney.aspx" name="gqycg_3" dd_name="礼品卡激活" rel="nofollow">礼品卡激活</a></li>--%>
								<%--<li><a target="_blank" href="http://help.dangdang.com/details/page24" name="qycg_4" dd_name="礼品卡使用">礼品卡使用</a></li>--%>
								<%--<li><a target="_blank" href="http://b2b.dangdang.com" name="qycg_5" dd_name="3C数码团购">3C数码团购</a></li>--%>
							<%--</ul>--%>
						<%--</li>--%>
						<%--<li class="hover "><a class="menu_btn" href="javascript:void(0);" style="cursor:default;" name="ddkf_0" dd_name="客户服务" id="a_bzzxchannel" onmouseover="showgaoji('a_bzzxchannel','__ddnav_bzzx');" onmouseout="hideotherchannel('a_bzzxchannel','__ddnav_bzzx');">客户服务</a>--%>
							<%--<ul class="ddnewhead_gcard_list" id="__ddnav_bzzx" onmouseover="showgaoji('a_bzzxchannel','__ddnav_bzzx');" onmouseout="hideotherchannel('a_bzzxchannel','__ddnav_bzzx');" style="display: none; width: 79px;">--%>
								<%--<li><a target="_blank" href="http://help.dangdang.com/index" name="ddkf_2" dd_name="帮助中心">帮助中心</a></li>--%>
								<%--<li><a target="_blank" href="http://return.dangdang.com/reverseapplyselect.aspx" name="ddkf_3" dd_name="自助退换货">自助退换货</a></li>--%>
								<%--<li><a target="_blank" href="http://order.dangdang.com/InvoiceApply/InvoiceOnlineReissue.aspx" name="tsjy_2" dd_name="自助发票" rel="nofollow">自助发票</a></li>--%>
								<%--<li><a target="_blank" href="http://help.dangdang.com/details/page206" name="ddkf_4" dd_name="联系客服">联系客服</a></li>--%>
								<%--<li><a target="_blank" href="http://help.dangdang.com/details/page206" name="tsjy_1" dd_name="我要投诉" rel="nofollow">我要投诉</a></li>--%>
							<%--</ul>--%>
						<%--</li>--%>
					</ul>
					<div class="new_head_znx" id="znx_content" style="display:none;"></div>
					<div class="ddnewhead_welcome" display="none;">
						<span id="nickname"><span class="hi">Hi，<a href="http://myhome.dangdang.com/" class="login_link" target="_blank"><b>${fontUserName}</b></a><a href="UserExit" target="_self">[退出]</a></span></span>
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
					<form action="toBookList" name="searchform" id="form_search_new" method="POST">
						<input type="text" class="text gray" name="key" id="key_S" >
						<a href="javascript:void(0);"  class="del-keywords"></a>
						<span class="select" ><span id="Show_Category_Name" dd_name="全部分类">全部分类</span><span class="icon"></span></span>
				        <input type="button" class="button">
					</form>
				</div>
				<div class="search_bottom">
					<a href="http://search.dangdang.com/advsearch" class="search_advs" target="_blank" name="ddnav_adv_s" dd_name="高级搜索">高级搜索</a>
				</div>
				<div id="suggest_key" class="suggest_key" style="display:none;"></div>
				<%--<div class="ddnew_cart"><a href="detailToCart" name="购物车" dd_name="购物车"><span class="icon_card">购物车</span><span id="cart_items_count">0</span></a></div>--%>
				<%--<div class="ddnew_order"><a target="_blank" href="#">我的订单<span id="unpaid_num" style="color:#ff2832;font:bold 12px Arial;"></span></a></div>--%>
			</div>
		</div>

		<%--上面导航条由于太多--%>
		<%--<div class="sub">--%>
			<%--<ul>--%>
				<%--<li><a name="nav2" target="_blank" href="http://bang.dangdang.com/books">图书排行榜</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/children">童书</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.43.htm">教辅</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.03.htm">小说</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.05.htm">文学</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.01.htm">青春文学</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.38.htm">传记</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.21.htm">成功励志</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.22.htm">管理</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.36.htm">历史</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.28.htm">哲学宗教</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.15.htm">亲子家教</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.18.htm">保健养生</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/exam?biaoti">考试</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/tech?ref=book-01-A">科技</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://book.dangdang.com/01.58.htm?ref=book-01-A">进口原版</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://e.dangdang.com/index_page.html">电子书</a></li>--%>
				<%--<li><a name="nav2" target="_blank" href="http://e.dangdang.com/new_original_index_page.html">网络文学</a></li>--%>
			<%--</ul>--%>
		<%--</div>--%>
	<%--</div>--%>

	<div class="product_wrapper">
		<div id="ad_cpt_top_16846" class="topbanner_all">
			<div ddt-pit="seq0">
				<a href="http://a.dangdang.com/tjump.php?q=fovfEhpDwaV%2BpvzZKNMUxhTj%2BDcvkAknxfrLg47OC%2FrtdN1sDA%2BnybcHCYegvryk58ci2nnIb01h0aLIWe2xUHHiiNeC2HN1vNHEKW6hn537xk%3D" target="_blank" rel="nofollow">
					<img src="http://img61.ddimg.cn/2018/3/30/2018033019575152999.jpg">
				</a>
			</div>
		</div>

		<div class="breadcrumb" id="breadcrumb" dd_name="顶部面包屑导航" ddt-area="000">
			<a href="http://category.dangdang.com/cp01.00.00.00.00.00.html" name="__Breadcrumb_pub" target="_blank" class="domain"><b>图书</b></a><span class="gt">&gt;</span><a href="http://category.dangdang.com/cp01.03.00.00.00.00.html" name="__Breadcrumb_pub" target="_blank">小说</a><span class="gt">&gt;</span><a href="http://category.dangdang.com/cp01.03.45.00.00.00.html" name="__Breadcrumb_pub" target="_blank">社会</a><span class="gt">&gt;</span><span>神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销<span class="dot">...</span></span>
			<div class="outlets" style="display:none" id="bread-crumb-outlets">
				<a class="o_close hidden" style=" display: none;"></a>
				<a class="o_icon" href=" http://v.dangdang.com/" title="尾品汇" target="_blank" name="go_outlets">
					<img src="images/outlets.png" alt="尾品汇">
				</a>
				<a class="o_banner hidden" id="olbp" href=" http://v.dangdang.com/17862_3533_1" target="_blank" name="Go_pinpai" style="display: none;">
					<img src="" class="J-outlets-img">
				</a>
			</div>
		</div>

		<div class="product_main clearfix">
			<div class="pic_info">
				<!-- 大图区开始 -->

				<div class="pic" id="largePicDiv">
					<a href="javascript:;" class="img">
						<img id="largePic" dd_name="大图" alt="神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）
（《科克斯书评》《出版人周刊》等百家媒体重磅推荐，入围2016 年杰克逊文学奖决选名单。一个交织着爱与罪恶的故事一场玩弄人性心理的悬疑陷阱！我们经常祈求神灵，却不曾观照自己是魔鬼还是天使。白马时光）" src="assets/images/${bookDto.image}" width="320" height="320">
						<div id="moveMask" class="zoom_pup" style="position: absolute; background: url(&quot;images/zoom_pup.png&quot;); left: 50px; top: 0px; display: none;"></div>
					</a>
				<div class="dp_slide">
					<a id="pre_slide" href="javascript:;" class="mainimg_fy prev  prev_none" style="z-index: 100; display: none;"></a>
					<a id="next_slide" href="javascript:;" class="mainimg_fy next prev_none" style="z-index: 100; display: none;"></a>
					<div class="dp_slide_box" id="main-img-slide" style="visibility: visible; overflow: hidden; position: relative; z-index: 2; left: 0px; width: 295px;">
						<ul id="main-img-slider" style="z-index: 1; margin: 0px; padding: 0px; position: relative; list-style: none; width: 885px; left: -295px;"><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-1_w_6.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-1_x_6.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-2_w_6.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-2_x_6.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-3_w_3.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-3_x_3.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-4_w_3.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-4_x_3.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"></li>
							<li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-1_w_6.jpg"><img src="assets/images/${bookDto.smallImage1}"></a></li>
							<li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-2_w_6.jpg"><img src="assets/images/${bookDto.smallImage2}"></a></li>
							<li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-3_w_3.jpg"><img src="assets/images/${bookDto.smallImage3}"></a></li>
							<li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-4_w_3.jpg"><img src="assets/images/${bookDto.smallImage4}"></a></li>
							<li style="overflow: hidden; float: left; width: 56px; height: 56px;"></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-1_w_6.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-1_x_6.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-2_w_6.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-2_x_6.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-3_w_3.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-3_x_3.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"><a href="javascript:;" data-imghref="http://img3m6.ddimg.cn/9/17/25229466-4_w_3.jpg"><img src="http://img3m6.ddimg.cn/9/17/25229466-4_x_3.jpg"></a></li><li style="overflow: hidden; float: left; width: 56px; height: 56px;"></li></ul>
					</div>
				</div>
			</div><!-- 大图区结束 -->
		</div>
			<div class="show_info">
				<div class="sale_box clearfix">
					<div class="sale_box_left" id="product_info" dd_name="b">
						<!-- 标题区begin -->
						<div class="name_info" ddt-area="001">
							<!-- 主标题 -->
							<h1 title="神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）">
								<img src="assets/dangdang_image/icon_ddzy.png" class="icon_name">
								${bookDto.bookName}    </h1>
							<!-- 副标题、促销语 -->
							<h2><span class="head_title_name" title="（《科克斯书评》《出版人周刊》等百家媒体重磅推荐，入围2016 年杰克逊文学奖决选名单。一个交织着爱与罪恶的故事一场玩弄人性心理的悬疑陷阱！我们经常祈求神灵，却不曾观照自己是魔鬼还是天使。白马时光）&nbsp;&nbsp;">${bookDto.description}</span></h2>
						</div>
						<!-- 标题区 end-->

						<!-- 出版物begin -->
						<!-- 图书信息区 -->
						<div class="messbox_info">
							<span class="t1" id="author">作者:<a href="#" target="_blank">${bookDto.author}</a> 著</span><span class="t1" dd_name="出版社" ddt-area="003">出版社:<a href="http://search.dangdang.com/?key3=%B0%D9%BB%A8%D6%DE%CE%C4%D2%D5%B3%F6%B0%E6%C9%E7&amp;medium=01&amp;category_path=01.00.00.00.00.00" target="_blank" dd_name="出版社">${bookDto.publish}</a></span><span class="t1">出版时间:${bookDto.publishDate}&nbsp;</span>    <!-- 评论数 -->
							<div class="pinglun">
								<a href="javascript:void(0)" id="comm_num_down" dd_name="评论数">2216</a>条评论
								<a href="javascript:;" class="score write_comment" id="w-comment">我要写评论</a>
							</div>
						</div>
						<!-- 出版物 end-->



						<!-- 价格区begin -->
						<div class="price_info clearfix">
							<div class="price_pc" id="pc-price">
								<div class="price_d">
									<p class="t" id="dd-price-text">当当价</p>
									<p id="dd-price"><span class="yen">¥</span><span id="discountedAfterPrice">${bookDto.discountedAfterPrice}</span></p>
								</div>
								<div class="price_zhe" id="dd-zhe">(${bookDto.discountedPrice}折)</div>
								<div class="price_m price_m_t" id="original-price-text">定价</div>
								<div class="price_m" id="original-price"><span class="yen">¥</span>${bookDto.originalPrice}</div>
									<span></span>
								</div>
							</div>

						<div class="area_info clearfix">
							<div class="left letter02">服务</div>
							<div class="right">
								<div class="clearfix">
									<span class="time">由“<b>本站</b>”发货，并提供售后服务。 <font id="arrive-time">21:45前完成下单，预计<b>明天</b>可送达</font></span>
								</div>
							</div>
						</div>

						<!-- 地址区end -->
						<!-- 关联选购 -->
						<!-- 百货关联 -->
						<!-- 百货关联end -->
						<!-- 按钮区begin -->
						<!-- 按钮区 -->
						<div class="buy_box clearfix" ddt-area="030">
							<div class="num">
								<input id="buy-num" class="text" value="1" type="text">
								<input id="product_id" class="text" value="${bookDto.id}" type="hidden">
								<input id="bDBid" class="text" value="${bookDto.bDBid}" type="hidden">
								<a href="#" class="num_add" id="num_add" dd_name="数量加">+</a>
								<a href="#" class="num_del num_disabled" id="num_del" dd_name="数量减">-</a>
							</div>
							<div class="buy_box_btn">
								<a href="#" id="part_buy_button" class="btn btn_red" dd_name="加入购物车" go-uri="//shopping.dangdang.com/shoppingcart/cart_append_new?product_ids=" ddt-src="addChart1" style="">加入购物车</a>
								<a href="javascript:;" id="gift_card_button" class="btn btn_red" dd_name="礼品卡加入购物车" style="display:none" ddt-src="giftCard1"><i class="cart"></i>加入购物车</a>
								<a href="javascript:;" id="buy_now_button" class="btn btn_b btn_b_red" dd_name="立即购买" style="display:none" go-uri="//checkoutb.dangdang.com/checkout.aspx?checkout_type=10&amp;" ddt-src="buyNow1">立即购买</a>
								<%--<a href="javascript:;" id="deposit_buy_button" rel="nofollow" class="btn btn_green" dd_name="售罄提醒" style="display: block">库存<span>${bookDto.stock}</span></a>--%>
								<a href="javascript:;" id="btn_collection" rel="nofollow" class="btn btn_b btn_b_red" dd_name="收藏商品" style="display: block" ddt-src="productCollect1">收藏</a>
								<a href="javascript:;" id="" rel="nofollow" class="btn btn_b btn_b_red" dd_name="售罄提醒" style="display: block" >库存<span id="productAmount">${bookDto.stock}</span></a>
							</div>
						</div>
					</div>

					</div>
					</div>


		</div>
	</div>
	</body>
</html>
