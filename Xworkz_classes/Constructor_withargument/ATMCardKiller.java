class ATMCardKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in ATMCardKiller");
		
		ATMCard atmCard=new ATMCard();
		System.out.println("ATM card bankName :"+atmCard.bankName);
		System.out.println("ATM card holder name :"+atmCard.holderName);
		System.out.println("ATM card pin number "+atmCard.pinNumber);
		
		System.out.println("=======================================");
		
		ATMCard atmCard1=new ATMCard("Karnataka Bnak","Harshitha",4556);
		System.out.println("ATM card bankName :"+atmCard1.bankName);
		System.out.println("ATM card holder name :"+atmCard1.holderName);
		System.out.println("ATM card pin number "+atmCard1.pinNumber);
		
	}
}