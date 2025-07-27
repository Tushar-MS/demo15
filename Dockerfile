FROM openjdk:17-jdk-slim
WORKDIR /app
VOLUME /tmp
COPY target/*.jar /app/app.jar
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]