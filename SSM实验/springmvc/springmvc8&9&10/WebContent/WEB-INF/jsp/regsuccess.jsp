<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户注册信息
	<form action="doregister">
	用户名：${user.username}<br/>
	密码：${user.password}<br/>
	国家：${user.address.country}<br/>
	城市：${user.address.city}<br/>
</body>
</html>