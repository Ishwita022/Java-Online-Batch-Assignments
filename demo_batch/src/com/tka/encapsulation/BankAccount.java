package com.tka.encapsulation;

import java.util.Scanner;

public class BankAccount {
 private long accountNum ;
 private double balance;
 
 public void setterAcc(long a) {
	 accountNum = a;
 }
 public void setterbal(double b) {
	balance = b;
}
 
 public long getterAcc() {
	return accountNum;
 }
 public double getterbal() {
	return balance;
}
 
 public void acceptBank() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Account number: ");
	 setterAcc(sc.nextLong());
	 System.out.print("Enter balance: ");
	 setterbal(sc.nextDouble());
	 System.out.println();
 }
 
 public void showBank() {
	 System.out.println("----Bank Inforamtion----");
	 System.out.println("Account Number is: "+getterAcc());
	 System.out.println("Balance: "+getterbal());
 }
}
