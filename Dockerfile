FROM openjdk:8

EXPOSE 8082

ADD target/JenkinTestJar.jar JenkinTestJar.jar

ENTRYPOINT [ "java","-jar","/JenkinTestJar.jar" ]