package com.kn.inttoroman;

import java.util.Scanner;

public class IntToRomanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		IntToRoman roman=new IntToRoman();
		String out=roman.isRoman(num);
		System.out.println(out);
		sc.close();

	}

}
