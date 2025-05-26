# Use a specific Eclipse Temurin JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/springboot-example-0.0.1-SNAPSHOT.jar springboot-example.jar


# Expose the application port
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "springboot-example.jar"]
