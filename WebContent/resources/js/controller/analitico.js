var carregaDadosGrafico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/TotaisDeposito')
        .success(function(data) {
			console.log('carregaDadosGrafico - event -> success');
			var labels = [], dinheiro = [], cheque = [], envelope = [];
			for (var i = 0; i < data.length; i++) {
				labels.push(data[i].data);
				dinheiro.push(data[i].dinheiro);
				cheque.push(data[i].cheque);
				envelope.push(data[i].envelope);
			}
			$scope.series = ['Dinheiro', 'Envelope', 'Cheque'];
			$scope.labels = labels;
			$scope.data = [dinheiro, envelope, cheque];
			
			console.log('carregaDadosGrafico - series: ' + JSON.stringify($scope.series));
			console.log('carregaDadosGrafico - labels: ' + JSON.stringify($scope.labels));
			console.log('carregaDadosGrafico - data: ' + JSON.stringify($scope.data));
			
			$timeout(function () {carregaDadosGrafico($scope, $http, $timeout);}, 60000);
        })
        .error(function(err) {
			console.log('carregaDadosGrafico - event -> error' + err);
        });	
    console.log("EXECUTANDO CONTROLLER >>> analitico.js >>> carregaDadosGrafico [FIM]");	  
}

var carregaDadosGraficoTerminais = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/StatusTerminais')
        .success(function(data) {
			console.log('carregaDadosGraficoTerminais - event -> success');
			var labels = [], erro = [], ok = [];
			for (var i = 0; i < data.length; i++) {
				labels.push(data[i].tag);
				var status = data[i].status, sucesso = 0, falha = 0;
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
			
			console.log('carregaDadosGraficoTerminais - series:' + JSON.stringify($scope.terminal.series));
			console.log('carregaDadosGraficoTerminais - labels:' + JSON.stringify($scope.terminal.labels));
			console.log('carregaDadosGraficoTerminais - data:' + JSON.stringify($scope.terminal.data));
			
			$timeout(function () {carregaDadosGraficoTerminais($scope, $http, $timeout);}, 60000);
		})
        .error(function(err) {
			console.log('carregaDadosGraficoTerminais - event -> error: ' + err);
        });	
}

var carregaMonitoramentoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/MonitoramentoAnalitico')
        .success(function(data) {
            console.log('carregaMonitoramentoAnalitico - success: ' + JSON.stringify(data));
			var status = data, sucesso = 0, falha = 0;
			for (var j = 0; j < status.length; j++) {
				if (status[j].status % 10 === 0)
					sucesso += status[j].quantidade;
				else
					falha += status[j].quantidade;
			}
			$scope.estado = [];
            $scope.estado.OK = sucesso;
            $scope.estado.ERROR = falha;        
			$timeout(function () {carregaMonitoramentoAnalitico($scope, $http, $timeout);}, 3000);
		})
        .error(function(data) {
            console.log('carregaMonitoramentoAnalitico - Error: ' + data);
        });
}

var carregaNumerarioSaldoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/NumerarioSaldoAnalitico')
        .success(function(data) {
            console.log('carregaNumerarioSaldoAnalitico - success: ' + data);
            $scope.transito = data;
			$timeout(function () {carregaNumerarioSaldoAnalitico($scope, $http, $timeout);}, 60000);
        })
        .error(function(data) {
            console.log('carregaNumerarioSaldoAnalitico - Error: ' + data);
        });
}

var carregaNumerarioRecolhidoAnalitico = function($scope, $http, $timeout) {
    $http.get('/eSafe/monitoring/service/NumerarioRecolhidoAnalitico')
        .success(function(data) {
            console.log('carregaNumerarioRecolhidoAnalitico - success: ' + data);
            $scope.recolhido = data;
			$timeout(function () {carregaNumerarioRecolhidoAnalitico($scope, $http, $timeout);}, 60000);
        })
        .error(function(data) {
            console.log('carregaNumerarioRecolhidoAnalitico - Error: ' + data);
        });
}

angular.module('monitoramentoApp', ['chart.js'])
  // Optional configuration
  .config(['ChartJsProvider', function (ChartJsProvider) {
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

angular.bootstrap(document.getElementById("monitoramento"), ['monitoramentoApp']);
