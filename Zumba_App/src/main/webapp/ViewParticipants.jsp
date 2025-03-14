<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Participants</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<h1>View Participants</h1>
	<table>
	<tr>
		<th>Participant Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Phone Number</th>
	</tr>
	
	<core:forEach var="ParticipantsName" items="${ParticipantsName}">
            <tr>
            <td> ${ParticipantsName.getPid()} </td>
            <td> ${ParticipantsName.getpname()} </td>
            <td> ${ParticipantsName.getemail()} </td>
            <td> ${ParticipantsName.getpnumber()} </td>
            </tr>
        </core:forEach>
	</table>
</body>
</html>