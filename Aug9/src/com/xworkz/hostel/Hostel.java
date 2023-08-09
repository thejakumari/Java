package com.xworkz.hostel;

public class Hostel {
	public void accommodation()
	{
		System.out.println("Invoking accommodation() in Hostel");
	}
	public void accommodation(String type)
	{
		System.out.println("Invoking accommodation() with String  in Hostel");
	}
	public void accommodation(String type,int noOfRoom)
	{
		System.out.println("Invoking accommodation() with String,int  in Hostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName)
	{
		System.out.println("Invoking accommodation() with String,int,String  in Hostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName,boolean pestService)
	{
		System.out.println("Invoking accommodation() with String,int,String,boolean  in Hostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName,boolean pestService,boolean roomClean)
	{
		System.out.println("Invoking accommodation() with String,int,String,boolean,boolean  in Hostel");
	}

}
