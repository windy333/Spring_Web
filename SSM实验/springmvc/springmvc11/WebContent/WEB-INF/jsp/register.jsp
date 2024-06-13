<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户注册
	<form action="doregister">
		姓名:<input type="text" name="username"/><br/>
		密码:<input type="text" name="password"/><br/>
		国家:<input type="text" name="address.country"/><br/>
		城市:<input type="text" name="address.city"/><br/><br/>
		<input type="submit" value="注册"/>
	</form>
</body>
</html>