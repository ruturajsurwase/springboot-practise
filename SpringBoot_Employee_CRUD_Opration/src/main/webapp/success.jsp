<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>

<center><h1>ALL INFORMAITION</h1></center>

<script type="text/javascript">
function addUser() {
	
	document.fn.action="register.jsp";
	document.fn.submit();
}
function deleteUser() {
	
	document.fn.action="delete";
	document.fn.submit();
}
function editUser() {

	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body>

<form name="fn">
		<table border="1" align="center">
			<th>Sr No</th>
			<th>Id</th>
			<th>Name</th>
			<th>UserName</th>
			<th>Password</th>
		    <th>ADDRESS</th>
			<th>Mobile No</th>
			<th>SALARY</th>
			<tr>
				<c:forEach items="${ruturaj}" var="emp">
					<br>
					<td><input type="radio" name="id" value="${emp.id}"></td>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.username}</td>
					<td>${emp.password}</td>
					<td>${emp.address}</td>
					<td>${emp.mobileno}</td>
					<td>${emp.salary}</td>
					<!-- <td><input type="button" value="EDIT" onclick="editUser()"></td>
					<td><input type="button" value="DELETE" onclick="deleteUser()"><td> -->
			</tr>
			</c:forEach>

		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>

</body>
</html>