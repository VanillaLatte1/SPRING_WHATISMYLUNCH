package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@____ = 어노테이션
@SpringBootApplication
public class spring_project {
	public static void main(String[] args) {
		SpringApplication.run(spring_project.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}
}
