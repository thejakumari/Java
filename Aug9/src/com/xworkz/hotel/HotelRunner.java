package com.xworkz.hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HotelRunner");
		Hotel hotel=new NonVegHotel();
		hotel.enjoyable();
		hotel.enjoyable("Bombay Dine");
		hotel.enjoyable("Bombay Dine", 130);
		hotel.enjoyable("Bombay Dine", 130, "Ujire");
		hotel.enjoyable("Bombay Dine", 130, "Ujire", "Non Veg");
		hotel.enjoyable("Bombay Dine", 130, "Ujire", "Non Veg", 80);
		System.out.println("===================");
		NonVegHotel hotel1=new NonVegHotel();
		hotel1.enjoyable();
		hotel1.enjoyable("Bombay Dine");
		hotel1.enjoyable("Bombay Dine", 130);
		hotel1.enjoyable("Bombay Dine", 130, "Ujire");
		hotel1.enjoyable("Bombay Dine", 130, "Ujire", "Non Veg");
		hotel1.enjoyable("Bombay Dine", 130, "Ujire", "Non Veg", 80);

	}

}
