package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
/*
    Status is default to 200 but we can specify with this annotation
 */
@ResponseStatus(HttpStatus.ACCEPTED)
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {
        return "Request accepted: " + message;
    }

    @PostMapping("/postOrder")
    public String postOrder(@RequestBody Order order) {
        return "Request accepted: " + order.toString();
    }
}
