# Spring-Boot-Master-Class

````
 java -jar .\demo1-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
 java -jar .\demo1-0.0.1-SNAPSHOT.jar --spring.profiles.active=staging --server.port=3000

````

### Docker
````
docker build -t spring-boot-docker-demo:latest .
docker run -p 8080:8080 springboot-docker-demo:latest
````
