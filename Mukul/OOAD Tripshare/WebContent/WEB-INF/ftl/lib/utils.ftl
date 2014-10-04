<#macro sitetemplate>
 <link href="./css/sharemycar.css" rel="stylesheet" />
  
 <html>
  <head><title>Share My Car</title>
	<body>
		<div id="header">
			<H2>
    		<a href="./home.html" ><img height="55" width="100" border="0px" src="images/share_my_car.png" align="left" alt="Car Image"/></a>
    		Share My Car
			</H2>
		</div>
    	
    	<#-- This processes the enclosed content:  -->
    	<#nested>
    </body>
  </html>
</#macro>
