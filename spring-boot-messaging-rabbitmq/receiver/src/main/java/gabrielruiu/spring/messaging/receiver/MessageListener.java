package gabrielruiu.spring.messaging.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@Component
public class MessageListener {

    @RabbitListener(queues = "message-queue")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
