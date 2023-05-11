<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="fn">
		<table border="1" align="center">
			<th>Sr No</th>
			<th>Id</th>
		    <th>UserName</th>
			<th>Password</th>
		    <th>EMAIL</th>
			<th>Mobile No</th>
		
			<tr>
				<c:forEach items="${ruturaj}" var="st">
					<br>
					<td><input type="radio" name="id" value="${st.id}"></td>
					<td>${st.id}</td>
					<td>${st.username}</td>
					<td>${st.password}</td>
					<td>${st.email}</td>
					<td>${st.mobileno}</td>
				
					<!-- <td><input type="button" value="EDIT" onclick="editUser()"></td>
					<td><input type="button" value="DELETE" onclick="deleteUser()"><td> -->
			</tr>
			</c:forEach>

		</table>
</form>
</body>
</html>