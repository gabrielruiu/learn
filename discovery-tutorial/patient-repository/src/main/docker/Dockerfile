FROM java:8
VOLUME /tmp

ENV DB_URL jdbc:h2:patient
ENV DB_USERNAME db
ENV DB_PASSWORD db
ENV PROFILES in-memory

ADD patient-repository-1.0-SNAPSHOT.jar patient-repository.jar
RUN sh -c 'touch patient-repository.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/patient-repository.jar",
            "-Ddb.url=$DB_URL",
            "-Ddb.username=$DB_USERNAME",
            "-Ddb.password=$DB_PASSWORD",
            "-Dspring.profiles.active=$PROFILES"
            ]