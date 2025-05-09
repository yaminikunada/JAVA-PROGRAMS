class DuplicateMaximumWord
{
	public static void main(String args[])
	{
		String s="vital informations resources under conformation seize",s2="";
		int max=Integer.MIN_VALUE;
		String str[]=s.split(" ");
		for(String t:str)
		{
			if(max<=t.length())//0<5
			{
				if(max<t.length())//0<5
				{
					max=t.length();//5
					s2=t;//vital
					
				}
				else
					s2=s2+" "+t;
			}
			
		
		}
		System.out.println(s2);

	}
}
