# spring-boot-sayaj1


First step would be connecting to a Postgres Database which does not have any tables yet.

Then go into " ./sayaj/src/main/resources/META-INF " . There is a file "application.yml". This file contains the information to connect to the database. To change the file, after   "jdbc-postgresql:" add the address of your database. Change the information for "username:" and  "password:" according to your username and password. 

The java file with the main method is SayajApplication.java which chan be find in " ./sayaj/src/main/java/com/udarn/sayaj " . In the case that the execution by terminal using javac SayajApplication.java and then java SayajApplication does not work, I used IntelliJ Community Version IDE 2021-1 and it executed as expected.

Tomcat is generally started on port 8080 but if needed that information is visible in the execution information (the code automatically outputs the port by saying Tomcat started on port  ----). The output will be visile if you go to (by writing this in the address bar for example) « http://localhost:8080/api/v1/employee ».

Provided that the execution did not cause any errors, the moment you visit the above link, you will see all the employees (which is nothing as the table is empty). If you add some employees (./sayaj/src/main/resources/db.migration/V1__EmployeeTable.sql has the create query for the table showing the constrains on the data), and refresh the page you will see all the added employees. 

To see an employee with a specific id, use this link http://localhost:8080/api/v1/employee/? where ? should be replaced with an integer used as an id.
