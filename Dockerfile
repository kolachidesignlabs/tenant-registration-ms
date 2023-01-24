FROM openjdk:19-jdk
VOLUME /tmp
ADD target/tenant-registration-ms-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
