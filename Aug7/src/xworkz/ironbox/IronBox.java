package xworkz.ironbox;

public class IronBox {
	public void iron()
	{
		System.out.println("Invoking iron in IronBox");
	}
	public void iron(String brand)
	{
		System.out.println("Invoking iron() in IronBox");
		System.out.println("Brand:"+brand);
		iron(450);
	}
	public void iron(double cost)
	{
		System.out.println("Invoking iron() in IronBox");
		System.out.println("Cost:"+cost);
	}
	public void iron(double cost,String brand)
	{
		System.out.println("Invoking iron() in IronBox");
		System.out.println("Cost:"+cost);
		System.out.println("Brand:"+brand);
		iron();
		
	}

}
