package com.kn.stringcaseconversion;

import java.util.Scanner;

public class CaseConversionDemo {

	public static void main(String[] args)
	{
		//Take input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=scan.nextLine();
		
		//create Object of caseConversion
		CaseConversion uppercase = new CaseConversion();
		//Call method to Case Convrsion
		String output=uppercase.stringCase(s);
		
		//print output
		System.out.println(output);
		
		//Release source
		scan.close();

	}

}
