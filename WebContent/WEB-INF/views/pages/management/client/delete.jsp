<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h4>
	<a href="<c:url value='.'/>"> <span class="fa-stack"
		style="font-size: 0.7em;"> <i
			class="fa fa-circle-thin fa-stack-2x"></i> <i
			class="fa fa-reply fa-stack-1x"></i>
	</span>
	</a>&nbsp; {{'DELETE' | translate}}
</h4>
<div class="box box-primary">
	<c:url var="post_url" value="/management/client/delete" />	
	<form:form method="POST" modelAttribute="client" class="form-horizontal" action="${post_url}">
		<div class="box-header with-border">
			<input type="submit" value="{{'CONFIRM' | translate}}"
				class="btn btn-success btn-flat pull-right" />
			<h5>{{'CLIENT' | translate}} - {{'CLIENT_DELETE_MESSAGE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="idCliente">{{'CLIENT_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idCliente" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsNomeFantasia">{{'CLIENT_FANTASY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsNomeFantasia" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsRazaoSocial">{{'CLIENT_COMPANY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsRazaoSocial" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsCnpj">{{'CLIENT_DOCUMENT' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsCnpj" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dtCadastro">{{'CLIENT_DATE_INCLUSION' | translate}}:</label>
					<div class="col-sm-10">
					  <form:input type="datepicker" path="dtCadastro" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icAtivo">{{'CLIENT_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="icAtivo" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsConexao">{{'CLIENT_CONNECTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsConexao" class="form-control input-sm" readonly="true" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>






