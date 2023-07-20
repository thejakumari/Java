class VegitableArray{
	public static void main(String[] names){
		System.out.println("Running Vegitables in main");
		float onion=35;
		float tomato=106;
		float greenchilli=65;
		float potato=34;
		float beetroot=60;
		float carrot=50;
		float cabbage=28;
		float[] vegitables={cabbage,carrot,beetroot,tomato,greenchilli,potato,onion};
		int total=vegitables.length;
		System.out.println("Total number of elements:"+total);
		for(int position=0;position<vegitables.length;position++)
		{
			System.out.println("Elements at index:"+position +"items are:"+vegitables[position]);
			
			
		}
		System.out.println("----------------------------------------------------");
			 vegitables[5]=40;
		     vegitables[0]=60;
			 for(int position=vegitables.length-1;position>=0;position--)
		
		{
			System.out.println("Elements at index:"+position+"items are:"+vegitables[position]);
			
		}
	}
}