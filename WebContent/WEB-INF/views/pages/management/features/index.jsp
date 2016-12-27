
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/features/create' />"
			class="btn btn-primary btn-flat pull-right"> <i
			class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}
		</a>
		<h4 class="box-title">{{'FEATURES' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="contacttypes" class="table table-striped table-condensed ">
			<thead>
				<tr>
					<th>{{'FEATURE_ID' | translate}}</th>
					<th>{{'FEATURE_DESCRIPTION' | translate}}</th>
					<th>{{'FEATURE_PREVIOUS' | translate}}</th>
					<th>{{'FEATURE_SYSTEM' | translate}}</th>
					<th>{{'FEATURE_ACTIVE' | translate}}</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty funcionalidades}">
					<c:forEach items="${funcionalidades}" var="funcionalidade">
						<tr>
							<td><c:out value="${funcionalidade.idFuncionalidade}" /></td>
							<td><c:out value="${funcionalidade.dsFuncionalidade}" /></td>
							<td>
						      <c:forEach items="${funcAnteriores}" var="option">
						      	<c:if test="${funcionalidade.idFuncionalidadeAnterior == option.idFuncionalidade}"><c:out value='${option.dsFuncionalidade}'></c:out></c:if> 
							  </c:forEach>
							</td>
							<td>
						      <c:forEach items="${sistemas}" var="option">
						      	<c:if test="${funcionalidade.idSistema == option.idSistema}"><c:out value='${option.dsSistema}'></c:out></c:if> 
							  </c:forEach>
							</td>
							<td><c:out value="${funcionalidade.icAtivo}" /></td>
							<td><a
								href="<c:url value='/management/features/edit'/>?id=${funcionalidade.idFuncionalidade}"><i
									class="fa fa-pencil" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/features/details'/>?id=${funcionalidade.idFuncionalidade}"><i
									class="fa fa-search" aria-hidden="true"></i></a> | <a
								href="<c:url value='/management/features/delete'/>?id=${funcionalidade.idFuncionalidade}"><i
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



