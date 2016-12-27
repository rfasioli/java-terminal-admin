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
<div class="box box-primary">
	<c:url value="#" var="theAction"/>
	<form:form action="${theAction}" method="POST" class="form-horizontal" modelAttribute="addressType">
		<div class="box-header with-border">
			<h5>{{'ADDRESS_TYPE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="tpEndereco">{{'ADDRESS_TYPE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="tpEndereco" id="tpEndereco"
							class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsTipoEndereco">{{'ADDRESS_TYPE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsTipoEndereco" id="dsTipoEndereco"
							class="form-control input-sm" readonly="true" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



