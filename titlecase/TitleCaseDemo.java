package com.kn.titlecase;

import java.util.Scanner;

public class TitleCaseDemo {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s= scan.nextLine();
		
		
		TitleCase toggleFirstLetter = new TitleCase();
		
		String output=toggleFirstLetter.firstLetter(s);
		System.out.println(output);
		
		scan.close();

	}

}
