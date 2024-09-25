# Java Web Server
This is a Simple Web Server using Java. It could be utilised for a new projects to create a new RESTful API or 
used a health check endpoint for your microservices. It's a simple web server using built-in JDK libraries.

<div style="text-align: center; width: 100%;" align="centre">
    <img style="max-width: 100%; width: 320px;" src="https://github.com/user-attachments/assets/d26641b5-a561-48fe-90f9-bf85fdbb08bf?raw=true" alt="Java Web Server Cover">
</div>


## Environment
 * OpenJDK Runtime Environment (build 24-ea+16-1800)
 * OpenJDK 64-Bit Server VM (build 24-ea+16-1800, mixed mode, sharing)


## Docker
Used official Oracle Docker Image for this Web Server in Java `openjdk:24-oracle`. Please see below running it 
inside a Docker container.

```bash	
docker run -it --rm --name java-web-server-syniol -v "$PWD":/usr/local/app --workdir /usr/local/app -p 8080:80 openjdk:24-oracle bash
```


## Up and Running
Enter the container and run the following commands to transpile `Server.java` to bytecodes and then to run it using `java` runtime.
```bash
javac Server.java
java Server
```

The when you open your browser with URL address: `http://localhost:8080/health`, you should see the response below.

```json
{
  "status": "OK"
}
```


## Packaging
You could also use __Jar__ to create a package to run instead.

```bash
jar cvfm Server.jar manifest.txt *.class  **/*.class
java -jar Server.jar
```


## Useful Commands
You could alternatively use `make` command at the root of this project to build and run the web server.

```bash
make
```


#### Credits
Copyright &copy; 2024 Syniol Limited. All rights reserved.
