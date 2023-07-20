class Baker{
	static void cooking(String foodItem,int noOfPeople ,String workingFor,int exp,int duration,String assistance){
		System.out.println("Invoking cooking() in Baker");
		if(foodItem!=null){
			System.out.println("Food Item is valid:"+foodItem);
		}
		else{
			System.err.println("Food Item is in-valid:"+foodItem);
			return;
		}
		if(noOfPeople>0){
			System.out.println("Number Of pepole working with baker is valid:"+noOfPeople);
		}
		else{
			System.err.println("Number Of pepole working with baker is in-valid:"+noOfPeople);
			return;
		}
		if(workingFor!=null){
			System.out.println("workingFor() is valid:"+workingFor);
		}
		else{
			System.err.println("workingFor() is in-valid:"+workingFor);
			return;
		}
		if(exp>=20){
			System.out.println("Experience is valid:"+exp);
		}
		else{
			System.err.println("Experience is in-valid:"+exp);
			return;
		}
		if(duration>=1){
			System.out.println("Duration is valid:"+duration);
		}
		else{
			System.err.println("Duartion is in-valid:"+duration);
			return;
		}
		if(assistance!=null){
			System.out.println("Asssistance is valid:"+assistance);
		}
		else{
			System.err.println("Assistnce is in-valid:"+assistance);
			return;
		}
	}
}