package xworkz.gadget;

public class Gadget {
	public void sense()
	{
		System.out.println("Invoking sense in Gadget");
	}
	public void sense(String name)
	{
		System.out.println("Invoking sense in Gadget");
		System.out.println("Name:"+name);
	}
	public void sense(String name,double cost )
	{
		System.out.println("Invoking sense in Gadget");
		System.out.println("Name:"+name);
		System.out.println("cost"+cost);
	}
	public void sense(double cost )
	{
		System.out.println("Invoking sense in Gadget");
		
		System.out.println("cost"+cost);
	}

}
