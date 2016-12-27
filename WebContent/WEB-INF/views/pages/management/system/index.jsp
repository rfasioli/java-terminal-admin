
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/system/create' />"
			class="btn btn-primary btn-flat pull-right"> <i
			class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}
		</a>
		<h4 class="box-title">{{'SYSTEM' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="contacttypes" class="table table-striped table-condensed ">
			<thead>
				<tr>
					<th>{{'SYSTEM_ID' | translate}}</th>
					<th>{{'SYSTEM_DESCRIPTION' | translate}}</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty sistemas}">
					<c:forEach items="${sistemas}" var="sistema">
						<tr>
							<td><c:out value="${sistema.idSistema}" /></td>
							<td><c:out value="${sistema.dsSistema}" /></td>
							<td><a
								href="<c:url value='/management/system/edit'/>?idSistema=${sistema.idSistema}"><i
									class="fa fa-pencil" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/system/details'/>?idSistema=${sistema.idSistema}"><i
									class="fa fa-search" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/system/delete'/>?idSistema=${sistema.idSistema}"><i
									class="fa fa-eraser" aria-hidden="true"></i></a></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
</div>

<script>
$(document).ready(function() {
    var table = $('#contacttypes').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>



