class PersonMail{
	static String mailByName(String name)
	{
		System.out.println("Invoking AgeByName in Person");
		if(name!=null)
		{
			System.out.println("Name is valid");
			if(name=="Samarth")
			{
				return "samarthgowda@gmail.com";
			}
			if(name=="Saanvi")
			{
				return "saanvip21@gmail.com";
			}
			if(name=="Sammrudhi")
			{
				return "sammrudhigowda21@gmail.com";
			}
			if(name=="Bhagath")
			{
				return "bhaggubhagath@gmail.com";
			}
			if(name=="Theju")
			{
				return "tejapangala@gmail.com";
			}
			if(name=="Anish")
			{
				return "gowdaanish@gmail.com";
			}
			if(name=="Ashwini")
			{
				return "ashwinipangala@gmail.com";
			}
			if(name=="Surjith")
			{
				return "surjithgowdap@gmail.com";
			}
			if(name=="Gowri")
			{
				return "gowri02p@gmail.com";
			}
			if(name=="Aahalya")
			{
				return "aahalyakeshav@gmail.com";
			}
		}
		else
		{
			System.err.println("AgeByName is invalid");
		}
		return "Not valid";
	
	
	}
	
}
