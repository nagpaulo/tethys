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
	<meta name="description" content="Sistema em desenvolvimeto">
	<meta name="author" content="Paulo Roberto Mesquita da Silva">
	
	<title>Template</title>
	
	<link href="${contextPath}/resources/css/bootstrap.min.css"	rel="stylesheet">
	<link href="${contextPath}/resources/css/bootstrap-theme.css" rel="stylesheet" media="screen"/>
	<link href="${contextPath}/resources/css/core.css" rel="stylesheet">
	<link href="${contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" media="screen" /> 
</head>

<body>
	<div class="container">
		
	</div>	
	<script type="text/javascript" src="${contextPath}/resources/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${contextPath}/resources/js/bootstrap.min.js"></script> 
    <script type="text/javascript" src="${contextPath}/resources/js/core.js"></script>
</body>
</html>