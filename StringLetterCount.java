class StringLetterCount
{
	public static void main(String args[])
	{
				String s="aaaaabbccccc";
		boolean[] s1= new boolean[s.length()];

		for(int x=0;x<=s.length()-1;x++)
		{
			if(s1[x])
				continue;
			int count=1;
			for(int y=x;x<s.length();y++)
			{
			char ch=s.charAt(x);
			if(s.charAt(x)== s.charAt(y))
			{
				count++;
				s1[y]=true;

			}
			}
			
		
		if(count>1)
		 System.out.println("s.charAt(x)" + count);
		}
	}
}

		