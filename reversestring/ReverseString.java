package com.kn.reversestring;

public class ReverseString {
	
		
	public  String reverseString(String inputString) {
		//StringBuffer bufferedString= new StringBuffer();
		//char[] crr= inputString.toCharArray();
		StringBuffer outputString= new StringBuffer();
		for(int i=inputString.length()-1;i>=0;i--)
		{
			outputString = outputString.append(inputString.charAt(i));/*here we are appending the character directly from the inputString and storing in the buffered string */
		}
//		for(int i=crr.length-1;i>=0;i--)
//		{
//			bufferedString=bufferedString.append(crr[i]);/*here we are appending the character from the array crr and storing in the buffered string */
//		}
		
		//String outputstring = bufferedString.toString();	
		
		
		return outputString.toString();/*Directly returning the string */
		
	}

}
