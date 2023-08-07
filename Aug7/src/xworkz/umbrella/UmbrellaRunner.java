package xworkz.umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in UmbrellaRunner");
		Umbrella umbrella=new Umbrella();
		umbrella.protect();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		umbrella.protect('L');
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		umbrella.protect(450);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		umbrella.protect(true);
	}

}
