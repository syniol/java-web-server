build:
	javac Server.java
	jar cvfm Server.jar manifest.txt *.class  **/*.class
	java -jar Server.jar
