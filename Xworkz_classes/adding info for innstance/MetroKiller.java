class MetroKiller{
	public static void main(String[] lines){
		System.out.println("Invoking main in Metrokiller ");
		Metro metro=new Metro();
		System.out.println(metro.source);
		System.out.println(metro.destination);
		System.out.println(metro.cost);
		System.out.println(metro.nameofmetro);
		System.out.println(metro.metroline);
		System.out.println("===============================================================");
		metro.source="Majestic";
		metro.destination="Bayyappanahalli";
		metro.cost=28.5;
		metro.nameofmetro="Namma Metro";
		metro.metroline="Purpule Line";
		System.out.println(metro.source);
		System.out.println(metro.destination);
		System.out.println(metro.cost);
		System.out.println(metro.nameofmetro);
		System.out.println(metro.metroline);
		System.out.println("===============================================================");
		Metro metro1=new Metro();
		System.out.println(metro1.source);
		System.out.println(metro1.destination);
		System.out.println(metro1.cost);
		System.out.println(metro1.nameofmetro);
		System.out.println(metro1.metroline);
		System.out.println("===============================================================");
        metro1.source="Banshankri";
		metro1.destination="Majestic";
		metro1.cost=18.5;
		metro1.nameofmetro="Namma Metro";
		metro1.metroline="Green Line";
		System.out.println(metro1.source);
		System.out.println(metro1.destination);
		System.out.println(metro1.cost);
		System.out.println(metro1.nameofmetro);
		System.out.println(metro1.metroline);
	}
}