class WonderArray{
	public static void main(String[] names){
		System.out.println("Running Wonders of world in main");
		String india="Taj Mahal";
		String china="Great Wall of China";
		String jordan="Petra";
		String italy="The Colosseum";
		String  brazil="Christ the Redeemer";
		String mexico="Chichen Itza";
		String peru="Machu Picchu";
		String[] wonders={china,italy,india,jordan,peru,mexico,brazil};
		int total=wonders.length;
		System.out.println("Total number of elements:"+total);
		for(int position=0;position<wonders.length;position++)
		{
			System.out.println("Elements at index:"+position +"items are:"+wonders[position]);
			
			
		}
		System.out.println("----------------------------------------------------");
			 wonders[6]="Great Pyramid of Giza";
		     wonders[4]="The Colossus of Rhodes";
		for(int position=wonders.length-1;position>=0;position--)
		{
			System.out.println("Elements at index:"+position+"items are:"+wonders[position]);
			
		}
	}
}