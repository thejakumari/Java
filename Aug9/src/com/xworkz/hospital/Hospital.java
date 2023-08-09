package com.xworkz.hospital;

public class Hospital {
	public void pharmacy()
	{
		System.out.println("Invoking pharmacy()in Hospital");
	}
	public void pharmacy(String name)
	{
		System.out.println("Invoking pharmacy() with String in Hospital");
	}
	public void pharmacy(String name,int noOfSpecialist)
	{
		System.out.println("Invoking pharmacy() with String,int in Hospital");
	}
	public void pharmacy(String name,int noOfSpecialist,boolean checkBp)
	{
		System.out.println("Invoking pharmacy() with String,int,boolean in Hospital");
	}
	public void pharmacy(String name,int noOfSpecialist,boolean checkBp,String location)
	{
		System.out.println("Invoking pharmacy() with String,int,boolean,String in Hospital");
	}
	public void pharmacy(String name,int noOfSpecialist,boolean checkBp,String location,double charge)
	{
		System.out.println("Invoking pharmacy() with String,int,boolean,String,double in Hospital");
	}


}
