<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join the Group</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<h1>Signup</h1>
	<h3>Register here for begin your Zumba journey</h3>
	<form action="ParticipantController" method="post">
		<label>Name</label> 
		<input type="text" id="pname" name="pname"> 
		
		<label>Email</label>
		<input type="email" id="email" name="email"> 
		
		<label>Phone Number</label> 
		<input type="number" id="pnumber" name="pnumber">
		<button type="submit">Register</button>
		<button type="reset">Clear</button>
	</form>
</body>
</html>