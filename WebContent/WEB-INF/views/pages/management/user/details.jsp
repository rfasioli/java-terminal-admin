<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h4>
	<a href="<c:url value='.'/>"> <span class="fa-stack"
		style="font-size: 0.7em;"> <i
			class="fa fa-circle-thin fa-stack-2x"></i> <i
			class="fa fa-reply fa-stack-1x"></i>
	</span>
	</a>&nbsp; {{'DETAILS' | translate}}
</h4>
<div class="box box-primary" ng-controller="ngUserInitialize" id="InitializeElement">
	<c:url var="post_url" value="/management/user/details" />
	<form:form method="POST" modelAttribute="usuario" class="form-horizontal" action="${post_url}" >
		<div class="box-header with-border">
			<h5>{{'USER' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="id">{{'USER_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="id" id="id" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="login">{{'USER_LOGIN' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="login" id="login" class="form-control input-sm" readonly="true"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'USER_EMAIL' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="email" id="email" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="senha">{{'USER_PASSWORD' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="password" path="senha" id="senha" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nome">{{'USER_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="nome" id="nome" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataCriacao">{{'USER_DT_CREATE' | translate}}:</label>
					<div class="col-sm-10">
					  <form:input type="date" path="dataCriacao" id="dataCriacao" class="datepicker form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataAlteracao">{{'USER_DT_UPDATE' | translate}}:</label>
					<div class="col-sm-10">
					  <form:input type="date" path="dataAlteracao" id="dataAlteracao" class="datepicker form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ativo">{{'USER_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="ativo" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idPerfil">{{'USER_PROFILE' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="idPerfil" name="idPerfil" readonly="true" >
					      <c:forEach items="${perfis}" var="option">
					      	<option value="<c:out value="${option.id}"></c:out>" <c:if test="${usuario.idPerfil == option.id}">selected</c:if>>{{"<c:out value='${option.descricao}'></c:out>" | translate}}</option> 
						  </c:forEach>
					    </select>
						<form:errors path="idPerfil" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>

	<div class="row">
	  <div class="col-md-6 col-sm-12">
		<!-- Lista de terminais para o usuário -->
		<div class="container">
			<div class="panel panel-info">
				<div class="panel-heading">
					{{'TERMINALS' | translate}} 
					<button class="pull-right btn btn-box-tool" data-toggle="collapse" href="#terminals_panel">
					  <i class="fa fa-window-minimize" aria-hidden="true"></i></button>
				</div>
				<div class="panel-collapse collapse in" id="terminals_panel">
					<div class="panel-body">
						<table class="table table-striped table-condensed "
							ng-controller="listaTerminaisCtrl">
							<thead>
								<tr>
									<th class="hide">{{'ID' | translate}}</th>
									<th>{{'NR_TERMINAL' | translate}}</th>
									<th>{{'DS_TERMINAL' | translate}}</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="terminal in terminais">
									<td class="hide">{{terminal.idTerminal}}</td>
									<td>{{terminal.nrTerminal}}</td>
									<td>{{terminal.dsTerminal}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	
	  </div>
	  <div class="col-md-6 col-sm-12">

		<!-- Lista de Clientes para o usuário -->
		<div class="container">
			<div class="panel panel-info">
				<div class="panel-heading">
					{{'CLIENTS' | translate}} 
					<button class="pull-right btn btn-box-tool" data-toggle="collapse" href="clients_panel">
					  <i class="fa fa-window-minimize" aria-hidden="true"></i></button>
				</div>
				<div class="panel-collapse collapse in" id="clients_panel">
					<div class="panel-body">
						<table class="table table-striped table-condensed "
							ng-controller="listaClientesCtrl">
							<thead>
								<tr>
									<th>{{'CLIENT_ID' | translate}}</th>
									<th>{{'CLIENT_FANTASY_NAME' | translate}}</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="cliente in clientes">
									<td>{{cliente.id}}</td>
									<td>{{cliente.nomeFantasia}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

	  </div>
  </div> <!-- col-md-6 col-sm-12 -->

</div>

<script type="text/javascript" src="<c:url value='/js/controller/user.js' />"></script>

