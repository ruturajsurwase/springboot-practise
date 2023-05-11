<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Student Registration</title>


</head>

<body>
<form action="registerStudent">

		<table border="0" align="center">
			<tr>
				<td>ID:-</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>USERNAME:-</td>
				<td><input type="text" name="username"></td>
			</tr>
			
				<td>PASSWORD:-</td>
				<td><input type="text" name="password"></td>
			</tr>
		    <tr>
				<td>Email:-</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
			<tr>
				<td>Mobile NO:-</td>
				<td><input type="text" name="mobileno"></td>
			</tr>
			
			  <p>Please select your favorite course:</p>
			 
 	 <input type="radio" id="java" name="fav_course" value="1">
  	<label for="java">JAVA</label><br>
  	<input type="radio" id="python" name="fav_course" value="2">
 	 <label for="python">PYTHON</label><br>
 	 <input type="radio" id="C++" name="fav_course" value="3">
  	<label for="c++">C++</label>
			
			
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
			
		</table>
	  </form>


</body>
</html>