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
			<h:outputText value="Place Order" />
		</h2>
		<h:form>
			<h:outputText value="Customer Id" />
			<h:inputText value="#{customerFound.cusid}" />
			<br />
			<br />
			<br />
	Select Vendor : 
	<h:selectOneMenu id="localCode" value="#{vendorDao.localCode}"
				onchange="submit()"
				valueChangeListener="#{vendorDao.employLocaleCodeChanged}">
				<f:selectItems value="#{vendorDao.showVendorNames()}" />
			</h:selectOneMenu>
			<br />
			<br />
	Select Wallet : 
	<h:selectOneMenu id="walletSelected" value="#{customerDao.localCode}" onchange="submit()"
				valueChangeListener="#{customerDao.employLocaleCodeChanged}">
				<f:selectItems value="#{customerDao.showCustomerWalleNames()}" />
			</h:selectOneMenu>
			
			<p>
				Selected Wallet Value is :
				<h:outputText value="#{customerDao.localCode}"></h:outputText>
				
			</p>
			
			<p>
				Selected Vendor Value is :
				<h:outputText value="#{vendorDao.localCode}"></h:outputText>
			</p>
			<p>
				Selected Vendor Id is :
				<h:outputText value="#{vendorDao.venId}"></h:outputText>
			</p>
			<br />
			<br />
	Select Restaurant : 
		<h:selectOneMenu id="restaurantSelected" value="#{resDao.localCode}" onchange="submit()"
				
				valueChangeListener="#{resDao.restaurantLocaleCodeChanged}">
				<f:selectItems value="#{resDao.showRestaurantNames()}" />
			</h:selectOneMenu>
			<p>
				Restaurant is :
				<h:outputText value="#{resDao.localCode}"></h:outputText>
				<br/>
				Restaurant Id is : 
					<h:outputText value="#{resDao.resId}"></h:outputText>
			</p>
			<h:commandButton action="PlaceOrderMenuShow" value="Show Menu" />
			</p>
			<br/><br/>
		</h:form>
	</center>
</body>
	</html>
</f:view>