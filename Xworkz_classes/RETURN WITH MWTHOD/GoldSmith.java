class GoldSmith{
	
	static void design(float qunatityInGrams,int price,String goldSmithName){
		System.out.println("Invoking design in GoldSmith");
	

		if(qunatityInGrams>=7){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.err.println(" qunatity in grams is in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=6500){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.err.println("Price is invalid:"+price);
			return;
		}
		
		if(goldSmithName!=null){
			System.out.println("Name of the goldsmith is valid:"+goldSmithName);
		}
		else{
			System.err.println("Name of the goldsmith is invalid:"+goldSmithName);
			return;
		}
		
		
	}
}