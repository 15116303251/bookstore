$(function () {
    //获取搜索框下的导航条
    $.ajax( {
        type : "POST",
        url : "querySub",
        dataType : "json",
        data:{},
        success : function(data) {
            var subLi="<ul>";
            for(var k=0;k<data.length;k=k+1){
                subLi=subLi+"<li><a name=\"nav2\" target=\"_blank\" href="+data[k].link+">"+data[k].subName+"</a></li>";
            }
            subLi=subLi+"</ul>"
            $(".sub").html(subLi);
        }
    });


//获取左边的导航条
    $.ajax( {
        type : "POST",
        url : "queryBigSmall",
        dataType : "json",
        data:{},
        success : function(data) {
            var total="";
            for(var k=0;k<data.length;k=k+1){
                var dd_level1="<dd class=\"dd_level1\">";
                var submenu="<div class=\"con\"><div class=\"submenu\" style=\"display:none\"><div class=\"con eject_main\"><div class=\"col eject_left\">";
                var levelone="<div class=\"level_one\"><dl class=\"con primary_dl\" style=\"\"><dt class=\"con\">";
                levelone=levelone+"<span>"+data[k].bBigType+"</span></dt>"
                for (var i=0;i<data[k].smallBigDetailsList.length;i++){
                    dd_level1=dd_level1+"<a class=\"\" href=\""+data[k].smallBigDetailsList[i].link+"\" target=\"_blank\" >"+data[k].smallBigDetailsList[i].bSType+"</a> |";
                    submenu=submenu+"<dl class=\"inner_dl\"><dt>"+data[k].smallBigDetailsList[i].bSType+"</dt><dd>"
                    for(var j=0;j<data[k].smallBigDetailsList[i].bookDetailBigClassesList.length;j++){
                        submenu=submenu+"<a class=\"\" href=\""+data[k].smallBigDetailsList[i].bookDetailBigClassesList[j].link+"\" target=\"_blank\"><span>"+data[k].smallBigDetailsList[i].bookDetailBigClassesList[j].bDBigDetail+"</span></a>"
                    }
                    submenu=submenu+"</dd></dl>";
                }
                submenu=submenu+"</div><div class=\"col eject_right\"></div></div></div></div>";
                dd_level1=dd_level1+"</dd></dl>";
                total=total+levelone+dd_level1+submenu+"</div>";
            }
            $(".flq_body").html(total);
        }
    });


//    弹出隐藏的导航条
    $(document).on('mouseover', '.level_one', function(){
        $(this).find("div").attr("style","display:block")
    });
    $(document).on('mouseout', '.level_one', function(){
        $(this).find("div").attr("style","display:none")
    });

    var total="<ul class=\"list_aa\" style=\"left:0px\" type=\"rollbox\"><li type=\"rollitem\" dd_name=\"第1帧\"><ul class=\"product_ul \" id=\"component_403754__5298_5294__5294\" ddt-area=\"5294\" dd_name=\"商品\">";
    var totalItem="";
    var pageNum=1;

    $.ajax(
        {
            type : "POST",
            url : "queryNewBookList",
            dataType : "json",
            data:{pageNum:pageNum},
            success : function(data) {
                for(var k=0;k<data.list.length;k=k+1){
                    totalItem=totalItem+"<li class=\"line1 \" nname=\"book-65152-9164_2-470620_1\" ddt-pit=\"1\" dd_name=\"1\"><a title=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\" class=\"img\" href="+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+" target=\"_blank\"><img src=\"assets/images/"+data.list[k].image+"\" alt=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\"></a><p class=\"name\" ddt-src=\"25229466\"><a title=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\" href="+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+" target=\"_blank\" style=\" \">"+data.list[k].bookName+"</a></p><p class=\"author\"><span class=\"author_t\"></span>"+data.list[k].author+"</p><p class=\"price\"><span class=\"rob\"><span class=\"sign\">¥</span><span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span><span class=\"tail\"></span></span><span class=\"price_r\"><span class=\"sign\">¥</span><span class=\"num\">"+data.list[k].originalPrice+"</span><span class=\"tail\"></span></span></p><div class=\"icon_pop\"></div></li>";
                   // if(k>0){
                   //     if((k+1)%8==0){
                   //         total=total+totalItem+"</ul></li>"
                   //         totalItem="<li type=\"rollitem\" dd_name=\"第1帧\"><ul class=\"product_ul \" id=\"component_403754__5298_5294__5294\" ddt-area=\"5294\" dd_name=\"商品\">";
                   //     }
                   // }
                }
                // if(k%8!=0){
                    total=total+totalItem+"</ul></li></ul>"
                // }else{
                //     total=total+"</ul>"
                // }
                $("#overcontent").html(total);
            }
        });


//    新书页面切换
    $(document).on('mouseover', '.book_online .mix_marquee_tab li', function(e){
        $(".book_online .mix_marquee_tab .current").removeClass("current");
        $(e.target).addClass("current");
        var num=  $(e.target).html();
        var total="<ul class=\"list_aa\" style=\"left:0px\" type=\"rollbox\"><li type=\"rollitem\" dd_name=\"第1帧\"><ul class=\"product_ul \" id=\"component_403754__5298_5294__5294\" ddt-area=\"5294\" dd_name=\"商品\">";
        var totalItem="";
        $(".book_online .over.list_aa").remove();
        $.ajax(
            {
                type : "POST",
                url : "queryNewBookList",
                dataType : "json",
                data:{pageNum:num},
                success : function(data) {
                    for(var k=0;k<data.list.length;k=k+1){
                        totalItem=totalItem+"<li class=\"line1 \" nname=\"book-65152-9164_2-470620_1\" ddt-pit=\"1\" dd_name=\"1\"><a title=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\" class=\"img\" href="+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+" target=\"_blank\"><img src=\"assets/images/"+data.list[k].image+"\" alt=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\"></a><p class=\"name\" ddt-src=\"25229466\"><a title=\"神迹（奥斯卡获奖影片《房间》小说原作者、《纽约时报》百万畅销书作家震撼新作，横扫欧美各大榜单）\" href=\"http://product.dangdang.com/25229466.html\" target=\"_blank\" style=\" \">"+data.list[k].bookName+"</a></p><p class=\"author\"><span class=\"author_t\"></span>"+data.list[k].author+"</p><p class=\"price\"><span class=\"rob\"><span class=\"sign\">¥</span><span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span><span class=\"tail\"></span></span><span class=\"price_r\"><span class=\"sign\">¥</span><span class=\"num\">"+data.list[k].originalPrice+"</span><span class=\"tail\"></span></span></p><div class=\"icon_pop\"></div></li>";
                    }
                    total=total+totalItem+"</ul></li></ul>"
                    $("#overcontent").html(total);
                }
            });
    });

//    获取公告
    $.ajax( {
        type : "GET",
        url : "queryContent",
        dataType : "json",
        data:{},
        success : function(data) {
            var contentLi="";
            for(var k=0;k<data.length;k=k+1){
                contentLi=contentLi+"<li  class=\"line line1 on\" ><a href=\""+data[k].href+"\" target=\"_blank\" class=\"\" >"+data[k].content+"</a></li>";
            }
            $(".new_content").html(contentLi);
        }
    });

    //新书预售
    var pageNum1=1;
    $.ajax( {
        type : "POST",
        url : "queryPresell",
        dataType : "json",
        data:{pageNum:pageNum1},
        success : function(data) {
            var presellLi="";
            for(var k=0;k<data.list.length;k=k+1){
                presellLi=presellLi+"<li class=\"line1\">\n" +
                    "    <a  class=\"img\" href="+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+" target=\"_blank\">\n" +
                    "    <img src=\"assets/images/"+data.list[k].image+"\">\n" +
                    "    </a>\n" +
                    "<p class=\"star\">\n" +
                    "    <span class=\"title\"></span>\n" +
                    "    <span class=\"level\"><span style=\"width: 0%;\"></span></span>\n" +
                    "</p>\n" +
                    "<p class=\"name\">\n" +
                    "    <a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+"\" target=\"_blank\" style=\" \">"+data.list[k].bookName+"</a>\n" +
                    "</p>\n" +
                    "<p class=\"price\">\n" +
                    "    <span class=\"rob\">\n" +
                    "        <span class=\"sign\">¥</span>\n" +
                    "        <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                    "        <span class=\"tail\"></span>\n" +
                    "    </span>\n" +
                    "    <span class=\"price_r\">\n" +
                    "         <span class=\"sign\">¥</span>\n" +
                    "         <span class=\"num\">"+data.list[k].originalPrice+"</span>\n" +
                    "         <span class=\"tail\"></span>\n" +
                    "    </span>\n" +
                    "</p>\n" +
                    "    <div class=\"icon_pop\"></div>\n" +
                    "    </li>";            }
            $("#presellLi").html(presellLi);
        }
    });

    //新书预售切换
    $(document).on('mouseover', '.book_presell .mix_marquee_tab li', function(e) {
        $(".book_presell .mix_marquee_tab .current").removeClass("current");
        $(e.target).addClass("current");
        var num=  $(e.target).html();
        $.ajax(
            {
                type : "POST",
                url : "queryPresell",
                dataType : "json",
                data:{pageNum:num},
                success : function(data) {
                    var presellLi="";
                    for(var k=0;k<data.list.length;k=k+1){
                        presellLi=presellLi+"<li class=\"line1\">\n" +
                            "    <a  class=\"img\" href=\""+data.list[k].link+"\"?bDBid=\"+data.list[k].bDBid+\"&bookId=\"+data.list[k].bookId+”\" target=\"_blank\">\n" +
                            "    <img src=\"assets/images/"+data.list[k].image+"\">\n" +
                            "    </a>\n" +
                            "<p class=\"star\">\n" +
                            "    <span class=\"title\"></span>\n" +
                            "    <span class=\"level\"><span style=\"width: 0%;\"></span></span>\n" +
                            "</p>\n" +
                            "<p class=\"name\">\n" +
                            "    <a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].bookId+"\" target=\"_blank\" style=\" \">"+data.list[k].bookName+"</a>\n" +
                            "</p>\n" +
                            "<p class=\"price\">\n" +
                            "    <span class=\"rob\">\n" +
                            "        <span class=\"sign\">¥</span>\n" +
                            "        <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                            "        <span class=\"tail\"></span>\n" +
                            "    </span>\n" +
                            "    <span class=\"price_r\">\n" +
                            "         <span class=\"sign\">¥</span>\n" +
                            "         <span class=\"num\">"+data.list[k].originalPrice+"</span>\n" +
                            "         <span class=\"tail\"></span>\n" +
                            "    </span>\n" +
                            "</p>\n" +
                            "    <div class=\"icon_pop\"></div>\n" +
                            "    </li>";            }
                    $("#presellLi").html(presellLi);
                }
            });
    })

    //   新书热卖榜头部切换
    $(document).on('mouseover', '.book_new .tab_box_aa .head ul li', function(e){
        $(".book_new .tab_box_aa .head ul .on").removeClass("on");
        $(e.target.parentNode).addClass("on");
        var type=  $(e.target).html();
        var totalItem="";
        $.ajax(
            {
                type : "POST",
                url : "queryNewHotBook",
                dataType : "json",
                data:{pageNum:1,type:type},
                success : function(data) {
                    for(var k=0;k<data.list.length;k=k+1){
                        totalItem=totalItem+"<li class=\"line1 bar\" style=\"display: block;\">\n" +
                            "    <span class=\"num num1 \">"+(k+1)+"</span>\n" +
                            "    <p class=\"name\" ><a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a></p>\n" +
                            "</li>\n" +
                            "<li class=\"line1 item\" style=\"display: none;\">\n" +
                            "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                            "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\"><img src=\"assets/images/"+data.list[k].image+"\"/></a>\n" +
                            "    <p class=\"name\"><a href=\"#\" target=\"_blank\">"+data.list[k].bookName+"</a></p>\n" +
                            "    <p class=\"price\">\n" +
                            "        <span class=\"rob\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "        <span class=\"price_r\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "    </p>\n" +
                            "    <p class=\"link \">\n" +
                            "        <span></span>\n" +
                            "        <a target=\"_blank\" href=\"#\">0</a>条评论\n" +
                            "    </p>\n" +
                            "    <div class=\"icon_pop\"></div>\n" +
                            "</li>";
                    }
                    $("#newBookHot").html(totalItem);
                }
            });
    });

    $.ajax(
        {
            type : "POST",
            url : "queryNewHotBook",
            dataType : "json",
            data:{pageNum:1,type:"校园"},
            success : function(data) {
                var totalItem="";
                for(var k=0;k<data.list.length;k=k+1){
                    totalItem=totalItem+"<li class=\"line1 bar\" style=\"display: block;\">\n" +
                        "    <span class=\"num num1 \">"+(k+1)+"</span>\n" +
                        "    <p class=\"name\" ><a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a></p>\n" +
                        "</li>\n" +
                        "<li class=\"line1 item\" style=\"display: none;\">\n" +
                        "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                        "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\"><img src=\"assets/images/"+data.list[k].image+"\"/></a>\n" +
                        "    <p class=\"name\"><a href=\"#\" target=\"_blank\">"+data.list[k].bookName+"</a></p>\n" +
                        "    <p class=\"price\">\n" +
                        "        <span class=\"rob\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "        <span class=\"price_r\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "    </p>\n" +
                        "    <p class=\"link \">\n" +
                        "        <span></span>\n" +
                        "        <a target=\"_blank\" href=\"#\">0</a>条评论\n" +
                        "    </p>\n" +
                        "    <div class=\"icon_pop\"></div>\n" +
                        "</li>";
                }
                $("#newBookHot").html(totalItem);
            }
        });


    //实现独家推荐界面js
    $(document).on('mouseover', '.dujia .head .tab_aa li', function(e){
        $(".dujia .head .tab_aa .on").removeClass("on");
        $(e.target.parentNode).addClass("on");
        var type=  $(e.target).find("span").html();
        $.ajax(
            {
                type : "POST",
                url : "exclusivePush",
                dataType : "json",
                data:{pageNum:0,type:type},
                success : function(data) {
                    var totalItem="";
                    for(var k=0;k<data.list.length;k=k+1){
                        totalItem=totalItem+"<li class=\"line1\">\n" +
                            "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">\n" +
                            "        <img src=\"assets/images/"+data.list[k].image+"\"/>\n" +
                            "    </a>\n" +
                            "    <p class=\"name\" >\n" +
                            "        <a \" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a>\n" +
                            "    </p>\n" +
                            "    <span class=\"num_logo\">当当独家特供</span>\n" +
                            "    <p class=\"price\">\n" +
                            "        <span class=\"rob\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "        <span class=\"price_r\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "    </p>\n" +
                            "    <div class=\"icon_pop\"></div>\n" +
                            "</li>";
                    }
                    $(".dujia .tab_content_aa .list_aa").html(totalItem);
                }
            });
    });

    $.ajax(
        {
            type : "POST",
            url : "exclusivePush",
            dataType : "json",
            data:{pageNum:0,type:"校园"},
            success : function(data) {
                var totalItem="";
                for(var k=0;k<data.list.length;k=k+1){
                    totalItem=totalItem+"<li class=\"line1\">\n" +
                        "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">\n" +
                        "        <img src=\"assets/images/"+data.list[k].image+"\"/>\n" +
                        "    </a>\n" +
                        "    <p class=\"name\" >\n" +
                        "        <a \" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a>\n" +
                        "    </p>\n" +
                        "    <span class=\"num_logo\">当当独家特供</span>\n" +
                        "    <p class=\"price\">\n" +
                        "        <span class=\"rob\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "        <span class=\"price_r\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "    </p>\n" +
                        "    <div class=\"icon_pop\"></div>\n" +
                        "</li>";
                }
                $(".dujia .tab_content_aa .list_aa").html(totalItem);
            }
        });

//    新书畅销版
    $(document).on('mouseover', '.book_sell .tab_box_aa .head ul li', function(e){
        $(".book_sell .tab_box_aa .head ul .on").removeClass("on");
        $(e.target.parentNode).addClass("on");
        var type=  $(e.target).html()
        var totalItem="";
        $.ajax(
            {
                type : "POST",
                url : "querySellBook",
                dataType : "json",
                data:{pageNum:1,type:type},
                success : function(data) {
                    for(var k=0;k<data.list.length;k=k+1){
                        totalItem=totalItem+"<li class=\"line1 bar\">\n" +
                            "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                            "    <p class=\"name\" ddt-src=\"25137790\">\n" +
                            "        <a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a>\n" +
                            "    </p>\n" +
                            "</li>\n" +
                            "<li class=\"line1 item\" style=\"display:none;\">\n" +
                            "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                            "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">\n" +
                            "        <img src=\"assets/images/"+data.list[k].image+"\" alt=\"活着（2017年新版）\">\n" +
                            "    </a>\n" +
                            "    <p class=\"name\">\n" +
                            "        <a title=\"活着（2017年新版）\" href=\"#\" target=\"_blank\" style=\" \">"+data.list[k].id+"</a>\n" +
                            "    </p>\n" +
                            "    <p class=\"price\">\n" +
                            "        <span class=\"rob\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "        <span class=\"price_r\">\n" +
                            "            <span class=\"sign\">¥</span>\n" +
                            "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                            "            <span class=\"tail\"></span>\n" +
                            "        </span>\n" +
                            "    </p>\n" +
                            "    <p class=\"link \">\n" +
                            "        <span></span>\n" +
                            "        <a target=\"_blank\" href=\"#\">22253</a>条评论\n" +
                            "    </p>\n" +
                            "    <div class=\"icon_pop\"></div>\n" +
                            "</li>\n";
                    }
                    $(".book_sell .tab_content_aa .book_top .list_ab").html(totalItem);
                }
            });
    });


    $.ajax(
        {
            type : "POST",
            url : "querySellBook",
            dataType : "json",
            data:{pageNum:1,type:"高职高专教材"},
            success : function(data) {
                var totalItem="";
                for(var k=0;k<data.list.length;k=k+1){
                    totalItem=totalItem+"<li class=\"line1 bar\">\n" +
                        "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                        "    <p class=\"name\" ddt-src=\"25137790\">\n" +
                        "        <a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">"+data.list[k].bookName+"</a>\n" +
                        "    </p>\n" +
                        "</li>\n" +
                        "<li class=\"line1 item\" style=\"display:none;\">\n" +
                        "    <span class=\"num num1\">"+(k+1)+"</span>\n" +
                        "    <a class=\"img\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">\n" +
                        "        <img src=\"assets/images/"+data.list[k].image+"\" alt=\"活着（2017年新版）\">\n" +
                        "    </a>\n" +
                        "    <p class=\"name\">\n" +
                        "        <a title=\"活着（2017年新版）\" href=\"#\" target=\"_blank\" style=\" \">"+data.list[k].id+"</a>\n" +
                        "    </p>\n" +
                        "    <p class=\"price\">\n" +
                        "        <span class=\"rob\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "        <span class=\"price_r\">\n" +
                        "            <span class=\"sign\">¥</span>\n" +
                        "            <span class=\"num\">"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
                        "            <span class=\"tail\"></span>\n" +
                        "        </span>\n" +
                        "    </p>\n" +
                        "    <p class=\"link \">\n" +
                        "        <span></span>\n" +
                        "        <a target=\"_blank\" href=\"#\">22253</a>条评论\n" +
                        "    </p>\n" +
                        "    <div class=\"icon_pop\"></div>\n" +
                        "</li>\n";
                }
                $("#sellAmount1").html(totalItem);
            }
        });

    $(document).on('click', '#hd .logo_line .search .button', function(e){
         $("#form_search_new").submit();
    })




})








