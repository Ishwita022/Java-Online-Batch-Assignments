package com.tka.abstraction;

public class CurrentAccount extends BankAccount {
	@Override
	public void deposite() {
		balance+=amount;
		System.out.print("Balance of Current Account after deposite: "+balance);
		System.out.println();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		balance-=amount;
		System.out.print("Balance of Current Account after withdraw: "+balance);
		System.out.println();
	}
}
