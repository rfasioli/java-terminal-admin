
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<a href="#" class="btn btn-primary btn-flat pull-right"> <i class="fa fa-plus" aria-hidden="true"></i> {{'NEW' | translate}}</a>
		<h4 class="box-title">{{'CLIENTS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table class="table table-striped table-condensed ">
			<tr>
				<th>{{'CLIENT_ID' | translate}}</th>
				<th>{{'CLIENT_FANTASY_NAME' | translate}}</th>
				<th>{{'CLIENT_DOCUMENT' | translate}}</th>
				<th>{{'CLIENT_CITY' | translate}}</th>
				<th>{{'CLIENT_STATE' | translate}}</th>
				<th>{{'CLIENT_ACTIVE' | translate}}</th>
				<th>{{'CLIENT_DATE_INCLUSION' | translate}}</th>
				<th></th>
			</tr>

			<tr>
				<td>1</td>
				<td>Cliente 1</td>
				<td>1912723530001-99</td>
				<td>São Paulo</td>
				<td>SP</td>
				<td>True</td>
				<td>10/10/2016</td>
				<td><a href="@Url.Action(" Edit", new { id=item.idCliente})"><i class="fa fa-pencil" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Details", new { id=item.idCliente})"><i class="fa fa-search" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Delete", new { id=item.idCliente})"><i class="fa fa-eraser" aria-hidden="true"></i></a>
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Cliente 1</td>
				<td>1912723530001-99</td>
				<td>São Paulo</td>
				<td>SP</td>
				<td>True</td>
				<td>10/10/2016</td>
				<td><a href="@Url.Action(" Edit", new { id=item.idCliente})"><i class="fa fa-pencil" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Details", new { id=item.idCliente})"><i class="fa fa-search" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Delete", new { id=item.idCliente})"><i class="fa fa-eraser" aria-hidden="true"></i></a>
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Cliente 1</td>
				<td>1912723530001-99</td>
				<td>São Paulo</td>
				<td>SP</td>
				<td>True</td>
				<td>10/10/2016</td>
				<td><a href="@Url.Action(" Edit", new { id=item.idCliente})"><i class="fa fa-pencil" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Details", new { id=item.idCliente})"><i class="fa fa-search" aria-hidden="true"></i></a>
				  | <a href="@Url.Action(" Delete", new { id=item.idCliente})"><i class="fa fa-eraser" aria-hidden="true"></i></a>
				</td>
			</tr>

		</table>
	</div>
</div>




