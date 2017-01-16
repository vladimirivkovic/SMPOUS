# SMPOUS
##This project demonstrates usage of Microservice Architecture using Spring Cloud and Netflix
##Project contains four microservices: User, ShoppingCart, Product and Payment
##Project contains services for microservice auto-discovery: Eureka microservice and request proxy service: Zool microservice
##Project demonstrates usage of Netflix load balancers: Hystrics and cicuit brakers: Ribbon
# Frontend
##Install all dependencies by calling ```npm install``` in frontend folder.
##Start frontend server by calling ```npm start``` in frontend folder.
##Requirements
The requirements for running this demo on your machine are found below.
⋅⋅* Maven 3
⋅⋅* Java 8
⋅⋅* Docker
⋅⋅* Docker Compose
#Building the project
To build the project, from the terminal, run the following commands at the root of the project.
```shell
mvn clean install
docker-compose up

```
