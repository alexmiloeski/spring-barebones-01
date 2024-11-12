package org.example.springbarebones01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {

    @Value("${app.var1}")
    private String var1;

    @Value("${app.secret1}")
    private String secret1;

    @GetMapping("/hello")
    public HashMap<String, String> hello() {
        System.out.println("Controller.hello");
        System.out.println("var1 = " + var1);
        System.out.println("secret1 = " + secret1);
        HashMap<String, String> map = new HashMap<>();
        map.put("var1", var1);
        map.put("secret1", secret1);
        return map;
    }

    @GetMapping("/bye")
    public String bye() {
        System.out.println("Controller.bye");
        return "bye";
    }
}
