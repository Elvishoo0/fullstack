# Imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Instalar Maven
RUN apk add --no-cache maven

# Directorio de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# Construcción sin ejecutar tests
RUN mvn clean package -DskipTests

# Ejecutar la app
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
