package com.crimson.BankAccountDetails;

import java.text.DecimalFormat;

public class BankAccount extends Exception implements Account{
	
	public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	private double balance;
	
	public BankAccount() {
		balance=0.0;
	}
	
	public BankAccount(double balance) {
		deposite(balance);
	}
	
	public BankAccount deposite(double money) {
		if(money<0.0) {
			try {
				throw new LowDepositeBalanceException("your balance is nill");
			}catch(LowDepositeBalanceException e) {
				System.out.println(e.toString());
			}
		}else {
		if(money>=0.0)
			balance+=money;
		}
		return this;
	}
	
	public BankAccount withdraw(double money) {
		if(money>=0.0 && money<=balance) {
			balance -= money;
		}else {
			if(money<0.0){
				try {
					throw new LowDepositeBalanceException("your balance is nill");
				}catch(LowDepositeBalanceException e) {
					System.out.println(e.toString());
				}
			}
		}
		return this;
	}
	
	public double getbalance() {
		return balance;
		
	}

	@Override
	public String toString() {
		return "Balance amount:"+MONEY.format(balance);
	}

	
	
	

}
