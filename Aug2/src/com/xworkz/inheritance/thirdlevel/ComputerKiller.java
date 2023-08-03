package com.xworkz.inheritance;

public class ComputerKiller {

	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.turnOn();
		System.out.println(computer.ram);
		Laptop laptop=new Laptop();
		laptop.turnOn();
		System.out.println(laptop.ram);
		System.out.println(laptop.brand);
		laptop.shutDown();
		Mobile mobile=new Mobile();
		
		mobile.call();
		mobile.shutDown();
		mobile.turnOn();
		System.out.println(mobile.brand);
		System.out.println(mobile.cost);
		System.out.println(mobile.ram);
		Tab tab=new Tab();
		tab.call();
		tab.shutDown();
		tab.turnOn();
		System.out.println(tab.brand);
		System.out.println(tab.cost);
		System.out.println(tab.ram);
		System.out.println(tab.battery);
		tab.videogame();
	}

}
