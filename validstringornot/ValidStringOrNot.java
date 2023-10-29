package com.kn.validstringornot;

public class ValidStringOrNot {
	public void isValidOrNot(String s)
	{
		char[] c=s.toCharArray();
		int paranthesis=0;
		int curly=0;
		int square=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				paranthesis++;
			}
			else if(c[i]==')')
			{
				paranthesis--;
			}
			else if(c[i]=='{')
			{
				curly++;
			}
			else if(c[i]=='}')
			{
				curly--;
			}
			else if(c[i]=='[')
			{
				square++;
			}
			else if(c[i]==']')
			{
				square--;
			}
			
			
		}
		if(paranthesis==0 && curly==0 && square==0)
		{
			System.out.println("The given string "+s+" is a valid String.");
		}
		else
		{
			System.out.println("The given string "+s+" is not a valid String.");
		}
		
	
		
	}

}
