package com.tka.loop_30hw;

public class Qu_6sum_sq_even_no_33to55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long sum=0, sq=0;
for (int i = 33; i <= 55; i++) {
	if(i%2==0) {
		sq=i*i;
		sum = sum + sq;
	}
}
System.out.println(sum);
	}

}
