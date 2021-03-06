
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/addresstype/create' />"
			class="btn btn-primary btn-flat pull-right"> <i
			class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}
		</a>
		<h4 class="box-title">{{'ADDRESS_TYPE' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="addresstypes" class="table table-striped table-condensed ">
			<thead>
				<tr>
					<th>{{'ADDRESS_TYPE_ID' | translate}}</th>
					<th>{{'ADDRESS_TYPE_DESCRIPTION' | translate}}</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty addressTypes}">
					<c:forEach items="${addressTypes}" var="addressType">
						<tr>
							<td><c:out value="${addressType.tpEndereco}" /></td>
							<td><c:out value="${addressType.dsTipoEndereco}" /></td>
							<td><a
								href="<c:url value='/management/addresstype/edit'/>?type=${addressType.tpEndereco}"><i
									class="fa fa-pencil" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/addresstype/details'/>?type=${addressType.tpEndereco}"><i
									class="fa fa-search" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/addresstype/delete'/>?type=${addressType.tpEndereco}"><i
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
    var table = $('#addresstypes').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>


