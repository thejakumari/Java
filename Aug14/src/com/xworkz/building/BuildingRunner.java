package com.xworkz.building;

public class BuildingRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BuildingRuner");
		Building build=new ShopBuilding();
		System.out.println(build.close());
		System.out.println(build.unlockDoors());
		System.out.println(build.turnLightsOn());
		System.out.println(build.turnLightsOff());
		System.out.println(build.open());
		System.out.println(build.lockDoors());
		System.out.println(build.getNumberOfFloors());
		System.out.println(build.exit());
		System.out.println(build.enter());
		System.out.println(build.elevator());

	}

}
