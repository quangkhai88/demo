    
#FROM maven:3.6.3-jdk-8-slim as BUILD
#RUN mkdir -p /workspace
#COPY . /workspace
#WORKDIR /workspace
#RUN mvn clean package -DskipTests


FROM openjdk:8-jdk-alpine
COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
