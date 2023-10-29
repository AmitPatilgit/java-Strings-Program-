package com.kn.printunicharacters;

public class UniCharacters {
	public void uniCharacter(String s1)
	{
  char[] crr = s1.toCharArray();
		
		//StringBuffer sb = new StringBuffer();
		
		
		
		for(int i=0;i<crr.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<crr.length;j++)
			{
				
				if(crr[i]==crr[j])
				{
					count++;
					//isUnique=false;
					break;
				}
			}
			if(count==1)
			{
				//sb.append(crr[i]);
				System.out.print(crr[i]);
			}
			
		
		}
		//return sb.toString();
		
	}

}
