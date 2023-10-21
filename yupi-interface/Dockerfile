#FROM maven:3.8.1-jdk-8-slim as builder
#
## Copy local code to the container image.
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#
## Build a release artifact.
#RUN mvn package -DskipTests
#
## Run the web service on container startup.
#CMD ["java","-jar","/app/target/Api-backend-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]
FROM openjdk:8
COPY *.jar /yupi-interface-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Xms216m","-Xmx800m","-jar","yupi-interface-0.0.1-SNAPSHOT.jar"]