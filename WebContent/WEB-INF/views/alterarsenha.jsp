<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<template:_padrao>
<jsp:body>
	<div class="container" id="container-body"><h3><i class="fa fa-user"></i> Alterar Senha</h3></div>
	<a href="#" class="command-page"><span class="fa fa-plus-square"></span> Novo</a>
	<div class="panel panel-default">
		<div class="panel-body">
			<form:form method="POST" modelAttribute="userForm" class="form-signin">
	        	<h2 class="form-signin-heading">Create your account</h2>
	        </form:form>
	    </div>
	</div>
</jsp:body>
</template:_padrao>