class Job1{
	static void apply()
	{
		System.out.println("Invoking apply() in Job");
		String name="Kiran";
		System.out.println("Person Name:"+ name);
	}
	static void apply(String personName,int exp)
	{
		System.out.println("Person Name:"+personName);
		System.out.println("Experience:"+exp);
	}
	static void apply(int exp,String personName) 
	{
		System.out.println("Person Name:"+personName);
		System.out.println("Experience:"+exp);
		
	}
}