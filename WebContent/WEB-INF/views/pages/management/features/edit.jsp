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
<div class="box box-primary">
	<c:url value="#" var="theAction"/>
	<form:form action="${theAction}" method="POST" class="form-horizontal" modelAttribute="funcionalidade">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'FEATURE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="idFuncionalidade">{{'FEATURE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idFuncionalidade"
							class="form-control input-sm" readonly="true" />
						<form:errors path="idFuncionalidade" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsFuncionalidade">{{'FEATURE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsFuncionalidade"
							class="form-control input-sm" />
						<form:errors path="dsFuncionalidade" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsPrograma">{{'FEATURE_PROGRAM' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsPrograma"
							class="form-control input-sm" />
						<form:errors path="dsPrograma" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idFuncionalidadeAnterior">{{'FEATURE_PREVIOUS' | translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="idFuncionalidadeAnterior">							
							<form:option value="">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${funcAnteriores}" itemValue="idFuncionalidade" itemLabel="dsFuncionalidade" />
						</form:select>					     
						<form:errors path="idFuncionalidadeAnterior" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSequencia">{{'FEATURE_SEQUENCE' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idSequencia"
							class="form-control input-sm" />
						<form:errors path="idSequencia" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSistema">{{'FEATURE_SYSTEM' | translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="idSistema">							
							<form:option value="">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${sistemas}" itemValue="idSistema" itemLabel="dsSistema" />
						</form:select>					     
						<form:errors path="idSistema" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icAtivo">{{'FEATURE_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="icAtivo" />
						<form:errors path="icAtivo" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsPath">{{'FEATURE_PATH' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsPath"
							class="form-control input-sm" />
						<form:errors path="dsPath" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsIcone">{{'FEATURE_ICON' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsIcone"
							class="form-control input-sm" />
						<form:errors path="dsIcone" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



