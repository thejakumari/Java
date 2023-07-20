class ParkKiller{
	public static void main(String[] names){
		System.out.println("Invoking main in ParkKiller");
		Park park1=new Park("Tree Park","Belthangady");
		System.out.println("Park name:"+park1.name);
		System.out.println("Park location:"+park1.location);
		System.out.println("=======================================");
		Park park2=new Park("Tree Park","Belthangady",980.9);
		System.out.println("Park name:"+park2.name);
		System.out.println("Park location:"+park2.location);
		System.out.println("Park location:"+park2.width);
		System.out.println("=======================================");
		Park park3=new Park("Tree Park","Belthangady",980.9,1200.9,50.0);
		System.out.println("Park name:"+park3.name);
		System.out.println("Park location:"+park3.location);
		System.out.println("Park location:"+park3.width);
		System.out.println("Park location:"+park3.length);
		System.out.println("Park location:"+park3.cost);
		
	}
}