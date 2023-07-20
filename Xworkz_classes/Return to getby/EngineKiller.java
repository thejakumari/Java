class EngineKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in EngineKiller");
		
		int ref1=Engine.getCCByModel("Swift");
		System.out.println("Ref1 is: "+ref1);
		
		int ref2=Engine.getCCByModel("Rapid");
		System.out.println("Ref2 is: "+ref2);
		
		int ref3=Engine.getCCByModel("BMW");
		System.out.println("Ref3 is: "+ref3);
		
		int ref4=Engine.getCCByModel("Benz");
		System.out.println("Ref4 is: "+ref4);
		
		int ref5=Engine.getCCByModel("audi");
		System.out.println("Ref5 is: "+ref5);
		
		int ref6=Engine.getCCByModel("Bentely");
		System.out.println("Ref6 is: "+ref6);
	}
}