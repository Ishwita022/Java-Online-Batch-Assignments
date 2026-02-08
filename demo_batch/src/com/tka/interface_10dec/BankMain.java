package com.tka.interface_10dec;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Bank b = new Bank();
System.out.println("1. Saving Account");
System.out.println("2. Current Account");
int choice = sc.nextInt();

if(choice==1) {
	SavingAccount s = new SavingAccount();
	System.out.print("Enter account number: ");
	s.setAccountNumber(sc.nextLong());
	
	
	System.out.print("Enter account holder: ");
	s.setAccountHolder(sc.next());
	
	
	System.out.print("Enter Initial Balance: ");
	s.setBalance(sc.nextDouble());

	
	b.addaccount(s);
	
	s.deposite(1000);
	s.calculateInterest();
	s.viewBalance();
	s.SavingBenefit();
}

else if(choice ==2) {
	CurrentAccount c = new CurrentAccount();
	
	System.out.print("Enter account number: ");
	c.setAccountNumber(sc.nextLong());

	
	System.out.print("Enter account holder: ");
	c.setAccountHolder(sc.next());
	System.out.println();
	System.out.print("Enter Initial Balance: ");
	c.setBalance(sc.nextDouble());
	
	
	b.addaccount(c);
	
	c.withdraw(5000);
	c.viewBalance();
	c.showoverdraftlimit();
}
b.showAllBalances();
sc.close();
	}

}
