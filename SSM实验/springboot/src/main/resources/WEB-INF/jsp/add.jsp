<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
</head>
<body>
	<br/>
	<br/>
	<h2 style="text-align: center">添加学生</h2>
	<form action="add" method="post">
		姓名：<input type="text" name="sname" /><br /> 
		性别：<input type="text"name="sex" /><br /> 
		年龄：<input type="text" name="age" /><br /> 
		<input type="submit" value="添加" />
	</form>
</body>
</html>