<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <title>product page</title>
</head>
<body>


  <h1 style="color:blue;"> <center>Manage Products</center> </h1>
	<a href="listOfProducts"><h2 style="color:blue;">1.view products</h2></a>
<table >
	<tr>
		<td colspan=8 align="center">List of Products</td> 
	</tr>
	<tr>
		<th>ID &nbsp;</th>
		<th>Name &nbsp;</th>
		<th>category &nbsp;</th>
		<th>price &nbsp;</th>
	</tr>

	<c:forEach items="${products}" var="product">
		<tr>
			
			<td><c:out value="${product.getPid()}" /></td>
			<td><c:out value="${product.getName()}" /></td>
			<td><c:out value="${product.getCategory()}"/></td>
			<td><c:out value="${product.getPrice()}" /></td>
			
		</tr>
	</c:forEach>
</table>


<br>

<h2 style="color:blue;"> 2.Add Product </h2>
<form action="addProduct" method="get">
	<table style="font-size: 20px; color: black;">
		<tr>
			 <th>product name</th>
			 <th><input type="text" name="Name" required /></th>
		</tr>
		<tr>
			  <th><br>product category</th>
			  <th><br> <input type="text" name="category" required /></th>
		</tr>
		<tr>
			  <th><br>product price</th>
			  <th><br> <input type="text" name="price" required /></th>
		</tr>
		<tr>
			   <th><br> <input type="submit" value="Submit" /></th>
			   <th><br> <input type="reset" value="Reset" /></th>
		</tr>
			</table>
</form>
<br>
<h2 style="color:blue;"> 3.Delete Product </h2>
 <h3> Enter the product Id to delete the product </h3>
<form action="deleteProduct" method="get">
	<table style="font-size: 20px; color: black;">
	    <tr>
			 <th>product Id</th>
			 <th><input type="text" name="Id" required /></th>
		</tr>
		
		<tr>
			   <th><br> <input type="submit" value="Delete" /></th>
			   <th><br> <input type="reset" value="Reset" /></th>
		</tr>
			</table>
</form>

<br>

<h2 style="color:blue;"> 4.Update Product </h2>
 <h3> Enter the product Id to change its details </h3>
<form action="updateProduct" method="get">
	<table  style="font-size: 20px; color: black;">
	    <tr>
			 <th><br>product Id</th>
			 <th><br> <input type="text" name="Id" required /></th>
		</tr>
		<tr>
			 <th><br>product name</th>
			 <th><br> <input type="text" name="Name" required /></th>
		</tr>
		<tr>
			  <th><br>product category</th>
			  <th><br> <input type="text" name="category" required /></th>
		</tr>
		<tr>
			  <th><br>product price</th>
			  <th><br> <input type="text" name="price" required /></th>
		</tr>
		<tr>
			   <th><br> <input type="submit" value="Update" /></th>
			   <th><br> <input type="reset" value="Reset" /></th>
		</tr>
</table>
</form>

</body>
</html>