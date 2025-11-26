package com.tka.array2_24nov;

import java.util.Scanner;

public class A {


public void acceptdata(int y[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	for (int k = 0; k < y.length; k++) {
		 y[k] = sc.nextInt();
	}
}

public void showdata(int y[]) {
	System.out.println();
	System.out.println("The values from array is: ");
	for (int k = 0; k < y.length; k++) {
		System.out.print(y[k]+ " ");
	}
}

public void ascending(int y[]) {	
	for (int k = 0; k < y.length; k++) {
		for (int j = k+1; j < y.length; j++) {
			if(y[k]>y[j]) {
				int t = y[k];
				y[k]=y[j];
				y[j]=t;
			}
		}
		
	}
}


public void descending(int y[]) {
	for (int k = 0; k < y.length; k++) {
		for (int j = k+1; j < y.length; j++) {
			if(y[k]<y[j]) {
				int t = y[k];
				y[k]=y[j];
				y[j]=t;
			}
		}
	}
}

public void maxNum(int y[]) {
	System.out.println();
	int max = y[0];
	for(int k=0; k<y.length; k++) {
		if(y[k]>max) {
			max=y[k];
		}
	}
	System.out.println("The max number is: "+max);
}

public void minNum(int y[]) {
	System.out.println();
	int min =y[0];
	for (int k = 0; k < y.length; k++) {
		if(y[k]<min) {
			min = y[k];
		}
	}
	System.out.println("The minimum number is: "+min);
}

public void secondMax(int y[]) {
	System.out.println();
	
		for (int k = 0; k < y.length; k++) {
			for (int j = k+1; j < y.length; j++) {
				if(y[k]<y[j]) {
					int t = y[k];
					y[k]=y[j];
					y[j]=t;
				}			
			}
	}
			System.out.println("The second max number is: "+y[1]);
}

public void secondMin(int y[]) {
	System.out.println();
	
		for (int k = 0; k < y.length; k++) {
			for (int j = k+1; j < y.length; j++) {
				if(y[k]>y[j]) {
					int t = y[k];
					y[k]=y[j];
					y[j]=t;
				}			
			}
	}
			System.out.println("The second min number is: "+y[1]);
}
}
