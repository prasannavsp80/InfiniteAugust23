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
                <h2 style="text-align: center" class="col-sm-4">Edit Your Record</h2>
            <hr/>
Employ No
                    <h:inputText id="empno" value="#{editEmploy.empno}" /> <br/>
Employ Name
                    <h:inputText id="name" value="#{editEmploy.name}" /> <br/>
Gender 
                    <h:inputText id="gender" value="#{editEmploy.gender}" /> <br/>                    
Department 
                    <h:inputText id="dept" value="#{editEmploy.dept}" /> <br/>
Designation
                    <h:inputText id="desig" value="#{editEmploy.desig}" /> <br/>
Basic
                    <h:inputText id="basic" value="#{editEmploy.basic}"/> <br/>
                    <h:commandButton value="Update" 
                    	action="#{ejbImpl.updateEmployEjb(editEmploy)}" />
        
        </h:form>
    </body>
</html>
</f:view>
