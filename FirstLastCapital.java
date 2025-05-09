class FirstLastCapital
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		String str[]=s.split(" ");
		for(String t:str)
		{
		char a[]=t.toCharArray();
			for(int x=0;x<=t.length()-1;x++)
			{
				char ch=t.charAt(x);

				char s1=ch.toUpperCase(t.indexOf(ch));
				//t.toUpperCase(a[a.length-1]);
			
		System.out.println(s1);
		}
		}
	}
}