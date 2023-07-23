class HelmetKiller{
	public static void main(String[] values)
	{
		System.out.println("Invoking main in HelmetKiller");
		Helmet helmet=new Helmet(400,6.0);
		helmet.helmetinstanceVariable();
        Helmet.helmetStaticVariable();		
	}
}