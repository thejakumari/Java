class Candle{
	static float meltingPoint;
	static String waxName;
	String color;
	int weight;
	static void candleStaticVariable()
	{
		meltingPoint=46.0f;
		waxName="Paraffin";
		System.out.println("MeltingPoint:"+meltingPoint);
		System.out.println("Wax Name:"+waxName);
	}
	void candleinstanceVariable()
	{
		System.out.println("Color:"+color);
		System.out.println("Weight:"+weight);
	}
	Candle(String color , int weight)
	{
		this.color=color;
		this.weight=weight;
	}
}