package com.tka.array2_24nov;

import java.util.Scanner;

public class Netflix {
private String username, password, country;
private double subscription;
private static Netflix netflix[] = new Netflix[5];


public Netflix() {
	
}
public Netflix(String u, String p, String c, double s) {
	setUsername(u);
	setPassword(p);
	setCountry(c);
	setSubscription(s);
}

public static void acceptNetflix() {
	for (int i = 0; i < netflix.length; i++) {
		netflix[i]= new Netflix();
		netflix[i].accept();
	}
}

public static void showNetflix() {
	System.out.println("-----Netflix Info------");
	for (int i = 0; i < netflix.length; i++) {
		netflix[i].show();
	}
}

public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Username: ");
	setUsername(sc.next());
	System.out.print("Enter Password: ");
	setPassword(sc.next());
	System.out.print("Enter Country: ");
	setCountry(sc.next());
	System.out.print("Enter Subscription price: ");
	setSubscription(sc.nextDouble());
}
public void show() {
	System.out.println();
	System.out.println("Username:- "+getUsername());
	System.out.println("Password:- "+getPassword());
	System.out.println("Country:- "+getCountry());
	System.out.println("Subscription:- "+getSubscription());
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public double getSubscription() {
	return subscription;
}
public void setSubscription(double subscription) {
	this.subscription = subscription;
}


}
