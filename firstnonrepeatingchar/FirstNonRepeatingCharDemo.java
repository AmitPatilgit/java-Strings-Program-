package com.kn.firstnonrepeatingchar;

import java.util.Scanner;

public class FirstNonRepeatingCharDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s= scan.nextLine();
		
		FirstNonRepeatingChar first = new FirstNonRepeatingChar();
		
		first.nonRepeating(s);
		//System.out.println(out);
		scan.close();

	}

}
