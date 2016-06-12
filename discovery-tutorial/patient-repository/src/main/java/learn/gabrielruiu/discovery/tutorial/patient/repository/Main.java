package learn.gabrielruiu.discovery.tutorial.patient.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.setDefaultProperties(defaultProperties());
        springApplication.run(args);
    }

    private static Map<String, Object> defaultProperties() {
        Map<String, Object> defaultProperties = new HashMap<>();
        defaultProperties.put("spring.profiles.active", "in-memory");
        return defaultProperties;
    }
}
