<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<h:form>
        Welcome to : <b>
        	<h:outputText value="#{loggedCustomer}"/> <br/><br/>
        </b>
        <h:commandLink action="CustomerInfo">
        	<h:outputLabel value="Show Customer Info" />
        </h:commandLink>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <h:commandLink action="#{customerController.showCustomerWallet()}">
        	<h:outputLabel value="Show Customer Wallets" />
        </h:commandLink>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <h:commandLink action="ShowRestaurant">
        	<h:outputLabel value="Show Restaurant's" />
        </h:commandLink>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <h:commandLink action="PlaceOrder">
        	<h:outputLabel value="Place Order" />
        </h:commandLink>
     </h:form>
</html>
</f:view>