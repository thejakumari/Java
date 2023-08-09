package com.xworkz.mall;

public class Mall {
	public void sale()
	{
		System.out.println("Invoking sale() in Mall");
	}
	public void sale(String name)
	{
		System.out.println("Invoking sale() with String in Mall");
	}
	public void sale(String name,int noOfStores)
	{
		System.out.println("Invoking sale() with String,int in Mall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility)
	{
		System.out.println("Invoking sale() with String,int,boolean in Mall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility,double retailSpace)
	{
		System.out.println("Invoking sale() with String,int,boolean,double in Mall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility,double retailSpace,String dining)
	{
		System.out.println("Invoking sale() with String,int,boolean,double,String in Mall");
	}


}
