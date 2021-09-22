FROM openjdk:11 as build
MAINTAINER mitko.spasov505@gmail.com
WORKDIR /app
COPY target/elastictest-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "elastictest-0.0.1-SNAPSHOT.jar"]
