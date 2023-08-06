package xworkz.mashroom;

public class CoffeRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Cofferunner");
		BlackCoffe coffe=new BlackCoffe();
		System.out.println(coffe.cost);
		System.out.println(coffe.location);
		System.out.println(coffe.taste);
		System.out.println(coffe.type);
		System.out.println("================");
		BlackCoffe coffe1=new BlackCoffe("Liberica Coffee",150.0,true,"Cafe Coffee day");
		System.out.println(coffe1.cost);
		System.out.println(coffe1.location);
		System.out.println(coffe1.taste);
		System.out.println(coffe1.type);
	}

}
