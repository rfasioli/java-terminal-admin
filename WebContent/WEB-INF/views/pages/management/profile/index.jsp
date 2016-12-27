
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/profile/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'PROFILE' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="profiles" class="table table-striped table-condensed ">
			<thead>
				<tr>
					<th>{{'PROFILE_ID' | translate}}</th>
					<th>{{'PROFILE_DESCRIPTION' | translate}}</th>
					<th>{{'PROFILE_TYPE' | translate}}</th>
					<th>{{'PROFILE_LEVEL' | translate}}</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty profiles}">
					<c:forEach items="${profiles}" var="profile">			
						<tr>
							<td><c:out value="${profile.idPerfil}"/></td>
							<td><c:out value="${profile.dsPerfil}"/></td>
							<td>
						      <c:forEach items="${profileTypes}" var="option">
						      	<c:if test="${profile.tpPerfil == option.valor}"><c:out value='${option.tag}'></c:out></c:if> 
							  </c:forEach>
							</td>
							<td>
						      <c:forEach items="${profileLevels}" var="option">
						      	<c:if test="${profile.icNivel == option.valor}"><c:out value='${option.tag}'></c:out></c:if> 
							  </c:forEach>
							</td>						
							<td><a href="<c:url value='/management/profile/edit'/>?id=${profile.idPerfil}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/profile/details'/>?id=${profile.idPerfil}"><i class="fa fa-search" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/profile/delete'/>?id=${profile.idPerfil}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
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
    var table = $('#profiles').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>


