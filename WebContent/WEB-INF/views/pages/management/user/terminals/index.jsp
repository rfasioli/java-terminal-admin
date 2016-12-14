
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">
		<h4 class="box-title">{{'AVAILABLE_TERMINALS' | translate}}</h4>
	</div>
	<div class="panel-body fixed-panel" ng-controller="listaTerminaisDisponiveisCtrl">
	  <div ng-controller="RowClickEventCtrl as cnf">
		<table id="terminais" class="table table-striped table-condensed " 
			datatable="ng" dt-options="cnf.dtOptions">
			<thead>
				<tr>
					<th class='hide'>{{'TERMINAL_ID' | translate}}</th>
					<th>{{'NR_TERMINAL' | translate}}</th>
					<th>{{'DS_TERMINAL' | translate}}</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="terminal in disponiveis">
					<td id="idTerminal" class='hide'>{{terminal.idTerminal}}</td>
					<td id="nrTerminal">{{terminal.nrTerminal}}</td>
					<td id="dsTerminal">{{terminal.dsTerminal}}</td>
				</tr>
			</tbody>
		</table>
	  </div>
	</div>
    <div class="panel-footer">
      <button id="btnAdd" type="button" >{{'ADD' | translate}}</button>
    </div>
</div>

<script>
  $(document).ready(function() {
    $('#btnAdd').click( function () {
    	$('#terminais > tbody > tr.selected > #idTerminal')
    	.each(function(index, elem) {
        	console.log(elem.innerText);
        });
        
    } );
  });

  app.controller('ngDtTblConfig', ngDtTblConfig)
     .controller('RowClickEventCtrl', RowClickEventCtrl);

  function ngDtTblConfig ($scope, DTOptionsBuilder) {
	  var vm = this;
	  vm.dtOptions = DTOptionsBuilder.newOptions().withDisplayLength(10);
  };

  function RowClickEventCtrl($scope, DTOptionsBuilder, DTColumnBuilder) {
     var vm = this;
     vm.someClickHandler = someClickHandler;
     vm.dtOptions = DTOptionsBuilder.newOptions()
         .withOption('rowCallback', rowCallback);
     
     function someClickHandler(info, nRow) {
         $(nRow).toggleClass('selected');
         console.log(JSON.stringify(info));
     }
     function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
         $('td', nRow).unbind('click');
         $('td', nRow).bind('click', function() {
             $scope.$apply(function() {
                 vm.someClickHandler(aData, nRow);
             });
         });
         
         return nRow;
     } 
  }
 
</script>


<script type="text/javascript"
	src="<c:url value='/js/controller/user.js' />"></script>


