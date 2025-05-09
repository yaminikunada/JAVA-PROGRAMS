class UniqueCharString
{
	public static void main(String args[])
	{
		String s="a lazy dog";
		for(int x=0;x<=s.length()-1;x++)
		{
			char letter =s.charAt(x);
			if(s.indexOf(letter)==s.lastIndexOf(letter))
				System.out.println(letter);
		}
	}
}

		