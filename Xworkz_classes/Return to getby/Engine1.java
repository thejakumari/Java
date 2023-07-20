class Engine1
{
	static int getccByModel(String name)
	{
		System.out.println("invoking getccByModel in engine");
		if(name!=null)
		{
			System.out.println("getccByModel is valid");
			if(name=="swift")
			{
				System.out.println("name is valid:");
				return 1111;
			}
			if(name=="lambhorghini")
			{
				System.out.println("name is valid:");
				return 2222;
			}
			
		}
		else{
			System.out.println("name is invalid");
			
		}
		return 3333;
	}
}