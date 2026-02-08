package com.tka.Static_Method_5nov;

public class Return_Type_Method {
public int sumofnum() {
	int sum=0;
	for (int i = 1; i <= 10; i++) {
		sum=sum+i;
	}
	return sum;
}

public void div4_7(int n){
	if(n%4==0 && n%7==0) {
		System.out.println(n);
	}
}

public long prod_odd() {
	long prod=1;
	for (int i = 44; i >= 22; i--) {
		if(i%2!=0) {
			prod=prod*i;
		}
	}
	
	return prod;
}
}
