<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<h:form>
Select Restaurant : 
		<h:selectOneMenu id="restaurantSelected" value="#{resDao.localCode}"
				onchange="submit()"
				valueChangeListener="#{resDao.restaurantLocaleCodeChanged}">
				<f:selectItems value="#{resDao.showRestaurantNames()}" />
			</h:selectOneMenu>
			<p>
				Restaurant is :
				<h:outputText value="#{resDao.localCode}"></h:outputText>
				Restaurant Id is : 
					<h:outputText value="#{resDao.resId}"></h:outputText>
			</p>
Select Menu : 
		<h:selectOneMenu id="menuSelected" value="#{menuDao.localCode}" 
			onchange="submit()"
			valueChangeListener="#{menuDao.menuOptionChanged}"
				>
				<f:selectItems value="#{menuDao.snuNames(resDao.resId)}" />howMehowMe
			</h:selectOneMenu>
			<p>
				Menu is :
				<h:outputText value="#{menuDao.localCode}"></h:outputText>
			
			</p>
     </h:form>
</html>
</f:view>