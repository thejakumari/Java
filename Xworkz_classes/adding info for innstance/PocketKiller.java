class PocketKiller{
	public static void main(String[] sizes){
		
		System.out.println("Invoking main in PocketKiller ");
		Pocket pocket=new Pocket();
		System.out.println(pocket.typeofpocket);
		System.out.println(pocket.name);
		System.out.println(pocket.size);
		System.out.println(pocket.shape);
		System.out.println(pocket.length);
		System.out.println("===============================================================");
		pocket.typeofpocket="Side";
		pocket.name="Side Seam";
		pocket.size=5.6;
		pocket.shape="Rectangle";
		pocket.length=5;
		System.out.println(pocket.typeofpocket);
		System.out.println(pocket.name);
		System.out.println(pocket.size);
		System.out.println(pocket.shape);
		System.out.println(pocket.length);
		System.out.println("===============================================================");
		Pocket pocket1=new Pocket();
		System.out.println(pocket1.typeofpocket);
		System.out.println(pocket1.name);
		System.out.println(pocket1.size);
		System.out.println(pocket1.shape);
		System.out.println(pocket1.length);
		System.out.println("===============================================================");
		pocket1.typeofpocket="Side";
		pocket1.name="Patch";
		pocket1.size=4.6;
		pocket1.shape="Rectangle";
		pocket1.length=4;
		System.out.println(pocket1.typeofpocket);
		System.out.println(pocket1.name);
		System.out.println(pocket1.size);
		System.out.println(pocket1.shape);
		System.out.println(pocket1.length);
	}
}