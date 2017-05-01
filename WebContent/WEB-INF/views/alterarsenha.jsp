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
			<form:form method="POST" modelAttribute="alterarSenhaForm" class="form-alterar-senha">
	        	<c:if test="${message != null}">	            
		            <div class="alert ${type}" role="alert">
						<i class="fa ${icons} fa-lg" aria-hidden="true"></i> <span>${message}</span>
					</div>
				</c:if>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group ${status.error ? 'has-error' : ''}">
			                <form:input type="text" path="usuario" class="form-control" placeholder="${usuarioLogado.usuario}" 
			                	autofocus="true" disabled="true" />
			            </div>
		            </div>
	            </div>
	            <div class="row">
					<div class="col-md-12">
			            <div class="form-group">
			   				<input type="password" id="nm_senha_atual" 
			   					name="nm_senha_atual" value="" class="form-control" 
			   					size="30" placeholder="Senha Atual"/>
				   		</div>
				   	</div>	
		   		</div>
				<div class="row">
					<div class="col-md-12">						
				   		<div class="form-group">
				   			<input type="password" id="nm_nova_senha" name="nm_nova_senha" 
				   				value="" class="form-control" size="30" placeholder="Nova Senha"/>
				   			
							<div class="progress">
								<div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
									<span class="pass-force"></span>
								</div>
							</div>
				   		</div>
			   		</div>	
			   		<div class="col-md-12">
				   		<div class="form-group">
				   			<input type="password" id="nm_repetir_senha" 
				   				name="nm_repetir_senha" value=""  class="form-control" size="30"
				   				placeholder="Repetir Senha"/>
				   			<span class="text-danger" id="pass-tip">Repetir Senha</span>
				   		</div>
				   	</div>				   	
		   		</div>
		   		<div class="row">
		   			<div class="col-md-12">
			   		<button type="submit" class="btn btn-success btn-lg btn-block"> 
			   			<span class="fa fa-save"></span> Alterar
			   		</button>
			   		</div>
		   		</div>
	        </form:form>
	    </div>
	</div>
</jsp:body>
</template:_padrao>
<script src="${contextPath}/resources/js/alterarSenha.js"></script>