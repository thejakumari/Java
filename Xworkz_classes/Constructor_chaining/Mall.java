class Mall{
	String name;
	int noOfStores;
	String dining;
	boolean parkingFacility;
	String location;
	double retailSpace;
	String entertainment;
	Mall()
	{
		System.out .println("Invoking constructor without argument");
	}
	Mall(String name)
	{
		this();
		this.name=name;
		System.out.println("Invoking String in constructor");
	}
	Mall(String name,int noOfStores)
	{
		this(name);
		this.noOfStores=noOfStores;
		System.out.println("Invoking String,int  in constructor");
	}
	Mall(String name,int noOfStores,String dining)
	{
		this(name,noOfStores);
		this.dining=dining;
		System.out.println("Invoking String,int,string  in constructor");
	}
	Mall(String name,int noOfStores,String dining,boolean parkingFacility)
	{
		this(name,noOfStores,dining);
		this.parkingFacility=parkingFacility;
		System.out.println("Invoking String,int,string,boolean  in constructor");
	}
	Mall(String name,int noOfStores,String dining,boolean parkingFacility,String location)
	{
		this(name,noOfStores,dining,parkingFacility);
		this.location=location;
		System.out.println("Invoking String,int,string,boolean,String  in constructor");
	}
	Mall(String name,int noOfStores,String dining,boolean parkingFacility,String location,double retailSpace)
	{
		this(name,noOfStores,dining,parkingFacility,location);
		this.retailSpace=retailSpace;
		System.out.println("Invoking String,int,string,boolean,String,double  in constructor");
	}
	Mall(String name,int noOfStores,String dining,boolean parkingFacility,String location,double retailSpace,String entertainment)
	{
		this(name,noOfStores,dining,parkingFacility,location,retailSpace);
		this.entertainment=entertainment;
		System.out.println("Invoking String,int,string,boolean,String,double  in constructor");
	}
}
