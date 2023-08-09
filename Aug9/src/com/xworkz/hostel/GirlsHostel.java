package com.xworkz.hostel;

public class GirlsHostel extends Hostel {
	@Override
	public void accommodation()
	{
		System.out.println("Invoking accommodation() in  GirlsHostel");
	}
	public void accommodation(String type)
	{
		System.out.println("Invoking accommodation() with String  in  GirlsHostel");
	}
	public void accommodation(String type,int noOfRoom)
	{
		System.out.println("Invoking accommodation() with String,int  in  GirlsHostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName)
	{
		System.out.println("Invoking accommodation() with String,int,String  in  GirlsHostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName,boolean pestService)
	{
		System.out.println("Invoking accommodation() with String,int,String,boolean  in  GirlsHostel");
	}
	public void accommodation(String type,int noOfRoom,String hostelName,boolean pestService,boolean roomClean)
	{
		System.out.println("Invoking accommodation() with String,int,String,boolean,boolean  in  GirlsHostel");
	}


}
