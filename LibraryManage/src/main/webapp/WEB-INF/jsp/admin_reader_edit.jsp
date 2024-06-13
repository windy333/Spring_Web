<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>编辑读者信息《 ${readerInfo.readerId}》</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js" ></script>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
    </script>
</head>
<body background="img/book2.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header" style="padding-bottom: 80px"></div>
<div class="col-xs-6 col-md-offset-3" style="position: relative;width: 380px;margin-left: 600px;margin-top: 20px">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">编辑读者信息《 ${readerInfo.readerId}》</h3>
        </div>
        <div class="panel-body">
            <form action="reader_edit_do.html?readerId=${readerInfo.readerId}" method="post" id="readeredit" >
                <div class="input-group">
                    <span class="input-group-addon">姓名</span>
                    <input type="text" class="form-control" name="name" id="name" value="${readerInfo.name}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span  class="input-group-addon">性别</span>
                    <input type="text" class="form-control" name="sex" id="sex"  value="${readerInfo.sex}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span class="input-group-addon">生日</span>
                    <input type="text" class="form-control" name="birth" id="birth" value="${readerInfo.birth}">
                </div>
                <script>
                    // 获取原始日期值
                    var originalDate = "${readerInfo.birth}";
                    // 格式化日期
                    var formattedDate = formatDate(originalDate);
                    // 将格式化后的日期值放入输入框
                    document.getElementById("birth").value = formattedDate;
                    // 自定义日期格式化函数
                    function formatDate(dateString) {
                        var date = new Date(dateString);
                        var year = date.getFullYear();
                        var month = (1 + date.getMonth()).toString().padStart(2, '0');
                        var day = date.getDate().toString().padStart(2, '0');

                        return year + "-" + month + "-" + day;
                    }
                </script>
                <div class="input-group" style="margin-top: 10px">
                    <span  class="input-group-addon">地址</span>
                    <input type="text" class="form-control" name="address" id="address"  value="${readerInfo.address}" >
                </div>
                <div class="input-group" style="margin-top: 10px">
                    <span class="input-group-addon">电话</span>
                    <input type="text" class="form-control" name="phone" id="phone" value="${readerInfo.phone}" >
                </div>
                <input type="submit" value="确定" class="btn btn-success btn-sm" class="text-left" style="margin-top: 10px;margin-left: 120px;width: 60px">
                <script>
                    $("#readeredit").submit(function () {
                        if($("#name").val()==''||$("#sex").val()==''||$("#birth").val()==''||$("#address").val()==''||$("#phone").val()==''){
                            alert("请填入完整读者信息！");
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
