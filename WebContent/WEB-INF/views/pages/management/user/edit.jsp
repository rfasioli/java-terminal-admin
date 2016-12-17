<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h4>
	<a href="<c:url value='.'/>"> <span class="fa-stack"
		style="font-size: 0.7em;"> <i
			class="fa fa-circle-thin fa-stack-2x"></i> <i
			class="fa fa-reply fa-stack-1x"></i>
	</span>
	</a>&nbsp; {{'EDIT' | translate}}
</h4>
<div class="box box-primary" ng-controller="ngUserInitialize" id="InitializeElement">
	<c:url var="post_url" value="/management/user/edit" />
	<form:form method="POST" modelAttribute="usuario" class="form-horizontal" action="${post_url}" >
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
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
						<form:input type="text" path="login" id="login" class="form-control input-sm"/>
						<form:errors path="login" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'USER_EMAIL' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="email" id="email" class="form-control input-sm"/>
						<form:errors path="email" cssStyle="color: red;" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="senha">{{'USER_PASSWORD' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="password" path="senha" id="senha" class="form-control input-sm"/>
						<form:errors path="senha" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nome">{{'USER_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="nome" id="nome" class="form-control input-sm"/>
						<form:errors path="nome" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataCriacao">{{'USER_DT_CREATE' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <form:input type="date" path="dataCriacao" id="dataCriacao" class="datepicker form-control input-sm" readonly="true" />
					  <form:errors path="dataCriacao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataAlteracao">{{'USER_DT_UPDATE' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <form:input type="date" path="dataAlteracao" id="dataAlteracao" class="datepicker form-control input-sm" readonly="true" />
					  <form:errors path="dataAlteracao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ativo">{{'USER_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="ativo" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idPerfil">{{'USER_PROFILE' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="idPerfil" name="idPerfil">
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
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="terminal in terminais">
									<td class="hide">{{terminal.idTerminal}}</td>
									<td>{{terminal.nrTerminal}}</td>
									<td>{{terminal.dsTerminal}}</td>
									
									<td><i class="fa fa-eraser" aria-hidden="true" 
										   ng-click="removeTerminal(terminal.idTerminal);"></i></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-footer">
						<button type="button" class="btn btn-info"
							data-toggle="modal" data-target="#terminalModal">{{'ADD' |
							translate}}</button>
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
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="cliente in clientes">
									<td>{{cliente.id}}</td>
									<td>{{cliente.nomeFantasia}}</td>
									<td><i class="fa fa-eraser" aria-hidden="true" 
										   ng-click="removeClient(cliente.id);"></i></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-footer">
						<button type="button" class="btn btn-info"
							data-toggle="modal" data-target="#clientModal">{{'ADD' |
							translate}}</button>
					</div>
				</div>
			</div>
		</div>

	  </div>
  </div> <!-- col-md-6 col-sm-12 -->

	<!-- Modal inclusão de terminais -->
	<div id="terminalModal" class="modal fade" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<i class="fa fa-window-close" aria-hidden="true"></i>
					</button>
					<h4 class="modal-title">{{'AVAILABLE_TERMINALS' | translate}}</h4>
				</div>
				<div class="modal-body">
				  <div ng-controller="listaTerminaisDisponiveisCtrl">
					<div ng-controller="RowClickEventCtrl as cnf">
						<table id="terminais" class="table table-striped table-condensed "
							datatable="ng" dt-options="cnf.dtOptions" width="100%">
							<thead>
								<tr>
									<th class='hide'>{{'TERMINAL_ID' | translate}}</th>
									<th>{{'NR_TERMINAL' | translate}}</th>
									<th>{{'DS_TERMINAL' | translate}}</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="terminal in disponiveis">
									<td id="idTerminal" class='hide'>{{terminal.idTerminal}}</td>
									<td id="nrTerminal">{{terminal.nrTerminal}}</td>
									<td id="dsTerminal">{{terminal.dsTerminal}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				  </div>
				</div>
				<div class="modal-footer">
					<div class="panel-footer">
						<button id="btnAdd" type="button" class="close" data-dismiss="modal">
							{{'ADD' | translate}}</button>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Modal inclusão de clientes -->
	<div id="clientModal" class="modal fade" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<i class="fa fa-window-close" aria-hidden="true"></i>
					</button>
					<h4 class="modal-title">{{'AVAILABLE_CLIENTS' | translate}}</h4>
				</div>
				<div class="modal-body">
				  <div ng-controller="listaClientesDisponiveisCtrl">
					<div ng-controller="ClientRowClickEventCtrl as cnfCli">
						<table id="clientes" class="table table-striped table-condensed "
							datatable="ng" dt-options="cnfCli.dtOptions" width="100%">
							<thead>
								<tr>
									<th>{{'CLIENT_ID' | translate}}</th>
									<th>{{'CLIENT_FANTASY_NAME' | translate}}</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="cliente in clientesdisponiveis">
									<td id="idCliente">{{cliente.id}}</td>
									<td id="dsRazaoSocial">{{cliente.nomeFantasia}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				  </div>
				</div>
				<div class="modal-footer">
					<div class="panel-footer">
						<button id="btnAddClient" type="button">{{'ADD' | translate}}</button>
					</div>
				</div>

			</div>
		</div>
	</div>

</div>

<script>
  $("#dataCriacao").datepicker();
  $("#dataAlteracao").datepicker();

  $(document).ready(function() {
    $('#btnAdd').click( function () {
    	$('#terminais > tbody > tr.selected > #idTerminal')
    	.each(function(index, elem) {
        	angular.element(document.getElementById('InitializeElement')).scope().addTerminal(elem.innerText);
        });
        
    });
    $('#btnAddClient').click( function () {
    	$('#clientes > tbody > tr.selected > #idCliente')
    	.each(function(index, elem) {
        	angular.element(document.getElementById('InitializeElement')).scope().addClient(elem.innerText);
        });  
    });
  });

  //Controles Terminais
  app.controller('ngDtTblConfig', ngDtTblConfig)
     .controller('RowClickEventCtrl', RowClickEventCtrl);

  function ngDtTblConfig ($scope, DTOptionsBuilder) {
	  var vm = this;
	  vm.dtOptions = DTOptionsBuilder.newOptions().withDisplayLength(10);
  };

  function RowClickEventCtrl($scope, DTOptionsBuilder, DTColumnBuilder) {
     var vm = this;
     vm.someClickHandler = someClickHandler;
     vm.dtOptions = DTOptionsBuilder.newOptions()
         .withOption('rowCallback', rowCallback);
     
     function someClickHandler(info, nRow) {
         $(nRow).toggleClass('selected');
     }
     function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
         $('td', nRow).unbind('click');
         $('td', nRow).bind('click', function() {
             $scope.$apply(function() {
                 vm.someClickHandler(aData, nRow);
             });
         });
         
         return nRow;
     } 
  }
 
  //Controles Cliente
  app.controller('ngClientDtTblConfig', ngClientDtTblConfig)
     .controller('ClientRowClickEventCtrl', ClientRowClickEventCtrl);

  function ngClientDtTblConfig ($scope, DTOptionsBuilder) {
	  var vm = this;
	  vm.dtOptions = DTOptionsBuilder.newOptions().withDisplayLength(5);
  };

  function ClientRowClickEventCtrl($scope, DTOptionsBuilder, DTColumnBuilder) {
     var vm = this;
     vm.someClickHandler = someClickHandler;
     vm.dtOptions = DTOptionsBuilder.newOptions()
         .withOption('rowCallback', rowCallback);
     
     function someClickHandler(info, nRow) {
         $(nRow).toggleClass('selected');
     }
     function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
         $('td', nRow).unbind('click');
         $('td', nRow).bind('click', function() {
             $scope.$apply(function() {
                 vm.someClickHandler(aData, nRow);
             });
         });
         
         return nRow;
     } 
  }
</script>

<script type="text/javascript" src="<c:url value='/js/controller/user.js' />"></script>

