FROM openjdk:8-jre-alpine
COPY /target/wlcp-discovery-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
CMD ["/usr/bin/java", "-jar", "app.jar"]