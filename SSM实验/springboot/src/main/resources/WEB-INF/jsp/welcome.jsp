<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>User List</title>
</head>
<body>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Sex</th>
		<th>Age</th>
	</tr>
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.sex}</td>
			<td>${user.age}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>