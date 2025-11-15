# Base image
FROM eclipse-temurin:17-jdk

# Directorio de la app
WORKDIR /app

# Copiar código
COPY . .

# Compilar (si tienes Maven)
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Exponer puerto (Spring Boot típico)
EXPOSE 8080

# Ejecutar app
CMD ["java", "-jar", "target/*.jar"]
