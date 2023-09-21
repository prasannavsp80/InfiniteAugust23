<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Date obj = new Date();
	%>
	Time is : 
	<b>
		<%=obj.getHours() %> : <%=obj.getMinutes() %> : <%=obj.getSeconds() %>
	</b>
</body>
</html>