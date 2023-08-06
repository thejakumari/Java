package xworkz.mashroom;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MushroomRunner");
		
		BlackMushroom mushroom1=new BlackMushroom();
		System.out.println(mushroom1.cost);
		System.out.println(mushroom1.edible);
		System.out.println(mushroom1.name);
		System.out.println(mushroom1.noOfQuantity);
		System.out.println("================");
		BlackMushroom mushroom2=new BlackMushroom("Oyster", 4, 80, true);
		System.out.println(mushroom2.cost);
		System.out.println(mushroom2.edible);
		System.out.println(mushroom2.name);
		System.out.println(mushroom2.noOfQuantity);
		
	}

}
