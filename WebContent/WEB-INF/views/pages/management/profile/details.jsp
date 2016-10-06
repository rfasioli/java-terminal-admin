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
	<form action="<c:url value=''/>" method="POST" class="form-horizontal">
		<div class="box-header with-border">
			<h5>{{'PROFILE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'PROFILE_ID' | translate}}:</label>
					<div class="col-sm-10">
						<label for="id" id="id">${profile.id}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'PROFILE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<label for="descricao" id="descricao">${profile.descricao}</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'PROFILE_TYPE' | translate}}:</label>
					<div class="col-sm-10">
						<label for="tipo" id="tipo">
					      <c:forEach items="${profileTypes}" var="option">
					      	<c:if test="${profile.tipo == option.valor}">{{"<c:out value='${option.tag}'></c:out>" | translate}}</c:if> 
						  </c:forEach>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'PROFILE_LEVEL' | translate}}:</label>
					<div class="col-sm-10">
						<label for="nivel" id="nivel">
					      <c:forEach items="${profileLevels}" var="option">
					      	<c:if test="${profile.nivel == option.valor}">{{"<c:out value='${option.tag}'></c:out>" | translate}}</c:if> 
						  </c:forEach>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'PROFILE_ACCESS' | translate}}:</label>
					<div class="col-sm-10">
						<label for="acesso" id="acesso">${profile.acesso}</label>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>



