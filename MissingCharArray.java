class MissingCharArray
{
	public static void main(String args[])
	{
		String s=" hai hello Good morning";
		
		for(char x='a' ;x<='z';x++)
		{
			int count=0;
			for(int y=0;y<=s.length()-1;y++)
			{
				char letter=s.charAt(y);
				if(letter==x ||letter==(char)(x+32))
					count++;
			}
			if(count==0)
				System.out.println(x);;
		}
	}
}
			