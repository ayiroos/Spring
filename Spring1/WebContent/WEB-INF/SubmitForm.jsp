<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Form</title>
</head>
<body>
<a href="/Spring1/submitForm?siteLanguage=en">English</a> | <a href="/Spring1/submitForm?siteLanguage=fr">French</a> 
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css" />

<p>
<a href="/Spring1/submitForm?siteTheme=green">Green</a>|
<a href="/Spring1/submitForm?siteTheme=red">Red</a>
</p>
<h3>${headerMessage}</h3>
<h3>Sooriya</h3>

<form:errors path="student1.*"/>

<form action="/Spring1/getDetails" method="post">

<table>
<tr><td><spring:message code="label.studentName"/></td><td><input type="text" name="studentName"/></td></tr>
<tr><td><spring:message code="label.studentHobby"/></td><td><input type="text" name="studentHobby"/></td></tr>
<tr><td><spring:message code="label.studentMobile"/></td><td><input type="text" name="studentMobile"/></td></tr>
<tr><td><spring:message code="label.studentDOB"/></td><td><input type="text" name="studentDOB"/></td></tr>
<tr><td><spring:message code="label.studentSkillSet"/></td><td><select name="studentSkillSet" multiple>
<option value="Java">Java</option>
<option value="Devops">Devops</option>
<option value=".Net">.Net</option>
<option value="Machine Learning">Machine Learning</option>
</select></td></tr>
<tr><td><spring:message code="label.Address"/></td></tr>
<tr>
<td><spring:message code="label.country"/></td><td><input type="text" name="studentAddress.country"/></td>
<td><spring:message code="label.state"/></td><td><input type="text" name="studentAddress.state"/></td>
<td><spring:message code="label.village"/></td><td><input type="text" name="studentAddress.village"/></td>
<td><spring:message code="label.pincode"/></td><td><input type="text" name="studentAddress.pincode"/></td>
</tr>
<tr><td><input type="submit" value=<spring:message code="label.submit"/>/></td></tr>
</table>
</form>
</body>
</html>