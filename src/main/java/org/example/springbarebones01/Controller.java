package org.example.springbarebones01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Controller.hello");
        return "hello";
    }

    @GetMapping("/bye")
    public String bye() {
        System.out.println("Controller.bye");
        return "bye";
    }
}
