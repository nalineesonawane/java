package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjc.main.model.RegisterPage;

@SpringBootApplication
public class DevToolsSpringBootTask1Application {

	public static void main(String[] args) {
		System.out.println("Welcome");
		SpringApplication.run(DevToolsSpringBootTask1Application.class, args);
	}

}
