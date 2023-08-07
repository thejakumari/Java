package xworkz.gadget;

public class GadgetRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in GadgetRunner");
		Gadget gadget=new Gadget();
		gadget.sense();
		gadget.sense(2200);
		gadget.sense(" Tablet");
		gadget.sense("Tab", 4500);

	}

}
