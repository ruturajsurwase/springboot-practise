<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
    <title>login and password form</title>
    <style>
        .form {
            width: 1000px;
            height: 600px;
            border: 1px solid olive;
            box-shadow: 0px 0px 10px gray;
            margin: auto;
        }
        .form h2 {
            font-size: 30px;
            border-bottom: 3px solid black;
            color: black;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            padding: 4px;
            text-align: center;
        }
        .box {
            position: fixed;
            top: 5px;
            left: 115px;
            width: 800px;
            height: 580px;
            border: 1px solid white;
              color: red;
            box-shadow: 0px 0px 10px gray;
            margin: auto;
            margin-top: 30px;
        }
        .box h2 {
            font-size: 50px;
            border-bottom: 2px solid black;
            color: black;
            font-family: 'Times New Roman', Times, serif;
            padding: 10px ;
            text-align: center;
            text-shadow: 0px 0px 2px black;
        }
        .login{
            text-align: center;
            margin-top:90px;
        }
        .login label {
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            padding: 15px;
            font-size: 25px;
            text-shadow: 0 0 1px black;
        }
        .login input {
            margin: 20px;
            width: 400px;
            border: none;
            border-bottom: 1px solid black;
            height: 50px;
            font-size: 25px;
            text-align: center;
            font-weight: lighter;
        }
        .button {
            padding: 10px;
            background-color: black;
            color: white;
            font-size: 20px;
            border: none;
            width: 80%;
            position: absolute;
            bottom: 25px;
            right:170px;
        }
    </style>
<body>
    <div class="box">
        <h2>
            Login and password form
        </h2>
        
        <marquee style="color: red;">${msg}</marquee>
        
        <form action="login" method="post" class="login">
        
            <label for="">
                Enter your Username
            </label>
            <br>
            <input type="username" name="username" >
            <br>
            <label for="">
                Enter your Password
            </label>
            <br>
            <input type="password" name="password" >
            <br>
            <input type="submit" value="CLICK HERE TO LOGIN">
            
            <td><a href="registration">Click Here For New User Registration</a></td>
            
        </form>
    </div>
</body>
</html>