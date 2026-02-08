package com.tka.interface_10dec;

public class CurrentAccount implements Account{
	

	
	private long accountNumber;
	private String accountHolder;
	private double balance;
	private double overdraftlimit;

	public CurrentAccount() {
		overdraftlimit=10000;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void showoverdraftlimit() {
		System.out.println("Ovrerdraft limit is: "+overdraftlimit);
	}

	@Override
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("Amount Added: "+balance);
	}
	@Override
	public void withdraw(double amount) {
		if(amount<=balance+overdraftlimit) {
			balance-=amount;
			System.out.println("Withdrawn Cash is: "+amount);
		}else {
			System.out.println("Sorry! Insufficient ammount");
		}
	}

	@Override
	public void calculateInterest() {
		
		System.out.println("Sorry No Interest for Saving account.");
	}
	@Override
	public void viewBalance() {
		System.out.println("View Balance: "+balance);
	}


	}


