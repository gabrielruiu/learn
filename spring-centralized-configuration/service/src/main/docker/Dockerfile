FROM java:8
VOLUME /tmp

#all git commands are relative to the following directory
#ENV GIT_DIR /home/spring-app/
#ENV GIT_WORK_TREE /home/spring-app

RUN apt-get update
RUN apt-get install -y git
RUN mkdir -p /home/spring-app/
ADD a-bootiful-client.properties /home/spring-app/a-bootiful-client.properties

RUN git config --global user.email "git-docker@gmail.com"
RUN git config --global user.name "Docker Git"

RUN cd /home/spring-app && git init && git add a-bootiful-client.properties && git commit -m "a-bootiful-client property file"

ADD spring-centralized-configuration-service-1.0-SNAPSHOT.jar spring-centralzied-configuration-service.jar
RUN sh -c 'touch /spring-centralzied-configuration-service.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/spring-centralzied-configuration-service.jar"]