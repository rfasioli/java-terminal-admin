
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/profile/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'PROFILE' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'PROFILE_ID' | translate}}</th>
				<th>{{'PROFILE_DESCRIPTION' | translate}}</th>
				<th>{{'PROFILE_TYPE' | translate}}</th>
				<th>{{'PROFILE_LEVEL' | translate}}</th>
				<th>{{'PROFILE_ACCESS' | translate}}</th>
				<th></th>
			</tr>

			<c:if test="${!empty profiles}">
				<c:forEach items="${profiles}" var="profile">			
					<tr>
						<td><c:out value="${profile.id}"/></td>
						<td><c:out value="${profile.descricao}"/></td>
						<td><c:out value="${profile.tipo}"/></td>
						<td><c:out value="${profile.nivel}"/></td>
						<td><c:out value="${profile.acesso}"/></td>
						<td><a href="<c:url value='/management/profile/edit'/>?id=${profile.id}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/profile/details'/>?id=${profile.id}"><i class="fa fa-search" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/profile/delete'/>?id=${profile.id}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</div>




