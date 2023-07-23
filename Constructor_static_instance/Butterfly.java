class Butterfly{
	static String kingdom;
	static String type;
    int noOfpairwings;
	String color;
	
	static void butterflyStaticVariable()
	{
		kingdom="animalia";
		type="Hesperildae";
		System.out.println("kingdom:"+kingdom);
		System.out.println("Type:"+type);
	}
	void butterflyinstanceVariable()
	{
		System.out.println("color:"+color);
		System.out.println("noOf  pair wings:"+noOfpairwings);
	}
	Butterfly(String color , int noOfpairwings)
	{
		this.color=color;
		this.noOfpairwings=noOfpairwings;
	}
}