class ReverseString
{
	public static void main(String args[])
	{
		String s="vital informations resources under conformation seize",res="";
		String str[]=s.split(" ");
		for(String t:str)
		{
			String s2=t;
			StringBuffer sb= new StringBuffer(s2);
			sb.reverse();
			res= res+sb+" ";
		}
		System.out.println(res);
	}
}

			
