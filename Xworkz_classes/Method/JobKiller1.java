class JobKiller1{
	public static void main(String[] values){
		System.out.println("Invoking main in Job Killer");
		Job1.apply();
		Job1.apply("Dhanu",6);
		Job1.apply(5,"Dhanu");
		}
}