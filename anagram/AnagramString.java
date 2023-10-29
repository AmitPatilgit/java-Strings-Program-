package com.kn.anagram;

public class AnagramString {
	public boolean stringAnagram(String s1,String s2)
	{
		boolean isAnagram=false;
		if(s1.length()==s2.length())
		{
			char[] crr1 =s1.toCharArray();
			char[] crr2=s2.toCharArray();
			
			
			crr1=sortCharArray(crr1);
			crr2=sortCharArray(crr2);
			
			for(int i=0;i<crr1.length;i++)
			{
				if(crr1[i]== crr2[i])
				{
					isAnagram=true;
				}
				else
				{
					isAnagram=false;
					break;
				}
			}
			
			
		}
		return isAnagram;
	}

	public char[] sortCharArray(char[] crr) 
	{
		for(int i=0;i<crr.length;i++)
		{
			 boolean isSwapped=false;
			for(int j=0;j<crr.length-1-i;j++)
			{
				if(crr[j]>crr[j+1])
				{
					char temp= crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false)
			{
				break;
			}
		}
		
		
		return crr;
	}

}
