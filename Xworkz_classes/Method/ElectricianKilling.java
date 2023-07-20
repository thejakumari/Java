class ElectricianKilling{

public static void main(String[] args){
	
	System.out.println("Electrician methods Invoking");
	Electrician.replace();
	Electrician.rebuild("Fridge");
	Electrician.repair(15);
	Electrician.rebuild(2000.00f);
	Electrician.repair(30);
	Electrician.install("Television");
	Electrician.install(12);
	Electrician.maintains();
	Electrician.replace();
	Electrician.checkStatus();

	electricUpgrade();
	customerService();
	
	
	
}
    static void electricUpgrade(){
		System.out.println("Electrician does electric Upgrade");
	}
	
	static void customerService(){
		System.out.println("Electrician does customer Service every time");
	}
	



}