package xworkz.mashroom;

public class GoldRunnner {
	public static void main(String[] args) {
	    System.out.println("Running main in GoldRunner");
			
			ShineGold gold=new ShineGold();
			System.out.println("Gold type"+gold.type);
			System.out.println("Gold Carrot"+gold.carrot);
			System.out.println("Gold price"+gold.price);
			System.out.println("Gold Weight"+gold.weightInGm);
			
			System.out.println("*************************");
			
			ShineGold gold1=new ShineGold();
			System.out.println("Gold type"+gold1.type);
			System.out.println("Gold Carrot"+gold1.carrot);
			System.out.println("Gold Price"+gold1.price);
			System.out.println("Gold Weight"+gold1.weightInGm);
		}

}
