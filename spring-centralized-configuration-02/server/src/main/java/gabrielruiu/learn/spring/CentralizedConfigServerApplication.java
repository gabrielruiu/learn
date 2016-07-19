package gabrielruiu.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CentralizedConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedConfigServerApplication.class, args);
	}
}
