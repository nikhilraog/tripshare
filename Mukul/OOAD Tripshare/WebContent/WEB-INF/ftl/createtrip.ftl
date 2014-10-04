<#import "lib/utils.ftl" as u> 

<@u.sitetemplate>

<div id="content">
  <fieldset>
  	<legend>New Trip</legend>
  	<form name="trip" action="createNewTrip.html" method="post">
    From: <output> <input type="text" name="source" /> <br/>
    To: <input type="text" name="destination" />   <br/>
    
    Date: <input type="text" name="startDate" /> <br/>
    Time: <input type="text" name="startTime" />   <br/>
    
    Avilable Seats: <input type="text" name="availableSeats" /> <br/>
    Expected Charges: <input type="text" name="rent" /> <br/>
    
    <input type="submit" value="   Submit   " />
    <input type="submit" value="   Reset   " />
    <input type="submit" value="   Cancel   " />
  </form>
  </fieldset>
</div>    

</@u.sitetemplate> 
  