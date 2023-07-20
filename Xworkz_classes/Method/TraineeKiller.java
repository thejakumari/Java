class TraineeKiller{
	public static void main(String[] args){
		Trainee.trainee();
		Trainee.trainee("Avani");
		Trainee.learn("Kiran","CSE");
		Trainee.learn("Aanya","ECE","Ujire");
		Trainee.listenToClass();
		Trainee.doTask();
		Trainee.doTask("oops");
		Trainee.task("Over Loading",5);
		Trainee.travel(8);
		Trainee.travel("Srinivas Nagar");
		drinkWater();
		eatChocolate();
	}
		static void drinkWater(){
			System.out.println("Trainee Drink water in Class");
		}
		static void eatChocolate(){
			System.out.println("Trainee Eat Chocolate in Class");
		}
}