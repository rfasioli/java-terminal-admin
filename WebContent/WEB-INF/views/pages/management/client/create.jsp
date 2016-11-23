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
	<!-- 
	<form action="<c:url value=''/>" method="POST" class="form-horizontal">
	-->
	<form:form method="POST" modelAttribute="client" class="form-horizontal">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'CLIENT' | translate}}</h5>
		</div>
		<form:errors path="*" cssClass="errorblock" element="div" />
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="nomeFantasia">{{'CLIENT_FANTASY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<!--
						<input type="text" name="nomeFantasia" value="${client.nomeFantasia}" id="nomeFantasia" />
						-->
						<form:input type="text" path="nomeFantasia" id="nomeFantasia"  class="form-control input-sm"/>
						<form:errors path="nomeFantasia" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="razaoSocial">{{'CLIENT_COMPANY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="razaoSocial" value="${client.razaoSocial}" id="razaoSocial" />
						<form:errors path="razaoSocial" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="cnpj">{{'CLIENT_DOCUMENT' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="cnpj" value="${client.cnpj}" id="cnpj" />
						<form:errors path="cnpj" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataCadastro">{{'CLIENT_DATE_INCLUSION' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <input class="datepicker" type="date" name="dataCadastro" value="${myDate}" id="dataCadastro" readonly />
					  <form:errors path="dataCadastro" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ativo">{{'CLIENT_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="client.ativo" />
						<!-- <input type="checkbox" name="ativo" value="${client.ativo}" id="ativo" />  -->
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="conexao">{{'CLIENT_CONNECTION' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="conexao" value="${client.conexao}" id="conexao" />
						<form:errors path="conexao" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>

<script>
	$("#dataCadastro").datepicker();
</script>


