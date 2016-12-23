
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/client/contact/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'CLIENT_CONTACTS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<c:if test="${!empty cliente}">
			<label class="control-label col-sm-2">{{'CLIENT' | translate}}</label>
			<label class="col-sm-10"><c:out value="${cliente.nomeFantasia}"/></label>
		</c:if>
		<c:if test="${!empty clientes}">
			<form class="form-inline">
				<div class="form-group">
					<label>{{'CLIENT' | translate}}</label>
				    <select class="form-control" id="cliente" name="cliente" onclick="">
						<option value="-1" > -- {{"SELECT" | translate}} -- </option> 
						<c:forEach items="${clientes}" var="option">
							<option value="<c:out value="${option.id}"></c:out>" ><c:out value='${option.nomeFantasia}'></c:out></option> 
						</c:forEach>
					</select>
				</div>
			</form>
		</c:if>
		

		<table class="table table-striped table-condensed ">
		  <thead>
			<tr>
				<th>{{'CLIENT' | translate}}</th>
				<th>{{'CLIENT_CONTACT_TYPE' | translate}}</th>
				<th>{{'CLIENT_CONTACT_DESCRIPTION' | translate}}</th>
				<th></th>
			</tr>
		  </thead>
		  <tbody>
			<c:if test="${!empty clienteContatos}">
				<c:forEach items="${clienteContatos}" var="clContato">			
					<tr>
						<td><c:out value="${clContato.idCliente}"/></td>
						<td>
					      <c:forEach items="${tiposContato}" var="option">
					      	<c:if test="${clContato.tipoContato == option.tipo}">{{"<c:out value='${option.descricao}'></c:out>" | translate}}</c:if> 
						  </c:forEach>
						</td>
						<td><c:out value="${clContato.descricao}"/></td>
						<td><a href="<c:url value='/management/client/contact/edit'/>?idCliente=${clContato.idCliente}&idSequencia=${clContato.idSequencia}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/contact/details'/>?idCliente=${clContato.idCliente}&idSequencia=${clContato.idSequencia}"><i class="fa fa-search" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/contact/delete'/>?idCliente=${clContato.idCliente}&idSequencia=${clContato.idSequencia}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		  </tbody>
		</table>
	</div>
</div>




