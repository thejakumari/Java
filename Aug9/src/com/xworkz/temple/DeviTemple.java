package com.xworkz.temple;

public class DeviTemple extends Temple {
	@Override
	public void pray()
	{
		System.out.println("Invoking pray() in Temple");
	}
	public void pray(String templeName)
	{
		System.out.println("Invoking pray() with String in Temple");
	}
	public void pray(String templeName,String location)
	{
		System.out.println("Invoking pray() with String,String in Temple");
	}
	public void pray(String templeName,String location,int noOfStep)
	{
		System.out.println("Invoking pray() with String,String,int in Temple");
	}
	public void pray(String templeName,String location,int noOfStep,boolean history)
	{
		System.out.println("Invoking pray() with String,String,int,boolean in Temple");
	}
	public void pray(String templeName,String location,int noOfStep,boolean history,double area)
	{
		System.out.println("Invoking pray() with String,String,int,boolean,double in Temple");
	}


}
