<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddEmploy.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		Employ Name : 
		<input type="text" name="name" /> <br/><br/>
		Gender : 
		<select name="gender">
			<option value="MALE">Male</option>
			<option value="FEMALE">Female</option>
		</select> <br/><br/>
		Department : 
		<select name="dept">
			<option value="Java">Java</option>
			<option value="Dotnet">Dotnet</option>
			<option value="Oracle">Oracle</option>
		</select> <br/><br/>
		Designation : 
		<select name="desig">
			<option value="Programmer">Programmer</option>
			<option value="TeamLead">TeamLead</option>
			<option value="Manager">Manager</option>
		</select> <br/><br/>
		Basic : 
		<input type="number" name="basic" />
		<br/><br/>
		<input type="submit" value="Add Employ" />
	</center>
</form>
</body>
</html>