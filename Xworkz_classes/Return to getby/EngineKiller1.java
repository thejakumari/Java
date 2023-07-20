class EngineKiller1
{
	public static void main(String[] args)
	{
		System.out.println("invoking enginekiller in main");
		int ref1=Engine1.getccByModel("swift");
		System.out.println("ref1 is:"+ref1);
		int ref2=Engine1.getccByModel("bmw");
		System.out.println("ref2 is:"+ref2);
	}
}