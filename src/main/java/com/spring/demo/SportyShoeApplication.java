package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.demo.service.userService;

@SpringBootApplication

public class SportyShoeApplication {

	public static void main(String[] args) {
		System.out.println("starting application");
		SpringApplication.run(SportyShoeApplication.class, args);
		
		
	}

}
