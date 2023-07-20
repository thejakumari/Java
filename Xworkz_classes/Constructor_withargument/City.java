class City{
	String name;
	int pincode;
	String district;
	City()
	{
		
		System.out.println("Invoking City without argument");
		System.out.println(this.name);
		System.out.println(this.pincode);
		System.out.println(this.district);
		this.name="Ujire";
		this.pincode=574218;
		this.district="Dakshin Kannada";
	}
	City(String name,int pincode,String district)
	{
		System.out.println("Invoking City with parameter");
	    this.name=name;
		this.pincode=pincode;
		this.district=district;
	
	
	
	}
}