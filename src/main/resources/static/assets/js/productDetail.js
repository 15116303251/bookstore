$(function () {

    $(document).on('click', '#num_add', function(){
    //购物车中商品数量的加减
        var num=parseInt($("#buy-num").val())+1;
        $("#buy-num").val(num);
    });

    $(document).on('click', '#num_del', function(){
        var num=parseInt($("#buy-num").val())-1;
        if(num<=0){
            $("#buy-num").val(0);
        }else{
            $("#buy-num").val(num);
        }

    });

    //加入购物车
    $(document).on('click', '#part_buy_button', function(){
        var product_id=$("#product_id").val();
        var product_amount=$("#buy-num").val();
        var bDBid=$("#bDBid").val();
        var price=$("#discountedAfterPrice").html();
        var productAmount=$("#productAmount").html();
        if(productAmount==0){
            $("#part_buy_button").attr("style","background-color: #487a6f");

        }else{
            $.ajax( {
                type : "POST",
                url : "addCart",
                dataType : "json",
                data:{ product_id:product_id,product_amount:product_amount,bDBid:bDBid,price:price},
                success : function(data) {
                    $("#cart_items_count").html(data);
                }
            });
        }

    });


    $(document).on('click', '#hd .logo_line .search .button', function(e){
        $("#form_search_new").submit();
    })

//--------------------------------------------------------------------------------------------------------------订单的数量
    $.ajax( {
        type : "GET",
        url : "getOrderNum",
        dataType : "json",
        data:{},
        success : function(data) {
            $("#unpaid_num").html(data);
        }
    });
//--------------------------------------------------------------------------------------------------------------购物车中商品的数量
    $.ajax( {
        type : "GET",
        url : "getCartProductCount",
        dataType : "json",
        data:{},
        success : function(data) {
            $("#cart_items_count").html(data);
        }
    });

//--------------------------------------------------------------------------------------------------------------商品收藏
    $(document).on('click', '#btn_collection', function(e){
        var bookId=$("#product_id").val();
        var bDBid=$("#bDBid").val();
        $.ajax( {
            type : "POST",
            url : "bookCollection",
            dataType : "json",
            data:{bookId:bookId,bDBid:bDBid},
            success : function(data) {
                //弹出提示窗口,确定后,刷新父窗口
                $("#btn_collection").html("已收藏");
                $("#collection_items_count").html(data)
            }
        });
    })

})