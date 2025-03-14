<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Schedule</title>
<link rel="stylesheet" type="text/css" href="index.css">

</head>
<body>
	<h1>Zumba classes schedule</h1>
	<table border="1">
	<% 
           java.util.ArrayList<String> activities = (java.util.ArrayList<String>) request.getAttribute("batches");

	// Check if the list is not null or empty
    if (activities != null && !activities.isEmpty()) {
        for (String activity : activities) {
%>
    <li><%= activity %></li>
<% 
        }
    } else { 
%>
    <li>No activities to display.</li>
<% }
        %>
</table>
<hr>
<table>
	<tr>
		<th>Batch Id</th>
		<th>Weekday</th>
		<th>Time</th>
	</tr>
	<core:forEach items="${sessionScope.batches}" var="batch">
		<br><tr>
			<td><core:out value="${batch.getbId()}"></core:out> </td>
			<td><core:out value="${batch.getWeekday()}"></core:out> </td>
			<td><core:out value="${batch.getTime()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.jsp">← Back</a>
<br>
<br>
<br>
<br>
<br>
</body>
</html>