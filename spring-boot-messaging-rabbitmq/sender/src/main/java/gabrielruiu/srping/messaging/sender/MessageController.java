package gabrielruiu.srping.messaging.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@RestController
public class MessageController {

    @Autowired
    MessageSender messageSender;

    @RequestMapping(value = "message", method = RequestMethod.POST)
    public void sendMessage(@RequestBody Message message) {
        messageSender.send(message.getMessage());
    }
}
