<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h4>
	<a href="<c:url value='.'/>"> <span class="fa-stack"
		style="font-size: 0.7em;"> <i
			class="fa fa-circle-thin fa-stack-2x"></i> <i
			class="fa fa-reply fa-stack-1x"></i>
	</span>
	</a>&nbsp; {{'NEW' | translate}}
</h4>
<div class="box box-primary">
	<c:url var="post_url" value="/management/user/create" />
	<form:form method="POST" modelAttribute="usuario"
		class="form-horizontal" action="${post_url}">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}"
				class="btn btn-success btn-flat pull-right" />
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

</div>

<script>
  $("#dataCriacao").datepicker();
  $("#dataAlteracao").datepicker();
</script>

