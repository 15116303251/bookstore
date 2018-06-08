<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css" />
    <script type="text/javascript" src="../assets/bootstrap/js/jquery-1.11.1.js" ></script>
    <script type="text/javascript" src="../assets/bootstrap/js/bootstrap.js" ></script>
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

            var idClassParent="";
            var url1="";
            $("#classAddBtn").click(function(){
                var class1=$("#class1").val();
                var bBid=$("#assignModel-role").val();
                var bSid=$("#assignModel-role1").val();
                var bDBid=$("#assignModel-role2").val();
                var bDSid=$("#assignModel-role3").val();
                if(bBid==-1){
                    url1="../saveBigClass";
                    idClassParent=-1;
                }
                else if(bSid==-1){
                    url1="../saveSmallClass";
                    idClassParent=bBid;
                }else if(bDBid==-1){
                    url1="../saveDetailBigClass";
                    idClassParent=bSid;
                }else if(bDSid==-1){
                    url1="../saveDetailSmallClass";
                    idClassParent=bDBid;
                }
                $.ajax( {
                    type : "POST",
                    url : url1,
                    dataType : "json",
                    data:{class1:class1,idClassParent:idClassParent},
                    success : function(data) {
                       alert("插入成功")
                    }
                });
            });
        })

    </script>


</head>

<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <nav class="navbar navbar-default" role="navigation">
                                <div class="navbar-header" style="align-content: center">
                                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                                    <a class="navbar-brand" href="#">类型添加</a>
                                </div>

                                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                    <form class="navbar-form navbar-left" role="search" >
                                        <div class="form-group">
                                            <select  id="assignModel-role" class="form-control" style="width: 650px;" name="bBid"></select>

                                            <select  id="assignModel-role1" class="form-control" style="width: 650px;" name="bSid"></select>

                                            <select  id="assignModel-role2" class="form-control" style="width: 650px;" name="bDBid">
                                            </select>

                                            <select  id="assignModel-role3" class="form-control" style="width: 650px;" name="bDSid">

                                            </select>
                                            <input id="class1" type="text" name="class1" class="form-control" placeholder="类型" style="width: 650px;"/>
                                        </div>
                                        <button id="classAddBtn" type="button" class="btn btn-default" style="width:650px">Submit</button>
                                    </form>
                                </div>

                            </nav>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>

</html>