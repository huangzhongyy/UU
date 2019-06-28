<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Rea" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input name="username" id="uname"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password" id="upass"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"/></td>
		</tr>
	</table>
</form>
</body>
</html>