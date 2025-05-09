class MaximumWord
{
	public static void main(String args[])
	{
		String s="vital information resources under seize",s2="";
		int max=Integer.MIN_VALUE;
		String str[]=s.split(" ");
		for(String t:str)
		{
			if(max<=t.length())
			{
				max=t.length();
				s2=t;
			}
		}
		System.out.println(s2);
	}
}
		

