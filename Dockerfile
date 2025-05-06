# Imagen base de Java
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copiar archivos del proyecto al contenedor
COPY . .

# Empaquetar el proyecto con Maven
RUN ./mvnw package -DskipTests

# Ejecutar la app
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
