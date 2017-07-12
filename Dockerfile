FROM openjdk:8-jre-alpine
COPY target/sentinel-0.1.jar /emp.jar
COPY application.properties /application.properties
CMD java -jar /emp.jar
