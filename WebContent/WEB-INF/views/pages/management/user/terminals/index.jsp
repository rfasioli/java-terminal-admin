<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="box-title">{{'AVAILABLE_TERMINALS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel">
		<table id="terminais" class="table table-striped table-condensed "> 
			<thead>
				<tr>
					<th class='hide'>{{'TERMINAL_ID' | translate}}</th>
					<th>{{'NR_TERMINAL' | translate}}</th>
					<th>{{'DS_TERMINAL' | translate}}</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${!empty terminais}">
					<c:forEach items="${terminais}" var="terminal">			
						<tr>
							<td id="idTerminal" class='hide'><c:out value="${terminal.idTerminal}"/></td>
							<td id="nrTerminal"><c:out value="${terminal.nrTerminal}"/></td>
							<td id="dsTerminal"><c:out value="${terminal.dsTerminal}"/></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
    <div class="panel-footer">
      <button id="btnAdd" type="button" >{{'ADD' | translate}}</button>
    </div>
</div>

<script>
$(document).ready(function() {
    var table = $('#terminais').DataTable();
 
    $('#terminais tbody').on( 'click', 'tr', function () {
        $(this).toggleClass('selected');
    } );
 
    $('#btnAdd').click( function () {
    	$('#terminais > tbody > tr.selected > #idTerminal')
    	.each(function(index, elem) {
        	console.log(elem.innerText);
        });        
    } );
} );
</script>


