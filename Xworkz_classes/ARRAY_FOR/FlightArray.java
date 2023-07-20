class FlightArray{
	public static void main(String[] names){
		System.out.println("Running Biscuit in main");
		String airindia="Air India";
		String indigo="IndiGo";
		String spicejet="Spice Jet";
		String airasiaindia="Air Asia India";
		String  vistara="Vistara";
		String allianceair="Alliance Air";
		String saudia="Saudia";
		String[] flights={airasiaindia,airindia,allianceair,spicejet,saudia,vistara,indigo};
		int total=flights.length;
		System.out.println("Total number of elements:"+total);
		for(int position=0;position<flights.length;position++)
		{
			System.out.println("Elements at index:"+position +"items are:"+flights[position]);
			
			
		}
		System.out.println("----------------------------------------------------");
			 flights[1]="Air Arabia";
		     flights[2]="Qatar Airways";
		for(int position=flights.length-1;position>=0;position--)
		{
			System.out.println("Elements at index:"+position+"items are:"+flights[position]);
			
		}
	}
}