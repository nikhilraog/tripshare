<#import "lib/utils.ftl" as u> 

<@u.sitetemplate>

<div id="content">
  <fieldset>
    <legend>Login</legend>
  	<form name="user" action="login.html" method="post">
    Username: <input type="text" name="username" /> <br/>
    Password: <input type="text" name="password" />   <br/>
    <input type="submit" value="   Log-In   " />
  </form>
  </fieldset>
</div>

</@u.sitetemplate> 
  
