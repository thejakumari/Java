class CityKiller{
	public static void main(String[] values){
		City city=new City();
		System.out.println("City name:"+city.name);
		System.out.println("Pincode:"+city.pincode);
		System.out.println("District:"+city.district);
		System.out.println("==========================================================");
		
		City city1=new City("Kayarthadka",574216,"Dakshin Kannada");
		System.out.println("City name:"+city1.name);
		System.out.println("Pincode:"+city1.pincode);
		System.out.println("District:"+city1.district);
	}
}