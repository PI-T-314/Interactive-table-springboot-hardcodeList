package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PeopleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PeopleApplication.class, args);
		PeopleController pc = context.getBean(PeopleController.class);
		System.out.println(pc.sayHello());
	}
	
	//the next 2 methods are to remove the error this is the only solution i found
	@Bean
	public String testString() {
		return "";
	}
	
	@Bean
	public int testInt() {
		return 0;
	}

}
