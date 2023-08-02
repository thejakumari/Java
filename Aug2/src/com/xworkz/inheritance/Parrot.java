package com.xworkz.inheritance;

public class Parrot extends Bird {
	
	public String color="Green";
	public Parrot()
	{
		System.out.println("No arg constructor Parrot");
	}
	public void makeSound()
	{
		System.out.println("Invoking makeSound() in Parrot");
	}

}
