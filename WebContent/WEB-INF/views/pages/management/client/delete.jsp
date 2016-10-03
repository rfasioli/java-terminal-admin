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
	<form action="<c:url value=''/>" method="POST" class="form-horizontal">
		<div class="box-header with-border">
			<input type="submit" value="{{'CONFIRM' | translate}}"
				class="btn btn-success btn-flat pull-right" />
			<h5>{{'CLIENT' | translate}} - {{'CLIENT_DELETE_MESSAGE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'CLIENTE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<label for="id" id="id">${client.id}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nomeFantasia">{{'CLIENT_FANTASY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<label for="nomeFantasia" id="nomeFantasia">${client.nomeFantasia}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="razaoSocial">{{'CLIENT_COMPANY_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<label for="razaoSocial" id="razaoSocial">${client.razaoSocial}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="cnpj">{{'CLIENT_DOCUMENT' | translate}}:</label>
					<div class="col-sm-10">
						<label for="cnpj" id="cnpj">${client.cnpj}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataCadastro">{{'CLIENT_DATE_INCLUSION' | translate}}:</label>
					<div class="col-sm-10">
						<label for="dataCadastro" id="dataCadastro">${client.dataCadastro}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ativo">{{'CLIENT_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<label for="ativo" id="ativo">${client.ativo}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="conexao">{{'CLIENT_CONNECTION' | translate}}:</label>
					<div class="col-sm-10">
						<label for="conexao" id="conexao">${client.conexao}</label>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>






