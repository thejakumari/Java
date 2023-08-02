package com.xworkz.inheritance;

public class ChickenRunner {

	public static void main(String[] args) {
		Chicken chicken=new Chicken();
		chicken.run();
		System.out.println(chicken.type);
		System.out.println("==========================");
		Meat meat=new Meat();
		meat.cut();
		meat.run();
		System.out.println(meat.kg);
		System.out.println(meat.type);
		System.out.println("==========================");
		Gravy gravy=new Gravy();
		System.out.println(gravy.good);
		gravy.cut();
		gravy.run();
		gravy.spicy();
		System.out.println(gravy.type);
		System.out.println(gravy.kg);
		System.out.println("==========================");
		Biryani biryani=new Biryani();
		biryani.cut();
		biryani.run();
		biryani.spicy();
		biryani.tasty();
		System.out.println(biryani.good);
		System.out.println(biryani.kg);
		System.out.println(biryani.noOfPlates);
		System.out.println(biryani.type);
		System.out.println("==========================");
		TikkaBiryani biryani1=new TikkaBiryani();
		biryani1.cut();
		biryani1.run();
		biryani1.spicy();
		biryani1.tasty();
		biryani1.eating();
		System.out.println(biryani1.good);
		System.out.println(biryani1.kg);
		System.out.println(biryani1.noOfPlates);
		System.out.println(biryani1.type);
		System.out.println(biryani1.recipe);
				
	}

}
