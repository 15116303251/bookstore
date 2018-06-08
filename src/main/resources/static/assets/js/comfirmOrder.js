
$(function () {
    $.ajax({
        type: "GET",
        url: "comfirmOrder",
        dataType: "json",
        data: {},
        success: function (data) {
            var add ="";
            if(data.address!=null) {
                add = "<ul><li class=\"addr active\" id=\"address_block\">\n" +
                    "    <h1>" + data.address.customerName + "<span>" + data.address.customerPhone + "</span></h1>\n" +
                    "    <p>" + data.address.bigAddress + "</p>\n" +
                    "    <p>" + data.address.address + "</p>\n" +
                    "    <div id=\"defalut\" style=\"display: block;\">\n" +
                    "    <span class=\"addr_mo\">默认地址</span>\n" +
                    "</div>\n" +
                    "<div id=\"oper\" style=\"display: block;\">\n" +
                    "    <a href=\"#\" id=\"edit_addr\" style=\"display: block;float: left;padding-left: 10px\" value=\"" + data.address.customerId + "\">编辑</a>\n" +
                    "    <a href=\"deleteAddress?customerId="+data.address.customerId+"\" id=\"del_addr\" style=\"display: none;float: left;padding-left: 10px\">删除 </a>\n" +
                    "    <a href=\"setDefaultAddress?customerId="+data.address.customerId+"\" id=\"set_default\" class=\"us\" style=\"display: none; float: left;padding-left: 10px\">设为默认地址</a>\n" +
                    "    </div>\n" +
                    "</li>";
            }else{
                add="<ul>"
            }
            for(var i=0;i<data.customers.length;i++){
                add=add+"<li class=\"addr active\" id=\"address_block\">\n" +
                    "    <h1>"+data.customers[i].customerName+"<span>"+data.customers[i].customerPhone+"</span></h1>\n" +
                    "    <p>"+data.customers[i].bigAddress+"</p>\n" +
                    "    <p>"+data.customers[i].address+"</p>\n" +
                    "    <div id=\"defalut\" style=\"display: none;\">\n" +
                    "    <span class=\"addr_mo\">默认地址</span>\n" +
                    "</div>\n" +
                    "<div id=\"oper\" style=\"display: block;\">\n" +
                    "    <a href=\"#\" id=\"edit_addr\" style=\"display: block;float: left;padding-left: 10px\" value=\"" +data.customers[i].customerId + "\">编辑</a>\n" +
                    "    <a href=\"deleteAddress?customerId="+data.customers[i].customerId+"\" id=\"del_addr\" style=\"display: block;float: left;padding-left: 10px\">删除 </a>\n" +
                    "    <a href=\"setDefaultAddress?customerId="+data.customers[i].customerId+"\" id=\"set_default\" class=\"us\" style=\"display: block; float: left;padding-left: 10px\">设为默认地址</a>\n" +
                    "    </div>\n" +
                    "</li>";
            }
            add=add+"</ul>"
            $("#address_content").html(add);

            var goodAdd="                                <tr>\n" +
                "                                    <th scope=\"col\" class=\"th_img\">&nbsp;</th>\n" +
                "                                    <th scope=\"col\" class=\"th_name\">商品名称</th>\n" +
                "                                    <th scope=\"col\">单价</th>\n" +
                "                                    <th scope=\"col\">数量</th>\n" +
                "                                    <th scope=\"col\">总价</th>\n" +
                "                                </tr>";
            for(var j=0;j<data.orderItemVoList.length;j++){
                goodAdd=goodAdd+"<tr>\n" +
                    "    <td class=\"img\">\n" +
                    "    <img src=\"assets/images/"+data.orderItemVoList[j].goodsImg+"\" width=\"70\" height=\"70\">\n" +
                    "    </td>\n" +
                    "<td class=\"name\">\n" +
                    "    <a href=\"http://product.dangdang.com/25245058.html\" target=\"_blank\" style=\"word-break:break-all;  word-wrap:break-word;\">"+data.orderItemVoList[j].goodsName+"</a>\n" +
                    "    <p class=\"seven\">\n" +
                    "        <span class=\"icon_7\"></span>支持7天无理由退换货\n" +
                    "    </p>\n" +
                    "</td>\n" +
                    "<td>"+data.orderItemVoList[j].goodsPrice+"</td>\n" +
                    "<td>"+data.orderItemVoList[j].goodsNum+"</td>\n" +
                    "<td>"+data.orderItemVoList[j].product_totalPrice+"</td></tr>"
            }
            $("#goodsList").html(goodAdd);

            var sub_right="<p>\n" +
                "    <span class=\"red\">"+data.orderItemVoList.length+"</span>个包裹\n" +
                "    <span class=\"tab\">商品金额："+data.payment+"</span>\n" +
                "    <span class=\"tab\">运费："+data.postage+"</span>\n" +
                "    <span class=\"tab\"></span>\n" +
                "</p>"
            $(".sub_right").html(sub_right);

            var address=data.address.bigAddress+" "+ data.address.address;
            var namePhone=data.address.customerName+" " +data.address.customerPhone
            var comfirmOrder1="<p><span class=\"big\">寄送至：</span><span id=\"address_summary\">"+address+"</span>&nbsp;&nbsp;&nbsp;&nbsp;<span id=\"name_phone_summary\">"+namePhone +"</span></p>\n" +
                "\n" +
                "<p>当当自营商品预计<span class=\"red\">明日</span>送达</p>"
            $(".confirm").html(comfirmOrder1);

            var pay=" 共<span class=\"red\">"+data.orderItemVoList.length+"</span>件商品<span class=\"price\">应付金额：<span class=\"red\">"+data.payment+"</span></span>\n" +
                "\n" +
                "            (含运费<span class=\"red\">"+data.postage+"</span>元)\n" +
                "\n" +
                "            <a id=\"submit\" href=\"javascript:void(0)\" class=\"btn_red\">去支付</a>"
            $(".box").html(pay)
        }
    });

    //弹出地址添加的框
    $(document).on('click', '#btn_add_address', function(){
        //购物车中商品数量的加减
       $("#divDialog").attr("style","left: 7.5px; top: 174.5px; display: block")
    });

    //弹出更新地址框
    $(document).on('click', '#edit_addr', function(e) {
        $("#divDialog").attr("style", "left: 7.5px; top: 174.5px; display: block")
        var customerId = $(e.target).attr("value");
        $.ajax({
            type: "POST",
            url: "updateAddress",
            dataType: "json",
            data: {customerId: customerId},
            success: function (data) {
                $("#txt_ship_name_edit").val(data.customerName);
                $("#phone").val(data.customerPhone);
                $("#txt_ship_mb_edit").val(data.bigAddress);
                $("#txt_ship_address_edit").val(data.address);
                $("#customerId").val(data.customerId)
            }
        });
    })

    // ------------------------------------------------------------------------------------------------------------提交表单
    $(document).on('click', '#submitAdd', function(){
        //购物车中商品数量的加减
        $("#divDialog").attr("style","left: 7.5px; top: 174.5px; display: none")
        $(".info_list").attr("action","addAddress");
        $(".info_list").attr("method","POST");
        $(".info_list").submit();
    });
    // ------------------------------------------------------------------------------------------------------------更新地址
    $(document).on('click', '#updateAdd', function(){
        $("#divDialog").attr("style","left: 7.5px; top: 174.5px; display: none")
        $(".info_list").attr("action","updateCustomerAddress");
        $(".info_list").attr("method","POST");
        $(".info_list").submit();
    });

    // ------------------------------------------------------------------------------------------------------------弹出地址添加的框
    $(document).on('click', '#cancelAdd', function(){
        //购物车中商品数量的加减
        $("#divDialog").attr("style","left: 7.5px; top: 174.5px; display: none")
    });

    // ------------------------------------------------------------------------------------------------------------设置去支付
    $(document).on('click', '#submit', function(){
        //购物车中商品数量的加减
        var way=$("#sltDeliveryTime_0_0  option:selected").val();
        alert(way);
        $("#submit").attr("href","toPay?way="+way);
    });

    //    显示购物车中商品的数量
    $.ajax(
        {
            type : "GET",
            url : "getCartProductCount",
            dataType : "json",
            data:{},
            success : function(data) {
                $("#cartAmount").html(data);
            }
        });

    //    显示订单表中订单的数量
    $.ajax(
        {
            type : "GET",
            url : "getOrderNum",
            dataType : "json",
            data:{},
            success : function(data) {
                $("#orderAmount").html(data);
            }
        });
})



