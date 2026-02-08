package com.tka.abstraction;

public class BankAccountMain {

	public static void main(String[] args) {
//		3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
		
		// TODO Auto-generated method stub
		BankAccount b1= new SavingAccount();
BankAccount b2= new CurrentAccount();
b1.deposite();
b1.withdraw();
b2.deposite();
b2.withdraw();
	}

}
