FROM openjdk:8-jre-alpine
COPY target/hello-world-1.0-SNAPSHOT.jar /emp.jar
CMD java -jar /emp.jar
