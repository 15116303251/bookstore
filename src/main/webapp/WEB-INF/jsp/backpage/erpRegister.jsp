
<%@ page contentType="text/html;charset=UTF-8" language="java" deferredSyntaxAllowedAsLiteral="true" %>
<html>
<head>
    <title>Title</title>
    <%
        String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" />
    <script type="text/javascript" src="assets/bootstrap/js/jquery-1.11.1.js" ></script>
    <script type="text/javascript" src="assets/bootstrap/js/bootstrap.js" ></script>
    <script type="text/javascript" src="assets/bootstrap/js/jquery-form.js"></script>
    <script>
        $(function(){

        });
    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form class="form-horizontal" role="form"  method="post" action="/erpRegister">
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司名称</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyName" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label" >公司地址</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyAdd" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司邮箱</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyEmail" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">联系人</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="linkUser" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">联系人电话</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="linkUserPhone" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">企业用户名称</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="erpUserName" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">企业用户密码</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="erpUserPsd" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司电话</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyTel" value=""/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 control-label"></div>
                    <in class="col-sm-4">
                        <button type="submit" class="btn btn-resiger col-lg-12">注册</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</form>
</body>
</html>

