package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("greet")
	public String greetData() {
		
		return "This is a greeting !!!!";
	}

}
