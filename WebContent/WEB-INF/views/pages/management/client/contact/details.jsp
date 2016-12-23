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
	<c:url var="post_url" value="/management/client/contact/create" />
	<form:form method="POST" modelAttribute="clienteContato"
		class="form-horizontal" action="${post_url}">
		<div class="box-header with-border">
			<h5>{{'CLIENT_CONTACT' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">

				<c:if test="${!empty cliente}">
					<label class="control-label col-sm-2" for="idCliente">{{'CLIENT' |
						translate}}</label>
					<div class="col-sm-10">
						<input class="form-control input-sm" readonly="readonly"
							value="${cliente.nomeFantasia}" />
						<form:input type="hidden" path="idCliente" id="idCliente"
							class="form-control" readonly="true" />
					</div>
				</c:if>

				<div class="form-group">
					<label class="control-label col-sm-2" for="idSequencia">{{'CLIENT_CONTACT_SEQUENCE'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idSequencia" id="idSequencia"
							class="form-control input-sm" readonly="readonly" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="tipoContato">{{'CLIENT_CONTACT_TYPE'
						| translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="tipoContato" readonly="true">							
							<form:option value="-1">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${tiposContato}" itemValue="tipo" itemLabel="descricao" />
						</form:select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="descricao">{{'CLIENT_CONTACT_DESCRIPTION'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="descricao" id="descricao"
							class="form-control input-sm" readonly="true"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="observacao">{{'CLIENT_CONTACT_NOTE'
						| translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="observacao" id="observacao"
							class="form-control input-sm" readonly="true"/>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>


