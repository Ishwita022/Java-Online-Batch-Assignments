package com.tka.polymorphism_4dec;

public class VarArgsMethod {
public void total(int ...a) {
	int sum =0;
	for(int y: a) {
		sum=sum+y;
	}
	System.out.println(sum);
}
}
