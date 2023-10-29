package com.kn.validstringornot;

import java.util.Scanner;

public class ValidStringOrNotDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		
		
		ValidStringOrNot validOrNot= new ValidStringOrNot();
		validOrNot.isValidOrNot(s);
		sc.close();

	}

}
