package com.xworkz.inheritance;

public class Tree extends Plant {
 public String type;
	public Tree() {
		System.out.println("no arg costructor Tree");
	}
	public void cut()
	{
		System.out.println("Invoking cut in Tree");
	}

}
