FROM openjdk:13-alpine
ADD target/book-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
CMD sleep 20s && java -jar /app.jar
