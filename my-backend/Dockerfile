FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/my-backend-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
