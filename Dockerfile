FROM openjdk:17-oraclelinux8

COPY target/*.jar spmvc.jar

EXPOSE 8081

CMD ["java","-jar","spmvc.jar"]