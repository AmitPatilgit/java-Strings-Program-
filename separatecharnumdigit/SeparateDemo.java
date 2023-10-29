package com.kn.separatecharnumdigit;

import java.util.Scanner;

public class SeparateDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String s= scan.nextLine();
		
		
		Separate separatechar = new Separate();
		
		
		separatechar.separate(s);
		scan.close();
		

	}

}
