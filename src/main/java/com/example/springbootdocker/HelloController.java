package com.example.springbootdocker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
		System.out.println("20240722 Ciccio out Hello2");
		System.err.println("20240722 Ciccio err Hello2");
        return "20240722 Hello 2 World, Spring Boot!";
    }
    
    @RequestMapping("/hello2/{name}")
    String hello2(@PathVariable String name) {
		System.out.println("20240722 Ciccio out Hello2 "+name);
		System.err.println("20240722 Ciccio err Hello2 "+name);
        return "Hello 2 World !"+name.toString();
    }

}