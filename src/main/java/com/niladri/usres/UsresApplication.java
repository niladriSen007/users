package com.niladri.usres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UsresApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsresApplication.class, args);
	}

}
