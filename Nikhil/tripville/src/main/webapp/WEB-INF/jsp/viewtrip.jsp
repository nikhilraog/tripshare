
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<title>Insert title here</title>
</head>
<body>
View Trip page

<c:if test="${not empty driverTripList}">
<br>
<br>

<table class="table table-striped">
 <tr>
 	<th>TripCode</th>
    <th>From</th>
    <th>Destination</th>
   <!--  <th>No of co-passesnger</th> -->
    <th> AvailableSeats</th>
    <th> Start date<th>
    <th> Rent </th>
    
  </tr>


<c:forEach var="trip" items="${driverTripList}">

<tr>
	<td><a href="#" >${trip.getTripId()}</a></td>
	<td>${trip.fromAddress}</td>
	<td>${trip.toAddress} </td>
	<%-- <td>${trip.getAvailableSeats()}</td> --%>
	<td>${trip.getNumofcopassengers()}</td>
	<td>${trip.getStartDate()}</td>
	<td>${trip.getRent()}</td>
</tr>
</c:forEach>

</table>

</c:if>
</body>
</html>