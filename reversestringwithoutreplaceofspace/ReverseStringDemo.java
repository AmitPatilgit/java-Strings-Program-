package com.kn.reversestringwithoutreplaceofspace;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=scan.nextLine();
		
		ReverseString reverseString = new ReverseString();
		
		String out=reverseString.reverseWithoutSpace(s);
		System.out.println(out);
		
		scan.close();
		

	}

}
