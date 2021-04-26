# HelloWorld

How to start the HelloWorld application locally
---

1. Start application with `java -jar target/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml`
2. In a separate terminal run `curl http://localhost:8080/hello-world`

How to start HelloWorld using Docker
---

1. Inside the `hello-world` directory, run `docker build --tag hello-world .`
2. Next, run `docker run --name hello-world -p 8080:8080 -d hello-world`
3. In a separate terminal run `curl http://localhost:8080/hello-world`