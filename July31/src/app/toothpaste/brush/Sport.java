package app.toothpaste.brush;

public class Sport {
	public String name;
	public Player[] players;
	
	public Sport(String name,Player[] players) {
		this.name=name;
		this.players=players;
	}
	
	public void printInfo() {
		System.out.println("Sport name is: "+name);
		
		for(int size=0; size< players.length; size++) {
			System.out.println("Player details are");
			Player ref=this.players[size];
			ref.printInfo();
			

		}
	}


}
