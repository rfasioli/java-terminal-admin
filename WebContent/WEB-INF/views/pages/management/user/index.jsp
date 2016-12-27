
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/user/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'USERS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="users" class="table table-striped table-condensed ">
			<thead>
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
			</thead>
			<tbody>
				<c:if test="${!empty usuarios}">
					<c:forEach items="${usuarios}" var="usuario">			
						<tr>
							<td><c:out value="${usuario.idUsuario}"/></td>
							<td><c:out value="${usuario.dsNomeUsuario}"/></td>
							<td><c:out value="${usuario.dsLogin}"/></td>
							<td><c:out value="${usuario.dsEmail}"/></td>
							<td>
								<%-- <c:out value="${usuario.idPerfil}"/> --%>
								<c:forEach items="${perfis}" var="perfil">
					      			<c:if test="${usuario.idPerfil == perfil.idPerfil}">
					      				<c:out value='${perfil.dsPerfil}'></c:out>
									</c:if> 
							  	</c:forEach>
							</td>
							<td><c:out value="${usuario.icAtivo}"/></td>
							<td><fmt:formatDate value="${usuario.dtAlteracao}" pattern="dd/MM/yyyy"/></td>							
							<td><a href="<c:url value='/management/user/edit'/>?id=${usuario.idUsuario}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/user/details'/>?id=${usuario.idUsuario}"><i class="fa fa-search" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/user/delete'/>?id=${usuario.idUsuario}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
							</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
</div>


<script>
$(document).ready(function() {
    var table = $('#users').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>


