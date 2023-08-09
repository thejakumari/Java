package com.xworkz.street;

public class WayStreet extends Street {
	@Override
	public void ride() {
		System.out.println("Invoking ride in WayStreet");
	}
	
	public void ride(String name) {
		System.out.println("Invoking ride with name in WayStreet");
	}
	
	public void ride(String name,String location) {
		System.out.println("Invoking ride with name and location in WayStreet");
	}

	public void ride(String name,String location,String streetType) {
		System.out.println("Invoking ride with name, location and marketType in WayStreet");
	}
	
	public void ride(int noOfStreetLight) {
		System.out.println("Invoking ride with noOfShops in WayStreet");
	}
	
	public void ride(String name,int noOfStreetLight) {
		System.out.println("Invoking ride with name and noOfShops in WayStreet");
	}
}
