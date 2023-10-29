package com.kn.caesarcipher;

public class CipherCaser {
	public String decoder(String s,int n)
	{
		StringBuffer sb = new StringBuffer();
		char[] c=s.toCharArray();
		
		while(n>26)
		{
			n=n-26;
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			
			if(s.charAt(i)>=97 && s.charAt(i)<=122-n)
			{
				c[i]=(char)(c[i]+n);
			}
			else if(s.charAt(i)>=65 && s.charAt(i)<=90-n)
			{
				c[i]=(char)(c[i]+n);
			}
			
			else
			{
				c[i]=(char)((c[i]+n)-26);
			}
		}
		for(char ch:c)
		{
			sb.append(ch);
		}
		
		
		return sb.toString();
		
	}

}
