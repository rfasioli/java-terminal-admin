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
	<c:url var="post_url" value="/management/client/create" />	
	<form:form method="POST" modelAttribute="client" class="form-horizontal" action="${post_url}">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'CLIENT' | translate}}</h5>
		</div>
		<form:errors path="*" cssClass="errorblock" element="div" />
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsNomeFantasia">{{'CLIENT_FANTASY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsNomeFantasia" id="dsNomeFantasia"  class="form-control input-sm"/>
						<form:errors path="dsNomeFantasia" cssStyle="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsRazaoSocial">{{'CLIENT_COMPANY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsRazaoSocial" id="dsRazaoSocial"  class="form-control input-sm"/>
						<form:errors path="dsRazaoSocial" cssStyle="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsCnpj">{{'CLIENT_DOCUMENT' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsCnpj" id="dsCnpj" class="form-control input-sm"/>
						<form:errors path="dsCnpj" cssStyle="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dtCadastro">{{'CLIENT_DATE_INCLUSION' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <%-- <input class="datepicker" type="date" name="dataCadastro" value="${myDate}" id="dataCadastro" readonly /> --%>
					  <form:input type="datepicker" path="dtCadastro" id="dataCadastro" class="form-control input-sm"/>
					  <form:errors path="dtCadastro" cssStyle="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icAtivo">{{'CLIENT_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="icAtivo" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsConexao">{{'CLIENT_CONNECTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsConexao" id="dsConexao" class="form-control input-sm"/>
						<form:errors path="dsConexao" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>

<script>
	$("#dataCadastro").datepicker({dateFormat: 'dd/mm/yy'});
</script>


