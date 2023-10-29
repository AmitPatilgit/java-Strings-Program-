package com.kn.replacestring;

import java.util.Scanner;

public class ReplaceStringDemo {

	public static void main(String[] args) 
	{
		//Take input String from user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String inputString=scan.nextLine();
		//Create the object of class ReplaceString
	   ReplaceString replaceString = new ReplaceString();
				
		// Call Method to REplace String
		String outputstring=replaceString.replaceString(inputString);
				
		//Print the output String
		System.out.println("The reversed String = " + outputstring);
				
		//Release the resource
		scan.close();

	}

}
