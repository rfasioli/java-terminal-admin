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
					<label class="control-label col-sm-2" for="idUsuario">{{'USER_ID'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idUsuario" 
							class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsLogin">{{'USER_LOGIN'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsLogin" 
							class="form-control input-sm" />
						<form:errors path="dsLogin" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsEmail">{{'USER_EMAIL'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsEmail" 
							class="form-control input-sm" />
						<form:errors path="dsEmail" cssStyle="color: red;" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsSenha">{{'USER_PASSWORD'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="password" path="dsSenha" 
							class="form-control input-sm" />
						<form:errors path="dsSenha" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsNomeUsuario">{{'USER_NAME'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsNomeUsuario" 
							class="form-control input-sm" />
						<form:errors path="dsNomeUsuario" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dtCriacao">{{'USER_DT_CREATE'
						| translate}}:</label>
					<div class="col-sm-10" >
						<form:input type="date" path="dtCriacao" id="dataCriacao" value="${now}"
							class="datepicker form-control input-sm" readonly="true" />
						<form:errors path="dtCriacao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dtAlteracao">{{'USER_DT_UPDATE'
						| translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
						<form:input type="date" path="dtAlteracao" id="dataAlteracao"
							class="datepicker form-control input-sm" readonly="true" />
						<form:errors path="dtAlteracao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icAtivo">{{'USER_ACTIVE'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="icAtivo" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idPerfil">{{'USER_PROFILE'
						| translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="idPerfil">							
							<form:option value="-1">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${perfis}" itemValue="idPerfil" itemLabel="dsPerfil" />
						</form:select>					     
						<form:errors path="idPerfil" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
	
	<div class="row">
      <div class="container">
		<!-- Lista de terminais para o usuário -->
		  <div class="col-md-6 col-sm-12">
	        <div class="box box-primary">
	          <div class="box-header with-border">
	            <h3 class="box-title">{{'TERMINALS' | translate}}</h3>
	            <div class="box-tools pull-right">
	              <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
	              <!--<button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>-->
	            </div>
	          </div> <!-- box-header with-border -->
	          <div class="box-body">
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
				<hr>
				<button type="button" class="btn btn-default btn-flat"
					data-toggle="modal" data-target="#terminalModal">{{'ADD' |
					translate}}</button>
	          </div> <!-- /.box-body -->
	        </div> <!-- box box-primary" -->	  
	    </div>
		<!-- Lista de Clientes para o usuário -->
	    <div class="col-md-6 col-sm-12">
	        <div class="box box-primary">
	          <div class="box-header with-border">
	            <h3 class="box-title">{{'CLIENTS' | translate}}</h3>
	            <div class="box-tools pull-right">
	              <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
	              <!--<button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>-->
	            </div>
	          </div> <!-- box-header with-border -->
	          <div class="box-body">
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
							<td>{{cliente.idCliente}}</td>
							<td>{{cliente.dsNomeFantasia}}</td>
							<td><i class="fa fa-eraser" aria-hidden="true" 
								   ng-click="removeClient(cliente.idCliente);"></i></td>
						</tr>
					</tbody>
				</table>
				<hr>
				<button type="button" class="btn btn-default btn-flat"
					data-toggle="modal" data-target="#clientModal">{{'ADD' |
					translate}}</button>
	          </div> <!-- /.box-body -->
	        </div> <!-- box box-primary" -->
	  </div>  <!-- col-md-6 col-sm-12 -->
    </div>
  </div>

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
						<button id="btnAdd" type="button" class="btn btn-success btn-flat" data-dismiss="modal">
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
									<td id="idCliente">{{cliente.idCliente}}</td>
									<td id="dsRazaoSocial">{{cliente.dsNomeFantasia}}</td>
								</tr>
							</tbody>
						</table>
					</div>
				  </div>
				</div>
				<div class="modal-footer">
					<div class="panel-footer">
						<button id="btnAddClient" class="btn btn-success btn-flat" type="button">{{'ADD' | translate}}</button>
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
    	var obj = $('#terminais > tbody > tr.selected > #idTerminal');
    	var terminais = [];
       	for(var i = 0; i < obj.length; i++) {
       		terminais.push(obj[i].innerText);
        };
   		angular.element(document.getElementById('InitializeElement')).scope().addTerminals(terminais);
    });
    
    $('#btnAddClient').click( function () {
    	var obj = $('#clientes > tbody > tr.selected > #idCliente');
    	var clientes = [];
    	for(var i = 0; i < obj.length; i++) {
    		clientes.push(obj[i].innerText);
	    };
   		angular.element(document.getElementById('InitializeElement')).scope().addClients(clientes);
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

