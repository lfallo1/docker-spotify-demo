FROM ubuntu:latest

MAINTAINER Lance Fallon "fallon.lance@gmail.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin/

COPY rest-api-demo-1.0.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "rest-api-demo-1.0.jar"]