package xworkz.stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main StaplerRunner");
		Stapler pin=new Stapler();
		pin.join();
		pin.join(14);
		pin.join(18, "Metal");
		pin.join("Plastic");
	}

}
