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
	<c:url var="post_url" value="/management/profile/delete" />	
	<form:form method="POST" modelAttribute="profile" class="form-horizontal" action="${post_url}">
		<div class="box-header with-border">
			<input type="submit" value="{{'CONFIRM' | translate}}"
				class="btn btn-success btn-flat pull-right" />
			<h5>{{'PROFILE' | translate}} - {{'PROFILE_DELETE_MESSAGE' | translate}}</h5>
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
						<form:input type="text" path="dsPerfil" id="dsPerfil"  class="form-control input-sm" readonly="true"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="tpPerfil">{{'PROFILE_TYPE' | translate}}:</label>
					<div class="col-sm-10">
						<label for="tpPerfil" id="tpPerfil">
					      <c:forEach items="${profileTypes}" var="option">
					      	<c:if test="${profile.tpPerfil == option.valor}">
								<c:url var="tipo_perfil" value="${option.tag}" />	
					      		<input type="text" class="form-control input-sm"  
					      			value="${tipo_perfil}" readonly="readonly" />
					      	</c:if> 
						  </c:forEach>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="icNivel">{{'PROFILE_LEVEL' | translate}}:</label>
					<div class="col-sm-10">
						<label for="icNivel" id="icNivel">
					      <c:forEach items="${profileLevels}" var="option">
					      	<c:if test="${profile.icNivel == option.valor}">
								<c:url var="nivel_perfil" value="${option.tag}" />	
					      		<input type="text" class="form-control input-sm"  
					      			value="${nivel_perfil}" readonly="readonly" />
					      	</c:if> 
						  </c:forEach>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dsRules">{{'PROFILE_RULES' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="dsRules" id="dsRules"  
							class="form-control input-sm" readonly="true"/>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



