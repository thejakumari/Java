class Beakry{
	    public static void main(String [] values){
		System.out.println("Invoking main in Beakry");
   		String   beakryname="Disha";
		String    cake="Red Valvet";
		double   price=250;
		int noofpieces=8;
		int noofcustomer=14;
		String sweetname1="Barfi";
		float   noofkg=2.50f;
		String sweetname2="Jalebi";
		String chip="Banana chip";
		String[] beakries={beakryname,cake,sweetname1,sweetname2,chip};
		String ref1=beakries[2];
 		System.out.println("Item is:"+ref1);
                                   // using for loop
  		int total=beakries.length;
		for(position=0;position<beakries.length;position++){
			System.out.println("Item is in index:"+position+"Item :"+beakries[position]);
			}
		for(position=beakries.length-1;position>=0;position--){
			System.out.println("Item is in index:"+position+"Item :"+beakries[position]);
			}
                         static void tasty(String name,double price){
 		System.out.println("Invoking the method tasty()");
		if(name!=null){
			System.out.println("Name is valid:"+name);
			      }
		else
		{
			System.err.println("Name is invalid:"+name);
		}
		if(price>=20){
			System.out.println("Price is valid:"+price);
			      }
		else
		{
			System.err.println("Price is invalid:"+price);
		}
	      	
		tasty(cake,price);
		}
}