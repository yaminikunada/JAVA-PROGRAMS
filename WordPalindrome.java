class WordPalindrome
{
	public static void main(String args[])
	{
		String s="mom and dad";
		String strr[]=s.split(" ");
		for(String t:strr)
		{
			String s2=t;
			StringBuffer sb=new StringBuffer(t);
			sb.reverse();
			 String res=sb.toString();
				
			if(res.equals(s2))
				System.out.println(s2+" palindrome");

		
		
		}
	}
}
			

