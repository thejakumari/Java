package com.xworkz.temple;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TempleRunner");
		Temple temple=new DeviTemple();
		temple.pray();
		temple.pray("DurgaParameshwari");
		temple.pray("DurgaParameshwari", "Kateel");
		temple.pray("DurgaParameshwari", "Kateel", 1000);
		temple.pray("DurgaParameshwari", "Kateel", 1000,true);
		temple.pray("DurgaParameshwari", "Kateel", 1000,true,670.0);
		System.out.println("================================");
		DeviTemple temple1=new DeviTemple();
		temple1.pray();
		temple1.pray("DurgaParameshwari");
		temple1.pray("DurgaParameshwari", "Kateel");
		temple1.pray("DurgaParameshwari", "Kateel", 1000);
		temple1.pray("DurgaParameshwari", "Kateel", 1000,true);
		temple1.pray("DurgaParameshwari", "Kateel", 1000,true,670);

	}

}
