app.controller('ngMenu', function($scope, $http) {
    //var userId = $location.search().id;
    $http.get('/eSafe/service/feature/menu')
    .then(function successCallback(response) {
    	if (response.status >= 200 && response.status <= 299)
    		$scope.menu = response.data;
    	else
            console.log('ngMenu - Error: ' + response.status + ' - ' + response.statusText );    		
     }, function errorCallback(response) {
        console.log('ngMenu - Error: ' + response.status + ' - ' + response.statusText );
    });	
});
