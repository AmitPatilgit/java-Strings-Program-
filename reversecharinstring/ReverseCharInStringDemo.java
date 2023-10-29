package com.kn.reversecharinstring;

import java.util.Scanner;

public class ReverseCharInStringDemo {

	public static void main(String[] args) {
		 

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		ReverseCharInString reverse = new ReverseCharInString();
		
		reverse.reverseCharacter(inputString);
		
		//System.out.println();
		scan.close();
	}

}
