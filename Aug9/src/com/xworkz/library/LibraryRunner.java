package com.xworkz.library;

public class LibraryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in LibraryRunner");
		Library library=new GeneralLibrary();
		library.education();
		library.education(4000);
		library.education(4000, "Siddavana");
		library.education(4000, "Siddavana", "General");
		library.education(4000, "Siddavana", "General",3);
		library.education(4000, "Siddavana", "General",3,"Mangalore");
		System.out.println("=======================");
		GeneralLibrary library1=new GeneralLibrary();
		library1.education();
		library1.education(4000);
		library1.education(4000, "Siddavana");
		library1.education(4000, "Siddavana", "General");
		library1.education(4000, "Siddavana", "General",3);
		library1.education(4000, "Siddavana", "General",3,"Mangalore");
	}

}
