#About
This project is a demo project for Spring-Boot. 
It was build with maven and it is conceived to illustrate most of the Spring Boot features presented  [here](https://docs.google.com/presentation/d/1uO_WO8GHi_BT2cBypQ7U3u8liYNGFSrP24UuCTlIVdQ/edit?usp=sharing)

#How to run
* build: mvn package
* run java -jar target/demo-0.0.1-SNAPSHOT.jar

#Pages
* Home page: /movie-catalog/ 
* Users page: /movie-catalog/users/all (required admin rights)

#Features
* Swagger: /movie-catalog/swagger/index.html
* Actuator: /movie-catalog/{endpoint}. Authenticate with admin/admin (or check application.properties for credentials)

#Credentials
(Note) This information is also on the login page
* For demo login use: user@domain.com/12345
* For demo login with admin right use: admin@domain.com/12345
