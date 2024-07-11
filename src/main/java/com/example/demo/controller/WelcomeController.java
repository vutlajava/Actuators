package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("Welcome")
	public String welcomeMethod() {
		
		return "Welcome Data !!!!";
	}

}
