package com.kn.firstnonrepeatingchar;

public class FirstNonRepeatingChar {
	

	public void nonRepeating(String s) {
		
		char[] c= s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			
			for(int j=0;j<c.length;j++)
			{
				
				if(c[i]==c[j])
				{
					count++;
					
					
				}
			}
			if(count==1)
			{
				
				System.out.print("The first non repeating character is :" +c[i]);
				break;
			}
		}
		
		
		//return null;
	}

	
}

