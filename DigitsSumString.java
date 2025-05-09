class DigitsSumString
{
	public static void main(String args[])
	{
		String s="hello 12 and 13 ";
		int sum=0;
		int n2=0;
		//String str[]=s.split(" ");
	      //  for (String t : str)
		// {
                     for(int x=0;x<=s.length()-1;x++)
		     {
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
			 	int num=Character.getNumericValue(ch);//1 2 1
				 n2=n2+num;//1 2 3 1 3 1 4 5 1 5 3 9
				sum=sum+n2;//1+3+3+4+3+4+1+4+5+1+5+3+9
			}
		    }

                // }

        System.out.println("sum is " + sum);
    }

}

