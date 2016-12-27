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
	<form:form action="${theAction}" method="POST" class="form-horizontal" modelAttribute="contactType">
		<div class="box-header with-border">
			<input type="submit" value="{{'CONFIRM' | translate}}"
				class="btn btn-success btn-flat pull-right" />
			<h5>{{'CONTACT_TYPE' | translate}} - {{'CONTACT_TYPE_DELETE_MESSAGE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="tpContato">{{'CONTACT_TYPE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="tpContato" id="tpContato"
							class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsTipoContato">{{'CONTACT_TYPE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsTipoContato" id="dsTipoContato"
							class="form-control input-sm" readonly="true" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



