<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="Sistema em desenvolvimento">
<meta name="author" content="Paulo Roberto Mesquita da Silva">

<title>Sistema Gerencial::</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"	rel="stylesheet">
<link href="${contextPath}/resources/css/bootstrap-theme.css" rel="stylesheet" media="screen" />
<link href="${contextPath}/resources/css/core.css" rel="stylesheet">
<link href="${contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" media="screen" />
</head>

<body>
	<div id="top">
		<div class="container">
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
	<div class="container">