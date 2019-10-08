<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Show Details Page</title>
</head>
<body>
 <h1>${headerMessage}</h1>
 <h3>Here are the details you entered..!</h1>
 
 <table>
 	<tr>
 		<td>Student Name :</td>
 		<td>${student1.studentName}</td>
 	</tr>
 	<tr>
 		<td>Student Hobby :</td>
 		<td>${student1.studentHobby}</td>
 	</tr>
 	<tr>
 		<td>Student Mobile :</td>
 		<td>${student1.studentMobile}</td>
 	</tr>
 	<tr>
 		<td>Student DOB :</td>
 		<td>${student1.studentDOB}</td>
 	</tr>
   	<tr>
 		<td>Student Skills :</td>
 		<td>${student1.studentSkillSet}</td>
 	</tr>
 	
 	<tr>
 		<td>Student Country :</td>
 		<td>${student1.studentAddress.country}</td>
 	</tr>
 	<tr>
 		<td>Student State :</td>
 		<td>${student1.studentAddress.state}</td>
 	</tr>
 	<tr>
 		<td>Student Village :</td>
 		<td>${student1.studentAddress.village}</td>
 	</tr>
   	<tr>
 		<td>Student Pin-code :</td>
 		<td>${student1.studentAddress.pincode}</td>
 	</tr>
 </table>
 
</body>
</html>