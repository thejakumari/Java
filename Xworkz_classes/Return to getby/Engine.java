class Engine{
	static int getCCByModel(String modelName ){
		System.out.println("invoking getCCByModel in Engine");
		if(modelName!=null){
			System.out.println("getCCByModel is valid");
			if(modelName=="Swift"){
			return 1197;
		    }
		    if(modelName=="Rapid"){
			return 1498;
		    }
		    if(modelName=="BMW"){
			return 2998;
		    }
		    if(modelName=="Benz"){
			return 1993;
		    }
		    if(modelName=="Audi"){
			return 1998;
		    }
		    if(modelName=="Bentely"){
			return 3993;
		    }
		}
		else{
			System.err.println("getCCByModel is invalid");
		    }
			
		
		return 1919;
		
	}
	
}