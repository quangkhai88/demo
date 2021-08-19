# syntax=docker/dockerfile:experimental

FROM maven:3.6.3-jdk-8-slim

COPY pom.xml .
COPY src src
RUN mvn package -DskipTests

RUN mv target/*.jar target/app.jar

ENTRYPOINT ["java","-jar","target/app.jar"]
