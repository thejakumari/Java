class Wallet{
	String brand;
	double cost;
	String color;
	Wallet()
	{
		System.out.println("Invoking constructor without argument");
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cost);
		this.brand="Allen Solly";
		this.cost=1334.0;
		this.color="Black";
	}
	Wallet(String brand,double cost,String color)
	{
		System.out.println("Invoking constructor with argument");
		this.brand=brand;
		this.cost=cost;
		this.color=color;
	}
}