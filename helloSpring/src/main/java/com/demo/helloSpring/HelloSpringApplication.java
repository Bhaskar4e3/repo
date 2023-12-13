package com.demo.helloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(HelloSpringApplication.class, args);
		Human a=context.getBean(Human.class);
		a.show();
		
		
		
		System.out.println("hello spring");
		
	}

}
