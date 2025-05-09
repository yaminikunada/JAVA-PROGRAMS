class Mock
{
	public static void main(String args[])
	{
		int num=12345,digit=4,rem=0;
		while(num!=0)
		{
			 rem=num%10;
			//System.out.println(rem);
			num=num/10;

		
		System.out.println(rem==digit?digit+" present in number":digit+" not present in number"+num);
			/*System.out.println(digit+" present in number"+num);
		       else
			System.out.println(digit+" not present in number"+num);*/
	}	
		
	}
}