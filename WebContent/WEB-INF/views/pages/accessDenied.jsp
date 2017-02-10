<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section class="content-header">
	<h1>
		{{'ACCESS_DENIED' | translate}}
	</h1>
</section>
<section class="content">
    {{'ACCESS_DENIED_MSG1' | translate}} <strong>${user}</strong>, {{'ACCESS_DENIED_MSG2' | translate}}
    <a href="<c:url value="/logout" />">{{'ACCESS_DENIED_LOGOUT' | translate}}</a>
</section>