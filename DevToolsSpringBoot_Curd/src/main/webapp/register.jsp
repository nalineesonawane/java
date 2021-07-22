<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1 color="red">Register Here!!</h1>
<table border="2">
<form action="reg1" method="post">
<tr>
<td>Id:-</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td>Name:-</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Address:-</td>
<td><input type="text" name="address"></td>
</tr>

<tr>
<td>UserName:-</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Password:-</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" name="register"><a href="login.jsp"></a></td>
</tr>
</table>
</form>
</body>
</html>