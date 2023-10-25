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
    <jsp:include page="Menu.jsp"/>
    <h:form>
    		<h:selectOneMenu id="localCode" value="#{employDao.localCode}" onchange="submit()"
	valueChangeListener="#{employDao.employLocaleCodeChanged}">
    <f:selectItems value="#{employDao.getDepartments()}"/>
</h:selectOneMenu>
<h:outputLabel id="heading" value="Selected Department is "/>
<h:outputText id="result" value="#{employDao.localCode}"/>
      <h:dataTable id="tableRender" value="#{employDao.getEmployListByDept(employDao.localCode)}" var="e" border="3">
        	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Employ No" id="eno" />
                    </f:facet>   
                    <h:outputText value="#{e.empno}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
                    		<h:outputLabel value="Employ Name" id="en1" />
                    </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
                    		<h:outputLabel value="Department" id="en2" />
                    </f:facet>
                    <h:outputText value="#{e.dept}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
                    		<h:outputLabel value="Designation" id="en3" />
                    </f:facet>
                    <h:outputText value="#{e.desig}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
                    		<h:outputLabel value="Basic" id="en5" />
                    </f:facet>
                    <h:outputText value="#{e.basic}"/>
                </h:column>
        </h:dataTable>
	</h:form>
</html>
</f:view>
