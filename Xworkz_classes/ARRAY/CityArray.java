class CityArray{
	public static void main(String[] names){
		System.out.println("Running in the City Names");
		String mangalore="Mangalore";
		String bangalore ="Bangalore";
		String hassan="Hassan";
		String chikmagalur="Chikmagalur";
		String udupi="Udupi";
		String hubballi="Hubballi";
		String dharwad="Dharwad";
		String kolar="Kolar";
		
		String[] cities={mangalore,bangalore,hassan,hubballi,chikmagalur,udupi,dharwad,kolar};
		
		
		System.out.println("Politician Name of ref2 is:"+cities[3]);
		String ref4=cities[5];
		System.out.println("Politician Name of ref4 is:"+ref4);
		String ref6=cities[6];
		System.out.println("Politician Name of ref6 is:"+ref6);
	}
}
