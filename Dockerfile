FROM openjdk:8-jre
WORKDIR /app
ADD target/hello-0.0.2-SNAPSHOT.jar /app/app.jar
ADD hello.yaml /app/app-config.yaml
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar", "server", "/app/app-config.yaml"]
