class Soil{
	static String name;
	static String texture;//clayey
	String usedFor;//growing cotton
	float pH;//7.2f
	static void soilStaticVariable()
	{
		name="Black";
		texture="Clayey";
		System.out.println("Name:"+name);
		System.out.println("Texture of Soil:"+texture);
	}
	void soilinstanceVariable()
	{
		System.out.println("Soil is used for:"+usedFor);
		System.out.println("pH of Soil:"+pH);
	}
	Soil(String usedFor , float pH)
	{
		this.usedFor=usedFor;
		this.pH=pH;
	}
	
}