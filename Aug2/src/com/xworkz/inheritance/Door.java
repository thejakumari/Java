package com.xworkz.inheritance;

public class Door extends Cupboard {
public  int size;
	public Door() {
		
		System.out.println("no arg costructor Door");
	}
	public void close()
	{
		System.out.println("Invoking open in Door");
	}
}
