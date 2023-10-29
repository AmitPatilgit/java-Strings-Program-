package com.kn.removeduplicate;

import java.util.Scanner;

public class RemoveDuplicateDemo {

	public static void main(String[] args) 
	{
		//take input from user 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String inputString = scan.nextLine();
		
		// create a object of class Remove duplicate
		RemoveDuplicate rd = new RemoveDuplicate();
		
		//call the behaviour removeString
		
		
		System.out.println("After removing the duplicates :" + rd.duplicateRemove(inputString));
		scan.close();

	}

}
