<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GenieForm</title>
<script type="text/javascript">
alert("entered java script");
function assignPerson(issue)
{
	if(issue=="LoginIssue")
	{
		document.getElementById("assignedTo").value="M1035100";
		document.getElementById("person").innerHTML="ramesh";
	}
	else if(issue=="networkIssue")
	{
		document.getElementById("assignedTo").value="M1035200";
		document.getElementById("person").innerHTML="suresh";
	}
	else if(issue=="laptopIssue")
	{
		document.getElementById("assignedTo").value="M1035300";
		document.getElementById("person").innerHTML="hari";
	}
	else if(issue=="browserIssue")
	{
		document.getElementById("assignedTo").value="M1035400";
		document.getElementById("person").innerHTML="nari";
	}
}


</script>


</head>
<body>
<div  style="border:solid 2px;width: 300px;margin-left:40%;margin-top:30%" >
	<form:form method="post" action="addGenie" commandName="genieForm">
		
			
		<br>
			Mid: <form:input path="mid" id="mid" value="${user.mid}"/>
		<br>
			genieType  <form:select path="genieType" onchange="assignPerson(this.value)">
			<option value="">-Select-</option>
			<option value="LoginIssue">LoginIssue</option>
			<option value="networkIssue">networkIssue</option>
			<option value="laptopIssue">laptopIssue</option>
			<option value="browserIssue">browserIssue</option>
						</form:select>
		<br>
			Severity<form:select path="Severity">
			<option value="">-Select-</option>
			<option value="Normal">Normal</option>
			<option value="critical">critical</option>
			<option value="Major">Major</option>
						</form:select>
		<br>
			Location 	 <form:select path="location">
			<option value="">-Select-</option>
			<option value="banglore">Banglore</option>
			<option value="Bhubaneshwar">Bhubaneshwar</option>
						</form:select>
		<br>
			status 	   <form:select path="status">
			<option value="">-Select-</option>
			<option value="open">open</option>
			<option value="closed">closed</option>
						</form:select>
		<br>
			Mobile number <form:input path="mobilenum" id="mobilenum" />
		<br>
			 Date <input type="date" path="date" id="date"  />
		<br>
			
			assignedTo <form:input path="assignedTo" id="assignedTo" readonly="true"/>
		<br>
			Associate Name: <b id="person"></b>
			
			
		<br>
			`<input type="submit" value="Submit" />


	</form:form>
</div>
</body>
</html>