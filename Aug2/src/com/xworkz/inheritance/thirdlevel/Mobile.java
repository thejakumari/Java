package com.xworkz.inheritance;

public class Mobile extends Laptop {
public int cost;
	public Mobile() {
		System.out.println("no arg construct mobile");
		}
	public void call()
	{
		System.out.println("Invoking call() in Mobile");
	}

}
