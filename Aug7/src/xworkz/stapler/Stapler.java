package xworkz.stapler;

public class Stapler {
	public void join()
	{
		System.out.println("Invoking join in Stapler");
	}
	public void join(double length)
	{
		System.out.println("Invoking join in Stapler");
	      System.out.println("Length"+length);
	}
	public void join(double length,String material)
	{
		System.out.println("Invoking join in Stapler");
	      System.out.println("Length"+length);
	      System.out.println("Material"+material);
	}
	public void join(String material)
	{
		System.out.println("Invoking join in Stapler");
	     
	      System.out.println("Material"+material);
	}


}
