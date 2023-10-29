package com.kn.stringcaseconversion;

public class CaseConversion {
	public String stringCase (String s)
	{
		char[] crr =s.toCharArray();
		
		for(int i=0;i<crr.length;i++)
		{
			// Checking condition for Upper Case character
			if(crr[i]>=65 && crr[i]<=90)
			{
				crr[i] =(char)(crr[i]+32);
			}
			//Checking condition for Lower Case character
			else if(crr[i]>=97 && crr[i]<=122)
			{
				crr[i]=(char)(crr[i]-32);
			}
			
		}
		StringBuffer bs = new StringBuffer();
		for(char c:crr)
			bs.append(c);
		
		
		return bs.toString();
		
	}

}
