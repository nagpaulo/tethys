<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:th="http'">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Sign In</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet" media="screen" th:href="@{/resources/css/bootstrap.min.css}"/>
    <link href="../resources/css/bootstrap-theme.css" rel="stylesheet" media="screen" th:href="@{/resources/css/bootstrap-theme.css}"/>
    <link href="../resources/css/core.css" rel="stylesheet" media="screen" th:href="@{/resources/css/core.css}" />
    <link href="../resources/css/font-awesome.min.css" rel="stylesheet" media="screen" th:href="@{/resources/css/font-awesome.min.css}" />    
    
    <script type="text/javascript" src="../resources/js/jquery-3.1.1.min.js" th:scr="@{/resources/js/jquery-3.1.1.min.js}"></script>
    <script type="text/javascript" src="../resources/js/bootstrap.min.js" th:scr="@{/resources/js/bootstrap.min.js}"></script> 
    <script type="text/javascript" src="../resources/js/core.js" th:scr="@{/resources/js/core.js}"></script>
</head>
<body>
	<form class="form-narrow form-horizontal"
		action="/j_spring_security_check" method="post"
		th:action="@{/j_spring_security_check}">
		<th:block th:if="${param.error != null}">
			<div
				th:replace="fragments/alert :: alert (type='danger', message='Sign in error. Please try again.')">Alert</div>
		</th:block>
		<fieldset>
			<legend>Please Sign In</legend>
			<div class="form-group">
				<label for="inputEmail" class="col-lg-2 control-label">Email</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="inputEmail"
						placeholder="Email" name="j_username" />
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="col-lg-2 control-label">Password</label>
				<div class="col-lg-10">
					<input type="password" class="form-control" id="inputPassword"
						placeholder="Password" name="j_password" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<div class="checkbox">
						<label> <input type="checkbox"
							name="_spring_security_remember_me" /> Remember me
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<button type="submit" class="btn btn-default">Sign in</button>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<p>
						New here? <a href="signup" th:href="@{/signup}">Sign Up</a>
					</p>
				</div>
			</div>
		</fieldset>
	</form>
</body>
</html>