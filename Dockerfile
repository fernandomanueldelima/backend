# Etapa 1: build
FROM maven:3.9.5-eclipse-temurin-21 AS build
COPY pom.xml mvnw ./
COPY .mvn .mvn
COPY src src
RUN mvn clean package -DskipTests

# Etapa 2: runtime
FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY --from=build target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
