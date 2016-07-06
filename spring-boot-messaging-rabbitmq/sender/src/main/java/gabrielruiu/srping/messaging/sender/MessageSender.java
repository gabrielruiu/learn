package gabrielruiu.srping.messaging.sender;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@Component
public class MessageSender {

    @Autowired
    RabbitMessagingTemplate template;

    public void send(String message) {
        template.convertAndSend("message-queue", message);
    }
}
