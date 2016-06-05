FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD spring-centralized-configuration-client-1.0-SNAPSHOT.jar spring-centralzied-configuration-client.jar
RUN sh -c 'touch /spring-centralzied-configuration-client.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/spring-centralzied-configuration-client.jar"]