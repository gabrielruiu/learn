A simple messaging setup with 3 running services:
- sender app
- receiver app
- rabbitmq instance

The RabbitMQ instance is started from a Docker image:
```
docker run -d --hostname my-rabbit --name rabbitmq -p 15672:15672 -p 5672:5672 -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=pass rabbitmq:3.6.2-management
```

Then run the **sender** and **receiver** apps, in that order (check out how to run Spring Boot apps). Remember to use different ports

The **sender** app exposes a REST endpoint, to which you can POST a message.
```
curl -X POST -H "Content-Type: application/json" -d '{
    "message" : "my message"
}' "http://localhost:8081/message"
```

The POSTed message is sent to the **message-queue** destination on RabbitMQ, and the **receiver** gets the message content.

