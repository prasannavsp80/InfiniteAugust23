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
        <center>
		<h2>
	<h:outputText value="Add Customer" />
	</h2>
	<h:form id="form">
	<h:outputText value="Customer Name " />
	<h:inputText id="name" value="#{customer.cusname}" /><br/> 
	<h:message for="form:name"></h:message>
	<br/><br/>
	<h:outputText value="Phone No " />
	<h:inputText id="phoneno" value="#{customer.cusphnno}" /><br/>
	<h:message for="form:phoneno"></h:message>
	
		<br><br>
	<h:outputText value="UserName " />
	<h:inputText id="username" value="#{customer.cususername}" /><br/>
	<h:message for="form:username"></h:message>
	
	    <br><br>
	<h:outputText value="Password " />
	<h:inputText id="password" value="#{customer.cuspassword}" /><br/>
	<h:message for="form:password"></h:message>
		<br><br>
	<h:outputText value="Customer Email " />
	<h:inputText id="email" value="#{customer.cusemail}" /><br/>
	<h:message for="form:email"></h:message>
	<br/><br/>
	<h:commandButton action="#{customerController.addCustomer()}" value="Add Customer" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton>
	
	</h:form>
</center>
    </body>
</html>

</f:view>