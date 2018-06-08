<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2 0002
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" deferredSyntaxAllowedAsLiteral="true" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css" />
    <script type="text/javascript" src="../assets/bootstrap/js/jquery-1.11.1.js" ></script>
    <script type="text/javascript" src="../assets/bootstrap/js/bootstrap.js" ></script>
    <script type="text/javascript" src="../assets/bootstrap/js/jquery-form.js"></script>
    <script>

        $(function(){
            //获取一级大分类的ID
            $.ajax( {
                type : "POST",
                url : "../queryBigTypeList",
                dataType : "json",
                data:{},
                success : function(data) {
                    var bigOption="<option value=\"-1\">一级分类</option>";
                    for(var k=0;k<data.length;k=k+1){
                        bigOption=bigOption+"<option value=\""+data[k].bBid+"\">"+data[k].bBigType+"</option>";
                    }
                    $("#assignModel-role").html(bigOption);
                }
            });

            //根据一级分类ID获取一级小分类
            $("#assignModel-role").change(function () {
                var bBid=$("#assignModel-role").val();
                $.ajax( {
                    type : "POST",
                    url : "../querySmallTypeList",
                    dataType : "json",
                    data:{bBid:bBid},
                    success : function(data) {
                        var smallOption="<option value=\"-1\">二级分类</option>";
                        for(var k=0;k<data.length;k=k+1){
                            smallOption=smallOption+"<option value=\""+data[k].bSid+"\">"+data[k].bSType+"</option>";
                        }
                        $("#assignModel-role1").html(smallOption);
                    }
                });

            });

            //根据一级小分类ID获取二级大分类
            $(document).on('change', '#assignModel-role1', function () {
                var bSid=$("#assignModel-role1").val();
                $.ajax( {
                    type : "POST",
                    url : "../queryDetailBigTypeList",
                    dataType : "json",
                    data:{bSid:bSid},
                    success : function(data) {
                        var bigDetailOption="<option value=\"-1\">三级分类</option>";
                        for(var k=0;k<data.length;k=k+1){
                            bigDetailOption=bigDetailOption+"<option value=\""+data[k].bDBid+"\">"+data[k].bDBigDetail+"</option>";
                        }
                        $("#assignModel-role2").html(bigDetailOption);
                    }
                });

            });

            //根据二级大分类ID获取二级小分类
            $(document).on('change', '#assignModel-role2', function () {
                var bDBid=$("#assignModel-role2").val();
                $.ajax( {
                    type : "POST",
                    url : "../queryDetailSmallTypeList",
                    dataType : "json",
                    data:{bDBid:bDBid},
                    success : function(data) {
                        var smallDetailOption="<option value=\"-1\">四级分类</option>";
                        for(var k=0;k<data.length;k=k+1){
                            smallDetailOption=smallDetailOption+"<option value=\""+data[k].bDSid+"\">"+data[k].bDSmallType+"</option>";
                        }
                        $("#assignModel-role3").html(smallDetailOption);
                    }
                });
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form class="form-horizontal" role="form" enctype="multipart/form-data" method="post" action="/good/ExplusiveAdd">
                <div class="form-group">
                    <label class="col-sm-4 control-label">书名</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="bookName" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">作者</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="author" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">出版社</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="publish" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">出版日期</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="publishDate" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">原价</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="originalPrice" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">折扣</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="discountedPrice" />
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-4 control-label">数量</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="Amount" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">一级大分类</label>
                    <div class="col-sm-4">
                        <select class="form-control" name="bBid" id="assignModel-role"></select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">一级小分类</label>
                    <div class="col-sm-4">
                        <select class="form-control" name="bSid" id="assignModel-role1"></select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-4 control-label">二级大分类</label>
                    <div class="col-sm-4">
                        <select class="form-control" name="bDBid" id="assignModel-role2"></select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-4 control-label">二级小分类</label>
                    <div class="col-sm-4">
                        <select class="form-control" name="bDSid" id="assignModel-role3"></select>
                    </div>
                </div>

                <div class="form-group">
                <label class="col-sm-4 control-label">图片</label>
                <div class="col-sm-4">
                    <input type="file" multiple class="form-control" name="file"/>
                </div>
        </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">描述</label>
                    <div class="col-sm-4">
                        <textarea class="form-control" name="description" cols="20" rows="5" name="description"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 control-label"></div>
                    <div class="col-sm-4">
                        <button type="submit" class="btn btn-default">新增</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
        </form>
</body>
</html>
