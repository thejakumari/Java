class Cake{
	static void tasty(String name,String type,String bakeryName,double price, int noOfPieces,String ocassion)
	{
		System.out.println("Invoking tasty() in Cake");
		if(name!=null)
		{
			System.out.println("Name is valid:"+name);
		
			
		}
		else
		{
			System.err.println("Name is in-valid:"+name);
			return;
			
		}
		if(type!=null)
		{
			System.out.println("Type is valid:"+type);
			
			
		}
		else
		{
			System.err.println("Type is in-valid:"+type);
			return;
			
		}
		if(bakeryName!=null)
		{
			System.out.println("Bakery Name is valid:"+bakeryName);
			
			
		}
		else
		{
			System.err.println("Bakery Name is in-valid:"+bakeryName);
			return;
			
		}
		if(price>=20)
		{
			System.out.println("Price  is valid:"+price);
			
			
		}
		else
		{
			System.err.println("Price is in-valid:"+price);
			return;
			
		}
		if(noOfPieces<=8)
		{
			System.out.println("Number of pieces  is valid:"+noOfPieces);
			
			
		}
		else
		{
			System.err.println("Number of pieces is in-valid:"+noOfPieces);
			return;
			
		}
		if(ocassion!=null)
		{
			System.out.println("Name of ocassion is valid:"+ocassion);
		
			
		}
		else
		{
			System.err.println("Name of ocassion is in-valid:"+ocassion);
			return;
			
		}
	}
}