<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新信息</title>
</head>
<body>

	<br/>
	<br/>
	<h2 style="text-align: center">更新信息</h2>
	<form action="update" method="post">
		姓名：<input type="text" name="sname" value="${stu.sname }" /><br /> 
		性别：<input type="text" name="sex" value="${stu.sex }"/><br /> 
		年龄：<input type="text" name="age" value="${stu.age }"/><br /> 
		<input type="hidden" name="sid" value="${stu.sid }" />
		<input type="submit" value="修改" />
	</form>

</body>
</html>