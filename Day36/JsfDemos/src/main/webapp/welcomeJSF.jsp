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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
            Please Enter Numbers:<BR>
            First Number <h:inputText id="num1" value="#{Calculator.num1}"/><br>
            Second Number<h:inputText id="num2" value="#{Calculator.num2}"/><br>
                Sum is <h:outputText id="sum" value="#{Calculator.sum}"/><br>
                <h:commandButton actionListener="#{Calculator.addNumber}" value="Add"/><br>
            
        </h:form>
        

    </body>
</html>
</f:view>
