<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Calc.jsp">
	<center>
		First Number : 
		<input type="number" name="firstNo" /> <br/><br/>
		Second Number : 
		<input type="number" name="secondNo" /> <br/><br/>
		<input type="submit" value="Calculation" />
	</center>
</form>
<%
	if (request.getParameter("firstNo")!=null && 
		request.getParameter("secondNo") !=null
			) {
%>
	<jsp:useBean id="beanCalc" class="com.java.beans.Calculation"/>
	<jsp:setProperty property="*" name="beanCalc"/>
	Sum is : <b> <%=beanCalc.sum() %> </b> <br/><br/>
	Sub is : <b> <%=beanCalc.sub() %>  </b> <br/><br/> 
	Mult is : <b> <%=beanCalc.mult() %> </b>
<%
	}
%>
</body>
</html>