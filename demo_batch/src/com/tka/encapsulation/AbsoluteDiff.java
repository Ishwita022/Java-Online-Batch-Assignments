package com.tka.encapsulation;

import java.util.Iterator;
import java.util.Scanner;

public class AbsoluteDiff {

	public void AbsDiff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = sc.nextInt();
		int org= y;
		int rev =0, n=0, diff=0;

		while(y>0) {
			 n = y%10;
			rev = (rev*10)+n;
			y/=10;
			
		}
		System.out.println("original number is "+org);
		System.out.println("reverse number is: "+rev);
//		diff = Math.abs(y-rev);
	   diff = org-rev;
		
		System.out.println("Difference is:"+diff);
	}
	
	public void pattern() {
		int x = 4715;
		int rev1=0;
		while(x>0) {
			int n = x%10;
			rev1 = (rev1*10)+n;
			x=x/10;
		}
		int y1 = rev1;
		while(y1>0) {
			int n1 = y1%10;
			for (int i = 1; i <= n1; i++) {
				System.out.print(n1);
			}
			System.out.println();
			y1/=10;
		}
	}
}
