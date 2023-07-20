class Resume{
	static void format()
	{
		System.out.println("Invoking Format in Resume");
		String type="Functional Resume";
		System.out.println("Type of resume:"+type);
	}
	static void format(String type)
	
	{
		System.out.println("Resume Type:"+type);
	}
	static void format(String type, int pages)
	
	{
		System.out.println("Resume Type:"+type);
		System.out.println("Number of Pages:"+pages);

	}
	static void clear()
	{
		System.out.println("Invoking to clear() in Resume");
	}
	static void delete()
	{
		System.out.println("Invoking to delete() in Resume");
	}
	
}