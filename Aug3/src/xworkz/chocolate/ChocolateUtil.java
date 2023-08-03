package xworkz.chocolate;

public class ChocolateUtil {
public static void eat(Chocolate chocolate) {
		
		System.out.println("Chocolate Brand: "+chocolate.brand);
		chocolate.sweet();
		
		if(chocolate instanceof DarkChacolate) {
			System.out.println("Acessing DarkChocolate");
			DarkChacolate chocolate1=(DarkChacolate)chocolate;
			
			System.out.println("Dark Chocolate Price"+chocolate1.flavour);
			chocolate1.enhance();
		}
		
		if(chocolate instanceof CaramelChocolate) {
			System.out.println("Acessing CaramelChocolate");
			CaramelChocolate chocolate2=(CaramelChocolate)chocolate;
			
			System.out.println("Caramel Chocolate Price"+chocolate2.sugarInGms);
			chocolate2.boostEnergy();
		}
	}

}
