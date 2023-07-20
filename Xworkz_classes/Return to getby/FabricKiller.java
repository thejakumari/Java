class FabricKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in FabricKiller");
		
		double ref1=Fabric.getPriceByType("Cotton");
		System.out.println("Ref1 is: "+ref1);
		
		double ref2=Fabric.getPriceByType("Nylon");
		System.out.println("Ref2 is: "+ref2);
		
		double ref3=Fabric.getPriceByType("Woolen");
		System.out.println("Ref3 is: "+ref3);
		
		double ref4=Fabric.getPriceByType("Linen");
		System.out.println("Ref4 is: "+ref4);
		
		double ref5=Fabric.getPriceByType("Polyster");
		System.out.println("Ref5 is: "+ref5);
		
		double ref6=Fabric.getPriceByType("Silk");
		System.out.println("Ref6 is: "+ref6);
	}
}