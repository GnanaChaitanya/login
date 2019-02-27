<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Registration Page
	<%-- <form:form modelAttribute="registrationPojo" action="registration.htm" method="post">
		Username: <form:input path="UserName" name="UserName" id="UserName"/><br>
		Password :<form:input path="Password" name="Password" id="Password"/><br>
		Name     : <form:input path="Name" name="Name" id="Name"/><br>
		University :<form:input path="University" name="University" id="University"/><br>
		PhoneNumber :<form:input path="Phone" name="Phone" id="Phone"/><br>
		Emergency Number:<form:input path="Emer" name="Emer" id="Emer"/><br>
		State    : <form:input path="State" name="State" id="State"/><br>
		Country  : <form:input path="Country" name="Country" id="Country"/><br>
		<form:button id="Register" name="Register">Register</form:button>
	</form:form> --%>
	<form action="registration.htm">
		Username: <input type="text" name="UserName" /><br>
		Password :<input type="text" name="Password"/><br>
		Name     : <input type="text" name="Name"/><br>
		University :<input type="text" name="University"/><br>
		PhoneNumber :<input type="text"  name="Phone"/><br>
		Emergency Number:<input type="text" name="Emer"/><br>
		State    : <input type="text" name="State"/><br>
		Country  : <input type="text" name="Country"/><br>
		<input type="submit" >
	</form>
		
</body>
</html>