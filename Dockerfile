FROM openjdk:17

WORKDIR D:\Automation\maven_sample_run

COPY pom.xml D:\Automation\maven_sample_run
COPY src D:\Automation\maven_sample_run
RUN mvn -B -f pom.xml clean package -DskipTests


EXPOSE 8080

ADD target/maven_sample_run-pro.jar maven_sample_run-pro.jar

ENTRYPOINT ["java","-jar", "/maven_sample_run-pro.jar"]
