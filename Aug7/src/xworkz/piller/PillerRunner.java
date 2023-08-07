package xworkz.piller;

public class PillerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PillerRunner");
		Piller piller=new Piller();
		piller.bearing();
		piller.bearing(55);
		piller.bearing("Stone");
		piller.bearing(450, "Wood");
	}

}
