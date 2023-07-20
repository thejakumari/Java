class BakerKiller{
	public static void main (String[] args){
		System.out.println("Running main in BakerKiller`");
		
		
		String foodItem="Veg Roll";
		int noOfPeople=5;
		String workingFor="Kripa Beakry";
		int exp=2;
		int duration=5;
		String assistance="yes";
		
		String item="Chocolate Cake";
		int hours=8;
		
		Baker.cooking(foodItem,noOfPeople,workingFor,exp,duration,assistance);
		System.out.println("");
		Baker.cooking(item,noOfPeople,workingFor,exp,hours,assistance);
		
	
		
		
	}
}