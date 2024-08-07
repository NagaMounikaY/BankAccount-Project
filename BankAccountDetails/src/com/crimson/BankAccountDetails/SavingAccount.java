package com.crimson.BankAccountDetails;

public class SavingAccount extends BankAccount {
	
	public final double DEFAULT_RATE=3.0;
	private double interestRate;
	
	
	public SavingAccount() {
		super();
		interestRate=DEFAULT_RATE;
	}


	public SavingAccount(double balance, double interestRate) {
		super(balance);
		//this.DEFAULT_RATE = default_rate;
		setInterestRate(interestRate);
	}
	
	public SavingAccount applyInterest() {
		double interest=getbalance()*(interestRate/100);
		deposite(interestRate);
		return this;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public SavingAccount setInterestRate(double interestRate) {
		if(interestRate>=0.0) 
			this.interestRate=interestRate;
		return this;
		
	}


	@Override
	public String toString() {
		return "interestRate=" + interestRate;
	}
	
	

}
