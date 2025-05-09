class ArraySecondMax
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,78,9,78,56,89,23};
		int max1=Integer.MIN_VALUE,max2=max1;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>max1)//
			{
				max2=max1;
				max1=a[x];
			}
			else if(a[x]<max1 && a[x]>max2)
				max2=a[x];
		}
		System.out.println("second maximum value is:"+max2);
	}
}
					