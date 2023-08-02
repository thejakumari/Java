package com.xworkz.inheritance;

public class BirdKiller {

	public static void main(String[] args) {
		Bird bird=new Bird();
		System.out.println(bird.name);
		bird.fly();
		System.out.println("==========");
		Parrot parrot=new Parrot();
		System.out.println(parrot.color);
		parrot.makeSound();
		System.out.println("==============");
		Bird parrot1=new Parrot();
		System.out.println(parrot1.name);
		parrot1.fly();
		System.out.println("==========");
		TalkingParrot parrot2=new TalkingParrot();
		System.out.println(parrot2.weight);
		parrot2.speak();
		System.out.println("==========");
		Parrot parrot3=new TalkingParrot();
		parrot3.fly();
       
		System.out.println(parrot3.color);
		System.out.println(parrot3.name);
		
		parrot3.makeSound();
				
		
		
		 
		

	}

}
