package xworkz.mashroom;

public class Mushroom {
	public String name="Cermini";
	public int noOfQuantity=3;
	public double cost=67;
	public boolean edible;
	
	public Mushroom(String name,int noOfQuantity,double cost,boolean edible)
	{
		this.name=name;
		this.cost=cost;
		this.noOfQuantity=noOfQuantity;
		this.edible=edible;
		System.out.println("Constructor with parameter in Mushroom");
		}

}
