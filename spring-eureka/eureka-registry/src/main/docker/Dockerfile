FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD eureka-registry-1.0-SNAPSHOT.jar eureka-registry.jar
RUN sh -c 'touch /eureka-registry.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/eureka-registry.jar"]