console.log('user.js - inicio');

app.controller('listaTerminaisCtrl', ['$scope', '$http', '$timeout', '$location'
                                      , function ($scope, $http, $timeout, $location){
//    $scope.formData = {};
    $scope.userId = $location.search().id;
    $http.get('/eSafe/service/user/terminal?idUser=' + $location.search().id)
    .success(function(data) {
	    $scope.terminais = data;
    })
    .error(function(data) {
        console.log('listaTerminaisCtrl - Error: ' + data);
    });
    console.log('user.js - userApp')

  }])
  .controller('listaTerminaisDisponiveisCtrl', ['$scope', '$http', '$timeout', '$location'
                                               , function ($scope, $http, $timeout, $location) {
      $scope.userId = $location.search().id;
      $http.get('/eSafe/service/user/terminal/notfrom?idUser=' + $location.search().id)
	  .success(function(data){
		  $scope.disponiveis = data;
	  })
	  .error(function(data){
		 console.log('listaTerminaisDisponiveisCtrl - error: ' + data); 
	  });
  }]);

console.log('user.js - fim');
