package com.xworkz.inheritance;

public class TeslaModelSLongRange extends TeslaModels{
public long range=400;
	
	public TeslaModelSLongRange() {
		System.out.println("Invoking no arg constructor in TeslaModelSLongRange");
		System.out.println("TeslaModelSLongRange range"+range);
	}
	
	public void chargingCapacity() {
		System.out.println("Invoking activateSpoiler in TeslaModelSLongRange");
	}
}