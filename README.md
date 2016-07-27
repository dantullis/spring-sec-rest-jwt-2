# spring-sec-rest-jwt (SpringBoot, Spring Security, REST API, and JWT - Part 2)

[![Build Status](https://travis-ci.org/dantullis/spring-sec-rest-jwt-2.svg?branch=master)](https://travis-ci.org/dantullis/spring-sec-rest-jwt-2)

This is a starter "Java Spring Boot" backend-server web application with Spring Security, REST API, and JWT auth token. It is based on the newer [Spring][httpSpring.io] "Java config annotations", rather than XML configuration(or even the mixed "XML configuration with annotations"). 

### PROJECT ATTRIBUTES:
- Database authentication
- Easily import project into [Spring Tool Suite][httpSpringToolSuite] IDE
- [Maven][httpMavenRepo] project eases dependency needs

### TOOLING REQUIREMENTS:
- Download and install the Java JDK SE. Not the JRE version.
- Download and install Spring Tool Suite. It is based on the Eclipse IDE.
- Download and install MySql Community Server and MySQL Workbench.

### TOOL DOWNLOAD URLs:
- Java JDK - (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- STS IDE - (https://spring.io/tools/sts/all)
- MySQL Community Server - (https://dev.mysql.com/downloads/mysql/)
- MySQL Workbench - (http://dev.mysql.com/downloads/workbench/)

### SETUP WORKSPACE FOLDER
On your development machine create a new folder. Name it what you want but for this document it will be called `WORKSPACE_FOLDER`.

Now open Spring Tool Suite and create a new workspace. Point the workspace to the `WORKSPACE_FOLDER` listed above.

### PROJECT DOWNLOAD
Now you will download the project. You have two ways to do this. If you have a local installation of git, you can do it by simply cloning this repository:

```
    cd to WORKSPACE_FOLDER
    git clone https://github.com/dantullis/spring-sec-rest-jwt-2.git
```

If you don't have git installed, you can download a `.zip` by pressing on the *Download zip* button in the upper side of this page. Download and unzip it to the `WORKSPACE_FOLDER`.

### IMPORT PROJECT INTO STS
- Open the Spring Tool Suite IDE.
- Select the workspace noted above location for this project.
- From the menu select Menu--> Import...
- In the "import" window expand the "Maven" folder.
- Choose "Existing Maven Projects" and press "Next".
- In the "Import Projects" press on the "Browse..." button next to "Select root directory".
- Browse to the `WORKSPACE_FOLDER` noted above and select the folder "backend".
- You should now see a project selected in the "Projects" list box.
- Make sure you don't check "Copy projects into workspace". The project will already be in that folder.
- Press the "Finish" button.

### FINISH PROJECT SETUP
There will be a few minor steps to finish the setup.
 - Finally, update Maven by right-clicking on the project name. Then choose Maven --> Update Project.

### SETUP DATABASE SERVER
You can use other database servers. The application.properties and pom.xml are setup for MySQL. You will need to change accordingly.
 - Database table(s) will be setup automatically based on the @Entity annotation in the model classes.
 
### RUN PROJECT:
Once completed you can Right-click on the project and select "Run As --> Spring Boot App". 
The first time you do this there will be some configuration steps performed. Subsequent runs will not need that.

### TEST PROJECT
 - Open a web browser and navigate to http://localhost:8080
 - You will need a web client to connect. Testing client will be posted soon.

### DEBUG PROJECT(Java)
To debug the Java code in the project do the following:
 - Place a break point in the Java code 
 - Right-click on the project name and select "Debug as --> Spring Boot App".
 - Exercise a web client application and you will see a window asking you to use the "debug perspective".

### PROBLEMS
You can look in the following places for possible problem resolutions:
 - Console tab in the STS IDE
 - Problems tab in the STS IDE. Enable it(Window-->Show View --> Other --General -- Problems)
 
 
### CREDITS: 
These projects will build on parts of the fine work found in the following places:

(https://github.com/raydeng83/lagoon/tree/master/backend)

(https://github.com/codesandnotes/secure-rest-spring-tut)

(https://spring.io/blog/2015/06/08/cors-support-in-spring-framework#filter-based-cors-support)

License
----

MIT

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [httpSpring.io]: <https://spring.io/>
   [httpSpringToolSuite]: <https://spring.io/tools>
   [httpMavenRepo]: <http://mvnrepository.com/>
   [httpSpring.io]: <https://spring.io/>
