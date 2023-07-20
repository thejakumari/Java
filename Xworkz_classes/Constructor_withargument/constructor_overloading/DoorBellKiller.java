class DoorBellKiller{
	public static void main (String [] values){
		System.out.println("Invoking main DoorBellKiller");
		DoorBell bell=new DoorBell();
		System.out.println("Bell range:"+bell.range);
		System.out.println("Bell brand:"+bell.brand);
		System.out.println("Bell price:"+bell.price);
		System.out.println("Bell weight:"+bell.weight);
		System.out.println("Bell color:"+bell.color);
		System.out.println("Bell material:"+bell.material);
		System.out.println("Bell Tone:"+bell.bellTone);
		System.out.println("*********************************************************************");
		DoorBell bell1=new DoorBell(70);
		System.out.println("Bell range:"+bell1.range);
		System.out.println("*********************************************************************");
		DoorBell bell2=new DoorBell(60,"Fybros");
		System.out.println("Bell range:"+bell2.range);
		System.out.println("Bell brand:"+bell2.brand);
		System.out.println("*********************************************************************");
		DoorBell bell3=new DoorBell(80,"Fybros",560.0);
		System.out.println("Bell range:"+bell3.range);
		System.out.println("Bell brand:"+bell3.brand);
		System.out.println("Bell price:"+bell3.price);
		System.out.println("*********************************************************************");
		DoorBell bell4=new DoorBell(80,"Fybros",560.0,177);
		System.out.println("Bell range:"+bell4.range);
		System.out.println("Bell brand:"+bell4.brand);
		System.out.println("Bell price:"+bell4.price);
		System.out.println("Bell weight:"+bell4.weight);
		System.out.println("*********************************************************************");
		DoorBell bell5=new DoorBell(80,"Fybros",560.0,177,"White&Red");
		System.out.println("Bell range:"+bell5.range);
		System.out.println("Bell brand:"+bell5.brand);
		System.out.println("Bell price:"+bell5.price);
		System.out.println("Bell weight:"+bell5.weight);
		System.out.println("Bell color:"+bell5.color);
		System.out.println("*********************************************************************");
		DoorBell bell6=new DoorBell(80,"Fybros",560.0,177,"White&Red","Plastic");
		System.out.println("Bell range:"+bell6.range);
		System.out.println("Bell brand:"+bell6.brand);
		System.out.println("Bell price:"+bell6.price);
		System.out.println("Bell weight:"+bell6.weight);
		System.out.println("Bell color:"+bell6.color);
		System.out.println("Bell material:"+bell6.material);
		System.out.println("*********************************************************************");
		DoorBell bell7=new DoorBell(80,"Fybros",560.0,177,"White&Red","Plastic","Musical");
		System.out.println("Bell range:"+bell7.range);
		System.out.println("Bell brand:"+bell7.brand);
		System.out.println("Bell price:"+bell7.price);
		System.out.println("Bell weight:"+bell7.weight);
		System.out.println("Bell color:"+bell7.color);
		System.out.println("Bell material:"+bell7.material);
		System.out.println("Bell Tone:"+bell7.bellTone);
		
	}
}