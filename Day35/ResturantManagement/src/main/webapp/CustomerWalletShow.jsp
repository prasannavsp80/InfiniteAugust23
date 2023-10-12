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
   <h:dataTable value="#{walletList}" var="e" border="5">
        	            	    <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Customer Id" />
        	           </f:facet>
                    <h:outputText value="#{e.custId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Wallet Id" />
        	           </f:facet>
                    <h:outputText value="#{e.walletId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Wallet Amount" />
        	           </f:facet>
                    <h:outputText value="#{e.walletAmount}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Wallet Source" />
        	           </f:facet>
                    <h:outputText value="#{e.walletSource}"/>
                </h:column>
                  
        </h:dataTable>
    </body>
</html>
</f:view>