class OilKiller{
	public static void main(String[] cooks){
		System.out.println("Invoking the main in OilKiller");
		Oil oil=new Oil();
		System.out.println("Oil Name:"+oil.name);
		System.out.println("Oil Viscosity:"+oil.viscosity);
		System.out.println("Oil Quantity:"+oil.quantity);
		System.out.println("*********************************************************************");
		Oil oil1=new Oil("Avocado");
		System.out.println("Oil Name:"+oil1.name);
		System.out.println("Oil Viscosity:"+oil1.viscosity);
		System.out.println("Oil Quantity:"+oil1.quantity);
		System.out.println("*********************************************************************");
		Oil oil2=new Oil(45.09,"Peanut");
		System.out.println("Oil Name:"+oil2.name);
		System.out.println("Oil Viscosity:"+oil2.viscosity);
		System.out.println("Oil Quantity:"+oil2.quantity);
		System.out.println("*********************************************************************");
		Oil oil3=new Oil(2,"Coconut",56.7);
		System.out.println("Oil Name:"+oil3.name);
		System.out.println("Oil Viscosity:"+oil3.viscosity);
		System.out.println("Oil Quantity:"+oil3.quantity);
		System.out.println("*********************************************************************");
	}
}