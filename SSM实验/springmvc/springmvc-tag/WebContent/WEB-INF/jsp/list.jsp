<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息</title>
</head>
<body>
	<h2 style="text-align:center">用户列表</h2>
	<table>
	<tr>
	<td>编号</td><td>姓名</td><td>年龄</td>
	<td>详细信息&nbsp;</td>
	</tr>
	
	<c:forEach items="${users }" var="user">
	<tr>
	<td>${user.id }</td><td>${user.username }</td><td>${user.age }</td>
	<td><a href="detail/${user.id }">详细信息&nbsp;</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>