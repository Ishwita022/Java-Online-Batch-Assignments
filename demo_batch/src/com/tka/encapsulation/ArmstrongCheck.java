package com.tka.encapsulation;

import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongCheck {
public long Power(long base, long pow) {
	long r=1;
	for (int i = 1; i <= pow; i++) {
		r = r*base;
	}
	System.out.println("power of number is: "+r);
	return r;
	
}


public int countDigit(int num) {
	int count =0;
	while(num>0) {
		num=num/10;
		count++;
	}
	System.out.println("count of number is: "+count);
	return count;
}
}
