FROM openjdk:17

EXPOSE 8080

COPY ./target/test-git-cd-ci-30-03.jar /apps/app.jar
COPY ./entrypoint.sh /apps/entrypoint.sh

RUN chmod +x /apps/entrypoint.sh

CMD ["/apps/entrypoint.sh"]