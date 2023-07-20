class DoorBell{
	String brand;
	int range;
	double price;
	int weight;
	String color;
	String material;
	String bellTone; 
	DoorBell()
	{
		System.out.println("Invoking the constructor without argument");
		System.out.println("Bell range:"+this.range);
		System.out.println("Bell brand:"+this.brand);
		System.out.println("Bell price:"+this.price);
		System.out.println("Bell weight:"+this.weight);
		System.out.println("Bell color:"+this.color);
		System.out.println("Bell material:"+this.material);
		System.out.println("Bell Tone:"+this.bellTone);
		this.range=60;
		this.brand="Cona Smyl";
		this.price=560.0;
		this.weight=184;
		this.color="White";
		this.material="Plastic";
		this.bellTone="Polyphonic";
	}
	DoorBell(int range)
	{
		System.out.println("Invoking the string constructor in DoorBell");
		this.brand=brand;
	}
	DoorBell(int range,String brand)
	{
		System.out.println("Invoking the string,int constructor in DoorBell");
		this.brand=brand;
		this.range=range;
	}
	DoorBell(int range,String brand,double price)
	{
		System.out.println("Invoking the string,int,double constructor in DoorBell");
		this.brand=brand;
		this.range=range;
		this.price=price;
		
	}
	DoorBell(int range,String brand,double price,int weight)
	{
		System.out.println("Invoking the string,int,double constructor in DoorBell");
		this.brand=brand;
		this.range=range;
		this.price=price;
		this.weight=weight;
		
	}
	DoorBell(int range,String brand,double price,int weight,String color)
	{
		System.out.println("Invoking the string,int,double constructor in DoorBell");
		this.brand=brand;
		this.range=range;
		this.price=price;
		this.weight=weight;
		this.color=color;
		
	}
	DoorBell(int range,String brand,double price,int weight,String color,String material)
	{
		System.out.println("Invoking the string,int,double constructor in DoorBell");
		this.brand=brand;
		this.range=range;
		this.price=price;
		this.weight=weight;
		this.color=color;
		this.material=material;
		
	}
	DoorBell(int range,String brand,double price,int weight,String color,String material,String bellTone)
	{
		System.out.println("Invoking the string,int,double constructor in DoorBell");
		this.brand=brand;
		this.range=range;
		this.price=price;
		this.weight=weight;
		this.color=color;
		this.material=material;
		this.bellTone=bellTone;
		
	}
}