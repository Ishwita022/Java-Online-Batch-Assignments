package com.tka.methods;

import java.util.Scanner;

public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task_MainClass_1 t1 = new Task_MainClass_1();
t1.number();

System.out.println();
Scanner sc = new Scanner(System.in);
System.out.print("Enter Range: ");
int range = sc.nextInt();
t1.user_number(range);
System.out.println();

System.out.print("Enter Range of odd number: ");
int odd = sc.nextInt();
t1.odd_num(odd);
System.out.println();

System.out.print("Enter Square of number: ");
int sq = sc.nextInt();
t1.square(sq);
System.out.println();

System.out.print("Enter Cube of number: ");
int cube = sc.nextInt();
t1.cube(cube);
System.out.println();

System.out.print("Enter range of number for sum: ");
int num = sc.nextInt();
t1.sum(num);
System.out.println();

System.out.print("Enter range oof number for product: ");
int n1 = sc.nextInt();
t1.prod(n1);
System.out.println();

	}

}
