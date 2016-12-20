<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:p="http://primefaces.org/ui">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="assets/css/bootstrap.min.css">

	<link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">
		<script src="assets/js/jquery-3.1.1.min.js"></script>
		<script src="assets/js/bootstrap.min.js"></script>
		<title>Modelo</title>
</head>
<body>
	<h1>Hello <span th:text="${name}"></span> from Thymeleaf!</h1>
</body>
</html>