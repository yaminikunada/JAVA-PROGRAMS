class DuplicateUniqeWord
{
	public static void main(String args[])
	{
		String s="hai all how are you hai welcome",s1="";
		String str[]=s.split(" ");
		int count=0;
		for(String t:str)
		{
			 s1=t;

			for(int x=0;x<=s.length()-1;x++)
			{	
				if(s1==t)
					count++;
			}
		}
		if(count==0)
				System.out.println(s1);

	}
}
