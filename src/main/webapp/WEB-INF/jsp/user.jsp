<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <title>welcome page</title>
</head>
<body>
<h1 style="color:blue;"> <center>Manage users</center> </h1>
<br>
<a href="getAllusers"><h2 style="color:blue;">1.Getallusers</h2></a>
<table >
	<tr>
		<td colspan=8 align="center">List of users</td>
	</tr>
	<tr>
		<th>ID &nbsp;</th>
		<th>Name &nbsp;</th>
		<th>timestamp &nbsp;</th>

	</tr>

	<c:forEach items="${users}" var="user">
		<tr>
			
			<td><c:out value="${user.getuId()}" /></td>
			<td><c:out value="${user.getUserName()}" /></td>
			<td><c:out value="${user.getTimestamp()}"/></td>
		</tr>
	</c:forEach>
</table>

<br>
	
<form action="searchUser" method="get">
       <h2 style="color:blue;">2.Search user</h2>
   <tr>
		<th>UserName</th>
		<th><input type="text" name="userName" required /></th>		
	</tr>
	 
	<tr>
	     <th><input type="submit" value="search" /></th>
	</tr>
            
      <br>
 </form>

   <table >
	<tr>
		<td colspan=8 align="center">users found</td>
	</tr>
	<tr>
		<th>ID &nbsp;</th>
		<th>Name &nbsp;</th>
		<th>timestamp &nbsp;</th>
	</tr>
	
		<c:forEach items="${user}" var="user">
		<tr>
			
			<td><c:out value="${user.getuId()}" /></td>
			<td><c:out value="${user.getUserName()}" /></td>
			<td><c:out value="${user.getTimestamp()}"/></td>
		</tr>
	</c:forEach>
	
</table>
   
   <br>
   
<a href="purchase"><h2 style="color:blue;">3.GetPurchaseReport</h2></a>
<table >
	<tr>
		<td colspan=8 align="center">purchaseReport</td>
	</tr>
	<tr>
		<th>userName &nbsp;</th>
		<th>productName &nbsp;</th>
		<th>category &nbsp;</th>
		<th>price &nbsp;</th>
        <th>timestamp &nbsp;</th>
	</tr>

	<c:forEach items="${purchases}" var="purchases">
		<tr>
			
			<td><c:out value="${purchases.getUserName() }" /></td>
			<td><c:out value="${purchases.getName()}" /></td>
			<td><c:out value="${purchases.getCategory()}"/></td>
			<td><c:out value="${purchases.getPrice()}" /></td>
			<td><c:out value="${purchases.getTimestamp()}" /></td>
		</tr>
	</c:forEach>
</table>

 <br>
<h2 style="color:blue;">4.Search Purchase</h2>
<form action="searchPurchase" method="get">
    Select a Category:&nbsp;
    
    <select name="category">
    
       <c:forEach items="${catlist}" var="cat">
       <option> 
			<c:out value="${cat}"/>
	   </option>
       </c:forEach>	
		   
	</select>
	 <br>
	  
Select a time:&nbsp;	
	<select name="timestamp">
    
       <c:forEach items="${timelist}" var="time">
       <option> 
			<c:out value="${time}"/>
	   </option>
       </c:forEach>	
		   
</select>
	
	 <br> &nbsp; &nbsp;<input type="submit" value="Search" />
</form> 

 
<table >
	<tr>
		<td colspan=8 align="center">Purchases found </td>
	</tr>
	<tr>
		<th>userName &nbsp;</th>
		<th>productName &nbsp;</th>
		<th>category &nbsp;</th>
		<th>price &nbsp;</th>
        <th>timestamp &nbsp;</th>
	</tr>

	<c:forEach items="${purchase}" var="purchase">
		<tr>
			
			<td><c:out value="${purchase.getUserName() }" /></td>
			<td><c:out value="${purchase.getName()}" /></td>
			<td><c:out value="${purchase.getCategory()}"/></td>
			<td><c:out value="${purchase.getPrice()}" /></td>
			<td><c:out value="${purchase.getTimestamp()}" /></td>
		</tr>
	</c:forEach>
</table>

<br>
<br>



</body>
</html>