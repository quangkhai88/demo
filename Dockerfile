# syntax=docker/dockerfile:experimental

FROM openjdk:8-jdk-alpine

COPY pom.xml .
COPY src src
RUN mvn install -DskipTests

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
