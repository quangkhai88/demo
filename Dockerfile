# syntax=docker/dockerfile:experimental

FROM maven:3.6.3-jdk-8-slim

COPY pom.xml .
COPY src src
RUN mvn install -DskipTests

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
