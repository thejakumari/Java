package xworkz.hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HotelRunner");
		Hotel hotel=new Hotel();
		hotel.serve();
		System.out.println("================");
		hotel.serve(210);
		System.out.println("================");
		hotel.serve("Masala Mandhi");
		System.out.println("================");
		hotel.serve(221, "Empire");
	}

}
