class WoodKiller{
	public static void main(String[] trees){
		System.out.println("Invoking main in WoodKiller");
		
		Wood wood1=new Wood("Walnut");
		System.out.println("WoodType:"+wood1.woodtype);
		System.out.println("=======================================");
		Wood wood2=new Wood("Walnut","Dark Brown",0.9f);
		System.out.println("WoodType:"+wood2.woodtype);
		System.out.println("Wood color:"+wood2.color);
		System.out.println("Specific gravity:"+wood2.specificGravity);
		
		System.out.println("=======================================");
		Wood wood3=new Wood("Walnut","Dark Brown",0.9f,20);
		System.out.println("WoodType:"+wood3.woodtype);
		System.out.println("Wood color:"+wood3.color);
		System.out.println("Specific gravity:"+wood3.specificGravity);
		System.out.println("Wood length:"+wood3.length);
		
		System.out.println("=======================================");
	}
}