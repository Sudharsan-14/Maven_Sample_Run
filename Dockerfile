FROM openjdk:17

WORKDIR D:\Automation\maven_sample_run

EXPOSE 8080

ADD target/maven_sample_run-pro.jar maven_sample_run-pro.jar

ENTRYPOINT ["java","-jar", "/maven_sample_run-pro.jar"]