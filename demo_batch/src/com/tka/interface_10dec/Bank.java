package com.tka.interface_10dec;

import java.util.ArrayList;

public class Bank {
private ArrayList<Account> account= new ArrayList<>();
public void addaccount(Account acc) {
	account.add(acc);
	System.out.println("Account added to bank");
}

public void showAllBalances() {
	for(Account acc : account) {
		acc.viewBalance();
	}
}
}
