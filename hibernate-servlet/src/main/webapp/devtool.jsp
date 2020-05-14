<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DevTool</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body> 
	<nav class="navbar navbar-expand-lg navbar-light bg-primary mb-3">
		<a class="navbar-brand text-light" href="index.jsp">Hibernate Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link text-light"
					href="#">DevTool <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link text-light"
					href="admin.jsp">Admin Account</a></li>
			</ul>
		</div>
	</nav>

	<div id="accordion">
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse1" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Customers Data</h5>
				</div>
			</button>

			<div id="collapse1" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/customers-inc.jsp" />  
					<br> <a href="customersselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse2" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Employees Data</h5>
				</div>
			</button>

			<div id="collapse2" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/employees-inc.jsp" /> 
					<br> <a href="employeesselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse3" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Offices Data</h5>
				</div>
			</button>

			<div id="collapse3" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/offices-inc.jsp" /> 
					<br> <a href="officesselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse4" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Orders Data</h5>
				</div>
			</button>

			<div id="collapse4" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/orders-inc.jsp" /> 
					<br> <a href="ordersselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse5" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Order Details Data</h5>
				</div>
			</button>

			<div id="collapse5" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/orderdetails-inc.jsp" /> 
					<br> <a href="orderdetailsselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse6" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Payments Data</h5>
				</div>
			</button>

			<div id="collapse6" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/payments-inc.jsp" /> 
					<br> <a href="paymentsselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse7" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Productlines Data</h5>
				</div>
			</button>

			<div id="collapse7" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/productlines-inc.jsp" /> 
					<br> <a href="productlinesselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
		<div class="card">
			<button class="btn btn-primary" data-toggle="collapse"
				data-target="#collapse8" aria-expanded="true"
				aria-controls="collapseOne">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0 text-light">Products Data</h5>
				</div>
			</button>

			<div id="collapse8" class="collapse" aria-labelledby="headingOne"
				data-parent="#accordion">
				<div class="card-body">
					<jsp:include page="inc/products-inc.jsp" /> 
					<br> <a href="productsselectall" class="btn btn-primary">Fetch
						All</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>