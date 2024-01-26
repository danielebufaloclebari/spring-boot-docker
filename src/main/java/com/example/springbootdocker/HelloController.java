package com.example.springbootdocker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "Hello 2 World, Spring Boot!";
    }
    
    @RequestMapping("/hello2/{name}")
    String hello2(@PathVariable String name) {
        return "Hello 2 World !"+name.toString();
    }

}