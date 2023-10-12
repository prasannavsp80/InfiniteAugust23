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
		
	
	Select Restaurant : 
		<h:selectOneMenu id="restaurantSelected" value="#{resDao.localCode}" onchange="submit()"
				
				valueChangeListener="#{resDao.restaurantLocaleCodeChanged}">
				<f:selectItems value="#{resDao.showRestaurantNames()}" />
			</h:selectOneMenu>
			<p>
				Restaurant is :
				<h:outputText value="#{resDao.localCode}"></h:outputText>
				<br/>
			
			</p>
	
			<br/><br/>
		</h:form>
	</center>
</body>
	</html>
</f:view>