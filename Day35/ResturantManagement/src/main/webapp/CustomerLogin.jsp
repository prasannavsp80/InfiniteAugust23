<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <center>
		<h2>
	<h:outputText value="Customer Login" />
	</h2>
	<h:form>
	<h:outputText value="UserName : " />
	<h:inputText id="username" value="#{customer.cususername}" /><br/><br/>
	<h:outputText value="Password : " />
	<h:inputText id="password" value="#{customer.cuspassword}" /><br/><br/>
	<h:commandButton action="#{customerController.customerLogin()}" value="Login" /><br/><br/>
	<h:outputText value="#{errorMessage}"/><br/><br/>
	<br/><br/>
	</h:form>
</center>
    </body>
</html>
</f:view>