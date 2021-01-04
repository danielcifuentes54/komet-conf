FROM openjdk:11.0.9.1-jre
COPY target/*.jar app.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/app.jar"]