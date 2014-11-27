
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<script  src="jquery-1.8.3.js"type="text/javascript">

</script>
<script type="text/javascript">
function pop(b){
alert("hey!!");

var $row = $(b).closest("tr");    
var $text1 = $row.find(".c1").text()+"@";
var $text2 = $row.find(".c2").text()+"@";
var $text3 = $row.find(".c3").text()+"@";
var $text4 = $row.find(".c4").text();
var data = $text1 + $text2 +$text3 +$text4;
alert("hey!!" + data);
$.get("http://localhost:8080/tripville/tripdetails",{"param1": data}); 
}
</script>

<title>Insert title here</title>
</head>
<body>
View Trip page

<%-- ${passengerTripList} --%>
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
	<td><a href="#"  >${trip.getTripId()}</a></td>
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

<c:if test="${not empty passengerTripList}">
<br>
<br>

<table id="tableId"  class="table table-striped">
 <tr>
 	<th>TripReqCode</th>
 	<th>TripId</th>
    <th>Copass</th>
    <th>Status</th>
   <!--  <th>No of co-passesnger</th> -->
    <!-- <th> AvailableSeats</th>
    <th> Start date<th>
    <th> Rent </th> -->
    
  </tr>


<c:forEach var="trip" items="${passengerTripList}">
<>
<tr>
	<td class="c1"><input type="button"  onclick="pop(this);">${trip.getTripreqid()}</td>
	<td class="c2">${trip.getTripid()}</td>
	<%-- <td>${trip.getTripid()}</td> --%>
	<td class="c3">${trip.getCopassid()} </td>
	<%-- <td>${trip.getAvailableSeats()}</td> --%>
	<td class="c4">${trip.getStatus()}</td>
	<%-- <td>${trip.getStartDate()}</td>
	<td>${trip.getRent()}</td> --%>
</tr>
</c:forEach>

</table>

</c:if>

