<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update">
<table border="0">
<tr>
<td>UID:-</td>
<td><input type="text" name="uid" value="${Student.uid}"></td>
</tr>
<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${Student.name}"></td>
</tr>
<tr>
<td>User Name:-</td>
<td><input type="text" name="uname" value="${Student.uname}"></td>
</tr>
<tr>
<td>Password:-</td>
<td><input type="text" name="password" value="${Student.password}"></td>
</tr>
<tr>
<td>Address:-</td>
<td><input type="text" name="mobileno" value="${Student.mobileno}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>


</body>
</html>