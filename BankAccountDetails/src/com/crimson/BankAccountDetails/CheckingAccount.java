package com.crimson.BankAccountDetails;

public class CheckingAccount extends BankAccount {
	
	public final  double DEFAULT_FEE=5.00;
	
	private double monthly_fee;
	

	public CheckingAccount() {
		super();
		monthly_fee=DEFAULT_FEE;
	}


	public CheckingAccount(double balance, double monthly_fee) {
		super(balance);
		this.monthly_fee=monthly_fee;
	}
	
	public CheckingAccount applyMonthlyFee(){
		withdraw(monthly_fee);
		return this ;
		
	}
	
	public double getMonthlyFee() {
		
		return monthly_fee;
		
	}
	
	public CheckingAccount setMonthlyFee(double monthly_fee) {
		if(monthly_fee>=0) {
			this.monthly_fee=monthly_fee;
		}else {
			if (monthly_fee<=0.0) {
				try {
					throw new LowDepositeBalanceException("your balance is nill");
				}catch(LowDepositeBalanceException e) {
					System.out.println(e.toString());
				}
			}
		}
		return this;
	}


	@Override
	public String toString() {
		return "monthly fee:"+MONEY.format(monthly_fee);
	}
	
	
	
	

}
