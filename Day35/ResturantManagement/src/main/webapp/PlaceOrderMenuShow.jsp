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
			Menu Items :
			<h:selectOneMenu value="#{menuDao.localCode}" onchange="submit()"
				valueChangeListener="#{menuDao.menuLocaleCodeChanged}">
				<f:selectItems value="#{menuDao.showMenuNames()}" />
			</h:selectOneMenu>
			
			<h:outputText value="#{menuDao.menuId}"></h:outputText>
			<h:outputText value="#{menu.menprice}"></h:outputText>
			<br/><br/>
			<h:inputText id="quantity" value="#{orders.ordquantity}" /><br/><br/> 
			<h:inputText id="comments" value="#{orders.ordcomments}" />
			<br/><br/>
			<h:commandButton action="#{ordersDao.placeOrderDao(orders)}" value="Place Order" />
		</center>
	</h:form>
</body>
	</html>
</f:view>