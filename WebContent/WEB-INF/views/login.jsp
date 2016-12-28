<jsp:include page="../template/_padrao_header.jsp"/>		
	<form method="POST" action="${contextPath}/api/login" class="form-signin">	
		<fieldset>
			<legend><i class="fa fa-lock"></i> Please Sign In</legend>
	        <div class="form-group ${error != null ? 'has-error' : ''}">
	            <span>${message}</span>
	            <input name="username" type="text" class="form-control" placeholder="Username"
	                   autofocus="true"/>
	            <input name="password" type="password" class="form-control" placeholder="Password"/>
	            <span>${error}</span>
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	
	            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
	            <h4 class="text-center"><a href="${contextPath}/api/registration">Create an account</a></h4>
	        </div>
		</fieldset>
    </form>
<jsp:include page="../template/_padrao_footer.jsp"/>	