<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:form>
<h:panelGrid>
<h:outputText value="idclient" />
<h:inputText value="#{clientManagedBean.c.idclient}" />
<h:outputText value="nom" />
<h:inputText value="#{clientManagedBean.c.nom}" />
<h:outputText value="prenom" />
<h:inputText value="#{clientManagedBean.c.prenom}" />
<h:outputText value="adresse" />
<h:inputText value="#{clientManagedBean.c.adresse}" />
<h:commandButton actionListener="#{clientManagedBean.ajouter}" value="ajouter" />
</h:panelGrid>
</h:form>
</f:view>
</body>
</html>