package com.tka.interface_10dec;

public class SavingAccount implements Account{
private long accountNumber;
private String accountHolder;
private double balance;
private double interestRate;

public SavingAccount() {
	interestRate=4.0;
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

public void SavingBenefit() {
	System.out.println("Saving Account gives you Interest Benefit.");
}

@Override
public void deposite(double amount) {
	balance+=amount;
	System.out.println("Amount Added: "+balance);
}
@Override
public void withdraw(double amount) {
	if(amount<=balance) {
		balance-=amount;
		System.out.println("Withdrawn Cash is: "+amount);
	}else {
		System.out.println("Sorry! Insufficient ammount");
	}
}

@Override
public void calculateInterest() {
	double interest = (balance*interestRate)/100;
	balance +=interest;
	System.out.println("Interest Added: "+balance);
}
@Override
public void viewBalance() {
	System.out.println("View Balance: "+balance);
}


}
