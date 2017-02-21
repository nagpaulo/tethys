<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!-- INICIO NAV (alterar pra include)-->
<nav class="navbar navbar-default navbar-static-top" role="navigation">
	<div class="container">
		<security:authorize access="hasRole('ROLE_USER_AUTH')">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="${contextPath}/api/home"><i class="fa fa-home"></i> Início</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-cog"></i> Configurações<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="${contextPath}/api/alterarsenha">Alterar Senha</a></li>
						<li class="divider"></li>
						<security:authorize access="hasRole('ROLE_MANTER_USUARIO')">
							<li><a href="#">Usuario</a></li>
						</security:authorize>	
						<security:authorize access="hasRole('ROLE_MANTER_TRANSACAO')">
							<li><a href="#">Transações</a></li>
						</security:authorize>
						<security:authorize access="hasRole('ROLE_MANTER_GRUPOUSUARIO')">
							<li><a href="#">Grupos</a></li>
						</security:authorize>
						<li class="divider"></li>
						<li>
							<c:if test="${pageContext.request.userPrincipal.name != null}">
						        <form id="logoutForm" method="POST" action="${contextPath}/logout">
						            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						        </form>						
						        <a href="#" onclick="document.forms['logoutForm'].submit()">
						        	<i class="fa fa-sign-out"></i> Sair
						        </a>						
						    </c:if>							
						</li>
					</ul></li>
			</ul>
		</div>
		</security:authorize>
	</div>
</nav>
<!-- FINAL NAV -->
