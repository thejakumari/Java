class JacketKiller{
	public static void main(String[]values){
	System.out.println("Invoking Jacket in main ");
	Jacket jacket=new Jacket();
	System.out.println(jacket.color);
	System.out.println(jacket.size);
	System.out.println(jacket.brand);
	System.out.println(jacket.type);
	System.out.println(jacket.price);
	System.out.println("===============================================================");
	jacket.color="Black";
	jacket.brand="Canada Goose";
	jacket.price=890.0;
	jacket.type="Sleeveless";
	jacket.size=34;
	System.out.println(jacket.color);
	System.out.println(jacket.size);
	System.out.println(jacket.brand);
	System.out.println(jacket.type);
	System.out.println(jacket.price);
	
	System.out.println("===============================================================");
	Jacket jacket1=new Jacket();
	System.out.println(jacket1.color);
	System.out.println(jacket1.size);
	System.out.println(jacket1.brand);
	System.out.println(jacket1.type);
	System.out.println(jacket1.price);
	System.out.println("===============================================================");
	jacket1.color="Black";
	jacket1.brand="Canada Goose";
	jacket1.price=990.0;
	jacket1.type="Sleeveless";
	jacket1.size=32;
	System.out.println(jacket1.color);
	System.out.println(jacket1.size);
	System.out.println(jacket1.brand);
	System.out.println(jacket1.type);
	System.out.println(jacket1.price);
	}
}