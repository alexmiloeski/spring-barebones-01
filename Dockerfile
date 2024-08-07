FROM maven:3.8.7-openjdk-18-slim
WORKDIR /app
COPY . .
RUN mvn clean package
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/target/spring-barebones-01-0.0.1-SNAPSHOT.jar"]
