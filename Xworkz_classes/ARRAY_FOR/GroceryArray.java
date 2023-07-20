class GroceryArray{
	public static void main(String[] items){
		System.out.println("Running Grocery in main ");
		String  tatasalt="Tata Salt";
		String oil="Sunflower Oil;";
	    String aashirvaadatta="Aashirvaad Atta";
		String ariel="Ariel";
		String redlabel="RedLabel";
		String honey="Dabur";
		String toothpaste="Colgate";
		
		String[] groceries={oil,tatasalt,toothpaste,aashirvaadatta,ariel,redlabel,honey};
		int total=groceries.length;
		System.out.println("Total number of elements:"+total);
		for(int position=0;position<groceries.length;position++)
		{
			System.out.println("Elements at index:"+position +"items are:"+groceries[position]);
			
			
		}
		System.out.println("----------------------------------------------------");
			 groceries[6]="Close Up";
		     groceries[4]="Bru";
		for(int position=groceries.length-1;position>=0;position--)
		{
			System.out.println("Elements at index:"+position+"items are:"+groceries[position]);
			
		}
	}
}