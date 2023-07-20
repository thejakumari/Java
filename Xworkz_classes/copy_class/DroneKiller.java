class DroneKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in DroneKiller");
		
		double ref=Drone.getDistanceByFlight("Parrot","Aerial Photography");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("IdeaForge","Baloon carrier");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight(null,null);
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("droneoperator","Gernalisum");
		System.out.println("ref is:"+ref);
		
		
		
		double price=Drone.getPricePerEvent("Baloon Carrier");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("Aerial Photography");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent(null);
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("Gernalisum");
		System.out.println("price is:"+price);
		
		
		
		int discount=Drone.getDiscountByEvent("Aerial Photography","Harshitha");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("Baloon Carrier","Ashwin");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent(null,null);
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("Gernalisum","Shri");
		System.out.println("discount is:"+discount);
	}
}