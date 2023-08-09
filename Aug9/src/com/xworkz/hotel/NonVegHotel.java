package com.xworkz.hotel;

public class NonVegHotel extends Hotel {
	@Override
	public void enjoyable()
	{
		System.out.println("Invoking enjoyable() in NonVegHotel");
	}
	public void enjoyable(String name)
	{
		System.out.println("Invoking enjoyable() with String in NonVegHotel");
	}
	public void enjoyable(String name,int numberofdishes)
	{
		System.out.println("Invoking enjoyable() with String,int in NonVegHotel");
	}
	public void enjoyable(String name,int numberofdishes,String location)
	{
		System.out.println("Invoking enjoyable() with String,int,String in NonVegHotel");
	}
	public void enjoyable(String name,int numberofdishes,String location,String type)
	{
		System.out.println("Invoking enjoyable() with String,int,String,String in NonVegHotel");
	}
	public void enjoyable(String name,int numberofdishes,String location,String type,double cost)
	{
		System.out.println("Invoking enjoyable() with String,int,String,String,double in Hotel");
	}

}
