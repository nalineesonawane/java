<%@page import="java.util.List"%>
<%@page import="com.cjc.main.model.RegisterPage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>

</tr>
<%List<RegisterPage> slist=(List)request.getAttribute("data");
for(RegisterPage rp:slist)
{%><tr>
<td><input type="radio" name="id" value="<%=rp.getId() %>">
<td><%=rp.getId() %></td>
<td><%=rp.getName() %></td>
<td><%=rp.getAddress() %></td>
<td><%=rp.getUsername() %></td>
<td><%=rp.getPassword() %></td>

</tr>
<%} %>


</table>
</body>
</html>