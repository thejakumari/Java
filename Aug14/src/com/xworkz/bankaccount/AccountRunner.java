package com.xworkz.bankaccount;

public class AccountRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in AccountRunner");
		BankAccount account=new SavingAccount();
		System.out.println(account.calculateInterest());
		System.out.println(account.deposit());
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.isOverdraftAvailable());
		System.out.println(account.printStatement());
		System.out.println(account.setAtmNo());
		System.out.println(account.transfer());
		System.out.println(account.withdraw());

	}

}
