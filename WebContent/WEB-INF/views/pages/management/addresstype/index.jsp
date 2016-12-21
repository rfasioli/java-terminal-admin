
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
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'ADDRESS_TYPE_ID' | translate}}</th>
				<th>{{'ADDRESS_TYPE_DESCRIPTION' | translate}}</th>
				<th></th>
			</tr>

			<c:if test="${!empty addressTypes}">
				<c:forEach items="${addressTypes}" var="addressType">
					<tr>
						<td><c:out value="${addressType.tipo}" /></td>
						<td><c:out value="${addressType.descricao}" /></td>
						<td><a
							href="<c:url value='/management/addresstype/edit'/>?type=${addressType.tipo}"><i
								class="fa fa-pencil" aria-hidden="true"></i></a> | <a
							href="<c:url value='/management/addresstype/details'/>?type=${addressType.tipo}"><i
								class="fa fa-search" aria-hidden="true"></i></a> | <a
							href="<c:url value='/management/addresstype/delete'/>?type=${addressType.tipo}"><i
								class="fa fa-eraser" aria-hidden="true"></i></a></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</div>




