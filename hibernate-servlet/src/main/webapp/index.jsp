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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

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
			</ul>

			<ul class="list-unstyled CTAs">
				<li><a href="admin.jsp" class="download">Admin Account</a></li>
				<li><a href="DevToolHome" class="article">DEV View</a></li>
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
							<li class="nav-item"><a class="nav-link" href="DevToolHome">DEV
									View</a></li>
							<li class="nav-item"><a class="nav-link"
								href="https://github.com/akashpal007/HibernateServlet/issues">Submit
									Issue</a></li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- Body----------------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="aboutSection" class="container-fluid details">
				<h2>About</h2>
				<div class="container-fluid mx-3 p-3">
					<p class="text-dark">
						This project is mead to understand how Hibernate works along with
						Object Relation Mapping, HQL, HCQL, MVC architecture, version
						control, etc.<br> Dev view initially shows 5 rows in JSON format so
						that we can understand how data come from DB. The Admin account
						can do various operations. (View and Controller are not written
						yet All the Models are written)<b> <br>
						<br> In my project, I separate the model into 3 sections
						Helper, Dao, DaoImpl. Every controller calls "Helper" and the
						helper is responsible to communicate with Dao and get back a
						response to the controller. <br>
						<br> I made a custom exception class named DbException. If
						there is any problem with connection or DB operation then it
						throws DbException. <br>
						<br> Each Dao Interface extends BaseDao Interface. BaseDao
						comprises a basic Db operation methods definition. <br>
						<br> There is a class named DbSession which has two static
						methods which will give session instance after starting a
						transaction and commit the transaction and close the session. <br></b>
					</p>
				</div>
			</div>
			<div id="DBStructure" class="container-fluid details">
				<h2>DBStructure</h2>
				<div class="card">
					<div class="card-body">
						<img src="pic/classicmodels.jpg" class="img-fluid">
					</div>
				</div>
				<!-- CustomersTable--------------------------------------------------------------------------------------------------------------------------------- -->
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
										<code>
											CREATE TABLE `customers` ( <br>`customerNumber` int(11)
											NOT NULL, <br>`customerName` varchar(50) NOT NULL, <br>`contactLastName`
											varchar(50) NOT NULL, <br>`contactFirstName` varchar(50)
											NOT NULL, <br>`phone` varchar(50) NOT NULL, <br>`addressLine1`
											varchar(50) NOT NULL, <br>`addressLine2` varchar(50)
											DEFAULT NULL, <br>`city` varchar(50) NOT NULL, <br>`state`
											varchar(50) DEFAULT NULL, <br>`postalCode` varchar(15)
											DEFAULT NULL, <br>`country` varchar(50) NOT NULL, <br>`salesRepEmployeeNumber`
											int(11) DEFAULT NULL, <br>`creditLimit` decimal(10,2)
											DEFAULT NULL, <br>PRIMARY KEY (`customerNumber`), <br>KEY
											`salesRepEmployeeNumber` <br>(`salesRepEmployeeNumber`),
											<br>CONSTRAINT `customers_ibfk_1` FOREIGN KEY <br>(`salesRepEmployeeNumber`)
											REFERENCES `employees` <br>(`employeeNumber`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#customersTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "customers") <br>public
											class CustomersVO { <br> @Id <br>
											@GeneratedValue(strategy = GenerationType.SEQUENCE) <br>
											@Column(name = "customerNumber", columnDefinition = "int(11)
											NOT NULL") <br> private Integer customerNumber; <br>
											@Column(name = "customerName", columnDefinition =
											"varchar(50) NOT NULL") <br> private String
											customerName; <br> <br> @Column(name =
											"contactLastName", columnDefinition = "varchar(50) NOT NULL")
											<br> private String contactLastName; <br> <br>
											@Column(name = "contactFirstName", columnDefinition =
											"varchar(50) NOT NULL") <br> private String
											contactFirstName; <br> <br> @Column(name = "phone",
											columnDefinition = "varchar(50) NOT NULL") <br> private
											String phone; <br> <br> @Column(name =
											"addressLine1", columnDefinition = "varchar(50) NOT NULL") <br>
											private String addressLine1; <br> <br> @Column(name
											= "addressLine2", columnDefinition = "varchar(50) DEFAULT
											NULL") <br> private String addressLine2; <br> <br>
											@Column(name = "city", columnDefinition = "varchar(50) NOT
											NULL") <br> private String city; <br> <br>
											@Column(name = "state", columnDefinition = "varchar(50)
											DEFAULT NULL") <br> private String state; <br> <br>
											@Column(name = "postalCode", columnDefinition = "varchar(15)
											DEFAULT NULL") <br> private String postalCode; <br>
											<br> @Column(name = "country", columnDefinition =
											"varchar(50) NOT NULL") <br> private String country; <br>
											<br> @ManyToOne <br> @JoinColumn(name =
											"salesRepEmployeeNumber") <br> private EmployeesVO
											employeesVO; <br> <br> @Column(name =
											"creditLimit", columnDefinition = "decimal(10,2) DEFAULT
											NULL") <br> private Double creditLimit; <br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="customersTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Customers Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/customers.jpg" class="img-fluid"
								alt="Customers Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- EmployeesTable------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="EmployeesTable" class="container-fluid details">
				<h2>EmployeesTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `employees` ( <br>`employeeNumber` int(11)
											NOT NULL, <br>`lastName` varchar(50) NOT NULL, <br>`firstName`
											varchar(50) NOT NULL, <br>`extension` varchar(10) NOT
											NULL, <br>`email` varchar(100) NOT NULL, <br>`officeCode`
											varchar(10) NOT NULL, <br>`reportsTo` int(11) DEFAULT
											NULL, <br>`jobTitle` varchar(50) NOT NULL, <br>PRIMARY
											KEY (`employeeNumber`), <br>KEY `reportsTo`
											(`reportsTo`), <br>KEY `officeCode` (`officeCode`), <br>CONSTRAINT
											`employees_ibfk_1` FOREIGN KEY <br>(`reportsTo`)
											REFERENCES `employees` <br>(`employeeNumber`), <br>CONSTRAINT
											`employees_ibfk_2` FOREIGN KEY <br>(`officeCode`)
											REFERENCES `offices` (`officeCode`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#employeesTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "employees") <br>public
											class EmployeesVO { <br> @Id <br>
											@GeneratedValue(strategy = GenerationType.AUTO) <br>
											@Column(name = "employeeNumber", columnDefinition = "int(11)
											NOT NULL") <br> private Integer employeeNumber; <br>
											<br> @Column(name = "lastName", columnDefinition =
											"varchar(50) NOT NULL") <br> private String lastName; <br>
											<br> @Column(name = "firstName", columnDefinition =
											"varchar(50) NOT NULL") <br> private String firstName; <br>
											<br> @Column(name = "extension", columnDefinition =
											"varchar(10) NOT NULL") <br> private String extension; <br>
											<br> @Column(name = "email", columnDefinition =
											"varchar(100) NOT NULL") <br> private String email; <br>
											<br> @ManyToOne <br> @JoinColumn(name =
											"officeCode") <br> private OfficesVO officesVO; <br>
											<br> @ManyToOne(cascade={CascadeType.ALL}) <br>
											@JoinColumn(name = "reportsTo") <br> private EmployeesVO
											reportsTo; <br> <br> @Column(name = "jobTitle",
											columnDefinition = "") <br> private String jobTitle; <br>
											}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="employeesTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Employees Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/employees.jpg" class="img-fluid"
								alt="Employees Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- OfficesTable--------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="OfficesTable" class="container-fluid details">
				<h2>OfficesTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `offices` ( <br>`officeCode` varchar(10)
											NOT NULL, <br>`city` varchar(50) NOT NULL, <br>`phone`
											varchar(50) NOT NULL, <br>`addressLine1` varchar(50) NOT
											NULL, <br>`addressLine2` varchar(50) DEFAULT NULL, <br>`state`
											varchar(50) DEFAULT NULL, <br>`country` varchar(50) NOT
											NULL, <br>`postalCode` varchar(15) NOT NULL, <br>`territory`
											varchar(10) NOT NULL, <br>PRIMARY KEY (`officeCode`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#officesTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "offices") <br>public
											class OfficesVO { <br> @Id <br>
											@GeneratedValue(strategy = GenerationType.SEQUENCE) <br>
											@Column(name = "officeCode", columnDefinition = "varchar(50)
											NOT NULL") <br> private String officeCode; <br> <br>
											@Column(name = "city", columnDefinition = "varchar(50) NOT
											NULL") <br> private String city; <br> <br>
											@Column(name = "phone", columnDefinition = "varchar(50) NOT
											NULL") <br> private String phone; <br> <br>
											@Column(name = "addressLine1", columnDefinition =
											"varchar(50) NOT NULL") <br> private String
											addressLine1; <br> <br> @Column(name =
											"addressLine2", columnDefinition = "varchar(50) DEFAULT
											NULL") <br> private String addressLine2; <br> <br>
											@Column(name = "state", columnDefinition = "varchar(50)
											DEFAULT NULL") <br> private String state; <br> <br>
											@Column(name = "country", columnDefinition = "varchar(50) NOT
											NULL") <br> private String country; <br> <br>
											@Column(name = "postalCode", columnDefinition = "varchar(15)
											NOT NULL") <br> private String postalCode; <br> <br>
											@Column(name = "territory", columnDefinition = "varchar(10)
											NOT NULL") <br> private String territory; <br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="officesTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Offices Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/offices.jpg" class="img-fluid"
								alt="Offices Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- OrdersTable---------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="OrdersTable" class="container-fluid details">
				<h2>OrdersTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `orders` ( <br>`orderNumber` int(11) NOT
											NULL, <br>`orderDate` date NOT NULL, <br>`requiredDate`
											date NOT NULL, <br>`shippedDate` date DEFAULT NULL, <br>`status`
											varchar(15) NOT NULL, <br>`comments` text, <br>`customerNumber`
											int(11) NOT NULL, <br>PRIMARY KEY (`orderNumber`), <br>KEY
											`customerNumber` (`customerNumber`), <br>CONSTRAINT
											`orders_ibfk_1` FOREIGN KEY <br>(`customerNumber`)
											REFERENCES `customers` <br>(`customerNumber`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#ordersTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "orders") <br>public
											class OrdersVO { <br> @Id <br>
											@GeneratedValue(strategy = GenerationType.SEQUENCE) <br>
											@Column(name = "orderNumber", columnDefinition = "int(11) NOT
											NULL") <br> private Integer orderNumber; <br> <br>
											@Column(name = "orderDate", columnDefinition = "date NOT
											NULL") <br> private Date orderDate; <br> <br>
											@Column(name = "requiredDate", columnDefinition = "date NOT
											NULL") <br> private Date requiredDate; <br> <br>
											@Column(name = "shippedDate", columnDefinition = "date
											DEFAULT NULL") <br> private Date shippedDate; <br>
											<br> @Column(name = "status", columnDefinition =
											"varchar(15) NOT NULL") <br> private String status; <br>
											<br> @Column(name = "comments", columnDefinition =
											"text") <br> private String comments; <br> <br>
											@ManyToOne <br> @JoinColumn(name = "customerNumber") <br>
											private CustomersVO customersVO; <br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="ordersTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Orders Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/orders.jpg" class="img-fluid"
								alt="Orders Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- OrderdetailsTable---------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="OrderdetailsTable" class="container-fluid details">
				<h2>OrderdetailsTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `orderdetails` ( <br>`orderNumber` int(11)
											NOT NULL, <br>`productCode` varchar(15) NOT NULL, <br>`quantityOrdered`
											int(11) NOT NULL, <br>`priceEach` decimal(10,2) NOT
											NULL, <br>`orderLineNumber` smallint(6) NOT NULL, <br>PRIMARY
											KEY (`orderNumber`,`productCode`), <br>KEY `productCode`
											(`productCode`), <br>CONSTRAINT `orderdetails_ibfk_1`
											FOREIGN KEY <br>(`orderNumber`) REFERENCES `orders`
											(`orderNumber`), <br>CONSTRAINT `orderdetails_ibfk_2`
											FOREIGN KEY <br>(`productCode`) REFERENCES `products`
											(`productCode`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#orderdetailsTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											<b><i>here we achieve composite primary key by
													@embedded</i></b> <br>@Entity <br>@Table(name =
											"orderdetails") <br>public class OrderDetailsVO { <br>
											<b> @EmbeddedId <br> private OrderDetailsPKConst
												pkConst;
											</b> <br> @Column(name = "quantityOrdered") <br>
											private double quantityOrdered; <br> <br>
											@Column(name = "orderLineNumber") <br> private int
											orderLineNumber; <br>}<br> <br> <i>//It
												must be Serializable</i> <br> <b>@Embeddable</b> <br>public
											class OrderDetailsPKConst implements Serializable { <br>
											@ManyToOne <br> @JoinColumn(name = "orderNumber") <br>
											private OrdersVO orderNumber; <br> <br> @ManyToOne
											<br> @JoinColumn(name = "productCode") <br> private
											ProductsVO productCode; <br> <i>//It must have a
												no-arg constructor</i> <br> public OrderDetailsPKConst() {}
											<br> <br> <i>//It must define equals() and
												hashCode() methods </i> <br> public int hashCode(){....} <br>
											public boolean equals(Object obj){....}<br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="orderdetailsTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Orderdetails Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/ordersdetails.jpg" class="img-fluid"
								alt="Orderdetails Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- PaymentsTable-------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="PaymentsTable" class="container-fluid details">
				<h2>PaymentsTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `payments` ( <br>`customerNumber` int(11)
											NOT NULL, <br>`checkNumber` varchar(50) NOT NULL, <br>`paymentDate`
											date NOT NULL, <br>`amount` decimal(10,2) NOT NULL, <br>PRIMARY
											KEY (`customerNumber`,`checkNumber`), <br>CONSTRAINT
											`payments_ibfk_1` FOREIGN KEY <br>(`customerNumber`)
											REFERENCES `customers` <br>(`customerNumber`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#paymentsTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											<b><i></i>here we achieve composite primary key by
												@idclass</b> <br>@Entity <br>@Table(name = "payments")
											<br>@IdClass(PaymentsPKConst.class) <br>public
											class PaymentsVO { <br> @Id <br> @ManyToOne <br>
											@JoinColumn(name = "customerNumber") <br> private
											CustomersVO customersVO; <br> <br> @Id <br>
											@Column(name = "checkNumber", columnDefinition = "varchar(50)
											NOT NULL") <br> private String checkNumber; <br> <br>
											@Column(name = "paymentDate", columnDefinition = "date NOT
											NULL") <br> private Date paymentDate; <br> <br>
											@Column(name = "amount", columnDefinition = "decimal(10,2)
											NOT NULL") <br> private double amount; <br>}<br>
											<br> <br>public class PaymentsPKConst implements
											Serializable { <br> private CustomersVO customersVO; <br>
											private String checkNumber; <br>public PaymentsPKConst()
											{}<br> public int hashCode() {....}<br>public
											boolean equals(Object obj) {....)<br> }<br> <b><i>In
													order to define the composite primary keys, we should
													follow some rules:
													<ul>
														<li>The composite primary key class must be public
														<li>It must have a no-arg constructor
														<li>It must define equals() and hashCode() methods
														<li>It must be Serializable
													</ul>
											</i></b>

										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="paymentsTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Payments Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/payments.jpg" class="img-fluid"
								alt="Payments Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- ProductlinesTable---------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="ProductlinesTable" class="container-fluid details">
				<h2>ProductlinesTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `productlines` ( <br>`productLine`
											varchar(50) NOT NULL, <br>`textDescription`
											varchar(4000) DEFAULT NULL, <br>`htmlDescription`
											mediumtext, <br>`image` mediumblob, <br>PRIMARY KEY
											(`productLine`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#productlinesTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "productlines") <br>public
											class ProductLinesVO { <br> @Id <br> @Column(name =
											"productLine", columnDefinition = "varchar(50) NOT NULL") <br>
											private String productLine; <br> <br> @Column(name
											= "textDescription", columnDefinition = "varchar(4000)
											DEFAULT NULL") <br> private String textDescription; <br>
											<br> @Column(name = "htmlDescription", columnDefinition
											= "mediumtext") <br> private String htmlDescription; <br>
											<br> @Column(name = "image", columnDefinition =
											"mediumblob") <br> private Blob image; <br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="productlinesTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Product-lines Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/productlines.jpg" class="img-fluid"
								alt="Product-lines Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- ProductsTable-------------------------------------------------------------------------------------------------------------------------------------- -->
			<div id="ProductsTable" class="container-fluid details">
				<h2>ProductsTable</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col">
							<div class="card h-100">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">MySql Create Table</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											CREATE TABLE `products` ( <br>`productCode` varchar(15)
											NOT NULL, <br>`productName` varchar(70) NOT NULL, <br>`productLine`
											varchar(50) NOT NULL, <br>`productScale` varchar(10) NOT
											NULL, <br>`productVendor` varchar(50) NOT NULL, <br>`productDescription`
											text NOT NULL, <br>`quantityInStock` smallint(6) NOT
											NULL, <br>`buyPrice` decimal(10,2) NOT NULL, <br>`MSRP`
											decimal(10,2) NOT NULL, <br>PRIMARY KEY (`productCode`),
											<br>KEY `productLine` (`productLine`), <br>CONSTRAINT
											`products_ibfk_1` FOREIGN KEY <br>(`productLine`)
											REFERENCES `productlines` (`productLine`))
										</code>
									</div>
									<br>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#productsTableModal">See
										Structure</button>
								</div>
							</div>

						</div>
						<div class="col">
							<div class="card h-100 ">
								<div class="card-body">
									<div class="nav bg-primary px-2 pt-2 text-white">
										<h4 class="card-title">Hibernate Entity Class</h4>
									</div>
									<div class="card-text px-2 pt-2">
										<code>
											@Entity <br>@Table(name = "products") <br>public
											class ProductsVO { <br> @Id <br>
											@GeneratedValue(strategy = GenerationType.AUTO) <br>
											@Column(name = "productCode", columnDefinition = "varchar(15)
											NOT NULL") <br> private String productCode; <br> <br>
											@Column(name = "productName", columnDefinition = "varchar(70)
											NOT NULL") <br> private String productName; <br> <br>
											@ManyToOne <br> @JoinColumn(name = "productLine") <br>
											private ProductLinesVO productLinesVO; <br> <br>
											@Column(name = "productScale", columnDefinition =
											"varchar(10) NOT NULL") <br> private String
											productScale; <br> <br> @Column(name =
											"productVendor", columnDefinition = "varchar(50) NOT NULL") <br>
											private String productVendor; <br> <br>
											@Column(name = "productDescription", columnDefinition = "text
											NOT NULL") <br> private String productDescription; <br>
											<br> @Column(name = "quantityInStock", columnDefinition
											= "smallint(6) NOT NULL") <br> private int
											quantityInStock; <br> <br> @Column(name =
											"buyPrice", columnDefinition = "varchar(15) NOT NULL") <br>
											private double buyPrice; <br> <br> @Column(name =
											"MSRP", columnDefinition = "decimal(10,2) NOT NULL") <br>
											private double mspr; <br>}
										</code>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="productsTableModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Products Table UML</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img src="pic/products.jpg" class="img-fluid"
								alt="Products Table UML img">
						</div>
					</div>
				</div>
			</div>
			<!-- ################################################################################################################################################### -->
			<div id="projectReferences" class="container-fluid details">
				<h2>ProjectReferences</h2>
				<div class="card">
					<div class="card-body">
						<b>This References are useful for me:</b>
						<ul>
							<li><a
								href="https://www.youtube.com/watch?v=Yv2xctJxE-w&list=PL4AFF701184976B25">Hibernate
									Tutorial YouTube By Java Brains</a>
							<li><a
								href="https://www.youtube.com/watch?v=0hm3QidFwYY&list=PLEAQNNR8IlB7fNkRsUgzrR346i-UqE5CG&index=2&t=201s">Hibernate
									Tutorial YouTube by luv2code</a>
							<li><a
								href="https://www.youtube.com/watch?v=7TOmdDJc14s&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46">Servlet
									and JSP Tutorial Telusko</a>
							<li><a href="https://www.javatpoint.com/hibernate-tutorial">hibernate-tutorial
									javatpoint</a>
							<li><a href="https://www.javatpoint.com/servlet-tutorial">servlet-tutorial
									javatpoint</a>
							<li><a href="https://www.javatpoint.com/jsp-tutorial">jsp-tutorial
									javatpoint</a>
							<li><a
								href="https://getbootstrap.com/docs/4.4/getting-started/introduction/">Bootstrap</a>
						</ul>
					</div>
				</div>

			</div>
			<div id="TechnologyAndTools" class="container-fluid details">
				<h2>Technology And Tools used</h2>
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/java.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Java 8</h5>
									<!-- <p class="card-text">Java programming is used for building
											this project. Various Oop's concepts ate use in this project
											such as Inheritance, Polymorphism, Interface, Class.</p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/hibernate.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Hibernate 5.4</h5>
									<!-- <p class="card-text">Hibernate Framework is used to
											interact with the database. Along with JPA (Java Persistence
											API) for data persistence. We use annotations for Entity
											class building.</p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/javaservlet.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Servlet 3.1</h5>
									<!-- <p class="card-text">Servlet technology is used to create
											a web application (resides at server side and generates a
											dynamic web page).Mainly used HttpServlet class.</p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/jsp.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">JSP</h5>
									<!-- <p class="card-text">Mainly JSP technology is used to
											create web pages containing HTML codes. We also use JSTL(JSP
											Standard Tag Library).</p> -->
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/tomcat.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Tomcat 9.0</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/mysql.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">MySql 5.7</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">

							<div class="card" style="width: 18rem;">
								<img src="pic/maven.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Maven</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/github.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Git(Using github)</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/html.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">HTML</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/bootstrap.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Bootstrap</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">

							<div class="card" style="width: 18rem;">
								<img src="pic/gson.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">GSON</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
						<div class="col-lg-3 d-flex align-items-stretch">
							<div class="card" style="width: 18rem;">
								<img src="pic/js.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">JavaScript</h5>
									<!-- <p class="card-text"></p> -->
								</div>
							</div>
						</div>
					</div>
				</div>
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