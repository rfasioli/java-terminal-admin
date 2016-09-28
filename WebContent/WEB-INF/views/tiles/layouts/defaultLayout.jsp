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
<link rel="stylesheet" href="<c:url value='/webjars/font-awesome/4.6.3/css/font-awesome.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/webjars/angular-chart.js/0.7.1/angular-chart.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/css/AdminLTE.css' />"></link>
<link rel="stylesheet" href="<c:url value='/css/skins/_all-skins.min.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/css/skins/skin-orion.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/css/site.css'/>"></link>
<link rel="stylesheet" href="<c:url value='/css/orion-preloader.css'/>"></link>

</head>

<body class="hold-transition skin-orion sidebar-mini">

    <div class="preloader">
        <div class="preloader-wrap">
            <div class="preloader-inner">
                <center>
                    <img class="preloader-logo" src="<c:url value='/img/logo/Orion-Logo-Small.png'/>" alt="Orion">
                    <i class="fa fa-spinner fa-pulse fa-4x fa-fw" aria-hidden="true"></i>
                </center>
            </div>
        </div>
    </div><!--/.preloader-->


	<div class="wrapper">
		<header id="header">
			<tiles:insertAttribute name="header" />
		</header>

		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>

		<section id="site-content">
			<tiles:insertAttribute name="body" />
		</section>

		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>

		<!-- Control Sidebar -->
		<div class="control-sidebar-bg"></div>

		<script type="text/javascript" src="<c:url value='/webjars/jquery/2.2.4/jquery.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/webjars/angularjs/1.5.8/angular-resource.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/webjars/bootstrap/3.3.6/js/bootstrap.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/webjars/chartjs/2.1.3/Chart.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/webjars/angular-chart.js/0.7.1/angular-chart.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/app.js' />"></script>
		<script type="text/javascript" src="<c:url value='/js/preloader.js' />"></script>
	</div>
</body>
</html>
