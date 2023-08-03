package com.xworkz.inheritance;

public class Bus extends LandVehicle {
public String brand="Duster";
	
	public Bus() {
		System.out.println("invoking no arg constructor in Bus");
		System.out.println("brand"+brand);
	}
	
	public void drive() {
		System.out.println("invoking drive in Bus");
	}
}