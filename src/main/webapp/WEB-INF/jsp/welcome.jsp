<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <title>welcome page</title>
</head>
<body>
  <h1> <center>Welcome to sporty shoe Admin</center> </h1><br>
	<h2 >change Password </h2>
    <h2	style="color:red;">${message}</h2>
<form action="changePassword" method="get">
	<table style="font-size: 20px; color: black;">
		<tr>
			 <th><br>password</th>
			 <th><br> <input type="text" name="password" required /></th>
		</tr>
		<tr>
			  <th><br>confirm Password</th>
			  <th><br> <input type="text" name="Cpassword" required /></th>
		</tr>
		<tr>
			   <th><br> <input type="submit" value="Submit" /></th>
			   <th><br> <input type="reset" value="Reset" /></th>
		</tr>
			</table>
</form>
   
<br>

<form action="product" method="get">
        <tr>
			   <th><br> <input type="submit" value="manage products" /></th>
			   
		</tr>
</form>

<form action="user" method="get">
        <tr>
			   <th><br> <input type="submit" value="user details" /></th>
			   
		</tr>


</body>
</html>