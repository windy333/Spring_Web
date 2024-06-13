<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生详细信息</title>
</head>
<body>
<h2 style="text-align:center">学生详细信息</h2>
	
		<table>
				<tr><td>编号：</td><td>${stu.sid}</td></tr> 
				<tr><td>姓名：</td><td>${stu.sname}</td></tr> 
				<tr><td>性别：</td><td>${stu.sex}</td></tr> 
				<tr><td>年龄：</td><td>${stu.age}</td></tr>
				<tr><td colspan=2><a href="findall">返回</a></td></tr>  
		</table>
	
</body>
</html>