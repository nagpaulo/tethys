<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<template:_padrao>
<jsp:body>
	<div class="panel panel-default">
		<div class="panel-body">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
		        <div class="jumbotron"> 
		        	<h1 class="text-center">Bem Vindo!</h1> 
		        	<p class="text-center">
		        		Esta é sua área administrativa, através dela, 
		        		você poderá acessar facilmente todos os recursos do sistema.
		        	</p> 
		        	<p class="text-center">
		        		<a href="#" class="btn btn-primary btn-lg" role="button">
		        			<i class="fa fa-comment" aria-hidden="true"></i> Notificações <span class="badge">42</span>
		        		</a>
		        	</p> 
		        </div>		
		    </c:if>
	    </div>
	</div>
</jsp:body>
</template:_padrao>