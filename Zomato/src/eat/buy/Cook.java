package eat.buy;

public class Cook {
	public Hotel hotel=new Hotel();
	public void chef() {
		System.out.println("Invoking chef() in Cook");
      this.hotel.eat();
      
			
			
	}
	
	public void famousFood() {
		System.out.println("Invoking famousFood() in Cook");
		this.hotel.serve();
		
		
	}
}

