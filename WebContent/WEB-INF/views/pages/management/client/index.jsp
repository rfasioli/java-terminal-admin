
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/client/create' />" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'CLIENTS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'CLIENT_ID' | translate}}</th>
				<th>{{'CLIENT_FANTASY_NAME' | translate}}</th>
				<th>{{'CLIENT_COMPANY_NAME' | translate}}</th>
				<th>{{'CLIENT_DOCUMENT' | translate}}</th>
				<th>{{'CLIENT_ACTIVE' | translate}}</th>
				<th>{{'CLIENT_DATE_INCLUSION' | translate}}</th>
				<th></th>
			</tr>

			<c:if test="${!empty clients}">
				<c:forEach items="${clients}" var="client">			
					<tr>
						<td><c:out value="${client.idCliente}"/></td>
						<td><c:out value="${client.dsNomeFantasia}"/></td>
						<td><c:out value="${client.dsRazaoSocial}"/></td>
						<td><c:out value="${client.dsCnpj}"/></td>
						<td><c:out value="${client.icAtivo}"/></td>
						<td><c:out value="${client.dtCadastro}"/></td>
						<td><a href="<c:url value='/management/client/edit'/>?id=${client.idCliente}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/details'/>?id=${client.idCliente}"><i class="fa fa-search" aria-hidden="true"></i></a>
						  | <a href="<c:url value='/management/client/delete'/>?id=${client.idCliente}"><i class="fa fa-eraser" aria-hidden="true"></i></a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</div>




