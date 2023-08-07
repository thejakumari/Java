package xworkz.ladder;

public class Ladder {
	public void fold()
	{
		System.out.println("Invoking climb() in Ladder");
	}
	public void fold(int length)
	{
		System.out.println("Invoking climb() in Ladder");
		System.out.println("Length"+length);
		fold();
	}
	public void fold(String type)
	{
		System.out.println("Invoking climb() in Ladder");
		System.out.println("Type"+type);
		fold(23);
	}
	public void fold(String type,int length)
	{
		System.out.println("Invoking climb() in Ladder");
		System.out.println("Type"+type);
		System.out.println("Length"+length);
		
	}


}
