package com.tka.abstraction;

public class SavingAccount extends BankAccount{
	
@Override
public void deposite() {
	balance+=amount;
	System.out.print("Balance of SavingAccount after deposite: "+balance);
	System.out.println();
}

@Override
public void withdraw() {
	// TODO Auto-generated method stub
	balance-=amount;
	System.out.print("Balance of SavingAccount after withdraw: "+balance);
	System.out.println();
}
}
