<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>旺旺图书</title>
		<script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js"></script>
		<script type="text/javascript" src="assets/js/main.js"></script>
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
				background: url(assets/dangdang_image/icon_cart.png) 5px 0 no-repeat #ff2832;
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

			#bd_auto {
				width: 1200px;
				font-family: Arial;
				margin-top: 15px;
				padding-bottom: 10px;
			}
			#bd_auto {
				margin: 0 auto;
			}
			.storey_one {
				zoom: 1;
				margin-bottom: 10px;
			}
			.storey_one .storey_one_left, .storey_one .storey_one_center {
				margin-right: 10px;
			}
			.storey_one .storey_one_left, .storey_one .storey_one_center, .storey_one .storey_one_right {
				float: left;
			}
			.storey_one .storey_one_left {
				z-index: 6;
				position: relative;
			}
            .sidemenu {
                width: 190px;
            }
            .sidemenu .flq_head {
                height: 35px;
                width: 190px;
                text-align: center;
                font-size: 18px;
                background: #487a6f;
                border-radius: 4px 4px 0 0;
                line-height: 34px;
                color: #fff;
                font-family: "Microsoft Yahei";
            }
            .sidemenu .flq_body {
                width: 190px;
                border-top: 2px dotted #487a6f;
                border-bottom: 1px solid #487a6f;
				border-right: 1px solid #487a6f;
				border-left: 1px solid #487a6f;
                position: relative;
                height: 913px;
                _height: 879px;
                background: url(images/home/sidemenu_bg2.png) -20px 0px repeat-y;
            }
            .sidemenu .flq_body .level_one {
                width: 188px;
				position: relative;
                border: 1px solid #487a6f;
                border-width: 0 1px;
            }
            .sidemenu .flq_body .level_one dl.primary_dl {
                width: 170px;
                border-bottom: 1px dotted #849555;
                margin-left: 9px;
                position: relative;
                overflow: hidden;
                padding-top: 3px;
                padding-bottom: 2px;
            }
            .sidemenu .flq_body .level_one dl.primary_dl dt {
                padding-bottom: 3px;
                font-family: "Microsoft Yahei";
            }
            .sidemenu .flq_body .level_one dl.primary_dl dt span {
                color: #487a6f;
                font-size: 14px;
                height: 24px;
                line-height: 24px;
                background: url(images/home/sidemenu_bg2.png) 160px 8px no-repeat;
                font-weight: bold;
                display: block;
            }
            .sidemenu .flq_body .submenu {
                position: absolute;
                left: 189px;
                top: -1px;
                width: 590px;
                border: 1px solid #487a6f;
                padding: 6px 12px 15px 16px;
                z-index: 5;
                box-shadow: -1px 1px 8px #bbb;
                background: #fff;
                display: none;
            }
            .sidemenu .flq_body .submenu .eject_left {
                width: 590px;
            }
            .sidemenu .flq_body .submenu .eject_left dl.inner_dl {
                zoom: 1;
                border-bottom: 1px dotted #d4d4d4;
                padding: 5px 0;
            }
            .sidemenu .flq_body .submenu .eject_left dl.inner_dl dt {
                width: 80px;
                float: left;
                margin-right: 20px;
                line-height: 28px;
                font-size: 12px;
                text-align: right;
                font-family: "Microsoft Yahei";
                color: #367e6f;
                font-weight: bold;
            }
            .sidemenu .flq_body .submenu .eject_left dl.inner_dl dd {
                zoom: 1;
                float: left;
                width: 470px;
            }
            .sidemenu .flq_body .submenu .eject_left dl.inner_dl dd a, .sidemenu .flq_body .submenu .eject_left dl.inner_dl dd a:hover {
                color: #666;
                padding-right: 9px;
                white-space: nowrap;
                background: url(images/home/sidemenu_bg1.png) right center no-repeat;
                margin-right: 8px;
                float: left;
                line-height: 28px;
                font-size: 12px;
            }

            /*.flq_head{height: 35px;width: 190px;text-align: center;font-size: 18px;background: #487a6f; border-radius: 4px 4px 0 0;line-height: 34px;color: #fff;font-family: Microsoft Yahei;}*/
            /*.flq_body{width: 190px;border-top: 2px dotted #487a6f;border-bottom: 1px solid #487a6f;position: relative;height: 878px;}*/
            /*.level_one{width: 188px;border: 1px solid #487a6f;border-width: 0 1px;}*/
            /*.primary_dl{width: 170px;border-bottom: 1px dotted #849555;margin-left: 9px;position: relative; overflow: hidden;padding-top: 3px;padding-bottom: 2px;}*/
            /*.primary_dl dt{padding-bottom: 3px;font-family: Microsoft Yahei;}*/
            /*.primary_dl dt span{color: #487a6f;font-size: 14px;height: 24px;line-height: 24px;background: url(assets/dangdang_image/sidemenu_bg2.png) 160px 8px no-repeat;font-weight: bold;display: block;}*/
            .primary_dl dd{zoom: 1;width: 178px;padding-bottom: 3px;font-size:12px}
            /*.submenu{position: absolute;left: 189px;top: -1px;width: 590px;border: 1px solid #487a6f;padding: 6px 12px 15px 16px;z-index: 5;box-shadow: -1px 1px 8px #bbb;background: #fff;display: none;}*/
            /*.eject_left{width: 590px;}*/
            .con col{float: left;}
            /*.eject_right{display: none;}*/
			.storey_one_center {
				margin-right: 10px;
			}

			.storey_one .storey_one_left, .storey_one .storey_one_center, .storey_one .storey_one_right {
				float: left;
			}
			.storey_one_center .tab_box_aa{width: 750px;height: 315px;position: relative;margin-bottom: 10px;overflow: hidden;}
			.storey_one_center .tab_box_aa .head{position: absolute;bottom: 10px;right: 0px;z-index: 2;}
			.storey_one_center .tab_box_aa .head .tab_aa{float: right;}
			.storey_one_center .tab_box_aa .head .tab_aa  li{width: 21px;height: 21px;line-height: 21px;border-radius: 50%;background: #fff;margin-right: 10px;text-align: center;color: #000;font-family:"Microsoft Yahei";font-size: 12px;float: left;position:relative;cursor:pointer;}
			.storey_one_center .tab_box_aa .content{width: 750px;height: 315px;position: absolute;top: 0;left: 0;}
			.storey_one_center .tab_box_aa .content .pic {display: block;width: 750px;height: 315px;}
			.book_online {width: 750px;overflow: hidden;position: relative;height: 590px;}
			.book_online .book_online_title {
				background: url(assets/dangdang_image/new_book.png) no-repeat;
				height: 43px;
				width: 750px;
				font-size: 0;
				line-height: 0;
				text-indent: -9999px;
			}
			.book_online .btn_brand_prev {
				width: 25px;
				height: 50px;
				background: url(assets/dangdang_image/book_fanye_btn.png) 0 0 no-repeat;
				position: absolute;
				left: 0;
				top: 50%;
				margin-top: 10px;
				z-index: 2;
				cursor: pointer;
			}
			.book_online .btn_brand_next {
				width: 25px;
				height: 50px;
				background: url(assets/dangdang_image/book_fanye_btn.png) -26px 0 no-repeat;
				z-index: 2;
				cursor: pointer;
				position: absolute;
				right: 0;
				top: 50%;
				margin-top: 10px;
			}
			.book_online .mix_marquee_tab {
				position: absolute;
				left: 337px;
				top: 580px;
			}
			.book_online .mix_marquee_tab li {
				float: left;
				width: 10px;
				height: 10px;
				font-size: 0;
				line-height: 10px;
				margin-right: 10px;
				background: url(assets/dangdang_image/diandian_bg2.png) 0 -20px no-repeat;
				text-indent: -9999px;
				cursor: pointer;
			}
			.book_online .mix_marquee_tab .current {
				float: left;
				width: 10px;
				height: 10px;
				font-size: 0;
				line-height: 10px;
				margin-right: 10px;
				background: url(assets/dangdang_image/diandian_bg2.png) 0 0px no-repeat;
				text-indent: -9999px;
				cursor: pointer;
			}
			.book_online .over {
				width: 750px;
				overflow: hidden;
				height: 530px;
				position: relative;
			}
			.book_online .list_aa {
				width: 10000px;
				position: absolute;
			}
			.book_online .list_aa li {
				float: left;
				width: 750px;
				overflow: hidden;
			}
			.book_online .product_ul {
				width: 800px;
				padding-top: 25px;
			}
			.book_online .product_ul li {
				width: 150px;
				margin-right: 47px;
				margin-bottom: 16px;
				height: 250px;
				position: relative;
				overflow: visible;
			}
			.book_online .product_ul a.img, .book_online .product_ul li img {
				width: 150px;
				display: block;
				height: 150px;
			}

			.book_online .product_ul li .name {
				padding: 5px 20px 0;
				height: 20px;
				line-height: 20px;
				overflow: hidden;
			}
			.book_online .product_ul li .name a, .book_online .product_ul li .name a:hover {
				color: #000;
				font-size: 12px;
			}
            .book_online .product_ul a {
                text-decoration: none;
            }
			.book_online .product_ul li .author {
				margin-top: 0px;
				font-size: 12px;
				padding: 0 20px;
				height: 18px;
				line-height: 18px;
				overflow: hidden;
				color: #aaa;

			}
			.book_online .product_ul li .price {
				padding-left: 20px;
				line-height: 16px;
				overflow: hidden;
				font-family: "Arial";
				font-size: 14px;
				position: relative;
				height: 36px;
			}
            .book_online .product_ul li .price .rob {
                color: #c30;
                float: left;
                overflow: hidden;
                font-weight: bold;
                margin-right: 12px;
            }
            .book_online .product_ul li .price .price_r {
                color: #aaa;
                text-decoration: line-through;
                float: left;
                overflow: hidden;
            }

            /*右边*/
            .storey_one_right{float:left;}
            .con {
                clear: both;
            }
            .con {
                zoom: 1;
            }
			.book_new_state {
				border: 1px solid #eaeaea;
				padding: 6px 10px;
				width: 218px;
				margin-bottom: 10px;
			}
            .book_new_state .book_right_title {
                height: 28px;
                font-size: 16px;
                color: #000;
                font-weight: bold;
                font-family: "Microsoft Yahei";
            }
            .book_new_state ul {
                position: relative;
                overflow: hidden;
                height: 68px;
            }
            .book_new_state ul li a, .book_new_state ul li a:hover {
                color: #000;
                display: block;
                height: 22px;
                position: relative;
                overflow: hidden;
                padding-left: 7px;
                background: url(assets/dangdang_image/sprite.png) -16px -160px no-repeat;
                line-height: 22px;
				font-size: 12px;
            }
			.book_presell {
				border: 1px solid #eaeaea;
				padding: 6px 0 0;
				width: 238px;
				height: 187px;
				position: relative;
				margin-bottom: 9px;
				overflow: hidden;
			}
			.book_presell .book_right_title {
				height: 25px;
				font-size: 16px;
				color: #000;
				font-weight: bold;
				padding-left: 10px;
				font-family: "Microsoft Yahei";
			}
			.book_presell .btn_brand_prev {
				width: 25px;
				height: 50px;
				background: url(assets/dangdang_image/book_fanye_btn.png) 0 0 no-repeat;
				position: absolute;
				left: 0;
				top: 50%;
				margin-top: -20px;
				z-index: 2;
				cursor: pointer;
			}
			.book_presell .btn_brand_next {
				width: 25px;
				height: 50px;
				background: url(assets/dangdang_image/book_fanye_btn.png) -26px 0 no-repeat;
				z-index: 2;
				cursor: pointer;
				position: absolute;
				right: 0;
				top: 50%;
				margin-top: -20px;
			}
			.book_presell .mix_marquee_tab {
				position: absolute;
				left: 90px;
				top: 172px;
				float: left;
				width: 160px;
			}
			.book_presell .mix_marquee_tab li {
				float: left;
				width: 10px;
				height: 10px;
				font-size: 0;
				line-height: 10px;
				margin-right: 10px;
				background: url(assets/dangdang_image/diandian_bg2.png) 0 -20px no-repeat;
				text-indent: -9999px;
				cursor: pointer;
			}
			.book_presell .mix_marquee_tab li.current {
				background-position: 0 0;
			}
			.book_presell .over {
				width: 238px;
				position: relative;
				overflow: hidden;
				height: 140px;
			}
			.book_presell .over .list_aa {
				width: 2000px;
				height: 148px;
				left: 0;
				position: absolute;
			}
			.book_presell .over .list_aa li {
				float: left;
				height: 148px;
				width: 238px;
				position: relative;
			}
			.book_presell .over .list_aa li .img {
				position: absolute;
				left: 0;
				top: 10px;
			}
			.book_presell .over .list_aa li .img, .book_presell .over .list_aa li .img img {
				display: block;
				width: 120px;
				height: 120px;
			}
			a {
				text-decoration: none;
				color: #666;
			}
			.book_presell .over .list_aa li .name {
				height: 44px;
				line-height: 22px;
				width: 94px;
				position: absolute;
				overflow: hidden;
				left: 120px;
				top: 31px;
                font-size: 12px;
			}
			.book_presell .over .list_aa li .name a, .book_presell .over .list_aa li .name a:hover {
				color: #000;
			}
			.book_presell .over .list_aa li .price {
				width: 110px;
				font-size: 14px;
				font-family: "Arial";
				position: absolute;
				left: 120px;
				top: 80px;
			}
			.book_presell .over .list_aa li .price .rob {
				color: #c30000;
				margin-right: 8px;
				font-weight: bold;
				display: block;
				margin-bottom: 4px;
			}
			.book_presell .over .list_aa li .price .price_r {
				color: #aaa;
				text-decoration: line-through;
			}
			.book_presell .over .list_aa li .icon_pop {
				position: absolute;
				right: 120px;
				top: 25px;
			}
			.book_presell .book_presell_more {
				position: absolute;
				top: 10px;
				right: 8px;
				color: #5097bc;
				font-size: 12px;
			}
			/*新书热卖榜*/
			.book_new {
				width: 240px;
			}
			.book_new .title {
				height: 40px;
				line-height: 40px;
				padding-left: 34px;
				font-size: 16px;
				color: #000;
				font-weight: bold;
				background: url(assets/dangdang_image/sprite.png) 5px 4px no-repeat;
				font-family: "Microsoft Yahei";
				position: relative;
				overflow: hidden;
				margin-bottom: 0px;
			}
			.book_new .title a {
				color: #d72832;
			}
			.book_new .tab_box_aa .head ul {
				height: 25px;
			}
			.book_new .tab_box_aa .head ul li {
				float: left;
				width: 48px;
			}
			.book_new .tab_box_aa .head ul li.on {
				border-top: 2px solid #487a6f;
			}
			.book_new .tab_box_aa .head ul li span {
				display: block;
				height: 20px;
				line-height: 20px;
				text-align: center;
				border: 1px solid #eaeaea;
				padding: 2px 0 1px;
				cursor: pointer;
				font-size: 12px;
			}
			.book_new .tab_box_aa .head ul li.on span {
				border-bottom: 0px;
				padding-top: 1px;
				border-top: 0;
				font-weight: bold;
				color: #487a6f;
				font-size: 12px;
			}
			.book_new .tab_box_aa .head ul li.first span {
				border-left: 1px solid #eaeaea;
				font-size: 12px;
			}
			.book_new .tab_content_aa {
				border: 1px solid #eaeaea;
				border-top: 0;
				padding-top: 3px;
			}
			.book_new .tab_content_aa .book_top {
				position: relative;
				height: 518px;
				padding-top: 5px;
			}
			.book_new .tab_content_aa .book_top .list_ab {
				/*position: relative;*/
				height: 480px;
				/*overflow: hidden;*/
			}
			.book_new .tab_content_aa .list_ab li.bar {
				height: 36px;
				line-height: 36px;
				border-bottom: 1px dotted #d8d8d8;
				width: 220px;
				margin-left: 9px;
				vertical-align: top;
			}
			.book_new .tab_content_aa .list_ab li.line1 span.num1, .book_new .tab_content_aa .list_ab li.line2 span.num2, .book_new .tab_content_aa .list_ab li.line3 span.num3 {
				color: #d10000;
			}
			.book_new .tab_content_aa .list_ab li.bar span.num {
				width: 29px;
				padding-left: 8px;
				float: left;
				font-size: 16px;
				color: #000;

			}
			.book_new .tab_content_aa .list_ab li.bar .name {
				float: left;
				height: 36px;
				position: relative;
				overflow: hidden;
				width: 182px;
				font-size: 12px;
			}
            .book_new .tab_content_aa .list_ab li.item .name a, .book_new .tab_content_aa .list_ab li.item .name a:hover, .book_new .tab_content_aa .list_ab li.bar .name a, .book_new .tab_content_aa .list_ab li.bar .name a:hover {
                color: #000;
                word-break: break-all;
                word-wrap: break-word;
            }
            .book_new .tab_content_aa .book_top .more_top {
                color: #5097bc;
                width: 225px;
                background: #fff;
                display: block;
                height: 30px;
                line-height: 30px;
                position: absolute;
                bottom: 8px;
                left: 5px;
                text-align: right;
				font-size: 12px;
            }
			.book_new .tab_content_aa .list_ab li.item {
				height: 150px;
				width: 220px;
				margin-left: 9px;
				position: relative;
				border-bottom: 1px dotted #d8d8d8;
				vertical-align: top;
			}

			.book_new .tab_content_aa .list_ab li.line1 span.num1, .book_new .tab_content_aa .list_ab li.line2 span.num2, .book_new .tab_content_aa .list_ab li.line3 span.num3 {
				color: #d10000;
			}
			.book_new .tab_content_aa .list_ab li.item .num {
				font-size: 16px;
				color: #000;
				height: 24px;
				line-height: 24px;
				position: absolute;
				left: 8px;
				top: 6px;
				z-index: 2;
			}
			.book_new .tab_content_aa .list_ab li.item .img, .book_new .tab_content_aa .list_ab li.item .img img {
				display: block;
				width: 120px;
				height: 120px;
			}
			.book_new .tab_content_aa .list_ab li.item .img {
				position: absolute;
				left: 20px;
				top: 11px;
			}
			.book_new .tab_content_aa .list_ab li.item .img, .book_new .tab_content_aa .list_ab li.item .img img {
				display: block;
				width: 120px;
				height: 120px;
			}
			.book_new .tab_content_aa .list_ab li.item .name {
				height: 44px;
				line-height: 22px;
				position: absolute;
				overflow: hidden;
				top: 9px;
				left: 145px;
				font-size: 12px;
			}
			.book_new .tab_content_aa .list_ab li.item .price {
				position: absolute;
				top: 55px;
				left: 145px;
				font-size: 14px;
				line-height: 20px;
			}
			.book_new .tab_content_aa .list_ab li.item .price .rob, .book_new .tab_content_aa .list_ab li.item .price .rob span {
				color: #c30000;
				line-height: 20px;
				height: 20px;
				font-size: 14px;
			}
			.book_new .tab_content_aa .list_ab li.item .price .rob {
				display: block;
				font-weight: bold;
			}
			.book_new .tab_content_aa .list_ab li.item .price .rob, .book_new .tab_content_aa .list_ab li.item .price .rob span {
				color: #c30000;
				line-height: 20px;
				height: 20px;
				font-size: 14px;
			}
			.book_new .tab_content_aa .list_ab li.item .price .num {
				position: static;
			}
			.book_new .tab_content_aa .list_ab li.item .num {
				position: absolute;
				left: 8px;
				top: 6px;
				z-index: 2;
			}
			.book_new .tab_content_aa .list_ab li.item .price .price_r, .book_new .tab_content_aa .list_ab li.item .price .price_r span {
				color: #a7a7a7;
				text-decoration: line-through;
				line-height: 18px;
				height: 18px;
				font-size: 14px;
			}
			.book_new .tab_content_aa .list_ab li.item .link, .book_new .tab_content_aa .list_ab li.item .link a, .book_new .tab_content_aa .list_ab li.item .link a:hover {
				color: #487a6f;
			}
			.book_new .tab_content_aa .list_ab li.item .num {
				position: absolute;
				left: 8px;
				top: 6px;
				z-index: 2;
			}
			.book_new .tab_content_aa .list_ab li.item .link {
				position: absolute;
				left: 145px;
				top: 97px;
				font-size: 12px;
			}

			/*独家特供*/
			.storey_two{zoom: 1;height: 582px;padding-top:10px}
			.storey_two .storey_two_left {
				float: left;
				width: 950px;
				margin-right: 10px;
			}
			.dujia {
				width: 950px;
				overflow: hidden;
				position: relative;
			}
			.dujia .head {
				position: relative;
				height: 50px;
				border-bottom: 1px solid #487a6f;
			}
			.dujia .head .title {
				height: 50px;
				width: 108px;
				line-height: 0;
				font-size: 0;
				background: url(assets/dangdang_image/title_sprite.png) 0 0 no-repeat;
				position: absolute;
				left: 0;
				top: 0;
				text-indent: -9999px;
			}
			.dujia .head .tab_aa {
				height: 35px;
				position: absolute;
				right: 15px;
				top: 17px;
			}
			.dujia .head .tab_aa li {
				padding: 2px 17px 0;
				height: 32px;
				line-height: 32px;
				float: left;
				color: #666;
				font-size: 14px;
				font-family: 'Microsoft Yahei';
				margin-right: 4px;
				cursor: pointer;
			}
			.dujia .head .tab_aa li.on {
				background: #fff;
				border-radius: 6px 6px 0 0;
				border: 2px solid #487a6f;
				border-bottom: none;
				color: #4e8176;
				padding: 0 15px;
				font-weight: bold;
			}
			.dujia .head .tab_aa li span {
				cursor: pointer;
			}
			.dujia .tab_content_aa .list_aa {
				padding: 20px 0 0 0;
				height: 513px;
				overflow: hidden;
				width: 1000px;
			}
			.dujia .tab_content_aa .list_aa li {
				float: left;
				width: 150px;
				height: 270px;
				margin-right: 47px;
				position: relative;
			}
			.dujia .tab_content_aa .list_aa li .img, .dujia .tab_content_aa .list_aa li .img img {
				width: 150px;
				height: 150px;
				display: block;
			}
			.dujia .tab_content_aa .list_aa li .name {
				padding: 7px 20px 0;
				height: 18px;
				line-height: 18px;
				overflow: hidden;
                font-size:12px;
			}
			.dujia .tab_content_aa .list_aa li .num_logo {
				padding: 5px 0px 0 35px;
				background: url(images/home/sprite.png) 20px -86px no-repeat;
				height: 16px;
				line-height: 16px;
				display: block;
				color: #5b877e;
				font-family: '宋体';
				font-size: 12px;
				overflow: hidden;
			}
			.dujia .tab_content_aa .list_aa li .price {
				padding: 5px 0 0 20px;
				height: 36px;
				line-height: 16px;
				overflow: hidden;
				font-family: "Arial";
				font-size: 14px;
				position: relative;
			}
			.dujia .tab_content_aa .list_aa li .price .rob {
				color: #c30;
				float: left;
				margin-right: 12px;
				font-weight: bold;
			}
            .dujia .tab_content_aa .list_aa li .name a, .dujia .tab_content_aa .list_aa li .name a:hover {
                color: #000;
                text-decoration: none;
            }
			/*独家推荐右边*/
			.storey_two .storey_two_right {
				float: left;
				width: 240px;
			}
			.book_sell {
				width: 240px;
				margin-bottom: 20px;
				padding-top: 10px;
			}
			.book_sell .title {
				height: 40px;
				line-height: 40px;
				padding-left: 34px;
				font-size: 16px;
				color: #000;
				font-weight: bold;
				background: url(assets/dangdang_image/sprite.png) 5px 4px no-repeat;
				font-family: "Microsoft Yahei";
				position: relative;
				overflow: hidden;
			}
			.book_sell .title a {
				color: #000;
			}
			.book_sell .tab_box_aa .head ul {
				height: 25px;
				overflow: hidden;
			}
			.book_sell .tab_box_aa .head ul li.on {
				border-top: 2px solid #487a6f;
			}
			.book_sell .tab_box_aa .head ul li {
				float: left;
				width: 48px;
			}
			.book_sell .tab_box_aa .head ul li span {
				display: block;
				text-align: center;
				height: 20px;
				line-height: 20px;
				border: 1px solid #eaeaea;
				border-left: 0;
				padding: 2px 0 1px;
				color: #000;
				cursor: pointer;
				font-size: 12px;

			}
			.book_sell .tab_box_aa .head ul li.on span {
				border-bottom: 0px;
				padding-top: 1px;
				border-top: 0;
				font-weight: bold;
				color: #487a6f;
				font-size: 12px;
			}
			.book_sell .tab_box_aa .head ul li.first span {
				border-left: 1px solid #eaeaea;
			}
			.book_sell .tab_content_aa {
				border: 1px solid #eaeaea;
				border-top: 0;
				padding-top: 3px;
			}
			.book_sell .tab_content_aa .book_top {
				position: relative;
				height: 506px;
			}
			.book_sell .tab_content_aa .book_top .list_ab {
				position: relative;
				height: 480px;
				overflow: hidden;
			}
			.book_sell .tab_content_aa .list_ab li.bar {
				height: 36px;
				line-height: 36px;
				border-bottom: 1px dotted #d8d8d8;
				width: 220px;
				margin-left: 9px;
				vertical-align: top;
                font-size: 12px;
			}
			.book_sell .tab_content_aa .list_ab li.line1 span.num1, .book_sell .tab_content_aa .list_ab li.line2 span.num2, .book_sell .tab_content_aa .list_ab li.line3 span.num3 {
				color: #d10000;
			}
			.book_sell .tab_content_aa .list_ab li.bar span.num {
				width: 29px;
				padding-left: 8px;
				float: left;
				font-size: 16px;
				color: #000;
			}
			.book_sell .tab_content_aa .list_ab li.bar .name {
				float: left;
				height: 36px;
				position: relative;
				overflow: hidden;
				width: 182px;
                font-size:12px;
			}
			.book_sell .tab_content_aa .list_ab li.item .name a, .book_sell .tab_content_aa .list_ab li.item .name a:hover, .book_sell .tab_content_aa .list_ab li.bar .name a, .book_sell .tab_content_aa .list_ab li.bar .name a:hover {
				color: #000;
				word-break: break-all;
				word-wrap: break-word;
			}
			.book_sell .tab_content_aa .list_ab li.item {
				height: 146px;
				width: 220px;
				margin-left: 9px;
				position: relative;
				border-bottom: 1px dotted #d8d8d8;
				vertical-align: top;
			}
			.book_sell .tab_content_aa .list_ab li.item .img, .book_sell .tab_content_aa .list_ab li.item .img img {
				display: block;
				width: 120px;
				height: 120px;
			}
			.book_sell .tab_content_aa .list_ab li.item .num {
				font-size: 16px;
				color: #000;
				height: 24px;
				line-height: 24px;
				position: absolute;
				left: 8px;
				top: 6px;
				z-index: 2;}
			.book_sell .tab_content_aa .list_ab li.item .img {
				position: absolute;
				left: 20px;
				top: 11px;
			}
			.book_sell .tab_content_aa .list_ab li.item .name {
				height: 44px;
				line-height: 22px;
				position: absolute;
				overflow: hidden;
				top: 9px;
				left: 145px;
				font-size: 12px;
			}
			.book_sell .tab_content_aa .list_ab li.item .price {
				position: absolute;
				top: 55px;
				left: 145px;
				font-size: 14px;
				line-height: 20px;
				font-family: "Arial";
			}
			.book_sell .tab_content_aa .list_ab li.item .price .rob, .book_sell .tab_content_aa .list_ab li.item .price .rob span {
				color: #c30000;
				font-size: 14px;
				line-height: 20px;
				height: 20px;
			}
			.book_sell .tab_content_aa .list_ab li.item .price .rob {
				display: block;
				font-weight: bold;
			}
			.book_sell .tab_content_aa .list_ab li.item .price .num {
				position: static;
			}
			.book_sell .tab_content_aa .list_ab li.item .price .price_r, .book_sell .tab_content_aa .list_ab li.item .price .price_r span {
				color: #a7a7a7;
				text-decoration: line-through;
				line-height: 18px;
				height: 18px;
				font-size: 14px;
			}
			.book_sell .tab_content_aa .list_ab li.item .price .num {
				position: static;
			}
			.book_sell .tab_content_aa .list_ab li.item .link, .book_sell .tab_content_aa .list_ab li.item .link a, .book_sell .tab_content_aa .list_ab li.item .link a:hover {
				color: #487a6f;
			}
			.book_sell .tab_content_aa .list_ab li.item .link {
				position: absolute;
				left: 145px;
				top: 97px;
				font-size:12px;
			}
			.book_sell .tab_content_aa .book_top .more_top {
				color: #5097bc;
				width: 225px;
				background: #fff;
				display: block;
				height: 30px;
				line-height: 30px;
				position: absolute;
				bottom: 1px;
				left: 5px;
				text-align: right;
				font-size: 12px;
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
                        <li><a target="_blank" href="toMyCollection" dd_name="我的收藏" rel="nofollow">我的收藏</a></li>
						<li><a target="_blank" href="toErpRegister" dd_name="商家入驻" rel="nofollow">商家入驻</a></li>

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

        <%--上面导航条由于太多--%>
		<%--<div class="sub"></div>--%>
	</div>

		<%--左中右--%>
		<div id="bd_auto">
			<div class="con storey_one">
				<div class="col storey_one_left">
					<div class="sidemenu">
						<div class="con flq_head">
							图书分类
						</div>
						<div class="con flq_body"></div>
					</div>
				</div>

			<div class="col storey_one_center">
				<div class="tab_box_aa">
					<div class="head head">
                        <ul class="tab_aa">
							<li class="first" type="bar"><span>1</span></li>
							<li class="tabh_1" type="bar"><span>2</span></li>
							<li class="tabh_2" type="bar"><span>3</span></li>
							<li class="tabh_3" type="bar"><span>4</span></li>
							<li class="tabh_4" type="bar"><span>5</span></li>
							<li class="tabh_5" type="bar"><span>6</span></li>
						</ul>
					</div>
					<div class="tab_content_aa">
						<div class="content tab_1" type="item" dd_name="tab_1" style="display: block;"><a class=" _1  pic" href="http://book.dangdang.com/20180322_nvwo" ddt-pit="1" dd_name="1" ddt-area="5223" ddt-src="http://book.dangdang.com/20180322_nvwo" title="季末大清仓 万种图书3折封顶" target="_blank" nname="book-65152-9164_1-474033_1"><img src="assets/dangdang_image/dangdang750312A01-1522224453.jpg" title="季末大清仓 万种图书3折封顶" alt="季末大清仓 万种图书3折封顶" ddt-src="http://img63.ddimg.cn/upload_img/00087/hw/750x315_lyx_0326-1522053864.jpg"></a></div>
					</div>
				</div>
				<div class="book_online">
					<div class="book_online_title"></div>
					<div class="roll_aa">
						<div class="btn_brand_prev" type="rollpre"></div>
						<div class="btn_brand_next" type="rollnext"></div>
						<ul class="mix_marquee_tab"><li class="current">1</li><li>2</li><li>3</li><li>4</li></ul>
						<div class="over" id="overcontent">
							<%--<ul class="list_aa" style="left:0px" type="rollbox">--%>
								<%--<li type="rollitem" dd_name="第1帧">--%>
									<%--<ul class="product_ul " id="component_403754__5298_5294__5294" ddt-area="5294" dd_name="商品">--%>
										<%--<li class="line1 " nname="book-65152-9164_2-470620_1" ddt-pit="1" dd_name="1">--%>
											<%--<a title="神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）" class="img" href="http://product.dangdang.com/25229466.html" target="_blank"><img src="http://img3m6.ddimg.cn/9/17/25229466-1_l_6.jpg" alt="神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）"></a><p class="name" ddt-src="25229466"><a title="神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）" href="http://product.dangdang.com/25229466.html" target="_blank" style=" ">神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作</a></p><p class="author"><span class="author_t"></span>爱玛·多诺霍，白马时光 出品</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">33</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">39</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line2 " nname="book-65152-9164_2-470620_2" ddt-pit="2" dd_name="2">--%>
											<%--<a title="周周复年年" class="img" href="http://product.dangdang.com/25236663.html" target="_blank"><img src="http://img3m3.ddimg.cn/78/36/25236663-1_l_2.jpg" alt="周周复年年"></a><p class="name" ddt-src="25236663"><a title="周周复年年" href="http://product.dangdang.com/25236663.html" target="_blank" style=" ">周周复年年</a></p><p class="author"><span class="author_t"></span>7号同学</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">21</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">34</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line3 " nname="book-65152-9164_2-470620_3" ddt-pit="3" dd_name="3">--%>
											<%--<a title="日俄战争：起源和开展（精装 全二册）" class="img" href="http://product.dangdang.com/25239196.html" target="_blank"><img src="http://img3m6.ddimg.cn/37/16/25239196-1_l_2.jpg" alt="日俄战争：起源和开展（精装 全二册）"></a><p class="name" ddt-src="25239196"><a title="日俄战争：起源和开展（精装 全二册）" href="http://product.dangdang.com/25239196.html" target="_blank" style=" ">日俄战争：起源和开展（精装&nbsp;全二册）</a></p><p class="author"><span class="author_t"></span>（日）和田春树</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">110</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">148</span><span class="tail">.00</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line4 " nname="book-65152-9164_2-470620_4" ddt-pit="4" dd_name="4">--%>
											<%--<a title="见识 吴军 首部认知升级类著作" class="img" href="http://product.dangdang.com/25220963.html" target="_blank"><img src="http://img3m3.ddimg.cn/20/24/25220963-1_l_2.jpg" alt="见识 吴军 首部认知升级类著作"></a><p class="name" ddt-src="25220963"><a title="见识 吴军 首部认知升级类著作" href="http://product.dangdang.com/25220963.html" target="_blank" style=" ">见识&nbsp;吴军&nbsp;首部认知升级类著作</a></p><p class="author"><span class="author_t"></span>吴军</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.40</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.00</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line5 " nname="book-65152-9164_2-470620_5" ddt-pit="5" dd_name="5">--%>
											<%--<a title="美国儿科学会育儿百科（第6版，2018全新增订)" class="img" href="http://product.dangdang.com/25238690.html" target="_blank"><img src="http://img3m0.ddimg.cn/26/28/25238690-1_l_3.jpg" alt="美国儿科学会育儿百科（第6版，2018全新增订)"></a><p class="name" ddt-src="25238690"><a title="美国儿科学会育儿百科（第6版，2018全新增订)" href="http://product.dangdang.com/25238690.html" target="_blank" style=" ">美国儿科学会育儿百科（第6版，2018全新增订)</a></p><p class="author"><span class="author_t"></span>〔美〕斯蒂文·谢尔弗 主编  陈铭宇，周莉，池丽叶 等 译</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">64</span><span class="tail">.10</span></span><span class="price_r"><span class="sign">¥</span><span class="num">89</span><span class="tail">.00</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line6 " nname="book-65152-9164_2-470620_6" ddt-pit="6" dd_name="6">--%>
											<%--<a title="DK幼儿百科全书——那些重要的事" class="img" href="http://product.dangdang.com/25233424.html" target="_blank"><img src="http://img3m4.ddimg.cn/7/16/25233424-1_l_3.jpg" alt="DK幼儿百科全书——那些重要的事"></a><p class="name" ddt-src="25233424"><a title="DK幼儿百科全书——那些重要的事" href="http://product.dangdang.com/25233424.html" target="_blank" style=" ">DK幼儿百科全书——那些重要的事</a></p><p class="author"><span class="author_t"></span>英国DK公司</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">98</span><span class="tail">.70</span></span><span class="price_r"><span class="sign">¥</span><span class="num">138</span><span class="tail">.00</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line7 " nname="book-65152-9164_2-470620_7" ddt-pit="7" dd_name="7">--%>
											<%--<a title="小喇叭中国儿童经典广播故事讲读绘本（80册）" class="img" href="http://product.dangdang.com/25226861.html" target="_blank"><img src="http://img3m1.ddimg.cn/77/2/25226861-1_l_3.jpg" alt="小喇叭中国儿童经典广播故事讲读绘本（80册）"></a><p class="name" ddt-src="25226861"><a title="小喇叭中国儿童经典广播故事讲读绘本（80册）" href="http://product.dangdang.com/25226861.html" target="_blank" style=" ">小喇叭中国儿童经典广播故事讲读绘本（80册）</a></p><p class="author"><span class="author_t"></span>江通动漫 著，童趣出版有限公司 编</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">334</span><span class="tail">.70</span></span><span class="price_r"><span class="sign">¥</span><span class="num">498</span><span class="tail">.00</span></span></p><div class="icon_pop"></div>            </li>--%>
										<%--<li class="line8 " nname="book-65152-9164_2-470620_8" ddt-pit="8" dd_name="8">--%>
											<%--<a title="烈火如歌(全两册)(电子书)" class="img" href="http://product.dangdang.com/1900961593.html" target="_blank"><img src="http://img3m3.ddimg.cn/25/13/1900961593-1_l_1.jpg" alt="烈火如歌(全两册)(电子书)"></a><p class="name" ddt-src="1900961593"><a title="烈火如歌(全两册)(电子书)" href="http://product.dangdang.com/1900961593.html" target="_blank" style=" ">烈火如歌(全两册)(电子书)</a></p><p class="author"><span class="author_t"></span>明晓溪</p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">9</span><span class="tail">.99</span></span></p><div class="icon_pop"></div>            </li>--%>
									<%--</ul>--%>
								<%--</li>--%>
							<%--</ul>--%>
						</div>

					</div>
				</div>

			</div>

            <%--右边--%>
			<div  class="storey_one_right" >
				<%--新闻--%>
                <div class="con">
                    <div class="book_new_state">
                        <div class="book_right_title "><h2 class="" ddt-pit="1" style="font-size: 16px">最新动态</h2></div>
                        <ul class="new_content">
                            <%--<li  class="line line1 on" ><a href="http://book.dangdang.com/20180328_qgi3" target="_blank" class="" title="大国对决，中美贸易战争将何去何从" >大国对决，中美贸易战争将何去何从</a></li>--%>
                            <%--<li  class="line line2 " ><a href="http://book.dangdang.com/20180326_ay1d" target="_blank" class="" title="人文社科，5折封顶，低至3.9折！" >人文社科，5折封顶，低至3.9折！</a></li>--%>
                            <%--<li  class="line line3 " ><a href="http://book.dangdang.com/20180323_2155" target="_blank" class="" title="万物复苏季，生活图书每满99减50" >万物复苏季，生活图书每满99减50</a></li>--%>
                        </ul>
                    </div>
				</div>

				<%--新书预售--%>
					<div class="con">
						<div class="book_presell">
							<div class="book_right_title "><h2 class="" ddt-pit="1" style="font-size: 16px">新书预售</h2></div>
							<div class="roll_aa">
								<div class="btn_brand_prev" type="rollpre"></div>
								<div class="btn_brand_next" type="rollnext"></div>
								<ul class="mix_marquee_tab" style="left: 74px;"><li class="current">1</li><li>2</li><li>3</li><li>4</li><li>5</li></ul>
								<div class="over">
									<ul class="list_aa " id="presellLi" ddt-area="5303" dd_name="商品"></ul>
								</div>
							</div>
							<a href="http://book.dangdang.com/20130201_vcey" target="_blank" title="预售更多" class="book_presell_more" >预售更多</a>
						</div>
					</div>

				<%--新书热卖榜--%>
					<div class="con">
						<div class="book_new">
							<div class="con title">
								<a  href="http://bang.dangdang.com/books/newhotsales/01.00.00.00.00.00-recent7-0-0-1-1" target="_blank" title="新书热卖榜" class="hot_link" >新书热卖榜</a>
							</div>
							<div class="con list">
								<div class="tab_box_aa">
									<div class="head">
										<ul class="tab_aa">
											<li class="on" type="bar"><span>校园</span></li>
											<li  type="bar"><span>文集</span></li>
											<li  type="bar"><span>中国史</span></li>
											<li  type="bar"><span>世界史 </span></li>
										</ul>
									</div>
									<div class="tab_content_aa">
										<div class="tab_1" type="item" dd_name="总榜" style="display: block;">
											<div class="book_top">
												<ul class="list_ab" id="newBookHot">
													<%--<li class="line1 bar" style="display: block;">--%>
														<%--<span class="num num1 ">1</span>--%>
														<%--<p class="name" ><a title="神奇校车·动画版（全10册）" href="http://product.dangdang.com/25243206.html?ref=book-65152-9168_1-473484-0" target="_blank">神奇校车·动画版（全10册）</a></p>--%>
													<%--</li>--%>
													<%--<li class="line1 item" style="display: none;">--%>
														<%--<span class="num num1">1</span>--%>
														<%--<a class="img" href="http://product.dangdang.com/25243206.html" target="_blank"><img src="http://img3m6.ddimg.cn/87/30/25243206-1_l_3.jpg" alt="神奇校车·动画版（全10册）"></a><p class="name" ddt-src="25243206"><a title="神奇校车·动画版（全10册）" href="http://product.dangdang.com/25243206.html?ref=book-65152-9168_1-473484-0" target="_blank">神奇校车·动画版（全10册）</a></p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">79</span><span class="tail">.30</span></span><span class="price_r"><span class="sign">¥</span><span class="num">118</span><span class="tail">.00</span></span></p><p class="link "><span></span><a target="_blank" href="http://product.dangdang.com/25243206.html?point=comment_point">0</a>条评论</p><div class="icon_pop"></div>--%>
													<%--</li>--%>
												</ul>
												<a href="http://bang.dangdang.com/books/newhotsales/01.00.00.00.00.00-recent7-0-0-1-1" target="_blank" title="查看完整榜单>>" class="more_top" >查看完整榜单&gt;&gt; </a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%--独家提供--%>
			<div class="con storey_two">
				<div class="col storey_two_left">
					<div>
						<div class="book_tegong">
							<div class="dujia">
								<div class="head headdujia">
									<h3 class="title">独家特供</h3>
									<ul class="tab_aa">
                                        <li  type="bar" class="on"><span>校园</span></li>
                                        <li  type="bar"><span>高职高专教材</span></li>
                                        <li  type="bar"><span>爱情/情感</span></li>
                                        <li  type="bar"><span>大陆漫画</span></li>
                                        <li  type="bar"><span>香港漫画</span></li>
                                        <li  type="bar"><span>摄影入门</span></li>
                                        <li  type="bar"><span>摄影理论</span></li>
										<li  type="bar"><span>中国史</span></li>
									</ul>
								</div>
								<div class="tab_content_aa tab_content_aadujia">
									<div class="content tab_1" style="display: block">
										<ul class="list_aa">
											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>
											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>
											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>
											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

											<%--<li class="line1" nname="book-65152-9161_1-470351_1" ddt-pit="1" dd_name="1">--%>
												<%--<a title="一本书读完最美古诗词（上下册）" class="img" href="http://product.dangdang.com/25195961.html" target="_blank"><img src="http://img3m1.ddimg.cn/65/34/25195961-1_l_4.jpg" alt="一本书读完最美古诗词（上下册）"></a><p class="name" ddt-src="25195961"><a title="一本书读完最美古诗词（上下册）" href="http://product.dangdang.com/25195961.html" target="_blank">一本书读完最美古诗词（上下册）</a></p><span class="num_logo">当当独家特供</span><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">29</span><span class="tail">.90</span></span><span class="price_r"><span class="sign">¥</span><span class="num">49</span><span class="tail">.80</span></span></p><div class="icon_pop"></div>            </li>--%>

										</ul>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
				<div class="col storey_two_right">
					<div class="book_sell" >
						<div class="con title">
							<a href="http://bang.dangdang.com/books/bestsellers/01.00.00.00.00.00-recent7-0-0-1-1" >图书畅销榜</a>
				        </div>
						<div class="con list">
							<div class="tab_box_aa ">
					            <div class="head  head">
									<ul class="tab_aa">
										<li class="tabh_1" type="bar"><span>研究生/本科/专科教材</span></li>
										<li class="tabh_2" type="bar"><span>成人教育教材</span></li>
										<li class="tabh_3 first on" type="bar"><span>高职高专教材</span></li>
										<li class="tabh_4" type="bar"><span>中职教材</span></li>
									</ul>
								</div>
					        <div class="tab_content_aa tab_content_aa ">
								<%--<div class="content tab_1" type="item" dd_name="总榜" style="display: block;">--%>
							<div class="book_top">
								<ul class="list_ab" id="sellAmount1">
									<%--<li class="line1 bar">--%>
										<%--<span class="num num1">1</span>--%>
										<%--<p class="name" ddt-src="25137790"><a title="活着（2017年新版）" href="http://product.dangdang.com/25137790.html?ref=book-65152-9162_1-473554-0" target="_blank">活着（2017年新版）</a></p>            </li>--%>
									<%--<li class="line1 item" nname="book-65152-9162_1-473554_" type="item" ddt-pit="1" dd_name="1" style="display:block;">--%>
										<%--<span class="num num1">1</span>--%>
										<%--<a class="img" href="http://product.dangdang.com/25137790.html" target="_blank"><img src="http://img3m0.ddimg.cn/7/27/25137790-1_l_1.jpg" alt="活着（2017年新版）"></a><p class="name" ddt-src="25137790"><a title="活着（2017年新版）" href="http://product.dangdang.com/25137790.html?ref=book-65152-9162_1-473554-0" target="_blank" style=" ">活着（2017年新版）</a></p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">14</span><span class="tail">.00</span></span><span class="price_r"><span class="sign">¥</span><span class="num">28</span><span class="tail">.00</span></span></p><p class="link "><span></span><a target="_blank" href="http://product.dangdang.com/25137790.html?point=comment_point">22253</a>条评论</p><div class="icon_pop"><span style="background: url(http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006) no-repeat 0px 0px; _background-image: none; _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006',sizingMethod='noscale');" class="product_tags"></span></div>            </li>--%>
									<%--<li class="line2 bar" nname="book-65152-9162_1-473554_" type="bar" ddt-pit="2" dd_name="2">--%>
										<%--<span class="num num2">2</span>--%>
										<%--<p class="name" ddt-src="24198400"><a title="我喜欢生命本来的样子(周国平经典散文作品集)" href="http://product.dangdang.com/24198400.html?ref=book-65152-9162_1-473554-1" target="_blank">我喜欢生命本来的样子(周国平</a></p>            </li>--%>
									<%--<li class="line2 item" nname="book-65152-9162_1-473554_" type="item" style="display:none;" ddt-pit="2" dd_name="2">--%>
										<%--<span class="num num2">2</span>--%>
										<%--<a class="img" href="http://product.dangdang.com/24198400.html" target="_blank"><img src="http://img3m0.ddimg.cn/28/30/24198400-1_l_4.jpg" alt="我喜欢生命本来的样子(周国平经典散文作品集)"></a><p class="name" ddt-src="24198400"><a title="我喜欢生命本来的样子(周国平经典散文作品集)" href="http://product.dangdang.com/24198400.html?ref=book-65152-9162_1-473554-1" target="_blank">我喜欢生命本来的样子(周国平经典散文作品</a></p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">22</span><span class="tail">.50</span></span><span class="price_r"><span class="sign">¥</span><span class="num">45</span><span class="tail">.00</span></span></p><p class="link "><span></span><a target="_blank" href="http://product.dangdang.com/24198400.html?point=comment_point">55650</a>条评论</p><div class="icon_pop"><span style="background: url(http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006) no-repeat 0px 0px; _background-image: none; _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006',sizingMethod='noscale');" class="product_tags"></span></div>            </li>--%>
									<%--<li class="line3 bar" nname="book-65152-9162_1-473554_" type="bar" ddt-pit="3" dd_name="3">--%>
										<%--<span class="num num3">3</span>--%>
										<%--<p class="name" ddt-src="20039611"><a title="小熊和最好的爸爸（全7册）" href="http://product.dangdang.com/20039611.html?ref=book-65152-9162_1-473554-2" target="_blank">小熊和最好的爸爸（全7册）</a></p>            </li>--%>
									<%--<li class="line3 item" nname="book-65152-9162_1-473554_" type="item" style="display:none;" ddt-pit="3" dd_name="3">--%>
										<%--<span class="num num3">3</span>--%>
										<%--<a class="img" href="http://product.dangdang.com/20039611.html" target="_blank"><img src="http://img3m1.ddimg.cn/31/4/20039611-1_l_1.jpg" alt="小熊和最好的爸爸（全7册）"></a><p class="name" ddt-src="20039611"><a title="小熊和最好的爸爸（全7册）" href="http://product.dangdang.com/20039611.html?ref=book-65152-9162_1-473554-2" target="_blank">小熊和最好的爸爸（全7册）</a></p><p class="price"><span class="rob"><span class="sign">¥</span><span class="num">17</span><span class="tail">.50</span></span><span class="price_r"><span class="sign">¥</span><span class="num">35</span><span class="tail">.00</span></span></p><p class="link "><span></span><a target="_blank" href="http://product.dangdang.com/20039611.html?point=comment_point">382684</a>条评论</p><div class="icon_pop"><span style="background: url(http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006) no-repeat 0px 0px; _background-image: none; _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='http://media1.ddimg.cn/label/search/files/51/24/12003009.jpg?r=64006',sizingMethod='noscale');" class="product_tags"></span></div>            </li>--%>
									</ul>
								    <a href="#" target="_blank" title="查看完整榜单>>" class="more_top" ddt-pit="1" >查看完整榜单&gt;&gt;</a>
							</div></div>
							</div>
							</div>
						</div>
					</div>
				</div>
	    </div>
	</body>
</html>
