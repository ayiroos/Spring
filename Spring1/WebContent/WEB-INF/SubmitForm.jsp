<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Form</title>
</head>
<body>
<h1>${headerMessage}</h1>

<form:errors path="student1.*"/>

<form action="/Spring1/getDetails" method="post">
<p>Name : <input type="text" name="studentName"/></p>
<p>Hobby : <input type="text" name="studentHobby"/></p>
<p>Mobile : <input type="text" name="studentMobile"/></p>
<p>Date of Birth : <input type="text" name="studentDOB"/></p>
<p>Skillset : <select name="studentSkillSet" multiple>
<option value="Java">Java</option>
<option value="Devops">Devops</option>
<option value=".Net">.Net</option>
<option value="Machine Learning">Machine Learning</option>
</select>
</p>
<p>Enter Address :</p> 
<p>Country : <input type="text" name="studentAddress.country"/></p>
<p>State : <input type="text" name="studentAddress.state"/></p>
<p>Village : <input type="text" name="studentAddress.village"/></p>
<p>Pincode : <input type="text" name="studentAddress.pincode"/></p>
<p> <input type="submit" value="Click to Submit Details"/> </p>
</form>
</body>
</html>