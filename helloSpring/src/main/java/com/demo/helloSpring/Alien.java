package com.demo.helloSpring;

import org.springframework.stereotype.Component;

@Component("alan")
public class Alien {
	private String name;
	private int id;
	public void main() {
	System.out.println("hellllo");}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + "]";
	}
	public Alien() {
		System.out.println("hiii");
	}
	
     
	

}

