class MaxMinSwap
{
	public static void main(String args[])
	{
		int a[]=new int[]{100,39,56,95,78,90};
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE,pos1=0,pos2=0,pos3=0;
		for( int x=0;x<=a.length-1;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
				pos1=x;
			}
		}
		for( int x=0;x<=a.length-1;x++)
		{
											
        		if(x==0)
			{
				a[pos1]=a[x];
			 a[x]=max;
			}
		
		        if(a[x]<min)
			{
				min=a[x];
				pos2=x;
			}
		
			if(x==a.length-1)
			{ 
			 a[pos2]=a[x];
			 a[x]=min;
                         } 

		}
		for( int x=0;x<=a.length-1;x++)
		


		System.out.println("a["+x+"]"+a[x]);

		
	}
}