
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/client/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'CLIENTS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="clients" class="table table-striped table-condensed ">
			<thead>
				<tr>
					<th>{{'CLIENT_ID' | translate}}</th>
					<th>{{'CLIENT_FANTASY_NAME' | translate}}</th>
					<th>{{'CLIENT_COMPANY_NAME' | translate}}</th>
					<th>{{'CLIENT_DOCUMENT' | translate}}</th>
					<th>{{'CLIENT_ACTIVE' | translate}}</th>
					<th>{{'CLIENT_DATE_INCLUSION' | translate}}</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty clients}">
					<c:forEach items="${clients}" var="client">			
						<tr>
							<td><c:out value="${client.idCliente}"/></td>
							<td><c:out value="${client.dsNomeFantasia}"/></td>
							<td><c:out value="${client.dsRazaoSocial}"/></td>
							<td><c:out value="${client.dsCnpj}"/></td>
							<td><c:out value="${client.icAtivo}"/></td>
							<td><fmt:formatDate value="${client.dtCadastro}" pattern="dd/MM/yyyy"/></td>
							<td><a href="<c:url value='/management/client/edit'/>?id=${client.idCliente}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/client/details'/>?id=${client.idCliente}"><i class="fa fa-search" aria-hidden="true"></i></a>
							  | <a href="<c:url value='/management/client/delete'/>?id=${client.idCliente}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
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
    var table = $('#clients').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>

