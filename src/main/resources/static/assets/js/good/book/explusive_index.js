layui.use([ 'element', 'form' ], function() {
    var element = layui.element(), form = layui.form();
    var config = {
        url : "/good/getExplusivePageData",// 获取数据的url
        page : true,
        select : true,
        width:1200,
        columns : [ {
            text : 'Id',
            name : 'id',
            width : 50
        }, {
            text : '书名',
            name : 'bookName',
            width : 100
        }, {
            text : '类别',
            name : 'bDBid',
            width : 50
        }, {
            text : '作者',
            name : 'author',
            width : 10
        }, {
            text : '出版社',
            name : 'publish',
            width : 100
        },{
            text : '出版日期',
            name : 'publishDate',
            width : 100
        }, {
            text : '定价',
            name : 'originalPrice',
            width : 50
        },  {
            text : '折扣',
            name : 'discountedPrice',
            width : 50
        }, {
            text : '描述',
            name : 'description',
            width : 400
        }, {
            text : '大图',
            name : 'image',
            width : 200,
            formatter : function(value, row, index) {
                return "<img src=\"assets/images/"+value+"\">";
            }
        }, {
            text : '库存',
            name : 'stock',
            width : 100
        }, {
            text : '销售量',
            name : 'saleNum',
            width : 100,
        } , {
            text : '小图1',
            name : 'smallImage1',
            width : 100,
            formatter : function(value, row, index) {
                return "<img src=\"assets/images/"+value+"\">";
            }
        } , {
            text : '小图2',
            name : 'smallImage2',
            width : 100,
            formatter : function(value, row, index) {
                return "<img src=\"assets/images/"+value+"\">";
            }
        } , {
            text : '小图3',
            name : 'smallImage3',
            width : 100,
            formatter : function(value, row, index) {
                return "<img src=\"assets/images/"+value+"\">";
            }
        } , {
            text : '小图4',
            name : 'smallImage4',
            width : 100,
            formatter : function(value, row, index) {
                return "<img src=\"assets/images/"+value+"\">";
            }
        } ],
        // 事件 一定要return
        onBeforeLoad : function(param) {
            return param;
        },
        onLoadSuccess : function(data) {
            return data;
        },
        dataFilter : function(data) {
            return data;
        }
    };
    $("#table").jfTable(config);

    // 添加用户方法
    $('#ExplusiveAdd').click(function() {
        layer.open({
            type : 2,
            move : false,
            title : '添加独家书本',
            area : [ '700px', '650px' ],
            content : '/good/goToExplusiveAddPage'
        });
    })

    // 删除用户方法
    $('#ExplusiveDel').click(function() {
        var row = $("#table").jfTable("getSelected");
        if (row.length <= 0) {
            layer.msg("至少需要选择一行数据才能进行该操作", {
                icon : 5,
                shift : 6
            });
            return;
        }
        var id=row[0].id;

        layer.confirm('是否确定删除该数据？', {
            icon : 3,
            title : '系统提示',
            btn : [ '删除', '取消' ]
        }, function(index, layero) {
            $.post("/good/ExplusiveDel", {
                id : id,
            }, function(result) {
                if (!result.status) {
                    layer.msg(result.message, {
                        icon : 5,
                        shift : 6
                    });
                } else {
                    layer.msg('删除成功', {
                        icon : 1
                    });
                    parent.refreshBookList();
                }
            }, "json");
            refreshBookList();
        });
    })

    // 更新用户方法
    $('#bookUpdate').click(function() {
        var row = $("#table").jfTable("getSelected");
        if (row.length != 1) {
            layer.msg("请选择一条数据进行修改操作", {
                icon : 5,
                shift : 6
            });
            return;
        }
        var id = row[0].id;
        var bDBid=row[0].bDBid;
        layer.open({
            type : 2,
            move : false,
            title : '书本更新',
            area : [ '700px', '650px' ],
            content : 'updateBook?id=' + id+"&bDBid="+bDBid
        });
    })

    // 更新用户方法
    $('#bookRefresh').click(function() {
        refreshBookList();
    })

    form.on('submit(formQuery)', function(data) {
        console.log($('#query_bookName').val());
        refreshBookList();
        return false;
    });
})

// 刷新用户列表
function refreshBookList() {
    var bookName = $('#query_bookName').val();
    var author=$("#query_author").val();
    var publish=$("#query_publish").val();
    var bDBid=$("#query_class").val();
    var obj = {};
    obj.bookName = bookName;
    obj.author=author;
    obj.publish=publish;
    obj.bDBid=bDBid;
    $("#table").jfTable("reload",obj);
}
//
// //开关点击事件
// function mds_switch_click(obj){
//     var row = $("#table").jfTable("getRow",obj.title)
//     var status = (row.userState)==0?-1:0;
//
//     if (row.userName=="admin") {
//         layer.msg("admin用户不能被禁用", {
//             icon : 5,
//             shift : 6
//         });
//         return;
//     }
//
//     $.post("/system/updateStatus.shtml", {
//         id : row.userId,
//         status : status
//     }, function(result) {
//         if (!result.status) {
//             layer.msg(result.message, {
//                 icon : 5,
//                 shift : 6
//             });
//         } else {
//             layer.msg('状态修改成功', {
//                 icon : 1
//             });
//             refreshUserList();
//         }
//     }, "json");
// }
