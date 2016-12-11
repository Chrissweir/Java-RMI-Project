#Asynchronous RMI String Comparison Service

- Student Name: Christopher Weir
- Student Number: G00309429
- Module: Distributed Systems
- Lecturer: John Healy

##Application Overview##

This Web Application compares two strings and returns the edit distance between them depending on the selected algorithm.

The user selects which algorithm they wish to use from the provided list and then input two strings. The user must then click the Compare
button which will redirect them to another page. This page provides the user with their inputted information and selected algorithm and
informs them that their request is pending. Every 10 seconds the application check if the users request has been completed, if it has
then the result will be displayed on the page.

##Instructions##

To run this application, you'll need the Web Application Archive (War) and the String-Service java application archive (Jar) that are provided in the Deployment folder of this
repository. You must then install the latest version of Apache Tomcat from http://tomcat.apache.org/. After you setup tomcat, you must put the comparaor.war file into the
webapps folder within the apache tomcat directory. Next navigate to the command line, navigate to the apache tomcat bin directory and type startup.bat, which starts tomcat.
Once all that is done, you can start your jar file. To do this simply navigate to the directory you have downloaded the string-service.jar file to and type the following command 
into the command line. java –cp ./string-service.jar ie.gmit.sw.StringServiceServant. This will start the RMI server. Next you can go to Localhost:8080/comparator and you can use the Webapp.

#UML Class Diagram#
![UML Diagram](https://github.com/Chrissweir/Java-RMI-Project/blob/master/UML.png)
