package xworkz.mashroom;

public class BlackMushroom extends Mushroom {

	public BlackMushroom() {
		super("Cremini",6,780,true);

		System.out.println("No argument constructor in BlackMushroom");
		
	}
	public BlackMushroom(String name,int noOfQuantity,double cost,boolean edible)
	{
		super(name,noOfQuantity,cost,edible);
		System.out.println("invoking constructor in Blackmushroom");
	}

}
