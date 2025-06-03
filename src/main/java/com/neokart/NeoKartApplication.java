package com.neokart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeoKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoKartApplication.class, args);
		System.out.println("NeoKart Application has started successfully!");
	}

}
