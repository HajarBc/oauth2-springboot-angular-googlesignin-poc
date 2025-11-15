FROM maven:3.9.2-eclipse-temurin-17

WORKDIR /app

COPY authorization-server/ ./

RUN mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]

