FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/home/runner/work/demo/target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

