class StadiumKiller{
	public static void main(String[] lines){
		System.out.println("Invoking main in Stadium ");
		Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.capacity);
		System.out.println(stadium.event);
		System.out.println(stadium.location);
		System.out.println(stadium.type);
		System.out.println("===============================================================");
		stadium.name="Shree Kanteerava";
		stadium.capacity=25810;
		stadium.event="Volleyball";
		stadium.location="Bangalore";
		stadium.type="Outdoor";
	    
		System.out.println(stadium.name);
		System.out.println(stadium.capacity);
		System.out.println(stadium.event);
		System.out.println(stadium.location);
		System.out.println(stadium.type);
		System.out.println("===============================================================");
		Stadium stadium1=new Stadium();
		System.out.println(stadium1.name);
		System.out.println(stadium1.capacity);
		System.out.println(stadium1.event);
		System.out.println(stadium1.location);
		System.out.println(stadium1.type);
		System.out.println("===============================================================");
		stadium1.name="Sardar Vallabhbhai Patel Sports Complex";
		stadium1.capacity=132000;
		stadium1.event="Cricket";
		stadium1.location="Ahmedabad";
		stadium1.type="Outdoor";
		System.out.println(stadium1.name);
		System.out.println(stadium1.capacity);
		System.out.println(stadium1.event);
		System.out.println(stadium1.location);
		System.out.println(stadium1.type);
	}
}