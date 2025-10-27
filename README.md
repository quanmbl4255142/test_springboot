# Spring Boot Backend

Simple REST API backend built with Spring Boot.

## Run

```bash
mvn spring-boot:run
```

Or build and run:

```bash
mvn clean package
java -jar target/springbootbackend-0.0.1-SNAPSHOT.jar
```

Server will start on http://localhost:8080

## Endpoints

- GET `/api/hello` - Hello message
- GET `/api/users` - Get list of users
- GET `/api/health` - Health check
