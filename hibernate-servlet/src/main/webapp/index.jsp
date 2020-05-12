<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Hibernate</title>

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="css/style3.css">
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

<!-- Font Awesome JS -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
	integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"
	integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
	crossorigin="anonymous"></script>

</head>

<body>

	<div class="wrapper">
		<!-- Sidebar  -->
		<nav id="sidebar">
			<div id="dismiss">
				<i class="fas fa-arrow-left"></i>
			</div>

			<div class="sidebar-header">
				<h3>Hibernate & Servlet</h3>
			</div>

			<ul class="list-unstyled components">
				<li class="active"><a href="#aboutSection">About</a></li>
				<li><a href="#homeSubmenu" data-toggle="collapse"
					aria-expanded="false">DB Structure</a>
					<ul class="collapse list-unstyled" id="homeSubmenu">
						<li><a href="#DBStructure">DB Structure</a></li>
						<li><a href="#CustomersTable">Customers Table</a></li>
						<li><a href="#EmployeesTable">Employees Table</a></li>
						<li><a href="#OfficesTable">Offices Table</a></li>
						<li><a href="#OrdersTable">Orders Table</a></li>
						<li><a href="#OrderdetailsTable">Orderdetails Table</a></li>
						<li><a href="#PaymentsTable">Payments Table</a></li>
						<li><a href="#ProductlinesTable">Productlines Table</a></li>
						<li><a href="#ProductsTable">Products Table</a></li>
					</ul></li>
				<li><a href="#projectReferences">References</a></li>
				<li><a href="#TechnologyAndTools">Technology and Tools</a></li>
				<li><a href="#Contact">Contact</a></li>
			</ul>

			<ul class="list-unstyled CTAs">
				<li><a href="admin.jsp" class="download">Admin Account</a></li>
				<li><a href="devtool.jsp" class="article">DEV View</a></li>
			</ul>
		</nav>

		<!-- Page Content  -->
		<div id="content">

			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-info">
						<i class="fas fa-align-left"></i> <span>Page Menu</span>
					</button>
					<button class="btn btn-info d-inline-block d-lg-none ml-auto"
						type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fas fa-align-justify"></i>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="nav navbar-nav ml-auto">
							<li class="nav-item active"><a class="nav-link" href="#">About</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="admin.jsp">Admin
									Account</a></li>
							<li class="nav-item"><a class="nav-link" href="devtool.jsp">DEV
									View</a></li>
							<li class="nav-item"><a class="nav-link"
								href="https://github.com/akashpal007/HibernateServlet/issues">Submit
									Issue</a></li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- Body -->
			<div id="aboutSection" class="container-fluid details">
				<h2>About</h2>

			</div>
			<div id="DBStructure" class="container-fluid details">
				<h2>DBStructure</h2>

			</div>
			<div id="CustomersTable" class="container-fluid details">
				<h2>CustomersTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>CREATE TABLE `customers` ( `customerNumber`
											int(11) NOT NULL, `customerName` varchar(50) NOT NULL,
											`contactLastName` varchar(50) NOT NULL, `contactFirstName`
											varchar(50) NOT NULL, `phone` varchar(50) NOT NULL,
											`addressLine1` varchar(50) NOT NULL, `addressLine2`
											varchar(50) DEFAULT NULL, `city` varchar(50) NOT NULL,
											`state` varchar(50) DEFAULT NULL, `postalCode` varchar(15)
											DEFAULT NULL, `country` varchar(50) NOT NULL,
											`salesRepEmployeeNumber` int(11) DEFAULT NULL, `creditLimit`
											decimal(10,2) DEFAULT NULL, PRIMARY KEY (`customerNumber`),
											KEY `salesRepEmployeeNumber` (`salesRepEmployeeNumber`),
											CONSTRAINT `customers_ibfk_1` FOREIGN KEY
											(`salesRepEmployeeNumber`) REFERENCES `employees`
											(`employeeNumber`) )</code>
									</div>
									<br>
									<a href="#" class="btn btn-primary">See Structure</a>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">Some example text some
										example text. John Doe is an architect and engineer</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="EmployeesTable" class="container-fluid details">
				<h2>EmployeesTable</h2>

			</div>
			<div id="OfficesTable" class="container-fluid details">
				<h2>OfficesTable</h2>

			</div>
			<div id="OrdersTable" class="container-fluid details">
				<h2>OrdersTable</h2>

			</div>
			<div id="OrderdetailsTable" class="container-fluid details">
				<h2>OrderdetailsTable</h2>

			</div>
			<div id="PaymentsTable" class="container-fluid details">
				<h2>PaymentsTable</h2>

			</div>
			<div id="ProductlinesTable" class="container-fluid details">
				<h2>ProductlinesTable</h2>

			</div>
			<div id="ProductsTable" class="container-fluid details">
				<h2>ProductsTable</h2>

			</div>
			<div id="projectReferences" class="container-fluid details">
				<h2>ProjectReferences</h2>

			</div>
			<div id="TechnologyAndTools" class="container-fluid details">
				<h2>TechnologyAndTools</h2>

			</div>
			<div id="Contact" class="container-fluid details">
				<h2>Contact</h2>

			</div>

		</div>
	</div>

	<div class="overlay"></div>

	<!-- jQuery CDN - Slim version (=without AJAX) -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<!-- Popper.JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<!-- Bootstrap JS -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>
	<!-- jQuery Custom Scroller CDN -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#sidebar").mCustomScrollbar({
				theme : "minimal"
			});

			$('#dismiss, .overlay').on('click', function() {
				$('#sidebar').removeClass('active');
				$('.overlay').removeClass('active');
			});

			$('#sidebarCollapse').on('click', function() {
				$('#sidebar').addClass('active');
				$('.overlay').addClass('active');
				$('.collapse.in').toggleClass('in');
				$('a[aria-expanded=true]').attr('aria-expanded', 'false');
			});
		});
	</script>
</body>

</html>