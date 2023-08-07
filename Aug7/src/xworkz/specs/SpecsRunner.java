package xworkz.specs;

public class SpecsRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SpecsRunner");
		Specs spec= new Specs();
		spec.lens();
		System.out.println("\n");
		spec.lens(1.5);
		spec.lens("concave");

							

}


}
