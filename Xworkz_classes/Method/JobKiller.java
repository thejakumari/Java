class JobKiller{
	public static void main(String[] values){
		System.out.println("Invoking main in Job Killer");
		Job.apply();
		Job.apply("Dhanu",6);
		Job.apply("Dhanu",5,"Kiran");
		Job.apply(4);
		Job.rejectOffer();
	}
}