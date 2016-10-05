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
	<form action="<c:url value=''/>" method="POST" class="form-horizontal">
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
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="tipo">{{'PROFILE_TYPE' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="tipo" value="${profile.tipo}" id="tipo" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nivel">{{'PROFILE_LEVEL' | translate}}:</label>
					<div class="col-sm-10">
						<input type="text" name="nivel" value="${profile.nivel}" id="nivel" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="acesso">{{'PROFILE_ACCESS' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="acesso" name="acesso">
					      <c:forEach items="${profileTypes}" var="option">
					      	<option><c:out value="${option}"></c:out></option> 
						  </c:forEach>
					    <!-- 
					      <option value="1" <c:if test="${profile.acesso == 1}">selected</c:if>>Master</option>
					      <option value="2" <c:if test="${profile.acesso == 2}">selected</c:if>>Cliente</option>
					     -->
					    </select>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>



