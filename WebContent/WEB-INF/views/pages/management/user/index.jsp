
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/user/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'USERS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'USER_ID' | translate}}</th>
				<th>{{'USER_NAME' | translate}}</th>
				<th>{{'USER_LOGIN' | translate}}</th>
				<th>{{'USER_EMAIL' | translate}}</th>
				<th>{{'USER_PROFILE' | translate}}</th>
				<th>{{'USER_ACTIVE' | translate}}</th>
				<th>{{'USER_DT_UPDATE' | translate}}</th>
				<th></th>
			</tr>

			<c:if test="${!empty usuarios}">
				<c:forEach items="${usuarios}" var="usuario">			
					<tr>
						<td><c:out value="${usuario.id}"/></td>
						<td><c:out value="${usuario.nome}"/></td>
						<td><c:out value="${usuario.login}"/></td>
						<td><c:out value="${usuario.email}"/></td>
						<td><c:out value="${usuario.idPerfil}"/></td>
						<td><c:out value="${usuario.ativo}"/></td>
						<td><c:out value="${usuario.dataAlteracao}"/></td>
						<td><a href="<c:url value='/management/user/edit'/>?id=${usuario.id}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/user/details'/>?id=${usuario.id}"><i class="fa fa-search" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/user/delete'/>?id=${usuario.id}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</div>




