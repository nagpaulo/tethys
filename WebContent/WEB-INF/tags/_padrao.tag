<%@attribute name="extraScripts" fragment="true"%>
<%@attribute name="extraStyles" fragment="true"%>
<%@attribute name="_menu" fragment="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="template" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="Sistema em desenvolvimeto">
	<meta name="author" content="Paulo Roberto Mesquita da Silva">
	
	<title>Template</title>
	
	<link href="${contextPath}/resources/css/bootstrap.min.css"	rel="stylesheet">
	<link href="${contextPath}/resources/css/bootstrap-theme.css" rel="stylesheet" media="screen"/>
	<link href="${contextPath}/resources/css/core.css" rel="stylesheet">
	<link href="${contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" media="screen" /> 
</head>

<body>
	<div id="top">
		<div class="container">
			<div class="user-info">
		    	<security:authorize access="hasRole('ROLE_USER_AUTH')">
		    		<div class="text-left user-name">
			    		<i class="fa fa-user"></i> <span>${SECURITY_USER.usuario}</span>
		    		</div>
		    		<div class="text-right">
		    			<i class="fa fa-sign-in"></i> <span>${pageContext.request.userPrincipal.name}</span>
			    		<i class="fa fa-home"></i> <span>MATRIZ</span>
			    		<i class="fa fa-calendar-o"></i> <span>${SECURITY_LAST_ACCESS}</span>
		    		</div>
		    	</security:authorize>
	    	</div>
			<div class="col-sm-8">
				<div class="pull-left titulo">
					<span>Sistema de Gestão</span> 
					<span class="line2">Laboratório Nascimento</span>
				</div>
			</div>

			<div class="col-sm-4 hidden-xs">
				<%-- <img src="${contextPath}/resources/img/logo_nascimento.jpg" 
				class="pull-right img-responsive" id="logo-seduc"> --%>
				<i class="fa fa-envira fa-3x pull-right img-responsive" aria-hidden="true" id="logo-seduc"></i>
			</div>
		</div>
	</div>
	<template:_menu/>
	<div class="container">		
		<jsp:doBody />
	</div>
	<div id="footer" class="hidden-xs footer-fixed">
		<span>&copy 2017</span><span> Labnascimento :: Proteses Odontológica Nascimento LTDA</span>
	</div>
	<script type="text/javascript" src="${contextPath}/resources/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${contextPath}/resources/js/bootstrap.min.js"></script> 
    <script type="text/javascript" src="${contextPath}/resources/js/core.js"></script>
    <script type="text/javascript" src="${contextPath}/resources/js/pStrength.jquery.js"></script>
    <script type="text/javascript" src="${contextPath}/resources/js/jquery.maskedinput.min.js"></script>    
	<jsp:invoke fragment="extraScripts"/>
</body>
</html>