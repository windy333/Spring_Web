<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
	<h1>修改用户信息</h1>
	<form:form action="update" method="post" commandName="user">
		<table border="1">
			<tr>
				<td>用户名</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<form:radiobutton path="gender" value="true" label="男" /> 
					<form:radiobutton path="gender" value="false" label="女" />
				</td>
			</tr>
			<tr>
				<td>婚姻</td>
				<td>
					<form:radiobutton path="married" value="是" />已婚 
					<form:radiobutton path="married" value="否" />未婚
				</td>
			</tr>
			<tr>
				<td>兴趣爱好1</td>
				<td>
					<form:checkbox path="myInteresting" value="美食"/>美食
					<form:checkbox path="myInteresting" value="音乐"/>音乐
					<form:checkbox path="myInteresting" value="旅行"/>旅行
				</td>
			</tr>
			<tr>
				<td>兴趣爱好2</td>
				<td>
					<form:checkbox path="myInteresting" value="美食" label="美食"/>
					<form:checkbox path="myInteresting" value="音乐" label="音乐"/>
					<form:checkbox path="myInteresting" value="旅行" label="旅行"/>
				</td>
			</tr>
			<tr>
				<td>兴趣爱好3</td>
				<td>
					<form:checkboxes path="myInteresting" items="${allInteresting}"/>
				</td>
			</tr>
			
			
			<tr>
				<td>居住城市1</td>
				<td>
					<form:radiobuttons path="city" items="${cities }"/><br/>
				</td>
			</tr>
			<tr>
				<td>居住城市2</td>
				<td>
					<form:select path="city">
						<option>请选择城市</option>
						<form:option value="北京">北京</form:option>
						<form:option value="广州">广州</form:option>
						<form:option value="深圳">深圳</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>居住城市3</td>
				<td>
					<form:select path="city">
						<option>请选择城市</option>
						<form:options items="${cities }"/>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td>学历</td>
				<td>
					<form:radiobuttons path="graduated" items="${graduates }"/><br/>
				</td>
			</tr>
			
			<tr>
				<td>个人描述</td>
				<td>
					<form:input path="description"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>