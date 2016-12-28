
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/client/address/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'CLIENT_ADRESSES' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<c:if test="${!empty cliente}">
			<label>{{'CLIENT' | translate}}</label>
			<label><c:out value="${cliente.nomeFantasia}"/></label>
		</c:if>
		<c:if test="${!empty clientes}">
			<form class="form-inline">
				<div class="form-group">
					<label>{{'CLIENT' | translate}}</label>
				    <select class="form-control" id="cliente" name="cliente" onclick="">
						<option value="-1" > -- {{"SELECT" | translate}} -- </option> 
						<c:forEach items="${clientes}" var="option">
							<option value="<c:out value="${option.idCliente}"></c:out>" ><c:out value='${option.dsNomeFantasia}'></c:out></option> 
						</c:forEach>
					</select>
				</div>
			</form>
		</c:if>
		

		<table id="adresses" class="table table-striped table-condensed ">
		  <thead>
			<tr>
				<th>{{'CLIENT' | translate}}</th>
				<th>{{'CLIENT_ADDRESS_TYPE' | translate}}</th>
				<th>{{'CLIENT_ADDRESS_PLACE' | translate}}</th>
				<th>{{'CLIENT_ADDRESS_CITY' | translate}}</th>
				<th></th>
			</tr>
		  </thead>
		  <tbody>
			<c:if test="${!empty clienteEnderecos}">
				<c:forEach items="${clienteEnderecos}" var="clEndereco">			
					<tr>
						<td><c:out value="${clEndereco.idCliente}"/></td>
						<td>
					      <c:forEach items="${tiposEndereco}" var="option">
					      	<c:if test="${clEndereco.tpEndereco == option.tpEndereco}">{{"<c:out value='${option.dsTipoEndereco}'></c:out>" | translate}}</c:if> 
						  </c:forEach>
						</td>
						<td><c:out value="${clEndereco.dsLogradouro}"/></td>
						<td><c:out value="${clEndereco.dsCidade}"/></td>
						<td><a href="<c:url value='/management/client/address/edit'/>?id=${profile.id}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/address/details'/>?id=${profile.id}"><i class="fa fa-search" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/address/delete'/>?id=${profile.id}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
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
    var table = $('#adresses').DataTable({
    	        "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
			    "language": { "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Portuguese-Brasil.json" }
    	    }); 
} );
</script>


