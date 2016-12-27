app.controller('ngUserInitialize', function($scope, $http, $location) {
    var userId = $location.search().id;

    //Funções terminais x usuário
	$scope.atualizaListaTerminais = function atualizaListaTerminais() {
	    $http.get('/eSafe/service/user/terminal?idUser=' + userId)
	    .then(function successCallback(response) {
	    	if (response.status >= 200 && response.status <= 299)
	    		$scope.terminais = response.data;
	    	else
	            console.log('atualizaListaTerminais - Error: ' + response.status + ' - ' + response.statusText );    		
	     }, function errorCallback(response) {
	        console.log('atualizaListaTerminais - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	}

	$scope.atualizaListaTerminaisDisponiveis = function atualizaListaTerminaisDisponiveis() {
	    $http.get('/eSafe/service/user/terminal/notfrom?idUser=' + userId)
	    .then(function successCallback(response) {
	    	if (response.status >= 200 && response.status <= 299)
	    		$scope.disponiveis = response.data;
	    	else
	            console.log('atualizaListaTerminaisDisponiveis - Error: ' + response.status + ' - ' + response.statusText );    		
	     }, function errorCallback(response) {
	        console.log('atualizaListaTerminaisDisponiveis - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	}

	$scope.addTerminal = function(idTerminal) {
		$http.get('/eSafe/service/user/terminal/add?idUser=' + userId + '&idTerminal='+ idTerminal)
	    .then(function successCallback(response) {

	    }, function errorCallback(response) {
	        console.log('addTerminal - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	};
	
	$scope.removeTerminal  = function(idTerminal) {
		$http.get('/eSafe/service/user/terminal/delete?idUser=' + userId + '&idTerminal='+ idTerminal)
	    .then(function successCallback(response) {
			$scope.atualizaListaTerminais();
    		$scope.atualizaListaTerminaisDisponiveis();
	     }, function errorCallback(response) {
	        console.log('removeTerminal - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	};

	$scope.updateTerminalTables = function() {
		$scope.atualizaListaTerminais();
		$scope.atualizaListaTerminaisDisponiveis();
	};

	//Funções cliente x usuario
	$scope.atualizaListaClientes = function atualizaListaClientes() {
	    $http.get('/eSafe/service/user/client?idUser=' + userId)
	    .then(function successCallback(response) {
		    $scope.clientes = response.data;
	     }, function errorCallback(response) {
	        console.log('atualizaListaClientes - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	}

	$scope.atualizaListaClientesDisponiveis = function atualizaListaClientesDisponiveis() {
	    $http.get('/eSafe/service/user/client/notfrom?idUser=' + userId)
	    .then(function successCallback(response) {
		    $scope.clientesdisponiveis = response.data;
	     }, function errorCallback(response) {
	        console.log('atualizaListaClientesDisponiveis - Error: ' + response.status + ' - ' + response.statusText );
	    });	
	}

	$scope.addClient = function(idClient) {
		$http.get('/eSafe/service/user/client/add?idUser=' + userId + '&idClient='+ idClient)
	    .then(function successCallback(response) {

	    }, function errorCallback(response) {
			console.log('addClient - Error: ' + response.status + ' - ' + response.statusText );
		});
	};
	
	$scope.removeClient  = function(idClient) {
		$http.get('/eSafe/service/user/client/delete?idUser=' + userId + '&idClient='+ idClient)
	    .then(function successCallback(response) {
			$scope.atualizaListaClientes();
			$scope.atualizaListaClientesDisponiveis();
			$scope.atualizaListaTerminais();
			$scope.atualizaListaTerminaisDisponiveis();
		}, function errorCallback(response) {
			console.log('removeClient - Error: ' + response.status + ' - ' + response.statusText );
		});
	};

	$scope.updateClientTables = function() {
		$scope.atualizaListaClientes();
		$scope.atualizaListaClientesDisponiveis();
	};
	
});


app.controller('listaTerminaisCtrl', function ($scope, $http, $location){
    $scope.atualizaListaTerminais($location.search().id);
  })
  .controller('listaTerminaisDisponiveisCtrl', function ($scope, $http, $location) {
      $scope.atualizaListaTerminaisDisponiveis($location.search().id);
  })
  .controller('listaClientesCtrl', function ($scope, $http, $location) {
      $scope.atualizaListaClientes($location.search().id);	  
  })
  .controller('listaClientesDisponiveisCtrl', function ($scope, $http, $location) {
      $scope.atualizaListaClientesDisponiveis($location.search().id);	  
  });


