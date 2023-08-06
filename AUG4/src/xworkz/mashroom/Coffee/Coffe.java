package xworkz.mashroom;

public class Coffe {
	public String type;
	public double cost;
	public boolean taste;
	public String location;

	public Coffe(String type,double cost,boolean taste,String location) {
		this.cost=cost;
		this.location=location;
		this.type=type;
		this.taste=taste;
		System.out.println("Invoking constructor with args");
		
	}

}
