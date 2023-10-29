package com.kn.occuranceofcharacter;

import java.util.Scanner;

public class OccuranceOfCharacterDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=scan.nextLine();
		
		OccuranceOfCharacter numOfCharacter=new OccuranceOfCharacter();
		
		numOfCharacter.characterOccurance(s);
		scan.close();
		//System.out.println(out);

	}

}
