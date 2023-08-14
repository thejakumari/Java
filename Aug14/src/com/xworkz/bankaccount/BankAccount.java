package com.xworkz.bankaccount;

public abstract class BankAccount {
	public double getBalance() {
		return 12540.0;
	}
	public double deposit() {
		return 10245.0;
		
	}
	public double withdraw( ) {
		return 5200.0;
	}
    public boolean transfer()
    {
    	return true;
    }
    public boolean calculateInterest() {
    	return true;
    }
    public abstract boolean printStatement();
    public abstract String getAccountNumber();
    public abstract String getAccountHolderName();
    public abstract  boolean setAtmNo();
    public abstract boolean isOverdraftAvailable();

}