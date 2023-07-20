class MallKiller{
	public static void main(String[] stores){
		System.out.println("Invoking main in MallKiller");
		
		Mall mall1=new Mall("Orion",400,"Chili's");
		System.out.println("Mall name:"+mall1.name);
		System.out.println("Mall noOfStores:"+mall1.noOfStores);
		System.out.println("Mall dining:"+mall1.dining);
		
		System.out.println("=======================================");
		Mall mall2=new Mall("Orion",400,"Chili's",true,"Rajajinagar");
		System.out.println("Mall name:"+mall2.name);
		System.out.println("Mall noOfStores:"+mall2.noOfStores);
		System.out.println("Mall dining:"+mall2.dining);
		System.out.println("Mall parkingFacility:"+mall2.parkingFacility);
		System.out.println("Mall location:"+mall2.location);
		
		System.out.println("=======================================");
		Mall mall3=new Mall("Orion",400,"Chili's",true,"Rajajinagar",8.2);
		System.out.println("Mall name:"+mall3.name);
		System.out.println("Mall noOfStores:"+mall3.noOfStores);
		System.out.println("Mall dining:"+mall3.dining);
		System.out.println("Mall parkingFacility:"+mall3.parkingFacility);
		System.out.println("Mall location:"+mall3.location);
		System.out.println("Mall retailSpace :"+mall3.retailSpace);
	}
}