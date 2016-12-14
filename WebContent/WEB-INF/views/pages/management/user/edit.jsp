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
	<c:url var="post_url" value="/management/user/edit" />
	<form:form method="POST" modelAttribute="usuario" class="form-horizontal" action="${post_url}" >
		<div class="box-header with-border">
			<input type="submit" value="{{'SAVE' | translate}}" class="btn btn-success btn-flat pull-right" />
			<h5>{{'USER' | translate}}</h5>
		</div>
		<div class="form-container">
			<div class="box-body form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="id">{{'USER_ID' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="id" id="id" class="form-control input-sm" readonly="true" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="login">{{'USER_LOGIN' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="login" id="login" class="form-control input-sm"/>
						<form:errors path="login" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">{{'USER_EMAIL' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="email" id="email" class="form-control input-sm"/>
						<form:errors path="email" cssStyle="color: red;" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="senha">{{'USER_PASSWORD' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="password" path="senha" id="senha" class="form-control input-sm"/>
						<form:errors path="senha" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nome">{{'USER_NAME' | translate}}:</label>
					<div class="col-sm-10">
						<form:input type="text" path="nome" id="nome" class="form-control input-sm"/>
						<form:errors path="nome" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataCriacao">{{'USER_DT_CREATE' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <form:input type="date" path="dataCriacao" id="dataCriacao" class="datepicker form-control input-sm" readonly="true" />
					  <form:errors path="dataCriacao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dataAlteracao">{{'USER_DT_UPDATE' | translate}}:</label>
					<div class="col-sm-10" ng-controller="loadDate">
					  <form:input type="date" path="dataAlteracao" id="dataAlteracao" class="datepicker form-control input-sm" readonly="true" />
					  <form:errors path="dataAlteracao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="ativo">{{'USER_ACTIVE' | translate}}:</label>
					<div class="col-sm-10">
						<form:checkbox path="ativo" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idPerfil">{{'USER_PROFILE' | translate}}:</label>
					<div class="col-sm-10">
					    <select class="form-control" id="idPerfil" name="idPerfil">
					      <c:forEach items="${perfis}" var="option">
					      	<option value="<c:out value="${option.id}"></c:out>" <c:if test="${usuario.idPerfil == option.id}">selected</c:if>>{{"<c:out value='${option.descricao}'></c:out>" | translate}}</option> 
						  </c:forEach>
					    </select>
						<form:errors path="idPerfil" cssClass="error" />
					</div>
				</div>
			</div>
		</div>
	</form:form>

	<table class="table table-striped table-condensed " ng-app="userApp" ng-controller="listaTerminaisCtrl">
	  <thead>
	    <tr>
			<th>{{'ID' | translate}}</th>
			<th>{{'NR_TERMINAL' | translate}}</th>
			<th>{{'DS_TERMINAL' | translate}}</th>
			<th></th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr ng-repeat="terminal in terminais">
	      <td>{{terminal.idTerminal}}</td>
	      <td>{{terminal.nrTerminal}}</td>      
	      <td>{{terminal.dsTerminal}}</td>      
		  <td><a href="<c:url value='/service/user/terminal/delete'/>?idUser=${usuario.id}&idTerminal=${terminal.id}"><i class="fa fa-eraser" aria-hidden="true"></i></a></td>
	    </tr>
	  </tbody>
	</table>

    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" data-remote="modal.html">Open Modal</button>
    <div id="myModal" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-body">
            <p>Falha no carregando dos terminais.</p>
          </div>
        </div>
      </div>
    </div>

		
<%-- 		<button type="button" class="btn" data-toggle="modal" data-target="#myModal" data-remote="<c:url value='/management/user/terminals'/>?idUser=${usuario.id}">Launch modal</button>
		<button type="button" class="btn" data-toggle="modal" data-target="#myModal" >Launch modal</button>
		
		<div id="myModal" class="modal hide fade">
		    <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> × </button>
		        <h3 id="myModalLabel">Modal header</h3>
		    </div>
		    <div class="modal-body">
		       <!-- remote content will be inserted here via jQuery load() -->
		       <p>Modal content</p>
		    </div>
		    <div class="modal-footer">
		        <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
		    </div>
		</div>		
 --%>		
</div>

<script>
	$("#dataCriacao").datepicker();
	$("#dataAlteracao").datepicker();
</script>

<script type="text/javascript" src="<c:url value='/js/controller/user.js' />"></script>

