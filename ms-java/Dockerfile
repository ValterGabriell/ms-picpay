FROM openjdk:17
MAINTAINER github/valtergabriell

COPY ./picpay-ms.jar /app/banking-ms.jar

WORKDIR  /app

ENTRYPOINT ["java","-jar", "banking-ms.jar"]

EXPOSE 8080

