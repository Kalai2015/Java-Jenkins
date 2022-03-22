FROM openjdk:8
EXPOSE 8082
ADD target/docker-jenkin-test.jar docker-jenkin-test.jar
ENTRYPOINT [ "java","-jar","/docker-jenkin-test.jar" ]
TEST2
