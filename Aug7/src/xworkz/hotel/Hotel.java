package xworkz.hotel;

public class Hotel {
	public void serve()
	{
		System.out.println("Invoking serve() in Hotel");
	}
	public void serve(String name)
	{
		System.out.println("Invoking serve() in Hotel");
		System.out.println("Hotel Name:"+name);
	}
	public void serve(int numberofdish)
	{
		System.out.println("Invoking serve() in Hotel");
		System.out.println("numberofdishe:"+numberofdish);
		serve(120,"Bombay Dine");
		
	}
	public void serve(int numberofdish,String name)
	{
		System.out.println("Invoking serve() in Hotel");
		System.out.println("numberofdishe:"+numberofdish);
		System.out.println("Hotel Name:"+name);
		serve(name);
	}

}
