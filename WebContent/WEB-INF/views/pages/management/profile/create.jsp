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
	<c:url value="#" var="theAction"/>
	<form:form action="${theAction}" method="POST" class="form-horizontal">
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'PROFILE' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="descricao">{{'PROFILE_DESCRIPTION' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="descricao" value="${profile.descricao}" id="descricao" />
						<form:errors path="descricao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="tipo">{{'PROFILE_TYPE' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="tipo" name="tipo">
					      <c:forEach items="${profileTypes}" var="option">
					      	<option value="<c:out value="${option.valor}"></c:out>" <c:if test="${profile.tipo == option.valor}">selected</c:if>>{{"<c:out value='${option.tag}'></c:out>" | translate}}</option> 
						  </c:forEach>
					    </select>
						<form:errors path="tipo" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nivel">{{'PROFILE_LEVEL' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="nivel" name="nivel">
					      <c:forEach items="${profileLevels}" var="option">
					      	<option value="<c:out value="${option.valor}"></c:out>" <c:if test="${profile.nivel == option.valor}">selected</c:if>>{{"<c:out value='${option.tag}'></c:out>" | translate}}</option> 
						  </c:forEach>
					    </select>
						<form:errors path="nivel" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
</div>



