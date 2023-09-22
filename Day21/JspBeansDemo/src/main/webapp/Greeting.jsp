<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanGreeeting" class="com.java.beans.Greeting"/>
	Default Greeting : 
	<b>
		<jsp:getProperty property="message" name="beanGreeeting"/>
	</b>
	<jsp:setProperty property="message" name="beanGreeeting" value="Good Afternoon..."/>
	<br/><br/>
	Updated Value : 
	<jsp:getProperty property="message" name="beanGreeeting"/>
</body>
</html>