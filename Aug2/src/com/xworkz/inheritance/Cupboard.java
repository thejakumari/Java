package com.xworkz.inheritance;

public class Cupboard extends Wood {
	public int door=8;

	public Cupboard() {
		
		System.out.println("no arg costructor Cupboard");
	}
	public void open()
	{
		System.out.println("Invoking open in Cupboard");
	}
}
