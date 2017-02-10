var carregaDadosGrafico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/TotaisDeposito')
    	.then(function successCallback(result) {
			var labels = [], dinheiro = [], cheque = [], envelope = [];
			for (var i = 0; i < result.data.length; i++) {
				labels.push(result.data[i].data);
				dinheiro.push(result.data[i].dinheiro);
				cheque.push(result.data[i].cheque);
				envelope.push(result.data[i].envelope);
			}
			$scope.series = ['Dinheiro', 'Envelope', 'Cheque'];
			$scope.labels = labels;
			$scope.data = [dinheiro, envelope, cheque];
			
			$timeout(function () {carregaDadosGrafico($scope, $http, $timeout);}, 60000);
		}, function errorCallback(err) {
			console.log('carregaDadosGrafico - event -> error' + err);
        });	
}

var carregaDadosGraficoTerminais = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/StatusTerminais')
	    .then(function successCallback(result) {
			var labels = [], erro = [], ok = [];
			for (var i = 0; i < result.data.length; i++) {
				labels.push(result.data[i].tag);
				var status = result.data[i].status, sucesso = 0, falha = 0;
				for (var j = 0; j < status.length; j++) {
					if (status[j].status % 10 === 0)
						sucesso += status[j].quantidade;
					else
						falha += status[j].quantidade;
				}
				ok.push(sucesso);
				erro.push(falha);
			}
			$scope.terminal = [];
			$scope.terminal.labels = labels;
			$scope.terminal.series = ['OK', 'Erro'];
			$scope.terminal.data = [ok, erro];
			
			$timeout(function () {carregaDadosGraficoTerminais($scope, $http, $timeout);}, 60000);
		}, function errorCallback(err) {
			console.log('carregaDadosGraficoTerminais - event -> error: ' + err);
        });	
}

var carregaMonitoramentoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/MonitoramentoAnalitico')
	    .then(function successCallback(result) {
			var status = result.data, sucesso = 0, falha = 0;
			for (var j = 0; j < status.length; j++) {
				if (status[j].status % 10 === 0)
					sucesso += status[j].quantidade;
				else
					falha += status[j].quantidade;
			}
			$scope.estado = {};
            $scope.estado.OK = sucesso;
            $scope.estado.ERROR = falha;        
			$timeout(function () {carregaMonitoramentoAnalitico($scope, $http, $timeout);}, 10000);
		}, function errorCallback(err) {
            console.log('carregaMonitoramentoAnalitico - Error: ' + JSON.stringify(err));
        });
}

var carregaNumerarioSaldoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/NumerarioSaldoAnalitico')
	    .then(function successCallback(result) {
            $scope.transito = result.data;
			$timeout(function () {carregaNumerarioSaldoAnalitico($scope, $http, $timeout);}, 60000);
		}, function errorCallback(err) {
            console.log('carregaNumerarioSaldoAnalitico - Error: ' + err);
        });
}


var carregaNumerarioRecolhidoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/NumerarioRecolhidoAnalitico')
	    .then(function successCallback(result) {
            $scope.recolhido = result.data;
			$timeout(function () {carregaNumerarioRecolhidoAnalitico($scope, $http, $timeout);}, 60000);
		}, function errorCallback(err) {
            console.log('carregaNumerarioRecolhidoAnalitico - Error: ' + err);
        });
}

//angular.module('monitoramentoApp', ['chart.js'])
// Optional configuration
app.config(['ChartJsProvider', function (ChartJsProvider) {
	// Configure all charts
	ChartJsProvider.setOptions({
	  colours: ['#FF0000', '#00FF00', '#0000FF'],
	  responsive: true
	});
	// Configure all line charts
	ChartJsProvider.setOptions('Line', {
	  datasetFill: true
	});
  }])
  .controller('monitoramentoAnaliticoCtrl', ['$scope', '$http', '$timeout', function ($scope, $http, $timeout){
    $scope.formData = {};

	carregaDadosGrafico($scope, $http, $timeout);
	carregaDadosGraficoTerminais($scope, $http, $timeout)
	carregaMonitoramentoAnalitico($scope, $http, $timeout);
	carregaNumerarioSaldoAnalitico($scope, $http, $timeout);
	carregaNumerarioRecolhidoAnalitico($scope, $http, $timeout);

	$scope.onClick = function (points, evt) {
		console.log(points, evt);
	};	
	
  }]);

//angular.bootstrap(document.getElementById("monitoramento"), ['monitoramentoApp']);

