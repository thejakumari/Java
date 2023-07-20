class Park{
	String name;
	String location;
	double  width;
	double length;
	double cost;
	boolean pool;
	int noOfTree;
	String benefit;
	boolean parkingFacility;
	Park()
	{
		System.out .println("Invoking constructor without argument");
	}
	Park(String name)
	{
		this();
		this.name=name;
		System.out.println("Invoking String in constructor");
	}
	Park(String name,String location)
	{
		this(name);
		this.location=location;
		System.out.println("Invoking String,string in constructor");
	}
	Park(String name,String location,double width)
	{
		this(name,location);
		this.width=width;
		System.out.println("Invoking String,string,double in constructor");
	}
	Park(String name,String location,double width,double length)
	{
		this(name,location,width);
		this.length=length;
		System.out.println("Invoking String,string,double,double in constructor");
	}
	Park(String name,String location,double width,double length,double cost)
	{
		this(name,location,width,length);
		this.cost=cost;
		System.out.println("Invoking String,string,double,double in constructor");
	}
	Park(String name,String location,double width,double length,double cost,boolean pool)
	{
		this(name,location,width,length,cost);
		this.pool=pool;
		System.out.println("Invoking String,string,double,double,boolean in constructor");
	}
	Park(String name,String location,double width,double length,double cost,boolean pool,int noOfTree)
	{
		this(name,location,width,length,cost,pool);
		this.noOfTree=noOfTree;
		System.out.println("Invoking String,string,double,double,boolean,int in constructor");
	}
	Park(String name,String location,double width,double length,double cost,boolean pool,int noOfTree,String benefit)
	{
		this(name,location,width,length,cost,pool,noOfTree);
		this.benefit=benefit;
		System.out.println("Invoking String,string,double,double,boolean,int,String in constructor");
	}
	Park(String name,String location,double width,double length,double cost,boolean pool,int noOfTree,String benefit,boolean parkingFacility)
	{
		this(name,location,width,length,cost,pool,noOfTree,benefit);
		this.parkingFacility=parkingFacility;
		System.out.println("Invoking String,string,double,double,boolean,int,String,boolean in constructor");
	}
}