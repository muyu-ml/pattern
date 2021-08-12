FROM openjdk:8u181-jdk-alpine
ARG workdir=/data/app/edge
VOLUME ${workdir}
WORKDIR ${workdir}
ADD demo.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
