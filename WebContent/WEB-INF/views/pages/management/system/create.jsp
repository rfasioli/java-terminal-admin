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
	<c:url value="#" var="theAction"/>
	<form:form action="${theAction}" method="POST" class="form-horizontal" modelAttribute="sistema">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'SYSTEM' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSistema">{{'SYSTEM_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idSistema"
							class="form-control input-sm" readonly="true" />
						<form:errors path="idSistema" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsSistema">{{'SYSTEM_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsSistema"
							class="form-control input-sm" />
						<form:errors path="dsSistema" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



