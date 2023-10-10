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
        	Employ No : 
        	<h:outputText value="#{employFound.empno}" />
        	<br/>
        	Employ Name : 
        	<h:outputText value="#{employFound.name}" />
        	<br/>
        	Gender : 
        	<h:outputText value="#{employFound.gender}" />
        	<br/>
        	Department : 
        	<h:outputText value="#{employFound.dept}" />
        	<br/>
        	Designation : 
        	<h:outputText value="#{employFound.desig}" />
        	<br/>
        	Basic : 
        	<h:outputText value="#{employFound.basic}" />
        	
        </h:form>
    </body>
</html>
</f:view>
