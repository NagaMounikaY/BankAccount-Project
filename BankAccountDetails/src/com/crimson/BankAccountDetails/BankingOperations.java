package com.crimson.BankAccountDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingOperations {
	List<Users> userList = new ArrayList<>();
	BankAccount b=new BankAccount();
	
	static String bankOperation;
	Scanner sc = new Scanner(System.in);
	
	public void readUserChoice(){
		
		System.out.println("Enter the user choice");
		System.out.println("register : to add new user");
		System.out.println("login : to login as existing user");
		System.out.println("checkbalance : to check balance user");
		System.out.println("savebalance : to save balance user");
		bankOperation = sc.next();
	
	}
	
	public void bankingMenu(){
		do {
		readUserChoice();
		switch (bankOperation) {
		case "register":
			registerUser();
			break;
			
		case "login":
			login();
			break;
			
		case "checkbalance":
			CheckBalance();
			break;
			
		case "savebalance":
			savingBalance();
			break;
			
		case "Exit":
			System.exit(0);
			break;

		default:
			break;
		}
		}while(bankOperation!=null);
		
		
	}
	
	
	private void registerUser(){
		Users u = new Users();
		System.out.println("Enter the user details: ");
		int userId = sc.nextInt();
		String userName = sc.next();
		String userPwd = sc.next();
		String accNumber = sc.next();
		
		u.setUserId(userId);
		u.setUserName(userName);
		u.setUserPassword(userPwd);
		u.setAccNumber(accNumber);
		
		userList.add(u);
		
		System.out.println("register sucess fully"+userList);
		
	}
	
	private void login() {
		System.out.println("enter login details:");
		 String userName = sc.next();
		String userPwd = sc.next();
		for(Users user:userList) {
		
		if(userName.equals(user.getUserName()) && userPwd.equals(user.getUserPassword())){
			System.out.println("enter the action withdraw or deposite ");
			String action = sc.next();
			System.out.println("enter the ammount:");
			double money = sc.nextDouble();
			switch (action) {
			case "withdraw":
				b.withdraw(money);
				break;
				
			case "deposite":
				b.deposite(money);
				break;

			default:
				break;
			
			}
			System.out.println(b);
			
		}else {
			System.out.println("user is not found");
		}
	}
	}
	
	private void CheckBalance(){
		CheckingAccount c= new CheckingAccount();
		System.out.println("enter the amount to set monthely fee:");
		double monthly_fee = sc.nextDouble();
		c.setMonthlyFee(monthly_fee);
		c.applyMonthlyFee();
		System.out.println(b.getbalance());
	}
	
	private void savingBalance(){
		SavingAccount s= new SavingAccount();
		System.out.println("enter the interest rate:");
		double interest_rate = sc.nextDouble();
		s.setInterestRate(interest_rate);
		s.applyInterest();
		System.out.println(b.getbalance());
	}
	}





