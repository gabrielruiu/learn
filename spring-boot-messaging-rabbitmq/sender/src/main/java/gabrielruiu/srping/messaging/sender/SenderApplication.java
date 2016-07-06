package gabrielruiu.srping.messaging.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SenderApplication {

	@Bean
	Queue queue() {
		return new Queue("message-queue", false);
	}

	public static void main(String[] args) {
		SpringApplication.run(SenderApplication.class, args);
	}
}
