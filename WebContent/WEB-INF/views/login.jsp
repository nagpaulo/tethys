<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
	<title>Hello Spring Security</title>
	<meta charset="utf-8" />
	
	<link rel="stylesheet" href="../assets/css/bootstrap.min.css" th:href="@{../assets/css/bootstrap.min.css}" />
	<link rel="stylesheet" href="../assets/css/bootstrap-theme.min.css" th:href="@{../assets/css/bootstrap-theme.min.css}" />
	<link rel="stylesheet" href="../assets/css/font-awesome.min.css" th:href="@{../assets/css/font-awesome.min.css}" />
	
	<script type="text/javascript" src="../assets/js/jquery-3.1.1.min.js" th:src="@{../assets/js/jquery-3.1.1.min.js}"></script>
	<script type="text/javascript" src="../assets/js/bootstrap.min.js" th:src="@{../assets/js/bootstrap.min.js}"></script>
</head>
<body>
	<div class="container">
		<div class="alert alert-success" role="alert">...</div>
		<div th:fragment="logout" class="logout" sec:authorize="isAuthenticated()">
			Logged in user: <span sec:authentication="name"></span> | Roles: <span
				sec:authentication="principal.authorities"></span>
			<div>
				<form action="#" th:action="@{/logout}" method="post">
					<input type="submit" value="Logout" />
				</form>
			</div>
		</div>
		<h1>Hello Spring Security</h1>
		<p>This is an unsecured page, but you can access the secured pages
			after authenticating.</p>
		<ul>
			<li>Go to the <a href="/user/index" th:href="@{/user/index}">secured
					pages</a></li>
		</ul>
	</div>
</body>
</html>