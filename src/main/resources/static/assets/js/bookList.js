$(function () {
    var totalItem="";
    $.ajax(
{
    type : "GET",
    url : "queryBookList",
    dataType : "json",
    data:{},
    success : function(data) {
    for(var k=0;k<data.list.length;k=k+1){
    totalItem=totalItem+"<li class=\"line1\" >\n" +
    "    <a  class=\"pic\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\">\n" +
    "        <img src=\"assets/images/"+data.list[k].image+"\">\n" +
    "    </a>\n" +
    "    <p class=\"name\">\n" +
    "        <a href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\" target=\"_blank\"> \n" +
    "            <font class=\"skcolor_ljg\">"+data.list[k].bookName+"</font>\n" +
    "        </a>\n" +
    "    </p>\n" +
    "    <p class=\"detail\">"+data.list[k].description+"\n" +
    "    </p>\n" +
    "    <p class=\"price\">\n" +
    "        <span class=\"search_now_price\">¥"+parseFloat(data.list[k].originalPrice*data.list[k].discountedPrice).toFixed(2)+"</span>\n" +
    "        <a class=\"search_discount\" style=\"text-decoration:none;\">定价：</a>\n" +
    "        <span class=\"search_pre_price\">¥"+parseFloat(data.list[k].originalPrice).toFixed(2)+"</span>\n" +
    "        <span class=\"search_discount\">&nbsp;("+parseFloat(data.list[k].discountedPrice).toFixed(2)+") </span>\n" +
    "    </p>\n" +
    "    <div class=\"lable_label\">\n" +
    "        <span class=\"new_lable\">\n" +
    "            <span class=\"new_lable1\">当当自营</span>\n" +
    "        </span>\n" +
    "    </div>\n" +
    "    <p class=\"search_star_line\">\n" +
    "        <span class=\"search_star_black\">\n" +
    "            <span style=\"width: 100%;\"></span>\n" +
    "        </span>\n" +
    "        <a href=\"#\" target=\"_blank\"  class=\"search_comment_num\">0条评论</a>\n" +
    "    </p>\n" +
    "    <span class=\"tag_box\"></span>\n" +
    "    <p class=\"search_book_author\">\n" +
    "        <span><a href=\"#\"  name=\"itemlist-author\" >"+data.list[k].author+"</a>\n" +
    "        </span>\n" +
    "        <span> /"+data.list[k].publishDate+"</span>\n" +
    "        <span>  /\n" +
    "            <a href=\"#\">"+data.list[k].publish+"</a>\n" +
    "        </span>\n" +
    "    </p>\n" +
    "    <div class=\"shop_button\">\n" +
    "        <p class=\"bottom_p\">\n" +
    "            <a class=\"search_btn_cart\" name=\"area_buy\" href=\""+data.list[k].link+"?bDBid="+data.list[k].bDBid+"&bookId="+data.list[k].id+"\">详细信息</a>\n" +
    "        </p>\n" +
    "    </div>\n" +
    "</li>";
}
    $(".bigimg").html(totalItem);
}
});
//搜索框
    $(document).on('click', '#hd .logo_line .search .button', function(e){
        $("#form_search_new").submit();
    })

//加入收藏
    $(document).on('click', '.search_btn_collect', function(e){
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

