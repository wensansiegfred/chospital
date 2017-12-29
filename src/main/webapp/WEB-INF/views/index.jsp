<!doctype html>
<html lang="en" ng-app="cHospital">
<head>
	<meta charset="UTF-8">
	<title>CamoTechQ Hospital Management System</title>
	<meta name="viewport" content="width=device-width, user-scalable=no">
	<link href='https://fonts.googleapis.com/css?family=Lato:400,100,700,900' rel='stylesheet' type='text/css'>
	<!-- css -->
	<link href="assets/css/bootstrap.css" rel="stylesheet" />
	<link href="assets/css/AdminLTE.min.css" rel="stylesheet" />
	<link href="assets/css/_all-skins.min.css" rel="stylesheet" />
	<link href="assets/css/style.css" rel="stylesheet" />
	<!-- angular -->
	<script type="text/javascript" src="assets/js/libs/angular/angular.min.js"></script>
	<script type="text/javascript" src="assets/js/libs/angular/angular-route.min.js"></script> 
	<script type="text/javascript" src="assets/js/libs/angular/angular-animate.min.js"></script>
	<!-- local -->
	<script type="text/javascript" src="assets/js/app.js"></script>
	<script type="text/javascript" src="assets/js/routes.js"></script> 
</head>
<body>
	<div class="main-wrapper">
		<header class="main-header">
			<nav class="navbar navbar-static-top"></nav>
		</header>
		<div class="container">
			<main ng-view></main>
		</div>
	</div>
</body>
</html>