FROM java:8
VOLUME /tmp

ADD patient-repository-1.0-SNAPSHOT.jar patient-repository.jar

RUN sh -c 'touch patient-repository.jar'

ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -Dspring.datasource.url=$DB_URL -Dspring.datasource.username=$DB_USERNAME -Dspring.datasource.password=$DB_PASSWORD -Dspring.profiles.active=$PROFILES -jar /patient-repository.jar