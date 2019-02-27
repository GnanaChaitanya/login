
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<form:form modelAttribute="loginPojo" action="login.htm" method="post">
		Username: <form:input path="us" name="us" id="us"/><br>
		Password: <form:input path="pass" name="pass" id="pass"/><br>
		<form:button id="login" name="login">login</form:button>
	</form:form>
	<%-- <form action="login.htm">
		UserName: <input type="text" name="us"/>
		Password: <input type="text" name="pass">
		<input type="button">
	</form> --%>
</body>
</html>
