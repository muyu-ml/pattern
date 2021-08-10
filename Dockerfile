FROM jdk1.8
VOLUME /tmp
ADD pattern.jar pattern.jar
ENTRYPOINT ["java","‐jar","/pattern.jar"]
