package com.xworkz.beakry;

public class BeakryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BeakryRunner");
		
		
		Beakry beakry=new SweetBeakry();
		beakry.bake();
		beakry.bake("Disha");
		beakry.bake("Disha", "CupCake");
		beakry.bake("Disha", "CupCake", 7);
		beakry.bake("Disha", "CupCake", 7,70);
		beakry.bake("Disha", "CupCake", 7,70, "Ujire");
		System.out.println("============");
		
		SweetBeakry beakry1=new SweetBeakry();
		beakry1.bake();
		beakry1.bake("Disha");
		beakry1.bake("Disha", "CupCake");
		beakry1.bake("Disha", "CupCake", 7);
		beakry1.bake("Disha", "CupCake", 7,70);
		beakry1.bake("Disha", "CupCake", 7,70, "Ujire");

	}

}
