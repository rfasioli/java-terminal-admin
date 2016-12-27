app.controller('ngMenu', function($scope, $http, $location) {
    var userId = $location.search().id;
    $http.get('/eSafe/service/feature/menu')
    .success(function(data) {
	    $scope.menu = data;
    })
    .error(function(data) {
        console.log('ngMenu - Error: ' + data);
    });	
});
