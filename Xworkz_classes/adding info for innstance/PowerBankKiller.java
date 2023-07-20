class PowerBankKiller{
	public static void main(String[] lines){
		System.out.println("Invoking main in PowerBank ");
		PowerBank powerBank=new PowerBank();
		System.out.println(powerBank.brand);
		System.out.println(powerBank.capacity);
		System.out.println(powerBank.cost);
		System.out.println(powerBank.noofports);
		System.out.println(powerBank.inputcapability);
		System.out.println("===============================================================");
		powerBank.brand="Mi";
		powerBank.capacity=10000;
		powerBank.cost=3200;
		powerBank.noofports=3;
		powerBank.inputcapability=22.5;
		System.out.println(powerBank.brand);
		System.out.println(powerBank.capacity);
		System.out.println(powerBank.cost);
		System.out.println(powerBank.noofports);
		System.out.println(powerBank.inputcapability);
		System.out.println("===============================================================");
		PowerBank powerBank1=new PowerBank();
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.capacity);
		System.out.println(powerBank1.cost);
		System.out.println(powerBank1.noofports);
		System.out.println(powerBank1.inputcapability);
		System.out.println("===============================================================");
		powerBank1.brand="Ankar";
		powerBank1.capacity=20100;
		powerBank1.cost=4300;
		powerBank1.noofports=2;
		powerBank1.inputcapability=32.5;
		System.out.println(powerBank1.brand);
		System.out.println(powerBank1.capacity);
		System.out.println(powerBank1.cost);
		System.out.println(powerBank1.noofports);
		System.out.println(powerBank1.inputcapability);
		System.out.println("===========================================");
	}
}