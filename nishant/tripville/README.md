This project is a maven based project. Using maven, eclipse project file has also been generated.
Project uses online deployed mysql database, so if you have maven installed on your system, this project works out of the box.

Once Maven is installed, the project can be bundled into a war package for deployment on tomcat using below command:

	mvn clean install -Dgpg.skip=true 

Then the tripville.war can be moved to the tomcat-installation-directory/webapps/

No further configuration is needed.

