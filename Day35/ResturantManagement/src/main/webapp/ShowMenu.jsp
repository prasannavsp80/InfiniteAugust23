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
                <h2><h:outputText value="Menu"/></h2>
            </center>
        <center>
        <h:dataTable value="#{menuList}" var="e" border="5">
        	          <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="menid" />
        	           </f:facet>
                    <h:outputText value="#{e.menid}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="MEN_ITEM" />
        	           </f:facet>
                    <h:outputText value="#{e.menitem}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="MEN_PRICE" />
        	           </f:facet>
                    <h:outputText value="#{e.menprice}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="Restaurant_ID" />
        	           </f:facet>
                    <h:outputText value="#{e.restaurantid}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="MEN_CALORIES" />
        	           </f:facet>
                    <h:outputText value="#{e.mencalories}"/>
                </h:column>
        	    <h:column>
                     <f:facet name="header">
        	           		<h:outputText value="MEN_SPECIALITY" />
        	           </f:facet>
                    <h:outputText value="#{e.menspeciality}"/>
                </h:column>
        </h:dataTable>
        <h:commandLink value="1" action="#{menuDao.showMenuDao(1,0)}" />
        &nbsp;&nbsp;
        <h:commandLink value="2" action="#{menuDao.showMenuDao(1,5)}" />
        &nbsp;&nbsp;
        <h:commandLink value="3" action="#{menuDao.showMenuDao(1,10)}" />
        &nbsp;&nbsp;
        <h:commandLink value="4" action="#{menuDao.showMenuDao(1,15)}" />
        &nbsp;&nbsp;
        <h:commandLink value="5" action="#{menuDao.showMenuDao(1,20)}" />
        &nbsp;&nbsp;
        <h:commandLink value="6" action="#{menuDao.showMenuDao(1,25)}" />
        &nbsp;&nbsp;
        <h:commandLink value="7" action="#{menuDao.showMenuDao(1,20)}" />
        </h:form>
        </center>
    </body>
</html>
</f:view>