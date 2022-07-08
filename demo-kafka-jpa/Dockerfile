FROM alpine:3.8

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#docker build -t springio/gs-spring-boot-docker .