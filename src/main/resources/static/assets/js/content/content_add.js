layui.use([ 'element', 'form', 'laydate' ], function() {
    var element = layui.element(), form = layui.form(),laydate = layui.laydate;

    form.on('submit(formSubmit)', function(data) {
        $.post("/content/contentAdd", data.field, function(result) {
            if (!result.status) {
                layer.msg(result.message, {
                    icon : 5,
                    shift : 6
                });
            } else {
                layer.msg('添加成功', {
                    icon : 1
                });
                parent.refreshUserList();
            }
        }, "json");
        return false;
    });
})