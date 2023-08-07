package xworkz.piller;

public class Piller {
	public void bearing()
	{
		System.out.println("Invoking bearing() in Piller");
	}
	public void bearing(int length)
	{
		System.out.println("Invoking bearing() in Piller");
		System.out.println("Length:"+length);
	}
	public void bearing(int length,String material)
	{
		System.out.println("Invoking bearing() in Piller");
		System.out.println("Length:"+length);
		System.out.println("Material "+ material);
		bearing(length);
		
	}
	public void bearing(String material)
	{
		System.out.println("Invoking bearing() in Piller");
		
		System.out.println("Material "+ material);
		bearing();
		
	}



}
