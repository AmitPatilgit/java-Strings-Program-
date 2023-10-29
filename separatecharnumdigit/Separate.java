package com.kn.separatecharnumdigit;

public class Separate {

	public void separate(String s)
	{
		char[] c= s.toCharArray();
		int upperVowel=0;
		int upperConsonant=0;
		int lowerVowel=0;
		int lowerConsonant=0;
		int digitCount=0;
		int specialcount=0;
		int spaceCount=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65 && c[i]<=90)
			{
				if(c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
				{
					upperVowel++;
					//System.out.println("Upper case Vowels = "+c[i]+upperVowel);
				}
				else
				{
					upperConsonant++;
					//System.out.println("Uppercase Consonants = "+ c[i]+upperConsonant);
				}
			}
			else if(c[i]>=97 && c[i]<=122)
			{
				if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
				{
					lowerVowel++;
					//System.out.println("Upper case Vowels = "+c[i]+upperVowel);
					
				}
				else
				{
					lowerConsonant++;
				}
			}
			else if(c[i]>=48 && c[i]<=57)
			{
				digitCount++;
			}
			else if(c[i]==32)
			{
				spaceCount++;
			}
			else 
			{
				specialcount++;
			}
		}
		System.out.println("Upper case number of Vowels are :"+upperVowel);
		System.out.println("Lower case number of Vowels are :"+lowerVowel);
		System.out.println("Upper case number of Consonants are :"+upperConsonant);
		System.out.println("Lower case number of Consonants are :"+lowerConsonant);
		System.out.println("The number of Digits are :"+digitCount);
		System.out.println("The number of Special characters are :"+specialcount);
		System.out.println("The number of Spaces characters are :"+spaceCount);
		
		

	}

}
