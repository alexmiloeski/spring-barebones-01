package org.example.springbarebones01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {

    @Value("${app.var1}")
    private String var1;

    @Value("${app.secone}")
    private String secOne;

    @GetMapping("/hello")
    public HashMap<String, String> hello() {
        System.out.println("Controller.hello");
        System.out.println("var1 = " + var1);
        System.out.println("secOne = " + secOne);
        HashMap<String, String> map = new HashMap<>();
        map.put("var1", var1);
        map.put("secOne", secOne);
        return map;
    }

    @GetMapping("/bye")
    public String bye() {
        System.out.println("Controller.bye");
        return "bye";
    }
}
