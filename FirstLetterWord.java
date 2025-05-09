class FirstLetterWord
{
	public static void main(String args[])
	{
		String s="vital information resources under seize",s2="";
		String str[]=s.split(" ");
		for(String t:str)
		{
				s2=s2+t.charAt(0);
		}
		System.out.println(s2);
		
		
	}
}
			
