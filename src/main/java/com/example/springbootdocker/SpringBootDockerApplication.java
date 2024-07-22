package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		System.out.println(" 20240722 CiccioStart");
		System.err.println("20240722 Ciccio err provola");
		SpringApplication.run(SpringBootDockerApplication.class, args);
		System.out.println("20240722 CiccioStart");
	}
	
    /*@GetMapping("/hello")*/
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("20240722 Ciccio out "+name);
		System.err.println("20240722 Ciccio err "+name);
    	return String.format("Hello %s!", name);
     
    }

}
