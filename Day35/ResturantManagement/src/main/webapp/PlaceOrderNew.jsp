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
		    Customer Id : 
        	  <h:inputText id="customerId" 
	  	label="Please Enter Customer Id"
		value="#{customerFound.cusid}">
	  </h:inputText> <br/><br/>
       Restaurant Name : 
               	<h:selectOneMenu value="#{resDao.localCode}" onchange="submit()"
	valueChangeListener="#{resDao.restaurantLocaleCodeChanged}">
    <f:selectItems value="#{resDao.showRestaurantNames()}"/>
</h:selectOneMenu>
Selected value is : 
<h:outputText value="#{resDao.resId}"/>
<br/><br/>
<br/><br/>
	Menu Items : 
              	<h:selectOneMenu value="#{menuDao.localCode}" onchange="submit()"
	valueChangeListener="#{menuDao.menuLocaleCodeChanged}">
    <f:selectItems value="#{menuDao.showMenuNames(resDao.resId)}"/>
</h:selectOneMenu>
<h:outputText value="#{menuDao.menuId}"/>
	<br/><br/>
		</h:form>
	</center>
</body>
	</html>
</f:view>