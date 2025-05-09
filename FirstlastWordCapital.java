class FirstlastWordCapital
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		String srr[]=s.split(" ");
		for(String t:srr)
		{
			String ch=t.toUpperCase();
		
		System.out.println(ch);
		}
	}
}