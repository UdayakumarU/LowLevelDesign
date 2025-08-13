package com.erudayu.LLD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) {
		SpringApplication.run(LldApplication.class, args);
		System.out.println("Hello");
	}

}
