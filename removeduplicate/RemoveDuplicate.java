package com.kn.removeduplicate;

public class RemoveDuplicate {
	public String duplicateRemove(String inputString)
	{
		char [] crr = inputString.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<crr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<crr.length;j++)
			{
				if(crr[i]==crr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				sb.append(crr[i]);
				//System.out.print(crr[i]);
			}
			
		
		}
		return sb.toString();
		
		
		
		
		
		
		
		
	}

	  
		

	

}
