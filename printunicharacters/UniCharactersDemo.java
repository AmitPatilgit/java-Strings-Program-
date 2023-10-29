package com.kn.printunicharacters;

import java.util.Scanner;

public class UniCharactersDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 =  scan.nextLine();
		//System.out.println();
		//char ch=scan.next().charAt(0);
		
		UniCharacters uc = new UniCharacters();
		
		uc.uniCharacter(s1);
		
		scan.close();
	}

}
