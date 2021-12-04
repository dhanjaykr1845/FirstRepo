class ReverseString
{
	public static void main(String args[])
	{
		String s="Welcome in java";
		String s1[]=s.split(" ");String s2="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				s2+=s1[i].charAt(j);
				
			}
			s2+=" ";
			
		}
		System.out.print(s2+" -----");	
		
	}
} 