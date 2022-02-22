
FROM maven:3.8.4-openjdk-17-slim AS build
RUN mkdir /opt/multi-service
WORKDIR /opt/multi-service
COPY . /opt/multi-service/
RUN mvn clean package


FROM openjdk:17.0.1-slim-buster
COPY --from=build /opt/multi-service/.mvn/maven-wrapper*.jar multi-service.jar
ENTRYPOINT java ${ADDITIONAL_OPTS} -jar unikode-service.jar