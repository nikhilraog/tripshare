<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<style>
.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
.green {
	font-weight: bold;
	color: green;
}

.message {
	margin-bottom: 10px;
}
</style>
<title>Tripville - Create New Trip</title>
</head>
<body>
	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Home</a></li>
				<li><a href="#">My profile</a></li>
				<li class="active"><a href="login.html">Logout</a></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>

	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Add New Trip</h1>
			</div>
		</div>

		<div></div>
	</div>

	<c:if test="${not empty message}">
		<div class="message green" font-size="175%">${message}</div>
	</c:if>
	
	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form:form id="myForm" method="post"
							class="bs-example form-horizontal" commandName="trip">
							<fieldset>
								<legend> New Trip</legend>

								<div class="form-group">
									<label for="fromAddressInput" class="col-lg-3 control-label">From</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control" path="fromAddress"
											id="fromAddressInput" placeholder="From" />
										<form:errors path="fromAddress" cssClass="error" />
									</div>
								</div>

								<div class="form-group">
									<label for="toAddressInput" class="col-lg-3 control-label">To</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="toAddress" id="toAddressInput" placeholder="To" />
										<form:errors path="toAddress" cssClass="error" />
									</div>
								</div>

								
								<div class="form-group">
									<label for="startDateInput" class="col-lg-3 control-label">Start Date</label>
									<div class="date form_date col-lg-9" data-date-format="mm/dd/yyyy" data-date-viewmode="years">
										<form:input type="text" class="form-control"											
											path="startDate" id="startDateInput"
											placeholder="Start Date" />
										<form:errors path="startDate" cssClass="error" />
									</div>
								</div>
								<div class="form-group">
									<label for="startTimeInput" class="col-lg-3 control-label">Start Time</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="startTime" id="startTimeInput" placeholder="Start Time" />
										<form:errors path="startTime" cssClass="error" />
									</div>
								</div>
								<div class="form-group">
									<label for="numofcopassengersInput" class="col-lg-3 control-label">No of Co-Passengers</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="numofcopassengers" id="numofcopassengersInput" placeholder="No of Co-Passengers" />
										<form:errors path="numofcopassengers" cssClass="error" />
									</div>
								</div>																
								<div class="form-group">
									<label for="rentInput" class="col-lg-3 control-label">Cost per person</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="rent" id="rentInput" placeholder="Cost per person" />
										<form:errors path="rent" cssClass="error" />
									</div>
								</div>
								<div class="form-group">
									<label for="commentsInput" class="col-lg-3 control-label">Comments</label>
									<div class="col-lg-9">
										<form:input type="text" class="form-control"
											path="comments" id="commentsInput" placeholder="Comments" />
										<form:errors path="comments" cssClass="error" />
									</div>
								</div>

								
								<div class="col-lg-9 col-lg-offset-3">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Submit">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Reset">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Cancel">
								</div>

							</fieldset>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>