package dev.superr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Value("${String.hello}")
    private final String hello;

    public StringController(@Value("${String.hello}") String hello) {
        this.hello = hello;
    }

    @GetMapping("/api/hello")
    public String getHello() {
        return hello;
    }

    @GetMapping("/api/hello2")
    public String getHello2() {
        return hello+"22";
    }

}
