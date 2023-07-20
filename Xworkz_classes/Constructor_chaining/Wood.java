class Wood{
	String woodtype;
	String color;//darkbrown
	float specificGravity;//0.9f
	double length;
	float density;
	
	Wood()
	{
		System.out .println("Invoking constructor without argument");
		
	}
	Wood(String woodtype)
	{
		this();
		this.woodtype=woodtype;
		System.out.println("Invoking String in constructor");
	}
	Wood(String woodtype,String color)
	{
		this(woodtype);
		this.color=color;
		
		System.out.println("Invoking String,String in constructor");
	}
	Wood(String woodtype,String color,float specificGravity)
	{
		this(woodtype,color);
		this.specificGravity=specificGravity;
		
		System.out.println("Invoking String,String,float in constructor");
	}
	Wood(String woodtype,String color,float specificGravity,double length)
	{
		this(woodtype,color,specificGravity);
		
		this.length=length;
		System.out.println("Invoking String,String,float,double in constructor");
	}
	Wood(String woodtype,String color,float specificGravity,double length,float density)
	{
		this(woodtype,color,specificGravity,length);
		
		this.density=density;
		System.out.println("Invoking String,String,float,double,float in constructor");
	}
}