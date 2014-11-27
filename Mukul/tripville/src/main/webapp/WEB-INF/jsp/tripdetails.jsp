<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<title>Tripville - Manage Trip</title>
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
				<h3>Manage trip from ${trip.fromAddress} to ${trip.toAddress} on ${formattedStartDate}</h3>
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
								<!-- <legend> New Trip</legend> -->

								<div class="form-group">
									<label for="fromAddressInput" class="col-lg-3 control-label">From</label>
									<div class="col-lg-9">
										<label for="fromAddressInput" class="col-lg-3 control-label">${trip.fromAddress}</label>
										
									</div>
								</div>

								<div class="form-group">
									<label for="toAddressInput" class="col-lg-3 control-label">To</label>
									<div class="col-lg-9">
									<label for="toAddressInput" class="col-lg-3 control-label">${trip.toAddress}</label>
									</div>
								</div>

								
								<div class="form-group">
									<label for="startDateInput" class="col-lg-3 control-label">Start Date</label>
									<div class="date form_date col-lg-9">
										<label for="startDateInput" class="col-lg-3 control-label">${trip.startDate}</label>
									</div>
								</div>
								<div class="form-group">
									<label for="startTimeInput" class="col-lg-3 control-label">Start Time</label>
									<div class="col-lg-9">
										<label for="startTimeInput" class="col-lg-3 control-label">${trip.startTime}</label>
									</div>
								</div>
								<div class="form-group">
									<label for="numofcopassengersInput" class="col-lg-3 control-label">No of Co-Passengers</label>
									<div class="col-lg-9">
										<label for="numofcopassengersInput" class="col-lg-3 control-label">${trip.numofcopassengers}</label>
									</div>
								</div>																
								<div class="form-group">
									<label for="rentInput" class="col-lg-3 control-label">Cost per person</label>
									<div class="col-lg-9">
										<label for="rentInput" class="col-lg-3 control-label">${trip.rent}</label>
									</div>
								</div>
								<div class="form-group">
									<label for="commentsInput" class="col-lg-3 control-label">Comments</label>
									<div class="col-lg-9">
										<label for="commentsInput" class="col-lg-3 control-label">${trip.comments}</label>
									</div>
								</div> 

								
								<!-- <div class="col-lg-9 col-lg-offset-3">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Submit">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Reset">
									<input class="btn btn-primary" type="submit" name="btnClk" value="Cancel">
								</div>  -->

							</fieldset>
							
							<c:if test="${not empty tripRequestList}">
							<br>
							<br>
							
							<table class="table table-striped">
							 <tr>
							    <th>Sent By</th>
							    <th>Status</th>
							    <th>Action</th>
							  </tr>
							
							
							<c:forEach var="tripReq" items="${tripRequestList}">
							
							<tr>
								<td>${tripReq.copassid} </td>
								<td>${tripReq.status} </td>
								<td></td>
							</tr>
							</c:forEach>
							
							</table>
							
							</c:if>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>