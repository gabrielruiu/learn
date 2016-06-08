FROM java:8
VOLUME /tmp
ADD patient-repository-1.0-SNAPSHOT.jar patient-repository.jar
RUN sh -c 'touch patient-repository.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/patient-repository.jar"]