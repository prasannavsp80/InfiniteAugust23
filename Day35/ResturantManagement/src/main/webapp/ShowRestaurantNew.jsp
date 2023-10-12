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
        		<center>
                <h2><h:outputText value="Restaurant"/></h2>
            </center>
        <center>
        <h:dataTable value="#{restaurantsList}" var="e" border="5">
        	            	    <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Restaurant_ID" />
        	           </f:facet>
                    <h:outputText value="#{e.restaurant_ID}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Restaurant_Name" />
        	           </f:facet>
                    <h:outputText value="#{e.restaurant_Name}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Branch" />
        	           </f:facet>
                    <h:outputText value="#{e.branch}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="City" />
        	           </f:facet>
                    <h:outputText value="#{e.city}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="MobileNo" />
        	           </f:facet>
                    <h:outputText value="#{e.mobileNo}"/>
                </h:column>
        	    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Email" />
        	           </f:facet>
                    <h:outputText value="#{e.email}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Rating" />
        	           </f:facet>
                    <h:outputText value="#{e.rating}"/>
                </h:column>
                 <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Show Menu" />
        	           </f:facet>
                    <h:commandButton action="#{menuDao.showMenuDaoNew(e.restaurant_ID)}" value="Show Menu" />
                </h:column>          
        </h:dataTable>
        </h:form>
        </center>
    </body>
</html>
</f:view>