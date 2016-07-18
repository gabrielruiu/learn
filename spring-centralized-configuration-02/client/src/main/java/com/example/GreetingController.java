package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gabriel Mihai Ruiu (gabriel.ruiu@mail.com)
 */
@RefreshScope
@RestController
public class GreetingController {

    @Value("${greeting.prefix}")
    private String prefix;

    @RequestMapping("/greeting/{name}")
    public Greeting getGreeting(@PathVariable("name") String name) {
        return new Greeting(prefix + " " + name);
    }
}
