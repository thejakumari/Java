package com.xworkz.mall;

public class BestMall extends Mall {
	@Override
	public void sale()
	{
		System.out.println("Invoking sale() in BestMall");
	}
	public void sale(String name)
	{
		System.out.println("Invoking sale() with String in BestMall");
	}
	public void sale(String name,int noOfStores)
	{
		System.out.println("Invoking sale() with String,int in BestMall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility)
	{
		System.out.println("Invoking sale() with String,int,boolean in BestMall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility,double retailSpace)
	{
		System.out.println("Invoking sale() with String,int,boolean,double in BestMall");
	}
	public void sale(String name,int noOfStores,boolean parkingFacility,double retailSpace,String dining)
	{
		System.out.println("Invoking sale() with String,int,boolean,double,String in BestMall");
	}


}
