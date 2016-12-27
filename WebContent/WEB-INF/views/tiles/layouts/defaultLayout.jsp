<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>

<head>
<%-- <base href="<c:url value='/'/>" > --%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>

<tiles:insertAttribute name="styles" />

<tiles:insertAttribute name="scripts" />

</head>

<body class="hold-transition skin-orion sidebar-mini" ng-app="app" ng-controller="translationCtrl" >

	<div class="preloader">
		<div class="preloader-wrap">
			<div class="preloader-inner">
				<img class="preloader-logo"	src="<c:url value='/img/logo/Orion-Logo-Small.png'/>" alt="Orion">
				<i class="fa fa-spinner fa-pulse fa-4x fa-fw" aria-hidden="true"></i>
			</div>
		</div>
	</div> <!--preloader-->

	<div class="wrapper">
		<header id="header">
			<tiles:insertAttribute name="header" />
		</header>

		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>

		<section id="site-content">
			<div class="container body-content content-wrapper">
				<tiles:insertAttribute name="body" />
			</div>
		</section>

		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>
		
		<!-- Control Sidebar -->
		<div class="control-sidebar-bg"></div>

	</div>
</body>
</html>
