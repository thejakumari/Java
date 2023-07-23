class Power{
	static String unit;
	static int time;
	int amountEnergy;
	
	String type;
	static void powerStaticVariable()
	{
		unit="Watt";
		time=1;
		System.out.println("Unit:"+unit);
		System.out.println("Time:"+time);
	}
	void powerinstanceVariable()
	{
		System.out.println("Amount Energy:"+amountEnergy);
		System.out.println("type:"+type);
	}
	Power( int amountEnergy , String type)
	{
		this.amountEnergy=amountEnergy;
		this.type=type;
	}
}