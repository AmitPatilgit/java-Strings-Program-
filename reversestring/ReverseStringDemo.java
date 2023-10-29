package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// Take input string from user
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String = " );
		String inputString = scan.nextLine();
		
		//Create the object of class ReverseString
		ReverseString reverseString = new ReverseString();
		
		// Call Method to reverse String
		String outputstring=reverseString.reverseString(inputString);
		//Print the Reversed String
		System.out.println("The reversed String = " + outputstring);
		
		//Release the resource
		scan.close();
		
	}

}
