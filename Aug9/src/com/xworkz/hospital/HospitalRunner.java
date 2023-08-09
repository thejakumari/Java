package com.xworkz.hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HospitalRunner");
		Hospital hospital=new MultiSpecialistHospital();
		hospital.pharmacy();
		hospital.pharmacy("Ashwini");
		hospital.pharmacy("Ashwini", 15);
		hospital.pharmacy("Ashwini", 15, true);
		hospital.pharmacy("Ashwini", 15, true, "Nelyadi");
		hospital.pharmacy("Ashwini", 15, true, "Nelyadi", 200);
		System.out.println("=========================");
		MultiSpecialistHospital hospital1=new MultiSpecialistHospital();
		hospital1.pharmacy();
		hospital1.pharmacy("Ashwini");
		hospital1.pharmacy("Ashwini", 15);
		hospital1.pharmacy("Ashwini", 15, true);
		hospital1.pharmacy("Ashwini", 15, true, "Nelyadi");
		hospital1.pharmacy("Ashwini", 15, true, "Nelyadi", 200);
	}

}
