
$(function () {
    $.ajax({
        type: "POST",
        url: "queryAllCart",
        dataType: "json",
        data: {},
        success: function (data) {
            var totalTr="";
            var totalPrice="";
            for(var i=0;i<data.cartProductVoList.length;i++){
                if(data.cartProductVoList[i].productChecked==1){
                    totalTr=totalTr+"\n" +
                        "<tr class=\"bb_none tree_first \">\n" +
                        "    <td class=\"row1\"><a href=\"#\" class=\"fn-product-check checknow check_on\" value=\""+data.cartProductVoList[i].carId+"\">选中</a></td>\n" +
                        "<td class=\"row_img\">\n" +
                        "    <div style=\"display: block;\" class=\"_big\">\n" +
                        "        <a href=\"#\" target=\"_blank\"><img src=\"assets/images/"+data.cartProductVoList[i].productImg+"\" id=\"bookimg\"></a>\n" +
                        "        <span class=\"arrow\"></span>\n" +
                        "    </div>\n" +
                        "</td>\n" +
                        "<td class=\"row_name\">\n" +
                        "    <div class=\"name\">\n" +
                        "        <a href=\"#\" target=\"_blank\"  style=\"word-break:break-all;  word-wrap:break-word;\">"+data.cartProductVoList[i].productName+"</a>\n" +
                        "    </div>\n" +
                        "</td>\n" +
                        "<td class=\"row3\"><span>¥<b>"+parseFloat(data.cartProductVoList[i].productOutprice*data.cartProductVoList[i].discountedPrice).toFixed(2)+"</b></span></td>\n" +
                        "<td class=\"fn-count-tip row3 \"><span class=\"amount fn-updatecount red\" ><a id=\"num_del\" href=\"#\" value=\""+data.cartProductVoList[i].carId+"\">-</a><input  id=\"buy-num\" value=\""+data.cartProductVoList[i].productAmount+"\" type=\"text\"><a  id=\"num_add\" href=\"#\" value=\""+data.cartProductVoList[i].carId+"\">+</a></span></td>\n" +
                        // "<td class=\"row4\"><span class=\"red\">¥<b>"+data.cartProductVoList[i].productTotalPrice+"</b></span></td>\n" +
                        "<td class=\"row5 \"><span><a href=\"bookCollection1?carId="+data.cartProductVoList[i].carId+"\" class=\"fn-add-wish\" >移入收藏</a></span><span><a href=\"deleteByPrimaryKey?cartId="+data.cartProductVoList[i].carId+"\" class=\"fn-remove-product\">删除</a></span></td>\n" +
                        "</tr>"
                }else{
                    totalTr=totalTr+"\n" +
                        "<tr class=\"bb_none tree_first \">\n" +
                        "    <td class=\"row1\"><a href=\"#\" class=\"fn-product-check checknow\" value=\""+data.cartProductVoList[i].carId+"\">选中</a></td>\n" +
                        "<td class=\"row_img\">\n" +
                        "    <div style=\"display: block;\" class=\"_big\">\n" +
                        "        <a href=\"#\" target=\"_blank\"><img src=\"assets/images/"+data.cartProductVoList[i].productImg+"\" id=\"bookimg\"></a>\n" +
                        "        <span class=\"arrow\"></span>\n" +
                        "    </div>\n" +
                        "</td>\n" +
                        "<td class=\"row_name\">\n" +
                        "    <div class=\"name\">\n" +
                        "        <a href=\"#\" target=\"_blank\"  style=\"word-break:break-all;  word-wrap:break-word;\">"+data.cartProductVoList[i].productName+"</a>\n" +
                        "    </div>\n" +
                        "</td>\n" +
                        "<td class=\"row3\"><span>¥<b>"+parseFloat(data.cartProductVoList[i].productOutprice*data.cartProductVoList[i].discountedPrice).toFixed(2)+"</b></span></td>\n" +
                        "<td class=\"fn-count-tip row3 \"><span class=\"amount fn-updatecount red\" ><a id=\"num_del\" href=\"#\" value=\""+data.cartProductVoList[i].carId+"\">-</a><input  id=\"buy-num\" value=\""+data.cartProductVoList[i].productAmount+"\" type=\"text\"><a  id=\"num_add\" href=\"#\" value=\""+data.cartProductVoList[i].carId+"\">+</a></span></td>\n" +
                        // "<td class=\"row4\"><span class=\"red\">¥<b>"+data.cartProductVoList[i].productTotalPrice+"</b></span></td>\n" +
                        "<td class=\"row5 \"><span><a href=\"bookCollection1?carId="+data.cartProductVoList[i].carId+"\" class=\"fn-add-wish\" >移入收藏</a></span><span><a href=\"deleteByPrimaryKey?cartId=\""+data.cartProductVoList[i].carId+" class=\"fn-remove-product\" >删除</a></span></td>\n" +
                        "</tr>"
                }

            }
            $(".goodCart").html(totalTr);

            totalPrice="<p><span class=\"cartsum\">总计(不含运费)：</span><span id=\"payAmount\" class=\"price\">¥<b class=\"totalAmount\">"+parseFloat(data.cartTotalPrice).toFixed(2)+"</b></span></p>\n" +
                "\n" +
                ""
            $(".subtotal").html(totalPrice);
        }
    });
//-----------------------------------------------------------------------------------------------------更改购物车中商品数量
    $(document).on('click', '#num_add', function(){
        //购物车中商品数量的加减
        var num1= $(this).prev().val();
        var num=parseInt(num1)+1;
        var cartId=$(this).attr("value");
        $(this).prev().val(num);
        $.ajax({
            type: "POST",
            url: "updateByPrimaryKey",
            dataType: "json",
            data: {cartId:cartId,num:num},
            success: function (data) {
                $(".totalAmount").html(parseFloat(data).toFixed(2))
            }
        });
    });

    $(document).on('click', '#num_del', function(){
        //购物车中商品数量的加减
        var num1= $(this).next().val();
        var num=parseInt(num1)-1;
        var cartId=$(this).attr("value");
        if(num<=0){
            num=0;
            $(this).next().val(0);
        }else{
            $(this).next().val(num);
        }
        $.ajax({
            type: "POST",
            url: "updateByPrimaryKey",
            dataType: "json",
            data: {cartId:cartId,num:num},
            success: function (data) {
                $(".totalAmount").html(parseFloat(data).toFixed(2))
            }
        });

    });

//-------------------------------------------------------------------------------------------更改购物车页面商品是否被选中状态
    $(document).on('click', '.shopping_list .row1 a', function(e){
        var classType=$(e.target).attr("class");
        var checkon="fn-product-check checknow check_on";
        var uncheckon="fn-product-check checknow"
        var cartId=$(this).attr("value");

        if(classType==checkon){
            $(e.target).removeClass(checkon);
            $(e.target).addClass(uncheckon);
            var flag=0;
            $.ajax({
                type: "POST",
                url: "updateSelectStatus",
                dataType: "json",
                data: {cartId:cartId,flag:flag},
                success: function (data) {
                    $(".totalAmount").html(parseFloat(data).toFixed(2))
                }
            });
        }else if(classType==uncheckon){
            $(e.target).removeClass(uncheckon);
            $(e.target).addClass(checkon);
            var flag=1;
            $.ajax({
                type: "POST",
                url: "updateSelectStatus",
                dataType: "json",
                data: {cartId:cartId,flag:flag},
                success: function (data) {
                    $(".totalAmount").html(parseFloat(data).toFixed(2))
                }
            });
        }
    });

//--------------------------------------------------------------------------------------------------------删除物车页面商品

    // $(document).on('click', '.fn-remove-product', function(e){
    //     var cartId=$(e.target).attr("value");
    //     alert(cartId)
    //     $.ajax({
    //         type: "POST",
    //         url: "deleteByPrimaryKey",
    //         dataType: "json",
    //         data: {cartId:cartId},
    //         success: function (data) {
    //             $(".totalAmount").html(parseFloat(data).toFixed(2))
    //         }
    //     });
    // });

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


