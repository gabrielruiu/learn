FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker-1.0-SNAPSHOT.jar docker-spring.jar
RUN sh -c 'touch /docker-spring.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/docker-spring.jar"]