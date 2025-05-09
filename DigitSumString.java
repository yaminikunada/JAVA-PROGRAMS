class DigitSumString
{
	public static void main(String args[])
	{
		String s="hello 12 and 13 good 14 153";
		int sum=0;
		for(int x=0;x<=s.length()-1;x++)
		{
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
			 	int num=Character.getNumericValue(ch);
				sum=sum+num;
			}
		}
		System.out.println("sum is "+sum);
	}
}		