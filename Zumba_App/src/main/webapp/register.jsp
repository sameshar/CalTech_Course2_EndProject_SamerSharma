<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join the Group</title>
</head>
<body>
<h1>Register here for begin your Zumba journey</h1>
<form action="ParticipantController" action="POST">
	<label>Name</label>
	<input type="text" id="name">
	<label>Email</label>
	<input type="email" id="email">
	<label>Phone Number</label>
	<input type="number" id="pnumber">
	<button type="submit">Register</button>
	<button type="reset">Clear</button>
</form>
</body>
</html>