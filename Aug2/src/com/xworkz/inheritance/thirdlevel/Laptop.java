package com.xworkz.inheritance;

public class Laptop extends Computer {

public String brand = "HP";
	
	public Laptop() {
		System.out.println("No arg constructor of Laptop");
		
	}

	public void shutDown() {
		System.out.println("Invoking shutDown method in Laptop");
	}

}
