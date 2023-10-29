package com.kn.longestwordinstring;

import java.util.Scanner;

public class LongestWordDemo {

	public static void main(String[] args) 
	{
		//Take input string from user
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter the String :");
		String inputString= scan.nextLine();
		
		//Create the object of class Reverse String
		LongestWord longestWord = new LongestWord();
		
		//Call method to Find the longest
		String output=longestWord.findLongest(inputString);
		System.out.println(output);
		scan.close();
		
	}

}
