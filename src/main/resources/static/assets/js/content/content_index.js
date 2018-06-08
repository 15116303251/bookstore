layui.use([ 'element', 'form' ], function() {
    var element = layui.element(), form = layui.form();
    var config = {
        url : "/content/getContentPage",// 获取数据的url
        page : true,
        select : true,
        width:1200,
        columns : [ {
            text : 'Id',
            name : 'id',
            width : 20
        }, {
            text : '内容',
            name : 'content',
            width : 50
        }, {
            text : '标志',
            name : 'flag',
            width : 20
        }, {
            text : '链接',
            name : 'href',
            width : 50
        }],
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
    $('#contentAdd').click(function() {
        layer.open({
            type : 2,
            move : false,
            title : '添加书本',
            area : [ '700px', '650px' ],
            content : '/content/goToContentAddPage'
        });
    })

    // 删除用户方法
    $('#contentDel').click(function() {
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
            $.post("content/contentDel", {
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
    $('#contentRefresh').click(function() {
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

    var obj = {};
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
