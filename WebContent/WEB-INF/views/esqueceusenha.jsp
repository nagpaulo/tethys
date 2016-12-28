<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<jsp:include page="../template/_padrao_header.jsp"/>
    <form:form method="POST" modelAttribute="userForm" class="form-signin">
    	<h2 class="form-signin-heading">Recuperação de senha</h2>
        <c:if test="${message != null}">	            
            <div class="alert ${type}" role="alert">
				<i class="fa ${icons} fa-lg" aria-hidden="true"></i> <span>${message}</span>
			</div>
		</c:if>
        <spring:bind path="login">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="login" class="form-control" placeholder="Usuario"
                            autofocus="true"></form:input>
                <form:errors path="login"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="email" class="form-control" placeholder="E-mail"></form:input>
                <form:errors path="email"></form:errors>
            </div>
        </spring:bind>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
<jsp:include page="../template/_padrao_footer.jsp"/>
