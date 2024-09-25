# JAVA WebServer
This is Java Gorilla Project


## Environment
 * OpenJDK Runtime Environment (build 24-ea+16-1800)
 * OpenJDK 64-Bit Server VM (build 24-ea+16-1800, mixed mode, sharing)


## Docker Command
Used official Oracle Docker Image for this Web Server in Java `openjdk:24-oracle`. Please see below running it 
inside a Docker container.


```bash	
    docker run -it --rm --name java-web-server-syniol -v "$PWD":/usr/local/app --workdir /usr/local/app -p 8080:8080 openjdk:24-oracle bash
```


#### Credits
Copyright &copy; 2024 Syniol Limited. All rights reserved.
