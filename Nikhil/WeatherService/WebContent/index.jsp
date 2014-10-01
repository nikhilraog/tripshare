<html>
<head>
	<title>Perfect Weather!</title>
</head>

<script>
function getWeather(city)
{
	//alert('Yo');
	//var text = document.getElementsById("loc").value;
	var url = "${pageContext.request.contextPath}/weatherCheck?location="+city;
	//var url = "${pageContext.request.contextPath}/weatherCheck?location="+city;
	window.location.href(url);
	
}


</script>


<body>
	Enter a location:<br/>
		
	<input type = "text" id = "tf" name="Enter_Location" value=""><br/>
	<input type = "button" id="loc" onclick="getWeather(document.getElementById('tf').value)" value="Submit">
	
	<!-- <a href="bangalore">Bangalore</a><br/>
	<a href="dallas">Dallas</a><br/>
	<a href="phoenix">Phoenix</a><br/>
	<a href="ny">New York</a><br/>
 -->
 </body>
</html>