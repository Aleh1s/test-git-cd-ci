FROM openjdk:17
EXPOSE 8080
ADD target/test-git-cd-ci.jar test-git-cd-ci.jar
ENTRYPOINT ["java", "-jar", "/test-git-cd-ci.jar"]