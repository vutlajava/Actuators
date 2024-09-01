package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ActuatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorsApplication.class, args);

}

	void added_branch_1001() {

		System.out.println("Added a method by add_1001");

	}

	void added_master() {

		System.out.println("added by master");
	}

	Void added_master1() {

		System.out.println("added by master 1");
	}
	
	
}
