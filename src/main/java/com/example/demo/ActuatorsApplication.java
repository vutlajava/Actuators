package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ActuatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorsApplication.class, args);

}

void method1_createdby_1001_user() {

		System.out.println("Method created by user 1001 ");
}

void method2_createdby_master1() {

	System.out.println(" method added by master user");
}
	
	
}
