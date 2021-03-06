<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<template:_padrao>
<jsp:body>		
	<form method="POST" action="${contextPath}/api/login" class="form-signin">	
		<fieldset>
			<legend><i class="fa fa-lock"></i> �rea Restrita</legend>
	        <div class="form-group ${error != null ? 'has-error' : ''}">
	        	<c:if test="${message != null}">	            
		            <div class="alert ${type}" role="alert">
						<i class="fa ${icons} fa-lg" aria-hidden="true"></i> <span>${message}</span>
					</div>
				</c:if>
	            <input name="username" type="text" class="form-control" placeholder="Usu�rio"
	                   autofocus="true"/>
	            <input name="password" type="password" class="form-control" placeholder="Senha"/>
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	
	            <button class="btn btn-lg btn-default btn-block" type="submit">Entrar</button>
	            <h4 class="text-center">
	            	<i class="fa fa-share-square-o" aria-hidden="true"></i>
	            	<a href="${contextPath}/api/esqueceusenha"> Esqueceu a senha?</a>
	            </h4>
	        </div>
		</fieldset>
    </form>
</jsp:body>
</template:_padrao>