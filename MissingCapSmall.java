class MissingCapSmall
{
	public static void main(String args[])
	{
		String s="mom and dad ABCDFEGHIJKLMNOPQRSTUVW yklmnabcdefghijklmnopqrstuvw";
		for(char x='a';x<='z';x++)
		{
			int count=0;
			for(int y=0;y<=s.length()-1;y++)
			{
				char letter=s.charAt(y);
				if(letter==x)
					count++;
			}
			if(count==0)
				System.out.println(x);
		}
		for(char x='A';x<='Z';x++)
		{
			int count=0;
			for(int y=0;y<=s.length()-1;y++)
			{
				char letter=s.charAt(y);
				if(letter==x)
					count++;
			}
			if(count==0)
				System.out.println(x);
		}
	}
}


