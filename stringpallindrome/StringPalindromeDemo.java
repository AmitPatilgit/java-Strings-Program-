package com.kn.stringpallindrome;

import java.util.Scanner;

import com.kn.reversestring.ReverseString;

public class StringPalindromeDemo {

	public static void main(String[] args) 
	{
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
				
				if(outputstring.equals(inputString)) {
					System.out.println("The string is Pallindrome ");
				}
				else
				{
					System.out.println("The string is not Pallindrome ");
				}

	}
	

}
