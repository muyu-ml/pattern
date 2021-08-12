FROM openjdk:8u181-jdk-alpine
COPY ./target/pattern.jar
WORKDIR /
ENTRYPOINT ["java","-jar","pattern.jar"]
