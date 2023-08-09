package com.xworkz.pub;

public class ThemePub extends Pub {
	@Override
	public void entertain() {
		System.out.println("Invoking entertain in ThemePub");
	}
	
	public void entertain(String name) {
		System.out.println("Invoking entertain with name in ThemePub");
	}

	public void entertain(String name,String location) {
		System.out.println("Invoking entertain with name and location in ThemePub");
	}
	
	public void entertain(String name,String location,String pubType) {
		System.out.println("Invoking entertain with name, location and pubType in ThemePub");
	}
	
	public void entertain(int entryFees) {
		System.out.println("Invoking entertain with entryFees in ThemePub");
	}

	public void entertain(String pubType,int entryFees) {
		System.out.println("Invoking entertain with pubType and entryFees in ThemePub");
	}


}
