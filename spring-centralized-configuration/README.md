How to setup a centralized configuration server (just gives out property values) and a client which gets its property values from that server.

I went the extra mile and dockerized both instances, but as they are right now, the client docker instance will fail because it will not be able to populate the required properties for its beans.
This is beacuse its trying the access the config server at localhost:8888, which doesn't exist because ist not the localhost which has the config server, its the other docker instance. Maybe I can network them somehow and in the end manage them both using _docker-compose_

Link: https://spring.io/guides/gs/centralized-configuration/
