FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/postservice-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 6060

ENTRYPOINT ["java","-jar","app.jar"]