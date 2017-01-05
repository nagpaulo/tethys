<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<template:_padrao>
<jsp:attribute name="extraScripts">
<script type="text/javascript">
    $(function(){
        $('#cpf').mask('999.999.999-99');
    });
</script>
</jsp:attribute>
<jsp:body>
    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h2 class="form-signin-heading">Create your account</h2>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="Username"
                            autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control"
                            placeholder="Confirm your password"></form:input>
                <form:errors path="passwordConfirm"></form:errors>
            </div>
        </spring:bind>
		
		<spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="email" class="form-control" placeholder="Informe seu Email"></form:input>
                <form:errors path="email"></form:errors>
            </div>
        </spring:bind>		
		
		<spring:bind path="cpf">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="cpf" class="form-control" placeholder="Informe seu CPF"
                            autofocus="true" id="cpf"></form:input>
                <form:errors path="cpf" ></form:errors>
            </div>
        </spring:bind>
		
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
</jsp:body>    
</template:_padrao>
