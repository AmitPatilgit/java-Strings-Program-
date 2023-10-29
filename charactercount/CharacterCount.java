package com.kn.charactercount;

public class CharacterCount {

	public int countCharacter(String inpuString,char ch) 
	{
		char[] crr = inpuString.toCharArray();
		
		//StringBuffer sb = new StringBuffer();
		
		int count=0;
		
		for(int i=0;i<crr.length-1;i++)
		{
			if(crr[i]==ch)
			{
				count++;
			}
			
		
		}
		return count;
		
		

	}

}
