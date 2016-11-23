<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>

<link rel="stylesheet" href="<c:url value='/webjars/bootstrap/3.3.6/css/bootstrap.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/webjars/jquery-ui/1.9.2/css/smoothness/jquery-ui-1.9.2.custom.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/webjars/font-awesome/4.6.3/css/font-awesome.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/webjars/ionicons/2.0.1/css/ionicons.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/webjars/angular-material/1.1.1/angular-material.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/css/AdminLTE.css' />"></link>
<link rel="stylesheet" href="<c:url value='/css/skins/_all-skins.min.css'/>"></link>

<tiles:insertAttribute name="styles" />

<script type="text/javascript" src="<c:url value='/webjars/jquery/2.2.4/jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/jquery-ui/1.9.2/js/jquery-ui-1.9.2.custom.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-resource.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-animate.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-aria.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-messages.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angular-translate/2.5.0/angular-translate.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-sanitize.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/angular-material/1.1.1/angular-material.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/webjars/bootstrap/3.3.6/js/bootstrap.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/app.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/preloader.js' />"></script>

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
