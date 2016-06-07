FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD eureka-client-1.0-SNAPSHOT.jar eureka-client.jar
RUN sh -c 'touch /eureka-client.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/eureka-client.jar"]