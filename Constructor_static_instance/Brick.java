class Brick{
	static int strength;
	static int absorption;
	double width;
	double length;
	static void brickStaticVariable()
	{
		strength=9;
		absorption=25;
		System.out.println("Strength:"+strength);
		System.out.println("Absorption:"+absorption);
	}
	void brickinstanceVariable()
	{
		System.out.println("width:"+width);
		System.out.println("length:"+length);
	}
	Brick(double width , double length)
	{
		this.width=width;
		this.length=length;
	}
}
