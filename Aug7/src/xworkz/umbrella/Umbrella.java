package xworkz.umbrella;

public class Umbrella {
	public void protect()
	{
		System.out.println("Invoking protect() in Umbrella");
	}
	public void protect(double cost)
	{
		System.out.println("Invoking protect in Umbrella");
		System.out.println("Cost:"+cost);
		protect('M');
	}
	public void protect(char size)
	{
		System.out.println("Invoking protect in Umbrella");
		System.out.println("Size:"+size);
		protect();
	}
	public void protect(boolean protectFromSun)
	{
		System.out.println("Invoking protect in Umbrella");
		System.out.println("protect From Sun:"+protectFromSun);

	}
}
