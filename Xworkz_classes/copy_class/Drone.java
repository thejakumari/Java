class Drone{
	static double getDistanceByFlight(String operator,String event){
		System.out.println("Invoking getDistanceByFlight in Drone");
		if(operator!=null &&event!=null){
			System.out.println("Operator  and eventis valid");
			if(operator=="Dronecity" && event=="Baloon carrier"){
				return 1.2;
			}
			if(operator=="Hawk" && event=="Aerial Photography"){
				return 7.2;
			}
		}
		else{
			System.err.println("Operator and event is invalid");
			return -5.0;
		}
		
		return 9.0;
	}
	static double getPricePerEvent(String eventName){
		System.out.println("Invoking getPricePerEvent in Drone");
		if(eventName!=null){
			System.out.println("Event name is valid");
			if(eventName=="Baloon carrier"){
				return 6500.0;
			}
			if(eventName=="Aerial Photography"){
				return 5500.50;
			}
		}
		else{
			System.err.println("Event name is invalid");
			return 500.0;
		}
		
		return 100;
	}
	static int getDiscountByEvent(String eventName,String refPerson){
		System.out.println("Invoking getDiscountByEvent in Drone");
		if(eventName!=null &&refPerson!=null){
			System.out.println("Event Name  and refered person is valid");
			if(eventName=="Aerial Photography" && refPerson=="Harshitha"){
				return 67;
			}
			if(eventName=="Baloon carrier" && refPerson=="Ashwin"){
				return 190;
			}
		}
		else{
			System.err.println("Operator and event is invalid");
			return -15;
		}
		
		return 50;
	}
	
	
}