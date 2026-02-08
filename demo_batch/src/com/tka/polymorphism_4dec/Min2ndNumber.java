package com.tka.polymorphism_4dec;

public class Min2ndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y[]= {3, 5, 7, 1, 9, 0, 8, 6, 4, 2};
int min=0;
int sec=0;
for (int i = 0; i < y.length; i++) {
	if(min>y[i]) {
		min=y[i]+1;
		
	}
}

System.out.println(min);
	}

}
