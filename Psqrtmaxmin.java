class Psqrtmax
{
	public static void main(String[] args)
	{
		int num=23469,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,min1=0;
		while(num!=0)
		{
			int rem=num%10,temp;//8 6 5 4
			int sqrt=(int)Math.sqrt(rem);
			if(sqrt*sqrt==rem)//4 1
			{
				if(rem>max)//19 4>9 1>9 f
				{
					max=rem;//9
				}
				
				else if(rem<min)
				{ 
					min=rem;//1
						
				 }
				
				
					
			}
			num=num/10;
		}
		System.out.println(max+" is maximum perfect square");
		System.out.println(min+" is minimum perfect square");
		
		
	}
}
						