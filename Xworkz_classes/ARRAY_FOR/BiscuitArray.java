class BiscuitArray{
	public static void main(String[] names){
		System.out.println("Running Biscuit in main");
		String monaco="Monaco";
		String mariegold="Marie Gold";
		String goodday="Good Day";
		String darkfantsy="Dark Fantasy";
		String  digestive="Digestive";
		String bourbon="Bourbon";
		String krackjack="Krackjack";
		String[] biscuits={monaco,mariegold,goodday,darkfantsy,digestive,krackjack,bourbon};
		int total=biscuits.length;
		System.out.println("Total number of elements:"+total);
		for(int position=0;position<biscuits.length;position++)
		{
			System.out.println("Elements at index:"+position +"items are:"+biscuits[position]);
			
			
		}
		System.out.println("----------------------------------------------------");
			 biscuits[6]="Parle-G";
		     biscuits[4]="Hide&Seek";
		for(int position=biscuits.length-1;position>=0;position--)
		{
			System.out.println("Elements at index:"+position+"items are:"+biscuits[position]);
			
		}
	}
}