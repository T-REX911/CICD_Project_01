# Use a base image with JDK 24
FROM openjdk:24-slim

# Copy the jar file to the container
ADD target/CICD_Project_01.jar CICD_Project_01.jar

# Expose the port defined in application.properties
EXPOSE 6380

# Command to run the application
ENTRYPOINT ["java", "-jar", "CICD_Project_01.jar"]