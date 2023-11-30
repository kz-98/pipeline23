FROM openjdk:8-jdk-oraclelinux8

COPY target/*.jar spmvc.jar

EXPOSE 8083

CMD ["java", "-jar", "spmvc.jar"]