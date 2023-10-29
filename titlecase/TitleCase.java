package com.kn.titlecase;

public class TitleCase {
	public String firstLetter(String s)
	{
		String [] s1= s.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s1.length;i++)
		{
			char[] crr = s1[i].toCharArray();
			
			for(int j=0;j<crr.length;j++)
			{
				if((crr[0]>=97 && crr[0]<=122))
				{
					crr[0]=(char)(crr[0]-32);
				}
			}
			for(char c:crr) {
				sb.append(c);
			}
			sb.append(" ");
			
			
		}
		
		
		
		return sb.toString();
		
		
	}

}
