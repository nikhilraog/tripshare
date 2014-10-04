<#import "lib/utils.ftl" as u> 

<@u.sitetemplate>

<div id="content">
 <fieldset>
  	<legend>Search Trip</legend>
  	<form name="trip" action="performSearchTrip.html" method="post">
    From: <output> <input type="text" name="source" /> <br/>
    To: <input type="text" name="destination" />   <br/>
    
    Date: <input type="text" name="startDate" /> <br/>
    Time: <input type="text" name="startTime" />   <br/>
    
    <input type="submit" value="   Search   " />
    <input type="submit" value="   Reset   " />
    <input type="submit" value="   Cancel   " />
  </form>
  </fieldset>
  
</div>    

</@u.sitetemplate> 
  
