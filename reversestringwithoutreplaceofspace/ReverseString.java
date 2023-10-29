
package com.kn.reversestringwithoutreplaceofspace;

public class ReverseString {
	public String reverseWithoutSpace(String s)
	{
		char[] c=s.toCharArray();
		char[] c1=new char[c.length];
		
		
		
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				c1[i]=c[i];
			}
			
		}
		
		int j=c.length-1;
		for(int i=0;i<c1.length;i++)
		{
			if(c[i]!=' ')
			{
				if(c1[j]== ' ')
				{
					j--;
				}
				c1[j]=c[i];
				j--;
			}
		}
		return new String(c1);
		
	}

}
