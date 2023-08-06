package xworkz.mashroom;

public class BlackCoffe extends Coffe {

	public BlackCoffe() {
		super("Bru",60,true,"Chikkamangalur");
		System.out.println("Invoking no arg constructor in BlackCoffe");
	}
	public BlackCoffe(String type,double cost,boolean taste,String location) {
		super(type,cost, taste, location);
		System.out.println("Invoking constructor in Blackcoffe");
	}

}
