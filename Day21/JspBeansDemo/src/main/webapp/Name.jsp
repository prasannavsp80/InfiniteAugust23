<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanName" class="com.java.beans.NameBean"/>
	<jsp:setProperty property="*" name="beanName"/>
	First Name : <b>
	<jsp:getProperty property="firstName" name="beanName"/></b>
	<br/><br/>
	Last Name : <b>
	<jsp:getProperty property="lastName" name="beanName"/>
	</b> <br/><br/>
	Full Name : <%=beanName.fullName() %>
</body>
</html>