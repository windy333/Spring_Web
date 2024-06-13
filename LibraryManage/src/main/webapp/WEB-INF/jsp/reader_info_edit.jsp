<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>${readercard.name}的主页</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js" ></script>
    <script>
        $(function () {
            $('#header').load('reader_header.html');
        })
    </script>
</head>
<body background="img/lizhi.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header" style="padding-bottom: 80px"></div>
<div class="col-xs-5 col-md-offset-3">
    <div class="panel panel-default" style="width: 360px;margin-left: 180px">
        <div class="panel-heading">
            <h3 class="panel-title">
                信息修改
            </h3>
        </div>
        <div class="panel-body">
            <form action="reader_edit_do_r.html" method="post" id="edit" >
                <div class="input-group">
                    <span  class="input-group-addon">读者证号</span>
                    <input type="text" readonly="readonly" class="form-control" name="readerId" id="readerId" value="${readerinfo.readerId}">
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span class="input-group-addon">姓名</span>
                    <input type="text" class="form-control" name="name" id="name" value="${readerinfo.name}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span  class="input-group-addon">性别</span>
                    <input type="text" class="form-control" name="sex" id="sex"  value="${readerinfo.sex}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span class="input-group-addon">生日</span>
                    <input type="text" class="form-control" name="birth" id="birth" value="<c:out value='${readerinfo.birth}' />" >
                </div>

                <script>
                    // 获取生日日期值
                    var birthDate = new Date("${readerinfo.birth}");
                    // 格式化日期为 yyyy-MM-dd 形式
                    var formattedBirthDate = birthDate.getFullYear() + '-' + (birthDate.getMonth() + 1).toString().padStart(2, '0') + '-' + birthDate.getDate().toString().padStart(2, '0');
                    // 将格式化后的日期设置到输入框中
                    document.getElementById('birth').value = formattedBirthDate;
                </script>
                <div class="input-group" style="margin-top: 10px">
                    <span  class="input-group-addon">地址</span>
                    <input type="text" class="form-control" name="address" id="address"  value="${readerinfo.address}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span  class="input-group-addon">电话</span>
                    <input type="text" class="form-control" name="phone" id="phone"  value="${readerinfo.phone}" >
                </div>
                <br/>
                <input type="submit" value="确定" class="btn btn-success btn-sm" class="text-left">
                <script>
                    $("#edit").submit(function () {
                        if($("#name").val()==''||$("#sex").val()==''||$("#birth").val()==''||$("#address").val()==''||$("#phone").val()==''){
                            alert("请填入完整图书信息！");
                            return false;
                        }
                    })
                </script>
            </form>
        </div>
    </div>
</div>
</body>
</html>
