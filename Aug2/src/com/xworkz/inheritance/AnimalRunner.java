package com.xworkz.inheritance;

public class AnimalRunner {
	public static void main(String[] args) {
		System.out.println("Running main in AnimalRunner");
		
		PantheraLeoAfricanLion lion=new PantheraLeoAfricanLion();

		lion.drink();
		lion.eat();
		lion.bark();
		lion.bite();
		lion.eatFood();
		lion.eatMeats();
		lion.run();
		lion.sleep();
		lion.roar();
	}

}
