class Bureau{
	static String typeOfMaterial;
	static String doorType;
	String color;
    int length;
	static void bureauStaticVariable()
	{
		typeOfMaterial="Plywood";
		doorType="Sliding";
		System.out.println("type Of Material:"+typeOfMaterial);
		System.out.println("Door Type:"+doorType);
	}
	void bureauinstanceVariable()
	{
		System.out.println("Color:"+color);
		System.out.println("Length:"+length);
	}
	Bureau(String color , int length)
	{
		this.color=color;
		this.length=length;
	}
}