<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GenieForm</title>
</head>
<body>
<div style="border:solid 2px;width: 300px;margin-left:40%;margin-top:30%"  >
<h3 align="center">Login form</h3>
	<form:form method="post" action="Validate"
		commandName="userDetails">
		
			Email:   <form:input path="email" id="email" /><br>
			Password:<form:password path="password" id="password" /><br>
						<input type="submit" value="Submit" />
		

	</form:form>
</div>

</body>

</html>
