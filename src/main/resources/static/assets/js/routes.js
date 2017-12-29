cHospital.config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {	
	$locationProvider.hashPrefix('');	
	$routeProvider
		.when('/login', {
			templateUrl: 'templates/login.html',
			controller: 'controller'
	    })
	    .when('/register', {
		    templateUrl: 'partials/register.html',
		    controller: 'RegistrationController'
	    })
	    .when('/meetings', {
	        templateUrl: 'partials/meetings.html',
	        controller: 'MeetingsController',
	        resolve: {
		        currentAuth: function(Authentication) {
		        return Authentication.requireAuth();
	        } //currentAuth
	      }//resolve
	    })
	    .otherwise({
	    	redirectTo: '/login'
	    });
}]);