package com.tka.Calculate_Task;

import java.util.Scanner;

public class Calculate_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String product_name;
      double product_quantity, product_price, total_amount;
      System.out.println("Enter the product name: ");
      product_name = sc.next();
      System.out.println("Enter the product price: ");
      product_price = sc.nextDouble();
      System.out.println("Enter the product quantity: ");
      product_quantity = sc.nextDouble();
      total_amount = product_quantity*product_price;
      System.out.println("Customer actual total amount is: "+total_amount);
      if(total_amount>1000.00) {
    	double total =  total_amount*5/100;
    	System.out.println("Customer total amount after applying discount is: "+total);
      }
	}

}
