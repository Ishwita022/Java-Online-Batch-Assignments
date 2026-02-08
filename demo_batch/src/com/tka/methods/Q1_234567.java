package com.tka.methods;

public class Q1_234567 {

	
	public void even(int n1) {
		if(n1%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("not Even number");
		}
	}
	
	public void odd(int n2) {
		if(n2%2!=0) {
			System.out.println("odd number");
		}else {
			System.out.println("not odd number");
		}
	}
	
	public void div3(int n3) {
		if(n3%3==0) {
			System.out.println("The number is divisble by 3");
		}else {
			System.out.println("The number is not divisble by 3");
		}
	}
	
	public void div5(int n4) {
		if(n4%5==0) {
			System.out.println("The number is divisble by 5");
		}else {
			System.out.println("The number is not divisble by 5");
		}
	}
	
	public void div3or5(int n5) {
		if(n5%3==0 || n5%5==0) {
			System.out.println("The number is divisble by 3 or 5");
		}else {
			System.out.println("The number is not divisble by 3 or 5");
		}
	}
	
	public void Mango(int n6) {
		if(n6%3==0 && n6%5==0) {
			System.out.println("Mango and Apple");
		}else if(n6%3==0){
			System.out.println("Mango");
		}else if(n6%5==0) {
			System.out.println("Apple");
		}else {
			System.out.println("number: "+n6);
		}	
	}
	
	public void div4and7(int n) {
		if(n%4==0 && n%7==0) {
			System.out.println("The number is divisble by 4 and 7");
		}else {
			System.out.println("The number is not divisble by 4 and 7");
		}
	}
}
