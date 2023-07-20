class Person{
	static int ageByName(String name)
	{
		System.out.println("Invoking AgeByName in Person");
		if(name!=null)
		{
			System.out.println("Name is valid");
			if(name=="Samarth")
			{
				return 12;
			}
			if(name=="Saanvi")
			{
				return 15;
			}
			if(name=="Sammrudhi")
			{
				return 17;
			}
			if(name=="Bhagath")
			{
				return 17;
			}
			if(name=="Theju")
			{
				return 21;
			}
			if(name=="Anish")
			{
				return 23;
			}
			if(name=="Ashwini")
			{
				return 25;
			}
			if(name=="Surjith")
			{
				return 32;
			}
			if(name=="Gowri")
			{
				return 35;
			}
			if(name=="Aahalya")
			{
				return 38;
			}
		}
		else
		{
			System.err.println("AgeByName is invalid");
		}
		return 100;
	
	
	}
	
}


























