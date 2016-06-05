package learn.spring.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@SpringBootApplication
@EnableConfigServer
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
