TAA Labs
===================

The goal of this lab is to add support of restful wabservices for your application. 

In order to initialize your project, we provide a tiny sample project to show how to run an JAX-RS application, embedded in Undertow app server, fired up in a `main()` method.

### Getting started

Just build the project:

    mvn clean install
    
and launch the server:

    java -jar target/server-test-1.0-SNAPSHOT.jar
   
You can test the service using 
to get a person
> curl -H "Content-Type: application/json" -X GET http://localhost:8080/status/person

to insert a Person
> curl -H "Content-Type: application/json" -X POST -d '{"name":"test","firstName":"t"}' http://localhost:8080/status/person

You can import this maven project in your favorite IDE. 

# Task 1

Using this example, select an example of RestServices. 

1. You can re-implement [swapi](https://swapi.co/)
2. You can provide a rest access to the [Borg calendar](https://github.com/mikeberger/borg_calendar)
3. you can provide you own Rest API for your tweeter account (http://twitter4j.org/en/index.html)[http://twitter4j.org/en/index.html]. 


The goal is to get a clean CRUD API for you a business layer that allows to interact with your application using retful services.


Maxime provides a complete example with an integration with JPA. https://github.com/maxleiko/taa-jpa. 


# Task 2. 
In following this guide. Integrate swagger with your API

https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5

Look at the three files to understand how you can integrate swagger to your application. Of course, when you go in production, the delivery of swagger-ui static content (JS, html, images)must not be provided by undertow but it must be provided by your nginx or your apache webserver. 

* https://github.com/maxleiko/taa-jpa/blob/master/src/main/java/web/rest/SwaggerResource.java
* https://github.com/maxleiko/taa-jpa/blob/master/pom.xml#L59
* https://github.com/maxleiko/taa-jpa/blob/master/src/main/java/app/RestApplication.java#L20

