class Oil{
	String name;
	double viscosity;
	int quantity;
	Oil()
	{
		System.out.println("Invoking the constructor without argument");
		System.out.println("Name of Oil:"+this.name);
		System.out.println("Viscosity of Oil:"+this.viscosity);
		System.out.println("Quantity of Oil:"+this.quantity);
		this.name="SunFlower";
		this.viscosity=25.0;
		this.quantity=1;
		
	}
	Oil(String name)
	{
		System.out.println("Invoking the String constructor in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
	Oil(double viscosity,String name)
	{
		System.out.println("Invoking the string, double constructor in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
	Oil(int quantity,String name,double viscosity)
	{
		System.out.println("Invoking the int, double,string constructor in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
	
}