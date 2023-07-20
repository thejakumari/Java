class WalletKilller{
	public static void main(String[] values){
		System.out.println("Invoking main in WalletKilller");
		Wallet wallet=new Wallet();
		System.out.println("Wallet Brand:"+wallet.brand);
		System.out.println("Wallet color:"+wallet.color);
		System.out.println("Wallet cost:"+wallet.cost);
		System.out.println("================================================");
		Wallet wallet1=new Wallet("Puma",2334.0,"Blue");
		System.out.println("Wallet Brand:"+wallet1.brand);
		System.out.println("Wallet color:"+wallet1.color);
		System.out.println("Wallet cost:"+wallet1.cost);
	}
}