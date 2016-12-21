
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="<c:url value='/management/contacttype/create' />"
			class="btn btn-primary btn-flat pull-right"> <i
			class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}
		</a>
		<h4 class="box-title">{{'CONTACT_TYPE' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'CONTACT_TYPE_ID' | translate}}</th>
				<th>{{'CONTACT_TYPE_DESCRIPTION' | translate}}</th>
				<th></th>
			</tr>

			<c:if test="${!empty contactTypes}">
				<c:forEach items="${contactTypes}" var="contactType">
					<tr>
						<td><c:out value="${contactType.tipo}" /></td>
						<td><c:out value="${contactType.descricao}" /></td>
						<td><a
							href="<c:url value='/management/contacttype/edit'/>?type=${contactType.tipo}"><i
								class="fa fa-pencil" aria-hidden="true"></i></a> | <a
							href="<c:url value='/management/contacttype/details'/>?type=${contactType.tipo}"><i
								class="fa fa-search" aria-hidden="true"></i></a> | <a
							href="<c:url value='/management/contacttype/delete'/>?type=${contactType.tipo}"><i
								class="fa fa-eraser" aria-hidden="true"></i></a></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</div>




