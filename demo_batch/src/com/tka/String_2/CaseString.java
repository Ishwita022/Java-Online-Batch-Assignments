package com.tka.String_2;

import java.util.Iterator;
import java.util.Scanner;

public class CaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaseString c = new CaseString();

	}

	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public CaseString() {
		lowerCaseAccept();
		upperCasetoLower();
		lowerToUpper();
		toggleCase();
	}

	public void lowerCaseAccept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		s = sc.nextLine();
	}

	public void toggleCase() {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}

			result = result + ch;
		}
		System.out.println("Toggle Case String is: " + result);
	}

	public void upperCasetoLower() {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		System.out.println("Upper to Lower Case String is: " + result);
	}

	public void lowerToUpper() {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			result = result + ch;
		}
		System.out.println("Lower to Upper Case String is: " + result);
	}
}
