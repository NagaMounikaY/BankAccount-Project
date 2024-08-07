package com.crimson.BankAccountDetails;

public class LowDepositeBalanceException extends RuntimeException {
	public LowDepositeBalanceException() {
		super();
	}
	
	public LowDepositeBalanceException(String msg) {
		super(msg);
	}

}
