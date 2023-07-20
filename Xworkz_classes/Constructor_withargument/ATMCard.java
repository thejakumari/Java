class ATMCard{
	String bankName;
	String holderName;
	int pinNumber;
	
	ATMCard(){ 
		System.out.println("Invoking no-arguments from ATMCard");
		System.out.println("Atm Card bankName :"+this.bankName);
		System.out.println("Atm Card holderName :"+this.holderName);
		System.out.println("Atm Card pinNumber :"+this.pinNumber);
		this.bankName="SBI"; 
		this.holderName="Theja";
		this.pinNumber=9696;

	}
	ATMCard(String bankName, String holderName,int pinNumber){ 
		this.bankName=bankName; 
		this.holderName=holderName;
		this.pinNumber=pinNumber;

		
	}
}