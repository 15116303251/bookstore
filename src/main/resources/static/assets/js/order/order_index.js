layui.use([ 'element', 'form' ], function() {
    var element = layui.element(), form = layui.form();
    var config = {
        url : "/order/getOrderPage",// 获取数据的url
        page : true,
        select : true,
        width:1200,
        columns : [ {
            text : 'Id',
            name : 'id',
            width : 20
        }, {
            text : '订单编号',
            name : 'orderNumber',
            width : 50
        }, {
            text : '用户Id',
            name : 'uid',
            width : 20
        }, {
            text : '支付金额',
            name : 'payPrice',
            width : 20
        }, {
            text : '是否支付',
            name : 'isPay',
            width : 20
        },{
            text : '订单创建日期',
            name : 'createTime',
            width : 30
        },  {
            text : '发货日期',
            name : 'shipTime',
            width : 30
        },{
            text : '接货日期',
            name : 'receiptTime',
            width : 30
        },{
            text : '是否发货',
            name : 'isShip',
            width : 10,
            formatter : function(value, row, index) {
                if (value == "1" || value ==1) {

                    return "<div name='mds_switch1' onclick='mds_switch_click(this);' title='"+index+"' class='open1'>已发货<div name='mds_switch2' class='open2'></div></div>";
                } else if (value == "0" || value ==0) {
                    return "<div name='mds_switch1' onclick='mds_switch_click(this);' title='"+index+"' class='close1'>未发货<div name='mds_switch2' class='close2'></div></div>";
                }
            }
        },{
    text : '是否收货',
    name : 'isReceipt',
    width : 20,
    formatter : function(value, row, index) {
        if (value == "0" || value == 0) {
            return "<div name='mds_switch1' onclick='mds_switch_click1(this);' title='"+index+"' class='close1'>未收货<div name='mds_switch2' class='close2'></div></div>";
        } else if (value == "1" || value == 1) {
            return "<div name='mds_switch1' onclick='mds_switch_click1(this);' title='"+index+"' class='open1'>已收货<div name='mds_switch2' class='open2'></div></div>";
        }
    }
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
    $('#orderAdd').click(function() {
        layer.open({
            type : 2,
            move : false,
            title : '添加订单',
            area : [ '700px', '650px' ],
            content : '/order/toAddOrder'
        });
    })

    // 删除用户方法
    $('#orderkDel').click(function() {
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
            $.post("/order/orderDel", {
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
        });
    })

    // 更新用户方法
    $('#orderUpdate').click(function() {
        var row = $("#table").jfTable("getSelected");
        if (row.length != 1) {
            layer.msg("请选择一条数据进行修改操作", {
                icon : 5,
                shift : 6
            });
            return;
        }
        var id = row[0].id;
        layer.open({
            type : 2,
            move : false,
            title : '书本更新',
            area : [ '700px', '650px' ],
            content : 'updateOrder?id=' + id
        });
    })

    // 更新用户方法
    $('#bookRefresh').click(function() {
        refreshBookList();
    })

    form.on('submit(formQuery)', function(data) {
        console.log($('#query_pay').val());
        refreshBookList();
        return false;
    });
})

// 刷新用户列表
function refreshBookList() {
    var order_id = $('#query_order_id').val();
    var isShip = $('#query_ship').val();
    var isPay = $('#query_pay').val();
    var isReceipt = $('#query_receipt').val();

    var obj = {};
    obj.isShip = isShip;
    obj.order_id = order_id;
    obj.isPay = isPay;
    obj.isReceipt = isReceipt;
    $("#table").jfTable("reload",obj);
}

//开关点击事件
function mds_switch_click(obj){
    var row = $("#table").jfTable("getRow",obj.title)
    var id=row.id;
    var status = row.isShip==0?1:0;
    $.post("/updateIsShipStatus.shtml", {
        id : id,
        status : status
    }, function(result) {
        if (!result.status) {
            layer.msg(result.message, {
                icon : 5,
                shift : 6
            });
        } else {

            layer.msg('状态修改成功', {
                icon : 1,
            });
        }
    }, "json");
    refreshBookList();
}


// //开关点击事件
function mds_switch_click1(obj){
    var row = $("#table").jfTable("getRow",obj.title)
    var status = (row.isReceipt)==0?1:0;
    $.post("/updateIsReceiptStatus.shtml", {
        id : row.id,
        status : status
    }, function(result) {
        if (!result.status) {
            layer.msg(result.message, {
                icon : 5,
                shift : 6
            });
        } else {
            layer.msg('状态修改成功', {
                icon : 1
            });
        }
    }, "json");
    refreshBookList();
}

