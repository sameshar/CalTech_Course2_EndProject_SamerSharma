<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Batch</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<h1>Add batch here</h1>
	<p>Register here for begin your Zumba journey</p>
	<form action="BatchController" method="post" name="bform">
		<label>Batch ID</label> 
		<input type="text" id="bid" name="bid"> 
	
		<label for="weekday">Choose a weekday:</label>
  <select name="weekday" id="weekday">
    <option value="monday">Monday</option>
    <option value="tuesday">Tuesday</option>
    <option value="wednesday">Wednesday</option>
    <option value="thursday">Thursday</option>
    <option value="friday">Friday</option>
    <option value="saturday">Saturday</option>
    <option value="sunday">Sunday</option>
  </select>
		
		<label>Time</label> 
		<input type="text" id="time" name="time">
		<button type="submit">Register</button>
		<button type="reset">Clear</button>
	</form>
	
	<a href="index.jsp">← Back</a>

</body>
</html>