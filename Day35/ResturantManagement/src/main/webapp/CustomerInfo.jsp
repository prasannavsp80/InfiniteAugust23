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
                <h2><h:outputText value="Customer Details"/></h2>
            </center>
    
      		<center>
      			Customer Name : 
      			<h:outputText value="#{customerFound.cusname}"/>
      			<br/><br/>
      			Phone NO : 
      			<h:outputText value="#{customerFound.cusphnno}"/>
      			<br/><br/>
      			UserName : 
      			<h:outputText value="#{customerFound.cususername}"/>
      			<br/><br/>
      			Email : 
      			<h:outputText value="#{customerFound.cusemail}"/>
      		</center>
   
    </body>
</html>
</f:view>