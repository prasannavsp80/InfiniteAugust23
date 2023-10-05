<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
        <p>
		Welcome to Menu Page...
	</p>
	<h:commandLink id="image-link-id" action="ShowDept.xhtml">  
<h:outputText value="Show Departments"></h:outputText>  
</h:commandLink>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<h:commandLink id="image-link-id1" action="EmployShow.xhtml">  
<h:outputText value="Show Employ"></h:outputText>  
</h:commandLink>
<hr/>
        </h:form>
    </body>
</html>
</f:view>
