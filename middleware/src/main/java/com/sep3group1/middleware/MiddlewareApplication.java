package com.sep3group1.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiddlewareApplication {
	// To test if it works on your machine, try to go to http://localhost:8080/devtest/api/cars/1
	// and see if you get details about the default car (also have the backend running)…
	public static void main(String[] args) {
		SpringApplication.run(MiddlewareApplication.class, args);
	}
}
