Date : 09/29/2014

This is the root readme file for this project. 

Authors:

		Nishant Garg
		Pulkit Khemka
		Nikhil G Rao
		Gautham Suriya M
		Mukul Kulkarni

Nikhil:  

	Just added Dummy Weather Service app for your referece to get stared with Spring .Please go through
        the tutorials in Youtube on spring (any) ex: javabrains koushik spring or better Tutorials.
        Link References:
		For Spring - JDBC Connect please go through this 

		http://docs.spring.io/docs/Spring-MVC-step-by-step/part5.html
		http://www.beingjavaguys.com/2013/07/spring-jdbc-template-with-spring-mvc.html
	
Mukul:	

	http://viralpatel.net/blogs/spring-mvc-freemarker-ftl-example/	

Nishant: 

	Look in nishant/tripville for Spring + Hibernate based implementatin of Login system using MYSQL. 
	Database is online, no local config needed

Git Reference:

Workflow :

	Pull latest changes before working on the repository.
	Work on code, make changes.
	Pull latest changes again to make sure there is no conflict.
	Add changes to the stage.
	commit changes
	push changes

Update your repository:

	git pull -u

Push changes to Github:
Since you are already in this repository, remote is already setup.
You can directly run following on the command line:

	git push origin master -u
If you are experience any errors related to authentication, do this:

	git remote set-url origin https://tripville@github.com/tripville/tripshare.git
Committing changes:

Everytime you add a new file or make changes to existing file, you have to add
files to the stage using following command :

	git add filename1 filename2
You can add everychange in one go, this add every filechange and new file
to the stage:

	git add .
Then go and commit :

	git commit -m "message"

