<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: Administrator--%>
  <%--Date: 2018/2/2 0002--%>
  <%--Time: 10:09--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" deferredSyntaxAllowedAsLiteral="true" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
        <%--<form name="form1" action="/updateErpAccount" method="post">--%>
            <%--<table width="200" border="1">--%>
                <%--<tr>--%>
                    <%--<td colspan="2">更新窗口</td>--%>
                <%--<tr>--%>
                    <%--<td><input type="hidden" name="companyId" size="10" value="${company.companyId}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>公司名称</td>--%>
                    <%--<td><input type="text" name="companyName" size="10" value="${company.companyName}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>公司地址</td>--%>
                    <%--<td><input type="text" name="companyAdd" size="10" value="${company.companyAdd}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>公司邮箱</td>--%>
                    <%--<td><input type="text" name="companyEmail" size="10" value="${company.companyEmail}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>联系人</td>--%>
                    <%--<td><input type="text" name="linkUser" size="10" value="${company.linkUser}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>联系人电话</td>--%>
                    <%--<td><input type="text" name="linkUserPhone" size="10" value="${company.linkUserPhone}"></td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td colspan="2"><input type="submit" name="submit" value="更新"> <a href="register.jsp">注册新用户</a></td>--%>
                <%--</tr>--%>
            <%--</table>--%>
        <%--</form>--%>
<%--</body>--%>
<%--</html>--%>
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
            <form class="form-horizontal" role="form"  method="post" action="updateErpAccount">
                <div class="form-group">
                    <label class="col-sm-4 control-label"></label>
                    <div class="col-sm-4">
                        <input type="hidden" class="form-control" name="companyId" value="${company.companyId}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司名称</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyName" value="${company.companyName}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label" >公司地址</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyAdd" value="${company.companyAdd}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司邮箱</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyEmail" value="${company.companyEmail}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">联系人</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="linkUser" value="${company.linkUser}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">联系人电话</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="linkUserPhone" value="${company.linkUserPhone}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">企业用户名称</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="erpUserName" value="${company.erpUserName}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">公司电话</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="companyTel" value="${company.companyTel}"/>
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
