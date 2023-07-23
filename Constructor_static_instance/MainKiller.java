class MainKiller{
	public static void main(String[] values)
	{
		System.out.println("Invoking main in MainKiller");
		Helmet helmet=new Helmet(400,6.0);
		helmet.helmetinstanceVariable();
        Helmet.helmetStaticVariable();
        System.out.println("-------------------------------------------------------------");		
		Soil soil=new Soil("Growing Cotton",7.2f);
		soil.soilinstanceVariable();
		Soil.soilStaticVariable();
        System.out.println("-------------------------------------------------------------");
        Candle candle =new Candle("Red",45);
        candle.candleinstanceVariable();
        Candle.candleStaticVariable();

		System.out.println("-------------------------------------------------------------");
		
		Brick brick =new Brick(110.0,230.0);
        brick.brickinstanceVariable();
        Brick.brickStaticVariable();
	
		System.out.println("-------------------------------------------------------------");
		
		Power power =new Power(43,"Electrical");
        power.powerinstanceVariable();
        Power.powerStaticVariable();
		
		System.out.println("-------------------------------------------------------------");
	    Butterfly butterfly =new Butterfly("Yellow",2);
        butterfly.butterflyinstanceVariable();
        Butterfly.butterflyStaticVariable();
		System.out.println("-------------------------------------------------------------");
		Bureau bureau =new Bureau("Grey",42);
        bureau.bureauinstanceVariable();
        Bureau.bureauStaticVariable();
	}
}