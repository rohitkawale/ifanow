FROM openjdk:8
ADD target/ifanowDocker.jar ifanowDocker.jar
EXPOSE 8080
ENTRYPOINT  ["java", "-Dspring.data.mongodb.uri=mongodb://mongo/test", "-jar", "ifanowDocker.jar"]