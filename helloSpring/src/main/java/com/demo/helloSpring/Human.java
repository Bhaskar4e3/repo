package com.demo.helloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Human {
	private String gender;
	private int age;
	@Autowired
	@Qualifier("alan")
	Alien Alien;

	//Alien Alien;
	public Human() {
		System.out.println("object created...");
	}
	public void show() {
		System.out.println("in human show...");
		Alien.main();
		
	}

}
