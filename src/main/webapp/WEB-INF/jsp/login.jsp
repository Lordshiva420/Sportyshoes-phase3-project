<%@page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <title>login page</title>
</head>
<body>

		
<h2 align="center">Admin Login Here </h2><br>
<h2	align="center" style="color:red;">${invalide}</h2>

<form action="/submitlogin" method="get">
	<table align="center" style="font-size: 20px; color: black;">
		<tr>
			<th><br>UserName</th>
			<th><br> <input type="text" name="userName" required /></th>
		</tr>
		<tr>
			<th><br>Password</th>
			<th><br> <input type="password" name="password" required /></th>
		</tr>
		<tr>
		    
			<th><br> <input type="submit" value="Submit" /></th>
			<th><br> <input type="reset" value="Reset" /></th>
		</tr>
		
	</table>
</form>

                      
	

</body>
</html>