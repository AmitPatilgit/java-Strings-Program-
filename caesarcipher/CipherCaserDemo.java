package com.kn.caesarcipher;

import java.util.Scanner;

public class CipherCaserDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take input from user 
		System.out.println("Enter the String : ");
		String s= scan.nextLine();
		System.out.println("Enter the key :");
		int n = scan.nextInt();
		//Create an object of class cipher caesar
		CipherCaser ciphercaser = new CipherCaser();
		
		
		
		//Call behavior 
		String out=ciphercaser.decoder(s,n);
		
		//Print output
		System.out.println("The ciphered Text is: " +out);
		
		//release Source
		
		scan.close();

	}

}
