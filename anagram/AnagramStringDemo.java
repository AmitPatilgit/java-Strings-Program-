package com.kn.anagram;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String one :");
		String s1=scan.nextLine();
		System.out.println("Enter the String two :");
		String s2=scan.nextLine();
		
		AnagramString anagram= new AnagramString();
		
		
		boolean isAnagram=anagram.stringAnagram(s1,s2);
		if(isAnagram)
		{
			System.out.println(s1 + " & " +s2 +" is Anagram "+isAnagram);
		}
		else
		{
			System.out.println(s1 + " & " +s2 +" is not Anagram "+isAnagram);
		}
		
		
		scan.close();
		
		
		
		
	}

}
