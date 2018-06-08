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
            <form class="form-horizontal" role="form"  method="post" action="updateAccount">
                <div class="form-group">
                    <label class="col-sm-4 control-label"></label>
                    <div class="col-sm-4">
                        <input type="hidden" class="form-control" name="userId" value="${account.userId}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">名字</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userName" value="${account.userName}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label" >邮箱</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userEmail" value="${account.userEmail}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">性别</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userSex" value="${account.userSex}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">生日</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userBirthday" value="${account.userBirthday}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">电话</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userTel" value="${account.userTel}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">省份</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userProvince" value="${account.userProvince}"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-4 control-label">城市</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userCity" value="${account.userCity}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">积分</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="grade" value="${account.grade}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">状态</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="userState" value="${account.userState}"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-4 control-label"></div>
                    <div class="col-sm-4">
                        <button type="submit" class="btn btn-default">更新</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</form>
</body>
</html>
