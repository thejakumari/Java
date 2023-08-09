package com.xworkz.zoo;

public class Zoo {
	public void research()
	{
		System.out.println("Invoking research() in Zoo");
	}
	public void research(int noOfZoo)
	{
		System.out.println("Invoking research()  with int  in Zoo");
	}
	public void research(int noOfZoo,String name)
	{
		System.out.println("Invoking research()  with int,String  in Zoo");
	}
	public void research(int noOfZoo,String name,String type)
	{
		System.out.println("Invoking research()  with int,String,String  in Zoo");
	}
	public void research(int noOfZoo,String name,String type,int varietyAnimal)
	{
		System.out.println("Invoking research()  with int,String,String,int  in Zoo");
	}
	public void research(int noOfZoo,String name,String type,int varietyAnimal,String location)
	{
		System.out.println("Invoking research()  with int,String,String,int,String  in Zoo");
	}


}
