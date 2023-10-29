package com.kn.occuranceofcharacter;

public class OccuranceOfCharacter {
	public void characterOccurance(String s)
	{
		
		char[] c=s.toCharArray();
		c=sortCharArray(c);
		int count=1;
		
		
		

			
			for(int j=0;j<c.length-1;j++)
			{
				
				if(c[j]==c[j+1])
				{
					count++;
				}
				
				
				else
				{
					System.out.println( c[j] + " - "+ count);
					count=1;
				}
				if(j+1==c.length-1)
				{
					if(c[j+1]==c[j])
					{
						count++;
					}
					else
					{
						System.out.println(c[j+1] + " - " + count);
						count=1;
					}
				}
			}
		
	}

	public char[] sortCharArray(char[] c) 
	{

		for(int i=0;i<c.length;i++)
		{
			boolean isSwapped=false;
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp= c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false)
			{
				break;
			}
		}
		
		return c;
	}

}
