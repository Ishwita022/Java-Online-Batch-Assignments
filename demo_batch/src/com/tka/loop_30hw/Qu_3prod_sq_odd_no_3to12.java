package com.tka.loop_30hw;

public class Qu_3prod_sq_odd_no_3to12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1, sq=0;
   for (int i = 3; i <= 12; i++) {
	if(i%2 !=0) {
		sq=i*i;
		prod= prod*sq;
	}
}
   System.out.println(prod);
	}

}
