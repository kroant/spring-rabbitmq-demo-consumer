# Spring RabbitMQ Demo Consumer

## Requirements
- JDK 21
- Docker

## How to run
Build the application and run tests:

`./gradlew clean build`

Run the application:

`./gradlew bootRun`

### Run in Docker (optional)

Build the image:

`./gradlew bootBuildImage`

Run the application:

`docker run spring-rabbitmq-demo-consumer:latest`

## Task
Consumes RabbitMQ messages.