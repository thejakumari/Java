package com.xworkz.bankaccount;

public class SavingAccount extends BankAccount {
	@Override
	 public  boolean printStatement() {
		 return true;
	 }
	@Override
	    public  String getAccountNumber() {
	    	return "KBA20210004567";
	    }
	@Override
	    public  String getAccountHolderName() {
	    	return "Theju";
	    }
	@Override
	    public   boolean setAtmNo() {
	    	return true;
	    }
	@Override
	    public  boolean isOverdraftAvailable() {
	    	return false;
	    }

}
