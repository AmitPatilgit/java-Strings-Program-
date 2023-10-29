package com.kn.charactercount;

import java.util.Scanner;

public class CharacterCountDemo {

	public static void main(String[] args) {
		
		//take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String inputStirng =  scan.nextLine();
		System.out.println("enter character :");
		char ch=scan.next().charAt(0);
		//object creation
		CharacterCount characterCount = new CharacterCount();
		System.out.println(characterCount.countCharacter(inputStirng, ch));
		
		
		
		scan.close();

	}

}
