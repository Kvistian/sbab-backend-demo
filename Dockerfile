FROM openjdk:19
ADD target/sbab-backend-demo-1.0-SNAPSHOT.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]
