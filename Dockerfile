FROM openjdk:8-jdk

RUN mkdir -p /usr/src/app/hello-world
COPY hello-world.yml /usr/src/app/hello-world
COPY example/hello-world-0.0.1-SNAPSHOT.jar /usr/src/app/hello-world

WORKDIR /usr/src/app/hello-world

EXPOSE 8080-8081

CMD ["java","-jar","hello-world-0.0.1-SNAPSHOT.jar","server","hello-world.yml"]