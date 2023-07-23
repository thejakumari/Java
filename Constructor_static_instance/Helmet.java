class Helmet{
	int mass;
	static int headband;
	static String shellShape;
	double brimDiameter;
	
	static void helmetStaticVariable()
	{
		headband=30;
		shellShape="Dome";
		System.out.println("Head Band:"+headband);
		System.out.println("Shape of the shell:"+shellShape);
	}
	void helmetinstanceVariable()
	{
		System.out.println("Mass of helmet:"+mass);
		System.out.println("Brim Diameter:"+brimDiameter);
	}
	Helmet(int mass , double brimDiameter)
	{
		this.mass=mass;
		this.brimDiameter=brimDiameter;
	}
}