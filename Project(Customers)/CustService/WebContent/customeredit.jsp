<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Customer</title>
</head>
<body>
	<h2>${customeradderror}</h2>
	<div class="custcontainer">
		<form name="editCustomer" action="editCustomer" method="post">
		
			<label for="cid">CustId:</label> 
			<input type="number" name="customer_Id" id="cid" value="${param.customer_Id}" readonly>
			
			<label for="cnm">CustName:</label>
			 <input type="text" name="customer_Name" id="cnm" value="${param.customer_Name}">
			 
			 
			<label for="ccode">Country_Code:</label> 
			<input type="number" name="" id="ccode" value="${param.country_Code}"> 
			
			<label for="cphno">PhoneNo:</label>
			<input type="number" name="" id="cphno" value="${param.phone_No}">
			
			<label for="cemail">Email:</label> 
			<input type="number" name=""id="cemail" value="${param.email_Id}"> 
			
			<label for="caddr">Address:</label>
			<input type="text" name="address" id="caddr" value="${param.address}">
			
			<label for="ccity">City:</label> 
			<input type="number" name="" id="ccity" value="${param.city}"> 
			
			<label for="cstate">State:</label>
			<input type="number" name="" id="cstate" value="${param.state}">
			
			<label for="ccountry">Country:</label>
			<input type="text" name="" id="ccountry" value="${param.country}">
			
			<label for="czip">Zip:</label>
			<input type="text" name="" id="czip" value="${param.zip}"> 
			<label for="cage">Age:</label>
			<input type="date" name="" id="cage" value="${param.age}"> 
			
			<label for="cgender">Gender:</label> 
			<input type="text" name="gender" id="cgender" value="${param.gender}">
			
			<label for="cidtype">IdType:</label> 
			<input type="text" name="type" id="cidtype" value="${param.id_Type}">
			
			<label for="cidno">IdNumber:</label>
			<input type="number" name="" id="cidno" value="${param.id_No}">
			
			
			<label for="cnationality">Nationality:</label> 
			<input type="text" name="" id="cnationality" value="${param.nationality}">
			<input type="submit" value="Edit">
		</form>
</body>
</html>