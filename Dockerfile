FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ADD target/*.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

