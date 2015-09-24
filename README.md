TP TAA
===================

Tiny sample project to show how to run an JAX-RS application, embedded inside of Undertow, fired up in a `main()` method.

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

# Task 1

Using this example, merge your business layer and create the restservices using the follwing project. 

The goal is to get a clean CRUD API for you business layer that allows to interact with your business services using retful services.

# Task 2. 
In following this guide. Integrate swagger with your API

https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5



