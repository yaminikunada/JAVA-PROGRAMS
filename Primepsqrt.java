class Primesqrt
{
	public static void main(String args[])
	{
		int num=178452,count=0,temp=num,rem=0;
		while(num!=0)
		{
			 rem=num%10;
			for(int start=2;start<=rem/2;start++)
			{
				if(rem%start==0)
					count++;
			}
			
	
			if(count==0 && rem>=2)
			
			
				System.out.println(rem+"prime number");
			else 
			{
				int sqrt=(int)Math.sqrt(rem);
				if(sqrt*sqrt==rem)
					System.out.println(rem+"perfect square ");
			        else
				System.out.println(rem+" not a perfect square ");
                         }
			num=num/10;
		}
			
		
	}
}

			
			