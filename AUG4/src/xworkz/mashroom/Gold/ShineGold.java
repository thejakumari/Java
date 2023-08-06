package xworkz.mashroom;

public class ShineGold extends Gold{
	public ShineGold() {
		super("Shine Gold", "24k", 86000.80d, 45.0f);
		System.out.println("Invoking No arg Constructor of ShineGold");
	}

	public ShineGold(String type, String carrot, double price, float weightInGm) {
		super(type, carrot, price, weightInGm);
		System.out.println("Invoking Constructor of ShineGold");
	}

}
