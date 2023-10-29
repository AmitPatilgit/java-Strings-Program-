package com.kn.reversecharinstring;

public class ReverseCharInString {
	public void reverseCharacter(String inputString)
	{
		String[] s1 = inputString.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
			char [] crr =s1[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--)
			{
				System.out.print(crr[j]);
			}
			System.out.print(" ");
		}
		
		
	}

}
