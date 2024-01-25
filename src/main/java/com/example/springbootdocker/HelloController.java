package com.example.springbootdocker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }
    
    @RequestMapping("/hello/{name}")
    String hello2(@PathVariable String name) {
        return "Hello World !"+name.toString();
    }

}