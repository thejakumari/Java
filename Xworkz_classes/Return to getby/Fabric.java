class Fabric{
	static double getPriceByType(String  clothType ){
		System.out.println("invoking  getPriceByType in Fabric");
		if(clothType!=null){
			System.out.println(" getPriceByType is valid");
			if(clothType=="Cotton"){
			return 2550.0;
		    }
		    if(clothType=="Nylon"){
			return 630;
		    }
		    if(clothType=="Woolen"){
			return 952;
		    }
		    if(clothType=="Linen"){
			return 660;
		    }
		    if(clothType=="Polyster"){
			return 720;
		    }
		    if(clothType=="Silk"){
			return 2680;
		    }
		}
		else{
			System.err.println("getPriceByType is invalid");
		    }
			
		
		return 240.05;
		
	}
	
}