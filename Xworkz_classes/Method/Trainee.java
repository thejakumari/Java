class Trainee{
	static void trainee(){
		System.out.println("Runnig tarinee in TraineeMethod");
	}
	static void trainee(String name){
		System.out.println("Invoking trainee  with single parameter Name : "+name);
	}
	static void learn(String name,String branch){
		System.out.println("Invoking trainee with double parameter Name : "+name+" ,Branch : "+branch);
	}
	static void learn(String name,String branch,String place){
		System.out.println("Invoking trainee  with three parameter  Name : "+name+" ,Branch : "+branch+" ,Place : "+place);
	}
	static void listenToClass(){
		System.out.println("Trainee Listen To Class");
	}
	static void task(){
		System.out.println("Trainee Do The Tasks");
	}
	static void doTask(String task){
		System.out.println("Trainee Do The Task of : "+task);
	}
	static void doTask(String task,int noOfClass){
		System.out.println("Trainee Do the Task of : "+task+" of "+noOfClass+" Classes");
	}
	static void travel(int reachTime){
		System.out.println("Trainee Travels Hours to reach Institution"+reachTime);
	}
	static void travel(String fromPlace){
		System.out.println("Trainee Travels Hours to reach Institution From : "+fromPlace);
	}
	
}