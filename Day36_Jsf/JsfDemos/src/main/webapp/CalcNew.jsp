<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
<body>
	        <h:form>
            Please Enter Numbers: <br/>
            First Number 
            <h:inputText id="num1" value="#{calculationNew.firstNo}"/><br>
            Second Number
            <h:inputText id="num2" value="#{calculationNew.secondNo}"/><br>
        	Result is : 
        	<h:outputText value="#{calculationNew.result}"/>
        	<h:commandButton actionListener="#{calculationNew.addition}" 
        		value="Sum" />
        </h:form>
</body>
</f:view>
</html>