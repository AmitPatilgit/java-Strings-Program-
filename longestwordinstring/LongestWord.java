package com.kn.longestwordinstring;

public class LongestWord {

	public String findLongest(String inputString)
	{
		String [] srr =inputString.split(" ");
		StringBuffer temp = new StringBuffer();
		
		for(String s:srr)
		{
			if(s.length()>temp.length())
			{
				temp= new StringBuffer(s);
			}
		}
		
		
		
		
		
		
		
		return temp.toString();
		
	}
}
