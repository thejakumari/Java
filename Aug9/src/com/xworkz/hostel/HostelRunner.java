package com.xworkz.hostel;

public class HostelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HostelRunner");
		Hostel hostel=new GirlsHostel();
		hostel.accommodation();
		hostel.accommodation("Girls");
		hostel.accommodation("Girls", 40);
		hostel.accommodation("Girls", 40, "Manjushree");
		hostel.accommodation("Girls", 40, "Manjushree", true);
		hostel.accommodation("Girls", 40, "Manjushree", true, true);
		System.out.println("================================");
		GirlsHostel hostel1=new GirlsHostel();
		hostel1.accommodation();
		hostel1.accommodation("Girls");
		hostel1.accommodation("Girls", 40);
		hostel1.accommodation("Girls", 40, "Manjushree");
		hostel1.accommodation("Girls", 40, "Manjushree", true);
		hostel1.accommodation("Girls", 40, "Manjushree", true, true);


	}

}
