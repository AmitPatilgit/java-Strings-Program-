package com.kn.replacestring;

public class ReplaceString {

	public String replaceString (String inputString)
	{
		
		StringBuffer bufferedString = new StringBuffer(inputString);
		
		for(int i=0;i<bufferedString.length();i++)
		{
			if(bufferedString.charAt(i)==' ')
			{
				bufferedString.setCharAt(i, '$');
			}
		}
		
		
//		for(int i=0;i<inputString.length();i++)
//		{
//			if(intputString.charAt(i)==' ')
//			{
//				inputString.replace(" ", "$");
//			}
//		}
		
		
		
		return bufferedString.toString();
		
	}

}
