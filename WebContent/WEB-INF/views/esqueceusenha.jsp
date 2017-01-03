<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<jsp:include page="../template/_padrao_header.jsp"/>
    <form:form method="POST" modelAttribute="userForm" class="form-signin">
    	<fieldset>
			<legend><i class="fa fa-share-square-o info"></i> Recuperação de Senha</legend>
	        <c:if test="${message != null}">	            
	            <div class="alert ${type}" role="alert">
					<i class="fa ${icons} fa-lg" aria-hidden="true"></i> <span>${message}</span>
				</div>
			</c:if>
	        <spring:bind path="username">
	            <div class="form-group ${status.error ? 'has-error' : ''}">
	                <form:input type="text" path="username" class="form-control" placeholder="Username"
	                            autofocus="true"></form:input>
	                <form:errors path="username"></form:errors>
	            </div>
	        </spring:bind>
	        <spring:bind path="email">
	            <div class="form-group ${status.error ? 'has-error' : ''}">
	                <form:input type="text" path="email" class="form-control" placeholder="Email"
	                            autofocus="true"></form:input>
	                <form:errors path="email"></form:errors>
	            </div>
	        </spring:bind>
	        <spring:bind path="cpf">
	            <div class="form-group ${status.error ? 'has-error' : ''}">
	                <form:input type="text" path="cpf" class="form-control" placeholder="CPF"
	                            autofocus="true"></form:input>
	                <form:errors path="cpf"></form:errors>
	            </div>
	        </spring:bind>
	        <div class="row">
	        	<div class="col-xs-6">
		        	<button class="btn btn-lg btn-primary btn-block" type="submit">Enviar</button>
	        	</div>
	        	<div class="col-xs-6">
	        		<button class="btn btn-lg btn-danger btn-block" onclick="window.location='${contextPath}/api/login'" type="button">Voltar</button>
	        	</div>
	        </div>        
	    </form:form>
    </fieldset>
    <script type="text/javascript">
	    $(function(){
	        $('#cpf').mask('999.999.999-99');
	    });
	</script>
<jsp:include page="../template/_padrao_footer.jsp"/>
