FROM openjdk:17
EXPOSE  8080
ADD target/docker-mongo.jar docker-mongo.jar
ENTRYPOINT ["java", "-jar", "/docker-mongo.jar"]