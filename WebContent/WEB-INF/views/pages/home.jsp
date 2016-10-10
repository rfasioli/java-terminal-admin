<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		eSafe <small>Sistema de gerenciamento de terminais</small>
	</h1>
</section>
<section class="content" id="home" ng-app="appchart" ng-controller="LineCtrl">
	<h2>Bem vindo!</h2>

	<div class="chart">
		<canvas id="line" class="chart chart-line" style="height: 250px"
			chart-data="data" chart-labels="labels" chart-legend="true"
			chart-series="series" chart-click="onClick">
        </canvas>
	</div>

</section>


<script>
	angular.module("appchart", ["chart.js"]).controller("LineCtrl", function ($scope) {

		  $scope.labels = ["January", "February", "March", "April", "May", "June", "July"];
		  $scope.series = ['Series A', 'Series B'];
		  $scope.data = [
		    [65, 59, 80, 81, 56, 55, 40],
		    [28, 48, 40, 19, 86, 27, 90]
		  ];
		  $scope.onClick = function (points, evt) {
		    console.log(points, evt);
		  };
		  $scope.datasetOverride = [{ yAxisID: 'y-axis-1' }, { yAxisID: 'y-axis-2' }];
		  $scope.options = {
		    scales: {
		      yAxes: [
		        {
		          id: 'y-axis-1',
		          type: 'linear',
		          display: true,
		          position: 'left'
		        },
		        {
		          id: 'y-axis-2',
		          type: 'linear',
		          display: true,
		          position: 'right'
		        }
		      ]
		    }
		  };
		});

	angular.bootstrap(document.getElementById("home"), ['appchart']);
	
</script>