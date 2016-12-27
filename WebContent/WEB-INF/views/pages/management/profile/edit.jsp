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
	<form:form modelAttribute="profile" action="${theAction}" method="POST" class="form-horizontal">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}"	class="btn btn-success btn-flat pull-right" />
			<h5>{{'PROFILE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="idPerfil">{{'PROFILE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="idPerfil" id="idPerfil"  class="form-control input-sm" readonly="true"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsPerfil">{{'PROFILE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsPerfil" id="dsPerfil"  class="form-control input-sm" />
						<form:errors path="dsPerfil" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="tpPerfil">{{'PROFILE_TYPE' | translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="tpPerfil">							
							<form:option value="-1">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${profileTypes}" itemValue="valor" itemLabel="tag" />
						</form:select>					     
						<form:errors path="tpPerfil" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icNivel">{{'PROFILE_LEVEL' | translate}}:</label>
					<div class="col-sm-10">
					 	<form:select class="form-control" path="icNivel">							
							<form:option value="-1">-- {{"SELECT" | translate}} --</form:option>
							<form:options items="${profileLevels}" itemValue="valor" itemLabel="tag" />
						</form:select>					     
						<form:errors path="icNivel" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



