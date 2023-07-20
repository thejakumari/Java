class Train{
	static String getTrainByNo(int  trainNo ){
		System.out.println("invoking  getTrainByNo in Train");
		if(trainNo==11013){
			System.out.println(" getTrainByNo is valid");
			
			return "Coimbatore Express";
		    }
		    if(trainNo==11014){
			return "Mumbai LTT Express";
		    }
		    if(trainNo==12134){
			return "Mumbai CSMT SF Express";
		    }
		    if(trainNo==22691){
			return "Hazrat Nizamuddin Rajdhani Express";
		    }
		
		    
		else{
			System.err.println("getTrainByNo is invalid");
		    }
			
		
		return "Belgavi SF Express";
		
	}
	
}