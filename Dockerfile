FROM openjdk:8-jre-alpine
COPY target/emp-0.0.1.jar /emp.jar
CMD java -jar /emp.jar
