package xworkz.elevator;

public class Elevator {
	public void carry()
	{
		System.out.println("Invoking carry() in Elevator");
		carry("Hydraulic Elevator");
	}
	public void carry(boolean carryPeople)
	{
		System.out.println("Invoking carry() in Elevator");
		System.out.println("Carry people"+carryPeople);
	}
	public void carry(boolean carryPeople,String type)
	{
		System.out.println("Invoking carry() in Elevator");
		System.out.println("Carry people"+carryPeople);
		System.out.println("Type:"+type);
		carry(carryPeople);
	}
	public void carry(String type)
	{
		System.out.println("Invoking carry() in Elevator");
		
		System.out.println("Type:"+type);
	}

}
