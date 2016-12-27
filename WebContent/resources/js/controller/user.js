app.controller('ngUserInitialize', function($scope, $http, $location) {
    var userId = $location.search().id;

    //Funções terminais x usuário
	$scope.atualizaListaTerminais = function atualizaListaTerminais() {
	    $http.get('/eSafe/service/user/terminal?idUser=' + userId)
	    .success(function(data) {
		    $scope.terminais = data;
	    })
	    .error(function(data) {
	        console.log('atualizaListaTerminais - Error: ' + data);
	    });	
	}

	$scope.atualizaListaTerminaisDisponiveis = function atualizaListaTerminaisDisponiveis() {
	    $http.get('/eSafe/service/user/terminal/notfrom?idUser=' + userId)
	    .success(function(data) {
		    $scope.disponiveis = data;
	    })
	    .error(function(data) {
	        console.log('atualizaListaTerminaisDisponiveis - Error: ' + data);
	    });	
	}

	$scope.addTerminal = function(idTerminal) {
		$http.get('/eSafe/service/user/terminal/add?idUser=' + userId + '&idTerminal='+ idTerminal)
		.success(function(data){
			$scope.atualizaListaTerminais();
			$scope.atualizaListaTerminaisDisponiveis();
		})
		.error(function(data){
			console.log('addTerminal - Error: ' + data);
		});
	};
	
	$scope.removeTerminal  = function(idTerminal) {
		$http.get('/eSafe/service/user/terminal/delete?idUser=' + userId + '&idTerminal='+ idTerminal)
		.success(function(data){
			$scope.atualizaListaTerminais();
			$scope.atualizaListaTerminaisDisponiveis();
		})
		.error(function(data){
			console.log('removeTerminal - Error: ' + data);
		});
	};
	
	//Funções cliente x usuario
	$scope.atualizaListaClientes = function atualizaListaClientes() {
	    $http.get('/eSafe/service/user/client?idUser=' + userId)
	    .success(function(data) {
		    $scope.clientes = data;
	    })
	    .error(function(data) {
	        console.log('atualizaListaClientes - Error: ' + data);
	    });	
	}

	$scope.atualizaListaClientesDisponiveis = function atualizaListaClientesDisponiveis() {
	    $http.get('/eSafe/service/user/client/notfrom?idUser=' + userId)
	    .success(function(data) {
		    $scope.clientesdisponiveis = data;
	    })
	    .error(function(data) {
	        console.log('atualizaListaClientesDisponiveis - Error: ' + data);
	    });	
	}

	$scope.addClient = function(idClient) {
		$http.get('/eSafe/service/user/client/add?idUser=' + userId + '&idClient='+ idClient)
		.success(function(data){
			$scope.atualizaListaClientes();
			$scope.atualizaListaClientesDisponiveis();
			$scope.atualizaListaTerminais();
			$scope.atualizaListaTerminaisDisponiveis();
		})
		.error(function(data){
			console.log('addClient Error: ' + data);
		});
	};
	
	$scope.removeClient  = function(idClient) {
		$http.get('/eSafe/service/user/client/delete?idUser=' + userId + '&idClient='+ idClient)
		.success(function(data){
			$scope.atualizaListaClientes();
			$scope.atualizaListaClientesDisponiveis();
			$scope.atualizaListaTerminais();
			$scope.atualizaListaTerminaisDisponiveis();
		})
		.error(function(data){
			console.log('removeClient Error: ' + data);
		});
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


